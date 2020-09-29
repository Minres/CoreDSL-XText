/**
 * generated by Xtext 2.10.0
 */
package com.minres.coredsl.tests;

import com.google.inject.Inject;
import com.minres.coredsl.coreDsl.DescriptionContent;
import com.minres.coredsl.tests.CoreDslInjectorProvider;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.testing.InjectWith;
import org.eclipse.xtext.testing.XtextRunner;
import org.eclipse.xtext.testing.util.ParseHelper;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(XtextRunner.class)
@InjectWith(CoreDslInjectorProvider.class)
@SuppressWarnings("all")
public class CoreDslParsingTest {
  @Inject
  private ParseHelper<DescriptionContent> parseHelper;
  
  public String addInstructionContext(final String str) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("InstructionSet TestISA {");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("registers { ");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("[[is_pc]] int PC ;");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("int Xreg[32];");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("float Freg[32];");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("instructions {");
    _builder.newLine();
    _builder.append("        ");
    _builder.append(str, "        ");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder.toString();
  }
  
  public String addInstructionSetContext(final String str) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("InstructionSet TestISA {");
    _builder.newLine();
    _builder.append("    ");
    _builder.append(str, "    ");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    return _builder.toString();
  }
  
  @Test
  public void parseInstrPRELU() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("PRELU {");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("encoding: b0000000 :: rs2[4:0] :: rs1[4:0] :: b000 :: rd[4:0] :: b1111011;  ");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("args_disass:\"{name(rd)}, {name(rs1)}, {name(rs2)}\"; ");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("behavior: {");
      _builder.newLine();
      _builder.append("        ");
      _builder.append("static float alpha = 0.2;  ");
      _builder.newLine();
      _builder.append("        ");
      _builder.append("float input, new_alpha;");
      _builder.newLine();
      _builder.append("        ");
      _builder.append("input = Freg[rs1];  // read global F register");
      _builder.newLine();
      _builder.append("        ");
      _builder.append("if (rs2!=0) // avoid having an additional instruction for setting parameter");
      _builder.newLine();
      _builder.append("            ");
      _builder.append("new_alpha = Freg[rs2];");
      _builder.newLine();
      _builder.append("        ");
      _builder.append("else ");
      _builder.newLine();
      _builder.append("            ");
      _builder.append("new_alpha = alpha; // use the stored alpha when rs2==0");
      _builder.newLine();
      _builder.append("        ");
      _builder.append("if(input > 0)");
      _builder.newLine();
      _builder.append("            ");
      _builder.append("Freg[rd] = input;");
      _builder.newLine();
      _builder.append("        ");
      _builder.append("else ");
      _builder.newLine();
      _builder.append("            ");
      _builder.append("Freg[rd] = input*new_alpha; ");
      _builder.newLine();
      _builder.append("        ");
      _builder.append("if (rs2!=0)");
      _builder.newLine();
      _builder.append("            ");
      _builder.append("alpha = new_alpha; // update internal alpha register");
      _builder.newLine();
      _builder.append("        ");
      _builder.append("}");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      final String input = _builder.toString();
      final DescriptionContent content = this.parseHelper.parse(this.addInstructionContext(input));
      Assert.assertEquals(1, content.getDefinitions().size());
      final Resource resource = content.eResource();
      EcoreUtil.resolveAll(resource);
      Assert.assertEquals(0, resource.getErrors().size());
      Assert.assertEquals(0, resource.getWarnings().size());
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void parseInstrSBOX() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("SBOX {");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("encoding: b0000000 :: rs2[4:0] :: rs1[4:0] :: b000 :: rd[4:0] :: b1111011;  ");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("args_disass:\"{name(rd)}, {name(rs1)}, {name(rs2)}\"; ");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("behavior: {");
      _builder.newLine();
      _builder.append("        ");
      _builder.append("unsigned int data_i;");
      _builder.newLine();
      _builder.append("        ");
      _builder.append("data_i = (unsigned int) Xreg[rs1];  ");
      _builder.newLine();
      _builder.append("        ");
      _builder.append("// contents of array omitted for for brevity        ");
      _builder.newLine();
      _builder.append("        ");
      _builder.append("const unsigned char sbox[256] = { 0x63, 0x7c, 0};  ");
      _builder.newLine();
      _builder.append("        ");
      _builder.append("Xreg[rd] = sbox[data_i[31:24]] :: sbox[data_i[23:16]] :: sbox[data_i[15:8]] :: sbox[data_i[7:0]];");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("}");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      final String input = _builder.toString();
      final DescriptionContent content = this.parseHelper.parse(this.addInstructionContext(input));
      Assert.assertEquals(1, content.getDefinitions().size());
      final Resource resource = content.eResource();
      EcoreUtil.resolveAll(resource);
      Assert.assertEquals(0, resource.getErrors().size());
      Assert.assertEquals(0, resource.getWarnings().size());
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void parseInstrSQRTFloatRegs() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("InstructionSet TestISA {");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("registers {");
      _builder.newLine();
      _builder.append("        ");
      _builder.append("float F_Ext[32];}");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("instructions { ");
      _builder.newLine();
      _builder.append("        ");
      _builder.append("vectorL {");
      _builder.newLine();
      _builder.append("            ");
      _builder.append("encoding: b0000000 :: rs2[4:0] :: rs1[4:0] :: b000 :: rd[4:0] :: b1111011 ;");
      _builder.newLine();
      _builder.append("            ");
      _builder.append("args_disass:\"{name(rd)}, {name(rs1)}\";");
      _builder.newLine();
      _builder.append("            ");
      _builder.append("behavior: { ");
      _builder.newLine();
      _builder.append("            ");
      _builder.append("float xc = F_Ext[rs1];     ");
      _builder.newLine();
      _builder.append("            ");
      _builder.append("float yc = F_Ext[rs1];");
      _builder.newLine();
      _builder.append("            ");
      _builder.append("float sqdist = xc*xc + yc*yc;");
      _builder.newLine();
      _builder.append("            ");
      _builder.append("//...SQRT(sqdist) computation");
      _builder.newLine();
      _builder.append("            ");
      _builder.append("}");
      _builder.newLine();
      _builder.append("        ");
      _builder.append("}");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("}");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      final String input = _builder.toString();
      final DescriptionContent content = this.parseHelper.parse(input);
      Assert.assertEquals(1, content.getDefinitions().size());
      final Resource resource = content.eResource();
      EcoreUtil.resolveAll(resource);
      Assert.assertEquals(0, resource.getErrors().size());
      Assert.assertEquals(0, resource.getWarnings().size());
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void parseInstrSQRTUnionRegs() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("InstructionSet TestISA {");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("registers {");
      _builder.newLine();
      _builder.append("        ");
      _builder.append("union ISAXRegFile{");
      _builder.newLine();
      _builder.append("            ");
      _builder.append("double doublePrec;  // for a double precision entry");
      _builder.newLine();
      _builder.append("            ");
      _builder.append("struct vector2d {");
      _builder.newLine();
      _builder.append("                ");
      _builder.append("float x_coord;");
      _builder.newLine();
      _builder.append("                ");
      _builder.append("float y_coord;");
      _builder.newLine();
      _builder.append("            ");
      _builder.append("} vector2d;         // for a 2d vector entry");
      _builder.newLine();
      _builder.append("        ");
      _builder.append("} ISAXRegFile[32]; ");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("}");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("instructions { ");
      _builder.newLine();
      _builder.append("        ");
      _builder.append("vectorL {");
      _builder.newLine();
      _builder.append("            ");
      _builder.append("encoding: b0000000 :: rs2[4:0] :: rs1[4:0] :: b000 :: rd[4:0] :: b1111011 ;");
      _builder.newLine();
      _builder.append("            ");
      _builder.append("args_disass:\"{name(rd)}, {name(rs1)}\";");
      _builder.newLine();
      _builder.append("            ");
      _builder.append("behavior: { ");
      _builder.newLine();
      _builder.append("                ");
      _builder.append("float xc = ISAXRegFile[rs1].vector2d.x_coord;");
      _builder.newLine();
      _builder.append("                ");
      _builder.append("float yc = ISAXRegFile[rs1].vector2d.y_coord;");
      _builder.newLine();
      _builder.append("                ");
      _builder.append("double result;");
      _builder.newLine();
      _builder.append("                ");
      _builder.append("double sqdist = xc*xc + yc*yc;");
      _builder.newLine();
      _builder.append("                ");
      _builder.append("if((sqdist==0) || (sqdist[30:23]==0xff))");
      _builder.newLine();
      _builder.append("                    ");
      _builder.append("result = 0; // avoid special cases");
      _builder.newLine();
      _builder.append("                ");
      _builder.append("else");
      _builder.newLine();
      _builder.append("                    ");
      _builder.append("result = 1;//sqrt(sqdist);  ");
      _builder.newLine();
      _builder.append("                ");
      _builder.append("ISAXRegFile[rd].doublePrec = result;");
      _builder.newLine();
      _builder.append("            ");
      _builder.append("}");
      _builder.newLine();
      _builder.append("        ");
      _builder.append("}");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("}");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      final String input = _builder.toString();
      final DescriptionContent content = this.parseHelper.parse(input);
      Assert.assertEquals(1, content.getDefinitions().size());
      final Resource resource = content.eResource();
      EcoreUtil.resolveAll(resource);
      Assert.assertEquals(0, resource.getErrors().size());
      Assert.assertEquals(0, resource.getWarnings().size());
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void parseInstrSpawn() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("InstructionSet TestISA {");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("registers {");
      _builder.newLine();
      _builder.append("        ");
      _builder.append("float Freg[32];");
      _builder.newLine();
      _builder.append("        ");
      _builder.append("[[is_interlock_for=Freg]] bool F_ready[32] ;  // use attribute to indicate purpose of F_ready");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("}");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("instructions {");
      _builder.newLine();
      _builder.append("        ");
      _builder.append("SIN {");
      _builder.newLine();
      _builder.append("            ");
      _builder.append("encoding: b0000000 :: rs2[4:0] :: rs1[4:0] :: b000 :: rd[4:0] :: b1111011 ;");
      _builder.newLine();
      _builder.append("            ");
      _builder.append("args_disass:\"#{name(rd)}, {name(rs1)}\";   ");
      _builder.newLine();
      _builder.append("            ");
      _builder.append("behavior: { ");
      _builder.newLine();
      _builder.append("                ");
      _builder.append("double theta = Freg[rs1];");
      _builder.newLine();
      _builder.append("                ");
      _builder.append("F_ready[rd] = false;            // synchronously mark result as unavailable");
      _builder.newLine();
      _builder.append("                ");
      _builder.append("spawn {                         // asynchronously do the following block");
      _builder.newLine();
      _builder.append("                        ");
      _builder.append("Freg[rd] = 0.01f;     // first perform the computation        ");
      _builder.newLine();
      _builder.append("                        ");
      _builder.append("F_ready[rd] = true;     // afterwards mark the result as ready");
      _builder.newLine();
      _builder.append("                ");
      _builder.append("}");
      _builder.newLine();
      _builder.append("            ");
      _builder.append("}");
      _builder.newLine();
      _builder.append("        ");
      _builder.append("}");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("}");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      final String input = _builder.toString();
      final DescriptionContent content = this.parseHelper.parse(input);
      Assert.assertEquals(1, content.getDefinitions().size());
      final Resource resource = content.eResource();
      EcoreUtil.resolveAll(resource);
      Assert.assertEquals(0, resource.getErrors().size());
      Assert.assertEquals(0, resource.getWarnings().size());
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void parseInstrZOL() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("InstructionSet TestISA {");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("registers {");
      _builder.newLine();
      _builder.append("    \t");
      _builder.append("int PC;");
      _builder.newLine();
      _builder.append("    \t");
      _builder.append("int X[32];");
      _builder.newLine();
      _builder.append("        ");
      _builder.append("unsigned int count, endpc, startpc;");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("}");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("functions {");
      _builder.newLine();
      _builder.append("        ");
      _builder.append("void doZOL(){      ");
      _builder.newLine();
      _builder.append("            ");
      _builder.append("bool zolactive = true; ");
      _builder.newLine();
      _builder.append("            ");
      _builder.append("while (zolactive) {         // keep executing while condition is true");
      _builder.newLine();
      _builder.append("                ");
      _builder.append("if (PC == endpc) {      // evaluate loop body once per clock cycle");
      _builder.newLine();
      _builder.append("                    ");
      _builder.append("if (count != 0) {");
      _builder.newLine();
      _builder.append("                        ");
      _builder.append("--count;");
      _builder.newLine();
      _builder.append("                        ");
      _builder.append("PC = startpc;   // jump to loop start");
      _builder.newLine();
      _builder.append("                    ");
      _builder.append("} else");
      _builder.newLine();
      _builder.append("                        ");
      _builder.append("zolactive = false;  // iteration limit reached, stop execution");
      _builder.newLine();
      _builder.append("                ");
      _builder.append("}");
      _builder.newLine();
      _builder.append("            ");
      _builder.append("}");
      _builder.newLine();
      _builder.append("        ");
      _builder.append("}");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("}");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("instructions {");
      _builder.newLine();
      _builder.append("        ");
      _builder.append("LP_SETUPI {");
      _builder.newLine();
      _builder.append("            ");
      _builder.append("encoding: b0000000 :: rs2[4:0] :: rs1[4:0] :: b000 :: rd[4:0] :: b1111011 ;");
      _builder.newLine();
      _builder.append("            ");
      _builder.append("args_disass:\"{name(rs1)}, {name(rs2)}\";");
      _builder.newLine();
      _builder.append("            ");
      _builder.append("behavior: {");
      _builder.newLine();
      _builder.append("                ");
      _builder.append("count   = X[rs1];");
      _builder.newLine();
      _builder.append("                ");
      _builder.append("endpc   = PC + 4 + X[rs2]<<2; // use PC relative addressing to save bits");
      _builder.newLine();
      _builder.append("                ");
      _builder.append("startpc = PC + 4; ");
      _builder.newLine();
      _builder.append("                ");
      _builder.append("spawn doZOL(); // Keep running after LPSETUPI ends");
      _builder.newLine();
      _builder.append("            ");
      _builder.append("}");
      _builder.newLine();
      _builder.append("        ");
      _builder.append("}");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("}");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      final String input = _builder.toString();
      final DescriptionContent content = this.parseHelper.parse(input);
      Assert.assertEquals(1, content.getDefinitions().size());
      final Resource resource = content.eResource();
      EcoreUtil.resolveAll(resource);
      Assert.assertEquals(0, resource.getErrors().size());
      Assert.assertEquals(0, resource.getWarnings().size());
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
