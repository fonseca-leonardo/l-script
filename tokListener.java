// Generated from tok.g4 by ANTLR 4.9.3

    import java.util.*;
	import java.util.Stack;
	import java.util.ArrayList;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link tokParser}.
 */
public interface tokListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link tokParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(tokParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link tokParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(tokParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link tokParser#decl}.
	 * @param ctx the parse tree
	 */
	void enterDecl(tokParser.DeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link tokParser#decl}.
	 * @param ctx the parse tree
	 */
	void exitDecl(tokParser.DeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link tokParser#bloco}.
	 * @param ctx the parse tree
	 */
	void enterBloco(tokParser.BlocoContext ctx);
	/**
	 * Exit a parse tree produced by {@link tokParser#bloco}.
	 * @param ctx the parse tree
	 */
	void exitBloco(tokParser.BlocoContext ctx);
	/**
	 * Enter a parse tree produced by {@link tokParser#declaraVar}.
	 * @param ctx the parse tree
	 */
	void enterDeclaraVar(tokParser.DeclaraVarContext ctx);
	/**
	 * Exit a parse tree produced by {@link tokParser#declaraVar}.
	 * @param ctx the parse tree
	 */
	void exitDeclaraVar(tokParser.DeclaraVarContext ctx);
	/**
	 * Enter a parse tree produced by {@link tokParser#tipo}.
	 * @param ctx the parse tree
	 */
	void enterTipo(tokParser.TipoContext ctx);
	/**
	 * Exit a parse tree produced by {@link tokParser#tipo}.
	 * @param ctx the parse tree
	 */
	void exitTipo(tokParser.TipoContext ctx);
	/**
	 * Enter a parse tree produced by {@link tokParser#cmd}.
	 * @param ctx the parse tree
	 */
	void enterCmd(tokParser.CmdContext ctx);
	/**
	 * Exit a parse tree produced by {@link tokParser#cmd}.
	 * @param ctx the parse tree
	 */
	void exitCmd(tokParser.CmdContext ctx);
	/**
	 * Enter a parse tree produced by {@link tokParser#cmdattrib}.
	 * @param ctx the parse tree
	 */
	void enterCmdattrib(tokParser.CmdattribContext ctx);
	/**
	 * Exit a parse tree produced by {@link tokParser#cmdattrib}.
	 * @param ctx the parse tree
	 */
	void exitCmdattrib(tokParser.CmdattribContext ctx);
	/**
	 * Enter a parse tree produced by {@link tokParser#expressao}.
	 * @param ctx the parse tree
	 */
	void enterExpressao(tokParser.ExpressaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link tokParser#expressao}.
	 * @param ctx the parse tree
	 */
	void exitExpressao(tokParser.ExpressaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link tokParser#termo}.
	 * @param ctx the parse tree
	 */
	void enterTermo(tokParser.TermoContext ctx);
	/**
	 * Exit a parse tree produced by {@link tokParser#termo}.
	 * @param ctx the parse tree
	 */
	void exitTermo(tokParser.TermoContext ctx);
	/**
	 * Enter a parse tree produced by {@link tokParser#cmdleitura}.
	 * @param ctx the parse tree
	 */
	void enterCmdleitura(tokParser.CmdleituraContext ctx);
	/**
	 * Exit a parse tree produced by {@link tokParser#cmdleitura}.
	 * @param ctx the parse tree
	 */
	void exitCmdleitura(tokParser.CmdleituraContext ctx);
	/**
	 * Enter a parse tree produced by {@link tokParser#cmdescrita}.
	 * @param ctx the parse tree
	 */
	void enterCmdescrita(tokParser.CmdescritaContext ctx);
	/**
	 * Exit a parse tree produced by {@link tokParser#cmdescrita}.
	 * @param ctx the parse tree
	 */
	void exitCmdescrita(tokParser.CmdescritaContext ctx);
	/**
	 * Enter a parse tree produced by {@link tokParser#cmdselecao}.
	 * @param ctx the parse tree
	 */
	void enterCmdselecao(tokParser.CmdselecaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link tokParser#cmdselecao}.
	 * @param ctx the parse tree
	 */
	void exitCmdselecao(tokParser.CmdselecaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link tokParser#cmdrepete}.
	 * @param ctx the parse tree
	 */
	void enterCmdrepete(tokParser.CmdrepeteContext ctx);
	/**
	 * Exit a parse tree produced by {@link tokParser#cmdrepete}.
	 * @param ctx the parse tree
	 */
	void exitCmdrepete(tokParser.CmdrepeteContext ctx);
	/**
	 * Enter a parse tree produced by {@link tokParser#cmdenquanto}.
	 * @param ctx the parse tree
	 */
	void enterCmdenquanto(tokParser.CmdenquantoContext ctx);
	/**
	 * Exit a parse tree produced by {@link tokParser#cmdenquanto}.
	 * @param ctx the parse tree
	 */
	void exitCmdenquanto(tokParser.CmdenquantoContext ctx);
}