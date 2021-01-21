/*
 * generated by Xtext 2.10.0
 */
package com.minres.coredsl.tests

import com.google.inject.Inject
import com.minres.coredsl.coreDsl.DescriptionContent
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.XtextRunner
import org.eclipse.xtext.testing.util.ParseHelper
import org.eclipse.xtext.testing.validation.ValidationTestHelper
import org.junit.Test
import org.junit.runner.RunWith
import static org.junit.Assert.assertTrue
import static org.junit.Assert.assertFalse

@RunWith(XtextRunner)
@InjectWith(CoreDslInjectorProvider)
class CoreDslScopingTest {

    @Inject extension ParseHelper<DescriptionContent> parseHelper

    @Inject ValidationTestHelper validator

    @Test
    def void useBeforeDeclaration() {
    	val content = '''
        InstructionSet TestISA {
            instructions {
            	Inst1 {
            		encoding: b0000000 :: rs2[4:0] :: rs1[4:0] :: b000 :: rd[4:0] :: b0000000;  
            		args_disass: "{name(rd)}, {name(rs1)}, {name(rs2)}";
            		behavior: {
            			x = 0;
            			int x;
            		}
            	}
            }
        }
    	'''.parse
    	val issues = validator.validate(content)
    	assertFalse(issues.isEmpty())
    }
    
    @Test
    def void declarationBeforeUse() {
    	val content = '''
        InstructionSet TestISA {
            instructions {
            	Inst1 {
            		encoding: b0000000 :: rs2[4:0] :: rs1[4:0] :: b000 :: rd[4:0] :: b0000000;  
            		args_disass: "{name(rd)}, {name(rs1)}, {name(rs2)}";
            		behavior: {
            			int x;
            			x = 0;
            		}
            	}
            }
        }
    	'''.parse
    	val issues = validator.validate(content)
    	assertTrue(issues.isEmpty())
    }
    
    @Test
    def void useBeforeDeclarationNested() {
    	val content = '''
        InstructionSet TestISA {
            instructions {
            	Inst1 {
            		encoding: b0000000 :: rs2[4:0] :: rs1[4:0] :: b000 :: rd[4:0] :: b0000000;  
            		args_disass: "{name(rd)}, {name(rs1)}, {name(rs2)}";
            		behavior: {
            			{
            				x = 0;
        				}
            			int x;
            		}
            	}
            }
        }
    	'''.parse
    	val issues = validator.validate(content)
    	assertFalse(issues.isEmpty())
    }
    
    @Test
    def void declarationBeforeUseNested() {
    	val content = '''
        InstructionSet TestISA {
            instructions {
            	Inst1 {
            		encoding: b0000000 :: rs2[4:0] :: rs1[4:0] :: b000 :: rd[4:0] :: b0000000;  
            		args_disass: "{name(rd)}, {name(rs1)}, {name(rs2)}";
            		behavior: {
            			int x;
            			{
            				x = 0;
        				}
            		}
            	}
            }
        }
    	'''.parse
    	val issues = validator.validate(content)
    	assertTrue(issues.isEmpty())
    }
    
    @Test
    def void globalScope() {
    	val content = '''
        InstructionSet TestISA {
        	constants {
        		int CCC = 42;
    		}
			registers {
    			unsigned X[32];
			}

			functions {
				int foo(int arg) {
					return arg;
				}
			}

            instructions {
            	Inst1 {
            		encoding: b0000000 :: rs2[4:0] :: rs1[4:0] :: b000 :: rd[4:0] :: b0000000;  
            		args_disass: "{name(rd)}, {name(rs1)}, {name(rs2)}";
            		behavior: {
            			X[rd] = X[rs1] + X[rs2] + foo(CCC);
            		}
            	}
            }
        }
    	'''.parse
    	val issues = validator.validate(content)
    	assertTrue(issues.isEmpty())
    }
    
    @Test
    def void globalScopeExtended() {
    	val content = '''
        InstructionSet TestISA {
        	constants {
        		int CCC = 42;
    		}
			registers {
    			unsigned X[32];
			}

			functions {
				int foo(int arg) {
					return arg;
				}
			}
		}
		
		InstructionSet TestISA2 extends TestISA {
            instructions {
            	Inst1 {
            		encoding: b0000000 :: rs2[4:0] :: rs1[4:0] :: b000 :: rd[4:0] :: b0000000;  
            		args_disass: "{name(rd)}, {name(rs1)}, {name(rs2)}";
            		behavior: {
            			X[rd] = X[rs1] + X[rs2] + foo(CCC);
            		}
            	}
            }
        }
    	'''.parse
    	val issues = validator.validate(content)
    	assertTrue(issues.isEmpty())
    }
    
    @Test
    def void globalScopeFromFile() {
    	val content = '''
        import "inputs/isa_1.core_desc"
		
		InstructionSet TestISA2 extends RV32I {
            instructions {
            	Inst1 {
            		encoding: b0000000 :: rs2[4:0] :: rs1[4:0] :: b000 :: rd[4:0] :: b0000000;  
            		args_disass: "{name(rd)}, {name(rs1)}, {name(rs2)}";
            		behavior: {
            			X[rd] = X[rs1] + X[rs2] + XLEN;
            		}
            	}
            }
        }
    	'''.parse
    	val issues = validator.validate(content)
    	assertTrue(issues.isEmpty())
    }
}