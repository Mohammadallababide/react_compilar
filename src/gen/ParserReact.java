// Generated from C:/Users/moha lebo/Desktop/Reactjs/src/Grammar/ParserReact.g4 by ANTLR 4.13.1
package gen;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class ParserReact extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		COMMA=1, OPEN_SQUARE=2, CLOSE_SQUARE=3, OPEN_BRACE=4, CLOSE_BRACE=5, OPEN_PAREN=6, 
		CLOSE_PAREN=7, COLON=8, DOT=9, ARROW=10, ASSIGN=11, MINUS=12, NEQUAL=13, 
		NOT=14, OR=15, AND=16, PLUS=17, PLE=18, PLPL=19, QUESTION=20, SIME=21, 
		DOLLAR=22, MOD=23, POWER=24, HASHTAG=25, MULTI=26, SINGLE_QUOTE=27, D_C=28, 
		Sdoular=29, EXPENSES=30, CONST=31, FUNCTION=32, BREAK=33, CONTINUE=34, 
		RETURN=35, IF=36, ELSE=37, ELSE_IF=38, FOR=39, FOREACH=40, WHILE=41, DO=42, 
		CLASS=43, VAR=44, LET=45, EXPORT=46, DEFAULT=47, SWITCH=48, CASE=49, IMPORT=50, 
		NULL=51, DOCUMNET=52, FROM=53, Backtick=54, LT=55, LT_EQ=56, GT=57, GT_EQ=58, 
		EQ=59, NOT_EQ1=60, JSX_SLASH_OR_DIV=61, BACKSLASH=62, COMMENT=63, TYPE=64, 
		TRUE=65, FALSE=66, DATATYPE_=67, REACT_=68, CREATEELEMENT=69, REACTDOM=70, 
		USESTATE_=71, USEEFFECT_=72, USEREF_=73, CONSOLE_=74, LOG_=75, INPUT_=76, 
		ONCHANGE_=77, VALUE_=78, PLACEHOLDER_=79, DISABLED_=80, ONFOCUS_=81, ONCLICK_=82, 
		HEIGHT=83, WIDTH=84, BUTTON_=85, MAP_=86, CLASS_NAME=87, MINUS_MINUS=88, 
		OPERATION=89, SYNTAX=90, E=91, ONE_CHAR_LETTER=92, STRING_LITERAL=93, 
		IDENTIFIER=94, NUMERIC_LITERAL=95, RANDOM_NAME=96, WS=97, MULTILINE_COMMENT=98, 
		SPACES=99, UNEXPECTED_CHAR=100;
	public static final int
		RULE_app = 0, RULE_export = 1, RULE_importR = 2, RULE_destination_name = 3, 
		RULE_react_libraries = 4, RULE_syntax = 5, RULE_attributes = 6, RULE_attribute = 7, 
		RULE_attributeValue = 8, RULE_useRef = 9, RULE_useState = 10, RULE_array = 11, 
		RULE_useEffect = 12, RULE_arrayy = 13, RULE_par = 14, RULE_map = 15, RULE_onClick = 16, 
		RULE_mapMethod = 17, RULE_jsxElement = 18, RULE_jsxChild2 = 19, RULE_jsxOpenTag = 20, 
		RULE_jsxChild = 21, RULE_functionCall = 22, RULE_jsxCode = 23, RULE_name = 24, 
		RULE_function_name = 25, RULE_signed_number = 26, RULE_error_message = 27, 
		RULE_any_name = 28, RULE_function_declaration = 29, RULE_arrow_function = 30, 
		RULE_normal_function = 31, RULE_function_header = 32, RULE_function_body = 33, 
		RULE_sub_function_body = 34, RULE_instructions = 35, RULE_functional_instruction = 36, 
		RULE_nonfunctional_instruction = 37, RULE_call_function = 38, RULE_callback_func = 39, 
		RULE_args = 40, RULE_prameters = 41, RULE_return_rule = 42, RULE_exiting_loops = 43, 
		RULE_return_type = 44, RULE_print_statment = 45, RULE_indisde_the_print = 46, 
		RULE_if_else_rule = 47, RULE_if_rule = 48, RULE_else_if_rule = 49, RULE_else_rulse = 50, 
		RULE_while_rule = 51, RULE_do_while = 52, RULE_for_loop_rule = 53, RULE_inside_for_loop = 54, 
		RULE_foreach = 55, RULE_switch_rule = 56, RULE_defult = 57, RULE_case_rule = 58, 
		RULE_defination_type = 59, RULE_general_creating = 60, RULE_creating_with_assign = 61, 
		RULE_create_without_assign = 62, RULE_genral_assign = 63, RULE_varible_name = 64, 
		RULE_assign_varible = 65, RULE_create_varible_without_assign = 66, RULE_create_varible_with_assign = 67, 
		RULE_array_name = 68, RULE_assign_array = 69, RULE_create_array_form = 70, 
		RULE_create_Array_without_assign = 71, RULE_create_Array_with_assign = 72, 
		RULE_array_base_form_without_index = 73, RULE_array_base_form_with_index = 74, 
		RULE_array_identifier_form = 75, RULE_array_boolean_form = 76, RULE_array_integer_form = 77, 
		RULE_array_charecter_form = 78, RULE_array_objects_form = 79, RULE_array_objects_form2 = 80, 
		RULE_array_varible_form = 81, RULE_array_anyType_form = 82, RULE_array_arrayes_form = 83, 
		RULE_value_left_side = 84, RULE_left_side_array = 85, RULE_json_name = 86, 
		RULE_assign_json = 87, RULE_create_json_form = 88, RULE_create_json_object_without_assign = 89, 
		RULE_create_json_with_assign = 90, RULE_inside_json_statmnet = 91, RULE_json_statment = 92, 
		RULE_value_json_statmnet = 93, RULE_varible_from_object = 94, RULE_shortcut_statments = 95, 
		RULE_any_arithmetic_oprator = 96, RULE_expression = 97, RULE_bool_expression = 98, 
		RULE_intral_expression_value = 99, RULE_use_random_name = 100;
	private static String[] makeRuleNames() {
		return new String[] {
			"app", "export", "importR", "destination_name", "react_libraries", "syntax", 
			"attributes", "attribute", "attributeValue", "useRef", "useState", "array", 
			"useEffect", "arrayy", "par", "map", "onClick", "mapMethod", "jsxElement", 
			"jsxChild2", "jsxOpenTag", "jsxChild", "functionCall", "jsxCode", "name", 
			"function_name", "signed_number", "error_message", "any_name", "function_declaration", 
			"arrow_function", "normal_function", "function_header", "function_body", 
			"sub_function_body", "instructions", "functional_instruction", "nonfunctional_instruction", 
			"call_function", "callback_func", "args", "prameters", "return_rule", 
			"exiting_loops", "return_type", "print_statment", "indisde_the_print", 
			"if_else_rule", "if_rule", "else_if_rule", "else_rulse", "while_rule", 
			"do_while", "for_loop_rule", "inside_for_loop", "foreach", "switch_rule", 
			"defult", "case_rule", "defination_type", "general_creating", "creating_with_assign", 
			"create_without_assign", "genral_assign", "varible_name", "assign_varible", 
			"create_varible_without_assign", "create_varible_with_assign", "array_name", 
			"assign_array", "create_array_form", "create_Array_without_assign", "create_Array_with_assign", 
			"array_base_form_without_index", "array_base_form_with_index", "array_identifier_form", 
			"array_boolean_form", "array_integer_form", "array_charecter_form", "array_objects_form", 
			"array_objects_form2", "array_varible_form", "array_anyType_form", "array_arrayes_form", 
			"value_left_side", "left_side_array", "json_name", "assign_json", "create_json_form", 
			"create_json_object_without_assign", "create_json_with_assign", "inside_json_statmnet", 
			"json_statment", "value_json_statmnet", "varible_from_object", "shortcut_statments", 
			"any_arithmetic_oprator", "expression", "bool_expression", "intral_expression_value", 
			"use_random_name"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "','", "'['", "']'", "'{'", "'}'", "'('", "')'", "':'", "'.'", 
			"'=>'", "'='", "'-'", "'=!'", "'!'", "'||'", "'&&'", "'+'", "'+='", "'++'", 
			"'?'", "';'", "'$'", "'%'", "'^'", "'#'", "'*'", "'''", "'\"'", "'Sdoular'", 
			"'expenses'", "'const'", "'function'", "'break'", "'continue'", "'return'", 
			"'if'", "'else'", "'else if'", "'for'", "'foreach'", "'while'", "'do'", 
			"'class'", "'var'", "'let'", "'export'", "'default'", "'switch'", "'case'", 
			"'import'", "'null'", "'document'", "'from'", "'`'", "'<'", "'<='", "'>'", 
			"'>='", "'=='", "'!='", "'/'", "'\\'", null, "'type'", "'true'", "'false'", 
			null, "'React'", "'createElement'", "'ReacttDOM'", "'useState'", "'useEffect'", 
			"'useRef'", "'console'", "'log'", "'input'", "'onChange'", "'value'", 
			"'placeholder'", "'disabled '", "'onFocus'", "'onclick'", "'height'", 
			"'width'", "'button'", "'map'", "'className'", "'--'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "COMMA", "OPEN_SQUARE", "CLOSE_SQUARE", "OPEN_BRACE", "CLOSE_BRACE", 
			"OPEN_PAREN", "CLOSE_PAREN", "COLON", "DOT", "ARROW", "ASSIGN", "MINUS", 
			"NEQUAL", "NOT", "OR", "AND", "PLUS", "PLE", "PLPL", "QUESTION", "SIME", 
			"DOLLAR", "MOD", "POWER", "HASHTAG", "MULTI", "SINGLE_QUOTE", "D_C", 
			"Sdoular", "EXPENSES", "CONST", "FUNCTION", "BREAK", "CONTINUE", "RETURN", 
			"IF", "ELSE", "ELSE_IF", "FOR", "FOREACH", "WHILE", "DO", "CLASS", "VAR", 
			"LET", "EXPORT", "DEFAULT", "SWITCH", "CASE", "IMPORT", "NULL", "DOCUMNET", 
			"FROM", "Backtick", "LT", "LT_EQ", "GT", "GT_EQ", "EQ", "NOT_EQ1", "JSX_SLASH_OR_DIV", 
			"BACKSLASH", "COMMENT", "TYPE", "TRUE", "FALSE", "DATATYPE_", "REACT_", 
			"CREATEELEMENT", "REACTDOM", "USESTATE_", "USEEFFECT_", "USEREF_", "CONSOLE_", 
			"LOG_", "INPUT_", "ONCHANGE_", "VALUE_", "PLACEHOLDER_", "DISABLED_", 
			"ONFOCUS_", "ONCLICK_", "HEIGHT", "WIDTH", "BUTTON_", "MAP_", "CLASS_NAME", 
			"MINUS_MINUS", "OPERATION", "SYNTAX", "E", "ONE_CHAR_LETTER", "STRING_LITERAL", 
			"IDENTIFIER", "NUMERIC_LITERAL", "RANDOM_NAME", "WS", "MULTILINE_COMMENT", 
			"SPACES", "UNEXPECTED_CHAR"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "ParserReact.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ParserReact(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AppContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(ParserReact.EOF, 0); }
		public List<ImportRContext> importR() {
			return getRuleContexts(ImportRContext.class);
		}
		public ImportRContext importR(int i) {
			return getRuleContext(ImportRContext.class,i);
		}
		public List<InstructionsContext> instructions() {
			return getRuleContexts(InstructionsContext.class);
		}
		public InstructionsContext instructions(int i) {
			return getRuleContext(InstructionsContext.class,i);
		}
		public List<Function_declarationContext> function_declaration() {
			return getRuleContexts(Function_declarationContext.class);
		}
		public Function_declarationContext function_declaration(int i) {
			return getRuleContext(Function_declarationContext.class,i);
		}
		public List<ExportContext> export() {
			return getRuleContexts(ExportContext.class);
		}
		public ExportContext export(int i) {
			return getRuleContext(ExportContext.class,i);
		}
		public AppContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_app; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserReactListener ) ((ParserReactListener)listener).enterApp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserReactListener ) ((ParserReactListener)listener).exitApp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserReactVisitor ) return ((ParserReactVisitor<? extends T>)visitor).visitApp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AppContext app() throws RecognitionException {
		AppContext _localctx = new AppContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_app);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(215);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IMPORT) {
				{
				{
				setState(202);
				importR();
				setState(207);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 342573034504256L) != 0) || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & 4210689L) != 0)) {
					{
					setState(205);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case PLPL:
					case CONST:
					case IF:
					case FOR:
					case FOREACH:
					case WHILE:
					case DO:
					case VAR:
					case LET:
					case SWITCH:
					case CONSOLE_:
					case MINUS_MINUS:
					case RANDOM_NAME:
						{
						setState(203);
						instructions();
						}
						break;
					case OPEN_PAREN:
					case FUNCTION:
						{
						setState(204);
						function_declaration();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(209);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(211);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EXPORT) {
					{
					setState(210);
					export();
					}
				}

				}
				}
				setState(217);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(218);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExportContext extends ParserRuleContext {
		public TerminalNode EXPORT() { return getToken(ParserReact.EXPORT, 0); }
		public TerminalNode DEFAULT() { return getToken(ParserReact.DEFAULT, 0); }
		public TerminalNode SYNTAX() { return getToken(ParserReact.SYNTAX, 0); }
		public TerminalNode SIME() { return getToken(ParserReact.SIME, 0); }
		public ExportContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_export; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserReactListener ) ((ParserReactListener)listener).enterExport(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserReactListener ) ((ParserReactListener)listener).exitExport(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserReactVisitor ) return ((ParserReactVisitor<? extends T>)visitor).visitExport(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExportContext export() throws RecognitionException {
		ExportContext _localctx = new ExportContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_export);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(220);
			match(EXPORT);
			setState(221);
			match(DEFAULT);
			setState(222);
			match(SYNTAX);
			setState(223);
			match(SIME);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ImportRContext extends ParserRuleContext {
		public TerminalNode IMPORT() { return getToken(ParserReact.IMPORT, 0); }
		public TerminalNode FROM() { return getToken(ParserReact.FROM, 0); }
		public TerminalNode SIME() { return getToken(ParserReact.SIME, 0); }
		public List<React_librariesContext> react_libraries() {
			return getRuleContexts(React_librariesContext.class);
		}
		public React_librariesContext react_libraries(int i) {
			return getRuleContext(React_librariesContext.class,i);
		}
		public TerminalNode OPEN_BRACE() { return getToken(ParserReact.OPEN_BRACE, 0); }
		public TerminalNode CLOSE_BRACE() { return getToken(ParserReact.CLOSE_BRACE, 0); }
		public Destination_nameContext destination_name() {
			return getRuleContext(Destination_nameContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(ParserReact.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ParserReact.COMMA, i);
		}
		public ImportRContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importR; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserReactListener ) ((ParserReactListener)listener).enterImportR(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserReactListener ) ((ParserReactListener)listener).exitImportR(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserReactVisitor ) return ((ParserReactVisitor<? extends T>)visitor).visitImportR(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportRContext importR() throws RecognitionException {
		ImportRContext _localctx = new ImportRContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_importR);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(225);
			match(IMPORT);
			setState(227);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & 272629817L) != 0)) {
				{
				setState(226);
				react_libraries();
				}
			}

			setState(243);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA || _la==OPEN_BRACE) {
				{
				setState(230);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(229);
					match(COMMA);
					}
				}

				setState(232);
				match(OPEN_BRACE);
				setState(239);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & 272629817L) != 0)) {
					{
					{
					setState(234);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==COMMA) {
						{
						setState(233);
						match(COMMA);
						}
					}

					setState(236);
					react_libraries();
					}
					}
					setState(241);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(242);
				match(CLOSE_BRACE);
				}
			}

			setState(245);
			match(FROM);
			setState(247);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(246);
				destination_name();
				}
			}

			setState(249);
			match(SIME);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Destination_nameContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(ParserReact.IDENTIFIER, 0); }
		public Destination_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_destination_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserReactListener ) ((ParserReactListener)listener).enterDestination_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserReactListener ) ((ParserReactListener)listener).exitDestination_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserReactVisitor ) return ((ParserReactVisitor<? extends T>)visitor).visitDestination_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Destination_nameContext destination_name() throws RecognitionException {
		Destination_nameContext _localctx = new Destination_nameContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_destination_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(251);
			match(IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class React_librariesContext extends ParserRuleContext {
		public TerminalNode USESTATE_() { return getToken(ParserReact.USESTATE_, 0); }
		public TerminalNode USEREF_() { return getToken(ParserReact.USEREF_, 0); }
		public TerminalNode USEEFFECT_() { return getToken(ParserReact.USEEFFECT_, 0); }
		public TerminalNode SYNTAX() { return getToken(ParserReact.SYNTAX, 0); }
		public TerminalNode REACT_() { return getToken(ParserReact.REACT_, 0); }
		public TerminalNode RANDOM_NAME() { return getToken(ParserReact.RANDOM_NAME, 0); }
		public React_librariesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_react_libraries; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserReactListener ) ((ParserReactListener)listener).enterReact_libraries(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserReactListener ) ((ParserReactListener)listener).exitReact_libraries(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserReactVisitor ) return ((ParserReactVisitor<? extends T>)visitor).visitReact_libraries(this);
			else return visitor.visitChildren(this);
		}
	}

	public final React_librariesContext react_libraries() throws RecognitionException {
		React_librariesContext _localctx = new React_librariesContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_react_libraries);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(253);
			_la = _input.LA(1);
			if ( !(((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & 272629817L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SyntaxContext extends ParserRuleContext {
		public TerminalNode ONE_CHAR_LETTER() { return getToken(ParserReact.ONE_CHAR_LETTER, 0); }
		public TerminalNode SIME() { return getToken(ParserReact.SIME, 0); }
		public SyntaxContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_syntax; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserReactListener ) ((ParserReactListener)listener).enterSyntax(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserReactListener ) ((ParserReactListener)listener).exitSyntax(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserReactVisitor ) return ((ParserReactVisitor<? extends T>)visitor).visitSyntax(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SyntaxContext syntax() throws RecognitionException {
		SyntaxContext _localctx = new SyntaxContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_syntax);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(255);
			match(ONE_CHAR_LETTER);
			setState(256);
			match(SIME);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AttributesContext extends ParserRuleContext {
		public TerminalNode OPEN_BRACE() { return getToken(ParserReact.OPEN_BRACE, 0); }
		public List<AttributeContext> attribute() {
			return getRuleContexts(AttributeContext.class);
		}
		public AttributeContext attribute(int i) {
			return getRuleContext(AttributeContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ParserReact.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ParserReact.COMMA, i);
		}
		public TerminalNode CLOSE_BRACE() { return getToken(ParserReact.CLOSE_BRACE, 0); }
		public AttributesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserReactListener ) ((ParserReactListener)listener).enterAttributes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserReactListener ) ((ParserReactListener)listener).exitAttributes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserReactVisitor ) return ((ParserReactVisitor<? extends T>)visitor).visitAttributes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributesContext attributes() throws RecognitionException {
		AttributesContext _localctx = new AttributesContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_attributes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(258);
			match(OPEN_BRACE);
			setState(259);
			attribute();
			setState(264);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(260);
				match(COMMA);
				setState(261);
				attribute();
				}
				}
				setState(266);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(268);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CLOSE_BRACE) {
				{
				setState(267);
				match(CLOSE_BRACE);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AttributeContext extends ParserRuleContext {
		public TerminalNode RANDOM_NAME() { return getToken(ParserReact.RANDOM_NAME, 0); }
		public TerminalNode COLON() { return getToken(ParserReact.COLON, 0); }
		public AttributeValueContext attributeValue() {
			return getRuleContext(AttributeValueContext.class,0);
		}
		public AttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserReactListener ) ((ParserReactListener)listener).enterAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserReactListener ) ((ParserReactListener)listener).exitAttribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserReactVisitor ) return ((ParserReactVisitor<? extends T>)visitor).visitAttribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributeContext attribute() throws RecognitionException {
		AttributeContext _localctx = new AttributeContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_attribute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(270);
			match(RANDOM_NAME);
			setState(271);
			match(COLON);
			setState(272);
			attributeValue();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AttributeValueContext extends ParserRuleContext {
		public TerminalNode NUMERIC_LITERAL() { return getToken(ParserReact.NUMERIC_LITERAL, 0); }
		public TerminalNode SYNTAX() { return getToken(ParserReact.SYNTAX, 0); }
		public AttributeValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributeValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserReactListener ) ((ParserReactListener)listener).enterAttributeValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserReactListener ) ((ParserReactListener)listener).exitAttributeValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserReactVisitor ) return ((ParserReactVisitor<? extends T>)visitor).visitAttributeValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributeValueContext attributeValue() throws RecognitionException {
		AttributeValueContext _localctx = new AttributeValueContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_attributeValue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(274);
			_la = _input.LA(1);
			if ( !(_la==SYNTAX || _la==NUMERIC_LITERAL) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class UseRefContext extends ParserRuleContext {
		public TerminalNode USEREF_() { return getToken(ParserReact.USEREF_, 0); }
		public TerminalNode OPEN_PAREN() { return getToken(ParserReact.OPEN_PAREN, 0); }
		public TerminalNode CLOSE_PAREN() { return getToken(ParserReact.CLOSE_PAREN, 0); }
		public UseRefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_useRef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserReactListener ) ((ParserReactListener)listener).enterUseRef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserReactListener ) ((ParserReactListener)listener).exitUseRef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserReactVisitor ) return ((ParserReactVisitor<? extends T>)visitor).visitUseRef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UseRefContext useRef() throws RecognitionException {
		UseRefContext _localctx = new UseRefContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_useRef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(276);
			match(USEREF_);
			setState(277);
			match(OPEN_PAREN);
			setState(278);
			match(CLOSE_PAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class UseStateContext extends ParserRuleContext {
		public TerminalNode USESTATE_() { return getToken(ParserReact.USESTATE_, 0); }
		public TerminalNode OPEN_PAREN() { return getToken(ParserReact.OPEN_PAREN, 0); }
		public TerminalNode CLOSE_PAREN() { return getToken(ParserReact.CLOSE_PAREN, 0); }
		public List<TerminalNode> SYNTAX() { return getTokens(ParserReact.SYNTAX); }
		public TerminalNode SYNTAX(int i) {
			return getToken(ParserReact.SYNTAX, i);
		}
		public TerminalNode DOT() { return getToken(ParserReact.DOT, 0); }
		public TerminalNode SIME() { return getToken(ParserReact.SIME, 0); }
		public UseStateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_useState; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserReactListener ) ((ParserReactListener)listener).enterUseState(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserReactListener ) ((ParserReactListener)listener).exitUseState(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserReactVisitor ) return ((ParserReactVisitor<? extends T>)visitor).visitUseState(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UseStateContext useState() throws RecognitionException {
		UseStateContext _localctx = new UseStateContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_useState);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(280);
			match(USESTATE_);
			setState(281);
			match(OPEN_PAREN);
			setState(286);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(282);
				match(SYNTAX);
				setState(283);
				match(DOT);
				setState(284);
				match(SYNTAX);
				}
				break;
			case 2:
				{
				setState(285);
				match(SYNTAX);
				}
				break;
			}
			setState(288);
			match(CLOSE_PAREN);
			setState(290);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(289);
				match(SIME);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ArrayContext extends ParserRuleContext {
		public ArrayyContext arrayy() {
			return getRuleContext(ArrayyContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(ParserReact.ASSIGN, 0); }
		public UseStateContext useState() {
			return getRuleContext(UseStateContext.class,0);
		}
		public TerminalNode VAR() { return getToken(ParserReact.VAR, 0); }
		public TerminalNode CONST() { return getToken(ParserReact.CONST, 0); }
		public TerminalNode LET() { return getToken(ParserReact.LET, 0); }
		public TerminalNode SIME() { return getToken(ParserReact.SIME, 0); }
		public ArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserReactListener ) ((ParserReactListener)listener).enterArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserReactListener ) ((ParserReactListener)listener).exitArray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserReactVisitor ) return ((ParserReactVisitor<? extends T>)visitor).visitArray(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayContext array() throws RecognitionException {
		ArrayContext _localctx = new ArrayContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_array);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(292);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 52778705616896L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(293);
			arrayy();
			setState(294);
			match(ASSIGN);
			setState(295);
			useState();
			setState(297);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SIME) {
				{
				setState(296);
				match(SIME);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class UseEffectContext extends ParserRuleContext {
		public TerminalNode USEEFFECT_() { return getToken(ParserReact.USEEFFECT_, 0); }
		public TerminalNode OPEN_PAREN() { return getToken(ParserReact.OPEN_PAREN, 0); }
		public Arrow_functionContext arrow_function() {
			return getRuleContext(Arrow_functionContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(ParserReact.COMMA, 0); }
		public ArrayyContext arrayy() {
			return getRuleContext(ArrayyContext.class,0);
		}
		public TerminalNode CLOSE_PAREN() { return getToken(ParserReact.CLOSE_PAREN, 0); }
		public TerminalNode SIME() { return getToken(ParserReact.SIME, 0); }
		public UseEffectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_useEffect; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserReactListener ) ((ParserReactListener)listener).enterUseEffect(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserReactListener ) ((ParserReactListener)listener).exitUseEffect(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserReactVisitor ) return ((ParserReactVisitor<? extends T>)visitor).visitUseEffect(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UseEffectContext useEffect() throws RecognitionException {
		UseEffectContext _localctx = new UseEffectContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_useEffect);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(299);
			match(USEEFFECT_);
			setState(300);
			match(OPEN_PAREN);
			setState(301);
			arrow_function();
			setState(302);
			match(COMMA);
			setState(303);
			arrayy();
			setState(304);
			match(CLOSE_PAREN);
			setState(305);
			match(SIME);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ArrayyContext extends ParserRuleContext {
		public TerminalNode OPEN_SQUARE() { return getToken(ParserReact.OPEN_SQUARE, 0); }
		public TerminalNode CLOSE_SQUARE() { return getToken(ParserReact.CLOSE_SQUARE, 0); }
		public List<ParContext> par() {
			return getRuleContexts(ParContext.class);
		}
		public ParContext par(int i) {
			return getRuleContext(ParContext.class,i);
		}
		public ArrayyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayy; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserReactListener ) ((ParserReactListener)listener).enterArrayy(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserReactListener ) ((ParserReactListener)listener).exitArrayy(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserReactVisitor ) return ((ParserReactVisitor<? extends T>)visitor).visitArrayy(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayyContext arrayy() throws RecognitionException {
		ArrayyContext _localctx = new ArrayyContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_arrayy);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(307);
			match(OPEN_SQUARE);
			setState(311);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 6917529027775300406L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 2214592513L) != 0)) {
				{
				{
				setState(308);
				par();
				}
				}
				setState(313);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(314);
			match(CLOSE_SQUARE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ParContext extends ParserRuleContext {
		public TerminalNode TYPE() { return getToken(ParserReact.TYPE, 0); }
		public TerminalNode COLON() { return getToken(ParserReact.COLON, 0); }
		public TerminalNode SYNTAX() { return getToken(ParserReact.SYNTAX, 0); }
		public TerminalNode NUMERIC_LITERAL() { return getToken(ParserReact.NUMERIC_LITERAL, 0); }
		public TerminalNode BACKSLASH() { return getToken(ParserReact.BACKSLASH, 0); }
		public TerminalNode DOT() { return getToken(ParserReact.DOT, 0); }
		public TerminalNode COMMA() { return getToken(ParserReact.COMMA, 0); }
		public TerminalNode SINGLE_QUOTE() { return getToken(ParserReact.SINGLE_QUOTE, 0); }
		public TerminalNode JSX_SLASH_OR_DIV() { return getToken(ParserReact.JSX_SLASH_OR_DIV, 0); }
		public TerminalNode OPEN_BRACE() { return getToken(ParserReact.OPEN_BRACE, 0); }
		public TerminalNode CLOSE_BRACE() { return getToken(ParserReact.CLOSE_BRACE, 0); }
		public TerminalNode OPEN_SQUARE() { return getToken(ParserReact.OPEN_SQUARE, 0); }
		public ParContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_par; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserReactListener ) ((ParserReactListener)listener).enterPar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserReactListener ) ((ParserReactListener)listener).exitPar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserReactVisitor ) return ((ParserReactVisitor<? extends T>)visitor).visitPar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParContext par() throws RecognitionException {
		ParContext _localctx = new ParContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_par);
		try {
			setState(328);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TYPE:
				enterOuterAlt(_localctx, 1);
				{
				setState(316);
				match(TYPE);
				}
				break;
			case COLON:
				enterOuterAlt(_localctx, 2);
				{
				setState(317);
				match(COLON);
				}
				break;
			case SYNTAX:
				enterOuterAlt(_localctx, 3);
				{
				setState(318);
				match(SYNTAX);
				}
				break;
			case NUMERIC_LITERAL:
				enterOuterAlt(_localctx, 4);
				{
				setState(319);
				match(NUMERIC_LITERAL);
				}
				break;
			case BACKSLASH:
				enterOuterAlt(_localctx, 5);
				{
				setState(320);
				match(BACKSLASH);
				}
				break;
			case DOT:
				enterOuterAlt(_localctx, 6);
				{
				setState(321);
				match(DOT);
				}
				break;
			case COMMA:
				enterOuterAlt(_localctx, 7);
				{
				setState(322);
				match(COMMA);
				}
				break;
			case SINGLE_QUOTE:
				enterOuterAlt(_localctx, 8);
				{
				setState(323);
				match(SINGLE_QUOTE);
				}
				break;
			case JSX_SLASH_OR_DIV:
				enterOuterAlt(_localctx, 9);
				{
				{
				setState(324);
				match(JSX_SLASH_OR_DIV);
				}
				}
				break;
			case OPEN_BRACE:
				enterOuterAlt(_localctx, 10);
				{
				setState(325);
				match(OPEN_BRACE);
				}
				break;
			case CLOSE_BRACE:
				enterOuterAlt(_localctx, 11);
				{
				setState(326);
				match(CLOSE_BRACE);
				}
				break;
			case OPEN_SQUARE:
				enterOuterAlt(_localctx, 12);
				{
				setState(327);
				match(OPEN_SQUARE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MapContext extends ParserRuleContext {
		public List<TerminalNode> OPEN_BRACE() { return getTokens(ParserReact.OPEN_BRACE); }
		public TerminalNode OPEN_BRACE(int i) {
			return getToken(ParserReact.OPEN_BRACE, i);
		}
		public List<TerminalNode> CLOSE_BRACE() { return getTokens(ParserReact.CLOSE_BRACE); }
		public TerminalNode CLOSE_BRACE(int i) {
			return getToken(ParserReact.CLOSE_BRACE, i);
		}
		public List<TerminalNode> SYNTAX() { return getTokens(ParserReact.SYNTAX); }
		public TerminalNode SYNTAX(int i) {
			return getToken(ParserReact.SYNTAX, i);
		}
		public List<TerminalNode> COLON() { return getTokens(ParserReact.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(ParserReact.COLON, i);
		}
		public List<AttributeValueContext> attributeValue() {
			return getRuleContexts(AttributeValueContext.class);
		}
		public AttributeValueContext attributeValue(int i) {
			return getRuleContext(AttributeValueContext.class,i);
		}
		public List<TerminalNode> DOLLAR() { return getTokens(ParserReact.DOLLAR); }
		public TerminalNode DOLLAR(int i) {
			return getToken(ParserReact.DOLLAR, i);
		}
		public List<ArrayyContext> arrayy() {
			return getRuleContexts(ArrayyContext.class);
		}
		public ArrayyContext arrayy(int i) {
			return getRuleContext(ArrayyContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ParserReact.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ParserReact.COMMA, i);
		}
		public MapContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_map; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserReactListener ) ((ParserReactListener)listener).enterMap(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserReactListener ) ((ParserReactListener)listener).exitMap(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserReactVisitor ) return ((ParserReactVisitor<? extends T>)visitor).visitMap(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MapContext map() throws RecognitionException {
		MapContext _localctx = new MapContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_map);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(330);
			match(OPEN_BRACE);
			setState(346);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SYNTAX) {
				{
				{
				setState(331);
				match(SYNTAX);
				setState(332);
				match(COLON);
				setState(339);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case SYNTAX:
				case NUMERIC_LITERAL:
					{
					setState(333);
					attributeValue();
					}
					break;
				case DOLLAR:
					{
					setState(334);
					match(DOLLAR);
					setState(335);
					match(OPEN_BRACE);
					{
					setState(336);
					match(SYNTAX);
					}
					setState(337);
					match(CLOSE_BRACE);
					}
					break;
				case OPEN_SQUARE:
					{
					setState(338);
					arrayy();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(342);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(341);
					match(COMMA);
					}
				}

				}
				}
				setState(348);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(349);
			match(CLOSE_BRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class OnClickContext extends ParserRuleContext {
		public TerminalNode OPEN_BRACE() { return getToken(ParserReact.OPEN_BRACE, 0); }
		public Arrow_functionContext arrow_function() {
			return getRuleContext(Arrow_functionContext.class,0);
		}
		public TerminalNode CLOSE_BRACE() { return getToken(ParserReact.CLOSE_BRACE, 0); }
		public OnClickContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_onClick; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserReactListener ) ((ParserReactListener)listener).enterOnClick(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserReactListener ) ((ParserReactListener)listener).exitOnClick(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserReactVisitor ) return ((ParserReactVisitor<? extends T>)visitor).visitOnClick(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OnClickContext onClick() throws RecognitionException {
		OnClickContext _localctx = new OnClickContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_onClick);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(351);
			match(OPEN_BRACE);
			setState(352);
			arrow_function();
			setState(353);
			match(CLOSE_BRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MapMethodContext extends ParserRuleContext {
		public TerminalNode MAP_() { return getToken(ParserReact.MAP_, 0); }
		public List<TerminalNode> OPEN_PAREN() { return getTokens(ParserReact.OPEN_PAREN); }
		public TerminalNode OPEN_PAREN(int i) {
			return getToken(ParserReact.OPEN_PAREN, i);
		}
		public List<TerminalNode> CLOSE_PAREN() { return getTokens(ParserReact.CLOSE_PAREN); }
		public TerminalNode CLOSE_PAREN(int i) {
			return getToken(ParserReact.CLOSE_PAREN, i);
		}
		public TerminalNode ARROW() { return getToken(ParserReact.ARROW, 0); }
		public JsxElementContext jsxElement() {
			return getRuleContext(JsxElementContext.class,0);
		}
		public List<TerminalNode> SYNTAX() { return getTokens(ParserReact.SYNTAX); }
		public TerminalNode SYNTAX(int i) {
			return getToken(ParserReact.SYNTAX, i);
		}
		public List<TerminalNode> DOT() { return getTokens(ParserReact.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(ParserReact.DOT, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ParserReact.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ParserReact.COMMA, i);
		}
		public MapMethodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mapMethod; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserReactListener ) ((ParserReactListener)listener).enterMapMethod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserReactListener ) ((ParserReactListener)listener).exitMapMethod(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserReactVisitor ) return ((ParserReactVisitor<? extends T>)visitor).visitMapMethod(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MapMethodContext mapMethod() throws RecognitionException {
		MapMethodContext _localctx = new MapMethodContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_mapMethod);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(359);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SYNTAX) {
				{
				{
				setState(355);
				match(SYNTAX);
				setState(356);
				match(DOT);
				}
				}
				setState(361);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(362);
			match(MAP_);
			setState(363);
			match(OPEN_PAREN);
			setState(364);
			match(OPEN_PAREN);
			setState(371);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SYNTAX) {
				{
				{
				setState(365);
				match(SYNTAX);
				setState(367);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(366);
					match(COMMA);
					}
				}

				}
				}
				setState(373);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(374);
			match(CLOSE_PAREN);
			setState(375);
			match(ARROW);
			setState(376);
			match(OPEN_PAREN);
			setState(377);
			jsxElement();
			setState(378);
			match(CLOSE_PAREN);
			setState(379);
			match(CLOSE_PAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class JsxElementContext extends ParserRuleContext {
		public TerminalNode LT() { return getToken(ParserReact.LT, 0); }
		public List<JsxChild2Context> jsxChild2() {
			return getRuleContexts(JsxChild2Context.class);
		}
		public JsxChild2Context jsxChild2(int i) {
			return getRuleContext(JsxChild2Context.class,i);
		}
		public TerminalNode GT() { return getToken(ParserReact.GT, 0); }
		public JsxElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jsxElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserReactListener ) ((ParserReactListener)listener).enterJsxElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserReactListener ) ((ParserReactListener)listener).exitJsxElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserReactVisitor ) return ((ParserReactVisitor<? extends T>)visitor).visitJsxElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JsxElementContext jsxElement() throws RecognitionException {
		JsxElementContext _localctx = new JsxElementContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_jsxElement);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(381);
			match(LT);
			setState(385);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(382);
					jsxChild2();
					}
					} 
				}
				setState(387);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			}
			setState(389);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				{
				setState(388);
				match(GT);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class JsxChild2Context extends ParserRuleContext {
		public JsxChildContext jsxChild() {
			return getRuleContext(JsxChildContext.class,0);
		}
		public JsxElementContext jsxElement() {
			return getRuleContext(JsxElementContext.class,0);
		}
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public JsxChild2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jsxChild2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserReactListener ) ((ParserReactListener)listener).enterJsxChild2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserReactListener ) ((ParserReactListener)listener).exitJsxChild2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserReactVisitor ) return ((ParserReactVisitor<? extends T>)visitor).visitJsxChild2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JsxChild2Context jsxChild2() throws RecognitionException {
		JsxChild2Context _localctx = new JsxChild2Context(_ctx, getState());
		enterRule(_localctx, 38, RULE_jsxChild2);
		try {
			setState(394);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(391);
				jsxChild();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(392);
				jsxElement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(393);
				functionCall();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class JsxOpenTagContext extends ParserRuleContext {
		public TerminalNode LT() { return getToken(ParserReact.LT, 0); }
		public TerminalNode GT() { return getToken(ParserReact.GT, 0); }
		public List<TerminalNode> SYNTAX() { return getTokens(ParserReact.SYNTAX); }
		public TerminalNode SYNTAX(int i) {
			return getToken(ParserReact.SYNTAX, i);
		}
		public List<JsxChildContext> jsxChild() {
			return getRuleContexts(JsxChildContext.class);
		}
		public JsxChildContext jsxChild(int i) {
			return getRuleContext(JsxChildContext.class,i);
		}
		public TerminalNode JSX_SLASH_OR_DIV() { return getToken(ParserReact.JSX_SLASH_OR_DIV, 0); }
		public JsxOpenTagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jsxOpenTag; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserReactListener ) ((ParserReactListener)listener).enterJsxOpenTag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserReactListener ) ((ParserReactListener)listener).exitJsxOpenTag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserReactVisitor ) return ((ParserReactVisitor<? extends T>)visitor).visitJsxOpenTag(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JsxOpenTagContext jsxOpenTag() throws RecognitionException {
		JsxOpenTagContext _localctx = new JsxOpenTagContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_jsxOpenTag);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(396);
			match(LT);
			setState(400);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(397);
					match(SYNTAX);
					}
					} 
				}
				setState(402);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			}
			setState(406);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(403);
					jsxChild();
					}
					} 
				}
				setState(408);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			}
			setState(410);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==JSX_SLASH_OR_DIV) {
				{
				setState(409);
				match(JSX_SLASH_OR_DIV);
				}
			}

			setState(412);
			match(GT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class JsxChildContext extends ParserRuleContext {
		public TerminalNode ASSIGN() { return getToken(ParserReact.ASSIGN, 0); }
		public TerminalNode OPEN_SQUARE() { return getToken(ParserReact.OPEN_SQUARE, 0); }
		public TerminalNode CLOSE_SQUARE() { return getToken(ParserReact.CLOSE_SQUARE, 0); }
		public TerminalNode LT() { return getToken(ParserReact.LT, 0); }
		public TerminalNode GT() { return getToken(ParserReact.GT, 0); }
		public TerminalNode DOLLAR() { return getToken(ParserReact.DOLLAR, 0); }
		public TerminalNode OPEN_PAREN() { return getToken(ParserReact.OPEN_PAREN, 0); }
		public TerminalNode CLOSE_PAREN() { return getToken(ParserReact.CLOSE_PAREN, 0); }
		public TerminalNode OPEN_BRACE() { return getToken(ParserReact.OPEN_BRACE, 0); }
		public TerminalNode CLOSE_BRACE() { return getToken(ParserReact.CLOSE_BRACE, 0); }
		public TerminalNode QUESTION() { return getToken(ParserReact.QUESTION, 0); }
		public TerminalNode MOD() { return getToken(ParserReact.MOD, 0); }
		public TerminalNode D_C() { return getToken(ParserReact.D_C, 0); }
		public TerminalNode SINGLE_QUOTE() { return getToken(ParserReact.SINGLE_QUOTE, 0); }
		public TerminalNode COLON() { return getToken(ParserReact.COLON, 0); }
		public TerminalNode HASHTAG() { return getToken(ParserReact.HASHTAG, 0); }
		public TerminalNode MINUS() { return getToken(ParserReact.MINUS, 0); }
		public TerminalNode JSX_SLASH_OR_DIV() { return getToken(ParserReact.JSX_SLASH_OR_DIV, 0); }
		public TerminalNode NUMERIC_LITERAL() { return getToken(ParserReact.NUMERIC_LITERAL, 0); }
		public TerminalNode DOT() { return getToken(ParserReact.DOT, 0); }
		public TerminalNode Backtick() { return getToken(ParserReact.Backtick, 0); }
		public TerminalNode ARROW() { return getToken(ParserReact.ARROW, 0); }
		public TerminalNode COMMA() { return getToken(ParserReact.COMMA, 0); }
		public TerminalNode SYNTAX() { return getToken(ParserReact.SYNTAX, 0); }
		public TerminalNode MAP_() { return getToken(ParserReact.MAP_, 0); }
		public JsxChildContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jsxChild; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserReactListener ) ((ParserReactListener)listener).enterJsxChild(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserReactListener ) ((ParserReactListener)listener).exitJsxChild(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserReactVisitor ) return ((ParserReactVisitor<? extends T>)visitor).visitJsxChild(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JsxChildContext jsxChild() throws RecognitionException {
		JsxChildContext _localctx = new JsxChildContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_jsxChild);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(414);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 2504001393267843070L) != 0) || ((((_la - 86)) & ~0x3f) == 0 && ((1L << (_la - 86)) & 529L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionCallContext extends ParserRuleContext {
		public TerminalNode OPEN_BRACE() { return getToken(ParserReact.OPEN_BRACE, 0); }
		public TerminalNode RANDOM_NAME() { return getToken(ParserReact.RANDOM_NAME, 0); }
		public TerminalNode OPEN_PAREN() { return getToken(ParserReact.OPEN_PAREN, 0); }
		public TerminalNode CLOSE_PAREN() { return getToken(ParserReact.CLOSE_PAREN, 0); }
		public TerminalNode CLOSE_BRACE() { return getToken(ParserReact.CLOSE_BRACE, 0); }
		public List<JsxChildContext> jsxChild() {
			return getRuleContexts(JsxChildContext.class);
		}
		public JsxChildContext jsxChild(int i) {
			return getRuleContext(JsxChildContext.class,i);
		}
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserReactListener ) ((ParserReactListener)listener).enterFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserReactListener ) ((ParserReactListener)listener).exitFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserReactVisitor ) return ((ParserReactVisitor<? extends T>)visitor).visitFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_functionCall);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(416);
			match(OPEN_BRACE);
			setState(417);
			match(RANDOM_NAME);
			setState(418);
			match(OPEN_PAREN);
			setState(422);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(419);
					jsxChild();
					}
					} 
				}
				setState(424);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			}
			setState(425);
			match(CLOSE_PAREN);
			setState(426);
			match(CLOSE_BRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class JsxCodeContext extends ParserRuleContext {
		public JsxOpenTagContext jsxOpenTag() {
			return getRuleContext(JsxOpenTagContext.class,0);
		}
		public JsxElementContext jsxElement() {
			return getRuleContext(JsxElementContext.class,0);
		}
		public SyntaxContext syntax() {
			return getRuleContext(SyntaxContext.class,0);
		}
		public JsxCodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jsxCode; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserReactListener ) ((ParserReactListener)listener).enterJsxCode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserReactListener ) ((ParserReactListener)listener).exitJsxCode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserReactVisitor ) return ((ParserReactVisitor<? extends T>)visitor).visitJsxCode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JsxCodeContext jsxCode() throws RecognitionException {
		JsxCodeContext _localctx = new JsxCodeContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_jsxCode);
		try {
			setState(431);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(428);
				jsxOpenTag();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(429);
				jsxElement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(430);
				syntax();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NameContext extends ParserRuleContext {
		public Use_random_nameContext use_random_name() {
			return getRuleContext(Use_random_nameContext.class,0);
		}
		public NameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserReactListener ) ((ParserReactListener)listener).enterName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserReactListener ) ((ParserReactListener)listener).exitName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserReactVisitor ) return ((ParserReactVisitor<? extends T>)visitor).visitName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NameContext name() throws RecognitionException {
		NameContext _localctx = new NameContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(433);
			use_random_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Function_nameContext extends ParserRuleContext {
		public Use_random_nameContext use_random_name() {
			return getRuleContext(Use_random_nameContext.class,0);
		}
		public Function_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserReactListener ) ((ParserReactListener)listener).enterFunction_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserReactListener ) ((ParserReactListener)listener).exitFunction_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserReactVisitor ) return ((ParserReactVisitor<? extends T>)visitor).visitFunction_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_nameContext function_name() throws RecognitionException {
		Function_nameContext _localctx = new Function_nameContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_function_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(435);
			use_random_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Signed_numberContext extends ParserRuleContext {
		public TerminalNode NUMERIC_LITERAL() { return getToken(ParserReact.NUMERIC_LITERAL, 0); }
		public TerminalNode MULTI() { return getToken(ParserReact.MULTI, 0); }
		public TerminalNode PLUS() { return getToken(ParserReact.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(ParserReact.MINUS, 0); }
		public Signed_numberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signed_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserReactListener ) ((ParserReactListener)listener).enterSigned_number(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserReactListener ) ((ParserReactListener)listener).exitSigned_number(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserReactVisitor ) return ((ParserReactVisitor<? extends T>)visitor).visitSigned_number(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Signed_numberContext signed_number() throws RecognitionException {
		Signed_numberContext _localctx = new Signed_numberContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_signed_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(442);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MINUS:
			case PLUS:
			case NUMERIC_LITERAL:
				{
				setState(438);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS || _la==PLUS) {
					{
					setState(437);
					_la = _input.LA(1);
					if ( !(_la==MINUS || _la==PLUS) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(440);
				match(NUMERIC_LITERAL);
				}
				break;
			case MULTI:
				{
				setState(441);
				match(MULTI);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Error_messageContext extends ParserRuleContext {
		public TerminalNode STRING_LITERAL() { return getToken(ParserReact.STRING_LITERAL, 0); }
		public Error_messageContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_error_message; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserReactListener ) ((ParserReactListener)listener).enterError_message(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserReactListener ) ((ParserReactListener)listener).exitError_message(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserReactVisitor ) return ((ParserReactVisitor<? extends T>)visitor).visitError_message(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Error_messageContext error_message() throws RecognitionException {
		Error_messageContext _localctx = new Error_messageContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_error_message);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(444);
			match(STRING_LITERAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Any_nameContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(ParserReact.IDENTIFIER, 0); }
		public TerminalNode RANDOM_NAME() { return getToken(ParserReact.RANDOM_NAME, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(ParserReact.STRING_LITERAL, 0); }
		public Any_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_any_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserReactListener ) ((ParserReactListener)listener).enterAny_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserReactListener ) ((ParserReactListener)listener).exitAny_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserReactVisitor ) return ((ParserReactVisitor<? extends T>)visitor).visitAny_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Any_nameContext any_name() throws RecognitionException {
		Any_nameContext _localctx = new Any_nameContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_any_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(446);
			_la = _input.LA(1);
			if ( !(((((_la - 93)) & ~0x3f) == 0 && ((1L << (_la - 93)) & 11L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Function_declarationContext extends ParserRuleContext {
		public Normal_functionContext normal_function() {
			return getRuleContext(Normal_functionContext.class,0);
		}
		public Arrow_functionContext arrow_function() {
			return getRuleContext(Arrow_functionContext.class,0);
		}
		public Function_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserReactListener ) ((ParserReactListener)listener).enterFunction_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserReactListener ) ((ParserReactListener)listener).exitFunction_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserReactVisitor ) return ((ParserReactVisitor<? extends T>)visitor).visitFunction_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_declarationContext function_declaration() throws RecognitionException {
		Function_declarationContext _localctx = new Function_declarationContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_function_declaration);
		try {
			setState(450);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FUNCTION:
				enterOuterAlt(_localctx, 1);
				{
				setState(448);
				normal_function();
				}
				break;
			case OPEN_PAREN:
				enterOuterAlt(_localctx, 2);
				{
				setState(449);
				arrow_function();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Arrow_functionContext extends ParserRuleContext {
		public TerminalNode OPEN_PAREN() { return getToken(ParserReact.OPEN_PAREN, 0); }
		public TerminalNode CLOSE_PAREN() { return getToken(ParserReact.CLOSE_PAREN, 0); }
		public TerminalNode ARROW() { return getToken(ParserReact.ARROW, 0); }
		public Function_bodyContext function_body() {
			return getRuleContext(Function_bodyContext.class,0);
		}
		public TerminalNode OPEN_BRACE() { return getToken(ParserReact.OPEN_BRACE, 0); }
		public TerminalNode CLOSE_BRACE() { return getToken(ParserReact.CLOSE_BRACE, 0); }
		public List<ArgsContext> args() {
			return getRuleContexts(ArgsContext.class);
		}
		public ArgsContext args(int i) {
			return getRuleContext(ArgsContext.class,i);
		}
		public List<Creating_with_assignContext> creating_with_assign() {
			return getRuleContexts(Creating_with_assignContext.class);
		}
		public Creating_with_assignContext creating_with_assign(int i) {
			return getRuleContext(Creating_with_assignContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ParserReact.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ParserReact.COMMA, i);
		}
		public Arrow_functionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrow_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserReactListener ) ((ParserReactListener)listener).enterArrow_function(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserReactListener ) ((ParserReactListener)listener).exitArrow_function(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserReactVisitor ) return ((ParserReactVisitor<? extends T>)visitor).visitArrow_function(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Arrow_functionContext arrow_function() throws RecognitionException {
		Arrow_functionContext _localctx = new Arrow_functionContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_arrow_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(452);
			match(OPEN_PAREN);
			setState(454);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_BRACE) {
				{
				setState(453);
				match(OPEN_BRACE);
				}
			}

			setState(470);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 52778705616896L) != 0) || _la==RANDOM_NAME) {
				{
				{
				setState(458);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
				case 1:
					{
					setState(456);
					args();
					}
					break;
				case 2:
					{
					setState(457);
					creating_with_assign();
					}
					break;
				}
				setState(467);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(460);
					match(COMMA);
					setState(463);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
					case 1:
						{
						setState(461);
						args();
						}
						break;
					case 2:
						{
						setState(462);
						creating_with_assign();
						}
						break;
					}
					}
					}
					setState(469);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
			}

			setState(473);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CLOSE_BRACE) {
				{
				setState(472);
				match(CLOSE_BRACE);
				}
			}

			setState(475);
			match(CLOSE_PAREN);
			setState(476);
			match(ARROW);
			setState(477);
			function_body();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Normal_functionContext extends ParserRuleContext {
		public TerminalNode FUNCTION() { return getToken(ParserReact.FUNCTION, 0); }
		public Function_headerContext function_header() {
			return getRuleContext(Function_headerContext.class,0);
		}
		public Function_bodyContext function_body() {
			return getRuleContext(Function_bodyContext.class,0);
		}
		public Normal_functionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_normal_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserReactListener ) ((ParserReactListener)listener).enterNormal_function(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserReactListener ) ((ParserReactListener)listener).exitNormal_function(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserReactVisitor ) return ((ParserReactVisitor<? extends T>)visitor).visitNormal_function(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Normal_functionContext normal_function() throws RecognitionException {
		Normal_functionContext _localctx = new Normal_functionContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_normal_function);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(479);
			match(FUNCTION);
			setState(480);
			function_header();
			setState(481);
			function_body();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Function_headerContext extends ParserRuleContext {
		public Use_random_nameContext use_random_name() {
			return getRuleContext(Use_random_nameContext.class,0);
		}
		public TerminalNode OPEN_PAREN() { return getToken(ParserReact.OPEN_PAREN, 0); }
		public TerminalNode CLOSE_PAREN() { return getToken(ParserReact.CLOSE_PAREN, 0); }
		public List<ArgsContext> args() {
			return getRuleContexts(ArgsContext.class);
		}
		public ArgsContext args(int i) {
			return getRuleContext(ArgsContext.class,i);
		}
		public List<Creating_with_assignContext> creating_with_assign() {
			return getRuleContexts(Creating_with_assignContext.class);
		}
		public Creating_with_assignContext creating_with_assign(int i) {
			return getRuleContext(Creating_with_assignContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ParserReact.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ParserReact.COMMA, i);
		}
		public Function_headerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_header; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserReactListener ) ((ParserReactListener)listener).enterFunction_header(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserReactListener ) ((ParserReactListener)listener).exitFunction_header(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserReactVisitor ) return ((ParserReactVisitor<? extends T>)visitor).visitFunction_header(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_headerContext function_header() throws RecognitionException {
		Function_headerContext _localctx = new Function_headerContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_function_header);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(483);
			use_random_name();
			setState(484);
			match(OPEN_PAREN);
			{
			setState(499);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 52778705616896L) != 0) || _la==RANDOM_NAME) {
				{
				{
				setState(487);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
				case 1:
					{
					setState(485);
					args();
					}
					break;
				case 2:
					{
					setState(486);
					creating_with_assign();
					}
					break;
				}
				setState(496);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(489);
					match(COMMA);
					setState(492);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
					case 1:
						{
						setState(490);
						args();
						}
						break;
					case 2:
						{
						setState(491);
						creating_with_assign();
						}
						break;
					}
					}
					}
					setState(498);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
			}

			}
			setState(501);
			match(CLOSE_PAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Function_bodyContext extends ParserRuleContext {
		public TerminalNode OPEN_BRACE() { return getToken(ParserReact.OPEN_BRACE, 0); }
		public List<Sub_function_bodyContext> sub_function_body() {
			return getRuleContexts(Sub_function_bodyContext.class);
		}
		public Sub_function_bodyContext sub_function_body(int i) {
			return getRuleContext(Sub_function_bodyContext.class,i);
		}
		public List<InstructionsContext> instructions() {
			return getRuleContexts(InstructionsContext.class);
		}
		public InstructionsContext instructions(int i) {
			return getRuleContext(InstructionsContext.class,i);
		}
		public List<JsxCodeContext> jsxCode() {
			return getRuleContexts(JsxCodeContext.class);
		}
		public JsxCodeContext jsxCode(int i) {
			return getRuleContext(JsxCodeContext.class,i);
		}
		public Return_ruleContext return_rule() {
			return getRuleContext(Return_ruleContext.class,0);
		}
		public TerminalNode SIME() { return getToken(ParserReact.SIME, 0); }
		public TerminalNode CLOSE_BRACE() { return getToken(ParserReact.CLOSE_BRACE, 0); }
		public Function_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserReactListener ) ((ParserReactListener)listener).enterFunction_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserReactListener ) ((ParserReactListener)listener).exitFunction_body(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserReactVisitor ) return ((ParserReactVisitor<? extends T>)visitor).visitFunction_body(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_bodyContext function_body() throws RecognitionException {
		Function_bodyContext _localctx = new Function_bodyContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_function_body);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(504);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				{
				setState(503);
				match(OPEN_BRACE);
				}
				break;
			}
			setState(511);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(509);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case OPEN_BRACE:
						{
						setState(506);
						sub_function_body();
						}
						break;
					case PLPL:
					case CONST:
					case IF:
					case FOR:
					case FOREACH:
					case WHILE:
					case DO:
					case VAR:
					case LET:
					case SWITCH:
					case CONSOLE_:
					case MINUS_MINUS:
					case RANDOM_NAME:
						{
						setState(507);
						instructions();
						}
						break;
					case LT:
					case ONE_CHAR_LETTER:
						{
						setState(508);
						jsxCode();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(513);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
			}
			setState(517);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
			case 1:
				{
				setState(514);
				return_rule();
				setState(515);
				match(SIME);
				}
				break;
			}
			setState(520);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				{
				setState(519);
				match(CLOSE_BRACE);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Sub_function_bodyContext extends ParserRuleContext {
		public TerminalNode OPEN_BRACE() { return getToken(ParserReact.OPEN_BRACE, 0); }
		public TerminalNode CLOSE_BRACE() { return getToken(ParserReact.CLOSE_BRACE, 0); }
		public List<Sub_function_bodyContext> sub_function_body() {
			return getRuleContexts(Sub_function_bodyContext.class);
		}
		public Sub_function_bodyContext sub_function_body(int i) {
			return getRuleContext(Sub_function_bodyContext.class,i);
		}
		public List<InstructionsContext> instructions() {
			return getRuleContexts(InstructionsContext.class);
		}
		public InstructionsContext instructions(int i) {
			return getRuleContext(InstructionsContext.class,i);
		}
		public Sub_function_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sub_function_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserReactListener ) ((ParserReactListener)listener).enterSub_function_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserReactListener ) ((ParserReactListener)listener).exitSub_function_body(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserReactVisitor ) return ((ParserReactVisitor<? extends T>)visitor).visitSub_function_body(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sub_function_bodyContext sub_function_body() throws RecognitionException {
		Sub_function_bodyContext _localctx = new Sub_function_bodyContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_sub_function_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(522);
			match(OPEN_BRACE);
			setState(527);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 342568739536912L) != 0) || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & 4210689L) != 0)) {
				{
				setState(525);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case OPEN_BRACE:
					{
					setState(523);
					sub_function_body();
					}
					break;
				case PLPL:
				case CONST:
				case IF:
				case FOR:
				case FOREACH:
				case WHILE:
				case DO:
				case VAR:
				case LET:
				case SWITCH:
				case CONSOLE_:
				case MINUS_MINUS:
				case RANDOM_NAME:
					{
					setState(524);
					instructions();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(529);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(530);
			match(CLOSE_BRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InstructionsContext extends ParserRuleContext {
		public Functional_instructionContext functional_instruction() {
			return getRuleContext(Functional_instructionContext.class,0);
		}
		public Nonfunctional_instructionContext nonfunctional_instruction() {
			return getRuleContext(Nonfunctional_instructionContext.class,0);
		}
		public InstructionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instructions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserReactListener ) ((ParserReactListener)listener).enterInstructions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserReactListener ) ((ParserReactListener)listener).exitInstructions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserReactVisitor ) return ((ParserReactVisitor<? extends T>)visitor).visitInstructions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstructionsContext instructions() throws RecognitionException {
		InstructionsContext _localctx = new InstructionsContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_instructions);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(534);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IF:
			case FOR:
			case FOREACH:
			case WHILE:
			case DO:
			case SWITCH:
				{
				setState(532);
				functional_instruction();
				}
				break;
			case PLPL:
			case CONST:
			case VAR:
			case LET:
			case CONSOLE_:
			case MINUS_MINUS:
			case RANDOM_NAME:
				{
				setState(533);
				nonfunctional_instruction();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Functional_instructionContext extends ParserRuleContext {
		public Do_whileContext do_while() {
			return getRuleContext(Do_whileContext.class,0);
		}
		public If_else_ruleContext if_else_rule() {
			return getRuleContext(If_else_ruleContext.class,0);
		}
		public Switch_ruleContext switch_rule() {
			return getRuleContext(Switch_ruleContext.class,0);
		}
		public While_ruleContext while_rule() {
			return getRuleContext(While_ruleContext.class,0);
		}
		public ForeachContext foreach() {
			return getRuleContext(ForeachContext.class,0);
		}
		public For_loop_ruleContext for_loop_rule() {
			return getRuleContext(For_loop_ruleContext.class,0);
		}
		public TerminalNode SIME() { return getToken(ParserReact.SIME, 0); }
		public TerminalNode OPEN_BRACE() { return getToken(ParserReact.OPEN_BRACE, 0); }
		public TerminalNode CLOSE_BRACE() { return getToken(ParserReact.CLOSE_BRACE, 0); }
		public List<InstructionsContext> instructions() {
			return getRuleContexts(InstructionsContext.class);
		}
		public InstructionsContext instructions(int i) {
			return getRuleContext(InstructionsContext.class,i);
		}
		public Exiting_loopsContext exiting_loops() {
			return getRuleContext(Exiting_loopsContext.class,0);
		}
		public Functional_instructionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functional_instruction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserReactListener ) ((ParserReactListener)listener).enterFunctional_instruction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserReactListener ) ((ParserReactListener)listener).exitFunctional_instruction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserReactVisitor ) return ((ParserReactVisitor<? extends T>)visitor).visitFunctional_instruction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Functional_instructionContext functional_instruction() throws RecognitionException {
		Functional_instructionContext _localctx = new Functional_instructionContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_functional_instruction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(564);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DO:
				{
				setState(536);
				do_while();
				}
				break;
			case IF:
				{
				setState(537);
				if_else_rule();
				}
				break;
			case SWITCH:
				{
				setState(538);
				switch_rule();
				}
				break;
			case FOR:
			case FOREACH:
			case WHILE:
				{
				setState(542);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case WHILE:
					{
					setState(539);
					while_rule();
					}
					break;
				case FOREACH:
					{
					setState(540);
					foreach();
					}
					break;
				case FOR:
					{
					setState(541);
					for_loop_rule();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(562);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case SIME:
				case BREAK:
				case CONTINUE:
				case RETURN:
					{
					setState(545);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
					case 1:
						{
						setState(544);
						exiting_loops();
						}
						break;
					}
					setState(547);
					match(SIME);
					}
					break;
				case OPEN_BRACE:
					{
					setState(548);
					match(OPEN_BRACE);
					setState(552);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 342568739536896L) != 0) || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & 4210689L) != 0)) {
						{
						{
						setState(549);
						instructions();
						}
						}
						setState(554);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(558);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 60131639296L) != 0)) {
						{
						setState(555);
						exiting_loops();
						setState(556);
						match(SIME);
						}
					}

					setState(560);
					match(CLOSE_BRACE);
					}
					break;
				case PLPL:
				case CONST:
				case IF:
				case FOR:
				case FOREACH:
				case WHILE:
				case DO:
				case VAR:
				case LET:
				case SWITCH:
				case CONSOLE_:
				case MINUS_MINUS:
				case RANDOM_NAME:
					{
					setState(561);
					instructions();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Nonfunctional_instructionContext extends ParserRuleContext {
		public TerminalNode SIME() { return getToken(ParserReact.SIME, 0); }
		public Call_functionContext call_function() {
			return getRuleContext(Call_functionContext.class,0);
		}
		public Print_statmentContext print_statment() {
			return getRuleContext(Print_statmentContext.class,0);
		}
		public Shortcut_statmentsContext shortcut_statments() {
			return getRuleContext(Shortcut_statmentsContext.class,0);
		}
		public General_creatingContext general_creating() {
			return getRuleContext(General_creatingContext.class,0);
		}
		public Genral_assignContext genral_assign() {
			return getRuleContext(Genral_assignContext.class,0);
		}
		public Nonfunctional_instructionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nonfunctional_instruction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserReactListener ) ((ParserReactListener)listener).enterNonfunctional_instruction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserReactListener ) ((ParserReactListener)listener).exitNonfunctional_instruction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserReactVisitor ) return ((ParserReactVisitor<? extends T>)visitor).visitNonfunctional_instruction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Nonfunctional_instructionContext nonfunctional_instruction() throws RecognitionException {
		Nonfunctional_instructionContext _localctx = new Nonfunctional_instructionContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_nonfunctional_instruction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(571);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
			case 1:
				{
				setState(566);
				call_function();
				}
				break;
			case 2:
				{
				setState(567);
				print_statment();
				}
				break;
			case 3:
				{
				setState(568);
				shortcut_statments();
				}
				break;
			case 4:
				{
				setState(569);
				general_creating();
				}
				break;
			case 5:
				{
				setState(570);
				genral_assign();
				}
				break;
			}
			setState(573);
			match(SIME);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Call_functionContext extends ParserRuleContext {
		public Use_random_nameContext use_random_name() {
			return getRuleContext(Use_random_nameContext.class,0);
		}
		public TerminalNode OPEN_PAREN() { return getToken(ParserReact.OPEN_PAREN, 0); }
		public TerminalNode CLOSE_PAREN() { return getToken(ParserReact.CLOSE_PAREN, 0); }
		public List<PrametersContext> prameters() {
			return getRuleContexts(PrametersContext.class);
		}
		public PrametersContext prameters(int i) {
			return getRuleContext(PrametersContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ParserReact.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ParserReact.COMMA, i);
		}
		public Call_functionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_call_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserReactListener ) ((ParserReactListener)listener).enterCall_function(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserReactListener ) ((ParserReactListener)listener).exitCall_function(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserReactVisitor ) return ((ParserReactVisitor<? extends T>)visitor).visitCall_function(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Call_functionContext call_function() throws RecognitionException {
		Call_functionContext _localctx = new Call_functionContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_call_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(575);
			use_random_name();
			setState(576);
			match(OPEN_PAREN);
			setState(587);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4295491648L) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & 3900702915L) != 0)) {
				{
				{
				setState(577);
				prameters();
				setState(582);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(578);
					match(COMMA);
					setState(579);
					prameters();
					}
					}
					setState(584);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(589);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(590);
			match(CLOSE_PAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Callback_funcContext extends ParserRuleContext {
		public Function_headerContext function_header() {
			return getRuleContext(Function_headerContext.class,0);
		}
		public Function_bodyContext function_body() {
			return getRuleContext(Function_bodyContext.class,0);
		}
		public Callback_funcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callback_func; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserReactListener ) ((ParserReactListener)listener).enterCallback_func(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserReactListener ) ((ParserReactListener)listener).exitCallback_func(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserReactVisitor ) return ((ParserReactVisitor<? extends T>)visitor).visitCallback_func(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Callback_funcContext callback_func() throws RecognitionException {
		Callback_funcContext _localctx = new Callback_funcContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_callback_func);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(592);
			function_header();
			setState(593);
			function_body();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ArgsContext extends ParserRuleContext {
		public Create_without_assignContext create_without_assign() {
			return getRuleContext(Create_without_assignContext.class,0);
		}
		public Callback_funcContext callback_func() {
			return getRuleContext(Callback_funcContext.class,0);
		}
		public ArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_args; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserReactListener ) ((ParserReactListener)listener).enterArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserReactListener ) ((ParserReactListener)listener).exitArgs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserReactVisitor ) return ((ParserReactVisitor<? extends T>)visitor).visitArgs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgsContext args() throws RecognitionException {
		ArgsContext _localctx = new ArgsContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_args);
		try {
			setState(597);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CONST:
			case VAR:
			case LET:
				enterOuterAlt(_localctx, 1);
				{
				setState(595);
				create_without_assign();
				}
				break;
			case RANDOM_NAME:
				enterOuterAlt(_localctx, 2);
				{
				setState(596);
				callback_func();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PrametersContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode NUMERIC_LITERAL() { return getToken(ParserReact.NUMERIC_LITERAL, 0); }
		public TerminalNode ONE_CHAR_LETTER() { return getToken(ParserReact.ONE_CHAR_LETTER, 0); }
		public Call_functionContext call_function() {
			return getRuleContext(Call_functionContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(ParserReact.IDENTIFIER, 0); }
		public Use_random_nameContext use_random_name() {
			return getRuleContext(Use_random_nameContext.class,0);
		}
		public Varible_from_objectContext varible_from_object() {
			return getRuleContext(Varible_from_objectContext.class,0);
		}
		public Array_base_form_with_indexContext array_base_form_with_index() {
			return getRuleContext(Array_base_form_with_indexContext.class,0);
		}
		public Genral_assignContext genral_assign() {
			return getRuleContext(Genral_assignContext.class,0);
		}
		public PrametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserReactListener ) ((ParserReactListener)listener).enterPrameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserReactListener ) ((ParserReactListener)listener).exitPrameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserReactVisitor ) return ((ParserReactVisitor<? extends T>)visitor).visitPrameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrametersContext prameters() throws RecognitionException {
		PrametersContext _localctx = new PrametersContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_prameters);
		try {
			setState(608);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(599);
				expression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(600);
				match(NUMERIC_LITERAL);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(601);
				match(ONE_CHAR_LETTER);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(602);
				call_function();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(603);
				match(IDENTIFIER);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(604);
				use_random_name();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(605);
				varible_from_object();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(606);
				array_base_form_with_index();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(607);
				genral_assign();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Return_ruleContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(ParserReact.RETURN, 0); }
		public Return_typeContext return_type() {
			return getRuleContext(Return_typeContext.class,0);
		}
		public Return_ruleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_rule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserReactListener ) ((ParserReactListener)listener).enterReturn_rule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserReactListener ) ((ParserReactListener)listener).exitReturn_rule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserReactVisitor ) return ((ParserReactVisitor<? extends T>)visitor).visitReturn_rule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Return_ruleContext return_rule() throws RecognitionException {
		Return_ruleContext _localctx = new Return_ruleContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_return_rule);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(612);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RETURN) {
				{
				setState(610);
				match(RETURN);
				{
				setState(611);
				return_type();
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Exiting_loopsContext extends ParserRuleContext {
		public Return_ruleContext return_rule() {
			return getRuleContext(Return_ruleContext.class,0);
		}
		public TerminalNode BREAK() { return getToken(ParserReact.BREAK, 0); }
		public TerminalNode CONTINUE() { return getToken(ParserReact.CONTINUE, 0); }
		public Exiting_loopsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exiting_loops; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserReactListener ) ((ParserReactListener)listener).enterExiting_loops(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserReactListener ) ((ParserReactListener)listener).exitExiting_loops(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserReactVisitor ) return ((ParserReactVisitor<? extends T>)visitor).visitExiting_loops(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Exiting_loopsContext exiting_loops() throws RecognitionException {
		Exiting_loopsContext _localctx = new Exiting_loopsContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_exiting_loops);
		int _la;
		try {
			setState(616);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SIME:
			case RETURN:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(614);
				return_rule();
				}
				}
				break;
			case BREAK:
			case CONTINUE:
				enterOuterAlt(_localctx, 2);
				{
				setState(615);
				_la = _input.LA(1);
				if ( !(_la==BREAK || _la==CONTINUE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Return_typeContext extends ParserRuleContext {
		public Intral_expression_valueContext intral_expression_value() {
			return getRuleContext(Intral_expression_valueContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Bool_expressionContext bool_expression() {
			return getRuleContext(Bool_expressionContext.class,0);
		}
		public OnClickContext onClick() {
			return getRuleContext(OnClickContext.class,0);
		}
		public MapMethodContext mapMethod() {
			return getRuleContext(MapMethodContext.class,0);
		}
		public JsxElementContext jsxElement() {
			return getRuleContext(JsxElementContext.class,0);
		}
		public TerminalNode NULL() { return getToken(ParserReact.NULL, 0); }
		public Return_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserReactListener ) ((ParserReactListener)listener).enterReturn_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserReactListener ) ((ParserReactListener)listener).exitReturn_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserReactVisitor ) return ((ParserReactVisitor<? extends T>)visitor).visitReturn_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Return_typeContext return_type() throws RecognitionException {
		Return_typeContext _localctx = new Return_typeContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_return_type);
		try {
			setState(626);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(619);
				intral_expression_value();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(620);
				expression(0);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(621);
				bool_expression();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(622);
				onClick();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(623);
				mapMethod();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(624);
				jsxElement();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(625);
				match(NULL);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Print_statmentContext extends ParserRuleContext {
		public TerminalNode CONSOLE_() { return getToken(ParserReact.CONSOLE_, 0); }
		public TerminalNode DOT() { return getToken(ParserReact.DOT, 0); }
		public TerminalNode LOG_() { return getToken(ParserReact.LOG_, 0); }
		public TerminalNode OPEN_PAREN() { return getToken(ParserReact.OPEN_PAREN, 0); }
		public TerminalNode CLOSE_PAREN() { return getToken(ParserReact.CLOSE_PAREN, 0); }
		public List<Indisde_the_printContext> indisde_the_print() {
			return getRuleContexts(Indisde_the_printContext.class);
		}
		public Indisde_the_printContext indisde_the_print(int i) {
			return getRuleContext(Indisde_the_printContext.class,i);
		}
		public List<TerminalNode> PLUS() { return getTokens(ParserReact.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(ParserReact.PLUS, i);
		}
		public Print_statmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print_statment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserReactListener ) ((ParserReactListener)listener).enterPrint_statment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserReactListener ) ((ParserReactListener)listener).exitPrint_statment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserReactVisitor ) return ((ParserReactVisitor<? extends T>)visitor).visitPrint_statment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Print_statmentContext print_statment() throws RecognitionException {
		Print_statmentContext _localctx = new Print_statmentContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_print_statment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(628);
			match(CONSOLE_);
			setState(629);
			match(DOT);
			setState(630);
			match(LOG_);
			setState(631);
			match(OPEN_PAREN);
			{
			setState(632);
			indisde_the_print();
			}
			setState(637);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PLUS) {
				{
				{
				setState(633);
				match(PLUS);
				setState(634);
				indisde_the_print();
				}
				}
				setState(639);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(640);
			match(CLOSE_PAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Indisde_the_printContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(ParserReact.IDENTIFIER, 0); }
		public Use_random_nameContext use_random_name() {
			return getRuleContext(Use_random_nameContext.class,0);
		}
		public Call_functionContext call_function() {
			return getRuleContext(Call_functionContext.class,0);
		}
		public Varible_from_objectContext varible_from_object() {
			return getRuleContext(Varible_from_objectContext.class,0);
		}
		public Array_base_form_with_indexContext array_base_form_with_index() {
			return getRuleContext(Array_base_form_with_indexContext.class,0);
		}
		public Indisde_the_printContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indisde_the_print; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserReactListener ) ((ParserReactListener)listener).enterIndisde_the_print(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserReactListener ) ((ParserReactListener)listener).exitIndisde_the_print(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserReactVisitor ) return ((ParserReactVisitor<? extends T>)visitor).visitIndisde_the_print(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Indisde_the_printContext indisde_the_print() throws RecognitionException {
		Indisde_the_printContext _localctx = new Indisde_the_printContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_indisde_the_print);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(648);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
			case 1:
				{
				setState(642);
				expression(0);
				}
				break;
			case 2:
				{
				setState(643);
				match(IDENTIFIER);
				}
				break;
			case 3:
				{
				setState(644);
				use_random_name();
				}
				break;
			case 4:
				{
				setState(645);
				call_function();
				}
				break;
			case 5:
				{
				setState(646);
				varible_from_object();
				}
				break;
			case 6:
				{
				setState(647);
				array_base_form_with_index();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class If_else_ruleContext extends ParserRuleContext {
		public If_ruleContext if_rule() {
			return getRuleContext(If_ruleContext.class,0);
		}
		public List<Else_if_ruleContext> else_if_rule() {
			return getRuleContexts(Else_if_ruleContext.class);
		}
		public Else_if_ruleContext else_if_rule(int i) {
			return getRuleContext(Else_if_ruleContext.class,i);
		}
		public Else_rulseContext else_rulse() {
			return getRuleContext(Else_rulseContext.class,0);
		}
		public If_else_ruleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_else_rule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserReactListener ) ((ParserReactListener)listener).enterIf_else_rule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserReactListener ) ((ParserReactListener)listener).exitIf_else_rule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserReactVisitor ) return ((ParserReactVisitor<? extends T>)visitor).visitIf_else_rule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_else_ruleContext if_else_rule() throws RecognitionException {
		If_else_ruleContext _localctx = new If_else_ruleContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_if_else_rule);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(650);
			if_rule();
			setState(654);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,68,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(651);
					else_if_rule();
					}
					} 
				}
				setState(656);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,68,_ctx);
			}
			setState(658);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,69,_ctx) ) {
			case 1:
				{
				setState(657);
				else_rulse();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class If_ruleContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(ParserReact.IF, 0); }
		public TerminalNode OPEN_PAREN() { return getToken(ParserReact.OPEN_PAREN, 0); }
		public TerminalNode CLOSE_PAREN() { return getToken(ParserReact.CLOSE_PAREN, 0); }
		public Bool_expressionContext bool_expression() {
			return getRuleContext(Bool_expressionContext.class,0);
		}
		public TerminalNode OPEN_BRACE() { return getToken(ParserReact.OPEN_BRACE, 0); }
		public TerminalNode CLOSE_BRACE() { return getToken(ParserReact.CLOSE_BRACE, 0); }
		public TerminalNode SIME() { return getToken(ParserReact.SIME, 0); }
		public List<InstructionsContext> instructions() {
			return getRuleContexts(InstructionsContext.class);
		}
		public InstructionsContext instructions(int i) {
			return getRuleContext(InstructionsContext.class,i);
		}
		public Return_ruleContext return_rule() {
			return getRuleContext(Return_ruleContext.class,0);
		}
		public If_ruleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_rule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserReactListener ) ((ParserReactListener)listener).enterIf_rule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserReactListener ) ((ParserReactListener)listener).exitIf_rule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserReactVisitor ) return ((ParserReactVisitor<? extends T>)visitor).visitIf_rule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_ruleContext if_rule() throws RecognitionException {
		If_ruleContext _localctx = new If_ruleContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_if_rule);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(660);
			match(IF);
			setState(661);
			match(OPEN_PAREN);
			{
			setState(662);
			bool_expression();
			}
			setState(663);
			match(CLOSE_PAREN);
			setState(682);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_BRACE:
				{
				setState(664);
				match(OPEN_BRACE);
				setState(668);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 342568739536896L) != 0) || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & 4210689L) != 0)) {
					{
					{
					setState(665);
					instructions();
					}
					}
					setState(670);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(674);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SIME || _la==RETURN) {
					{
					setState(671);
					return_rule();
					setState(672);
					match(SIME);
					}
				}

				setState(676);
				match(CLOSE_BRACE);
				}
				break;
			case PLPL:
			case SIME:
			case CONST:
			case RETURN:
			case IF:
			case FOR:
			case FOREACH:
			case WHILE:
			case DO:
			case VAR:
			case LET:
			case SWITCH:
			case CONSOLE_:
			case MINUS_MINUS:
			case RANDOM_NAME:
				{
				setState(679);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,72,_ctx) ) {
				case 1:
					{
					setState(677);
					return_rule();
					}
					break;
				case 2:
					{
					setState(678);
					instructions();
					}
					break;
				}
				setState(681);
				match(SIME);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Else_if_ruleContext extends ParserRuleContext {
		public TerminalNode ELSE_IF() { return getToken(ParserReact.ELSE_IF, 0); }
		public TerminalNode OPEN_PAREN() { return getToken(ParserReact.OPEN_PAREN, 0); }
		public TerminalNode CLOSE_PAREN() { return getToken(ParserReact.CLOSE_PAREN, 0); }
		public Bool_expressionContext bool_expression() {
			return getRuleContext(Bool_expressionContext.class,0);
		}
		public TerminalNode OPEN_BRACE() { return getToken(ParserReact.OPEN_BRACE, 0); }
		public TerminalNode CLOSE_BRACE() { return getToken(ParserReact.CLOSE_BRACE, 0); }
		public TerminalNode SIME() { return getToken(ParserReact.SIME, 0); }
		public List<InstructionsContext> instructions() {
			return getRuleContexts(InstructionsContext.class);
		}
		public InstructionsContext instructions(int i) {
			return getRuleContext(InstructionsContext.class,i);
		}
		public Return_ruleContext return_rule() {
			return getRuleContext(Return_ruleContext.class,0);
		}
		public Else_if_ruleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else_if_rule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserReactListener ) ((ParserReactListener)listener).enterElse_if_rule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserReactListener ) ((ParserReactListener)listener).exitElse_if_rule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserReactVisitor ) return ((ParserReactVisitor<? extends T>)visitor).visitElse_if_rule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Else_if_ruleContext else_if_rule() throws RecognitionException {
		Else_if_ruleContext _localctx = new Else_if_ruleContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_else_if_rule);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(684);
			match(ELSE_IF);
			setState(685);
			match(OPEN_PAREN);
			{
			setState(686);
			bool_expression();
			}
			setState(687);
			match(CLOSE_PAREN);
			setState(706);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_BRACE:
				{
				setState(688);
				match(OPEN_BRACE);
				setState(692);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 342568739536896L) != 0) || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & 4210689L) != 0)) {
					{
					{
					setState(689);
					instructions();
					}
					}
					setState(694);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(698);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SIME || _la==RETURN) {
					{
					setState(695);
					return_rule();
					setState(696);
					match(SIME);
					}
				}

				setState(700);
				match(CLOSE_BRACE);
				}
				break;
			case PLPL:
			case SIME:
			case CONST:
			case RETURN:
			case IF:
			case FOR:
			case FOREACH:
			case WHILE:
			case DO:
			case VAR:
			case LET:
			case SWITCH:
			case CONSOLE_:
			case MINUS_MINUS:
			case RANDOM_NAME:
				{
				setState(703);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,76,_ctx) ) {
				case 1:
					{
					setState(701);
					return_rule();
					}
					break;
				case 2:
					{
					setState(702);
					instructions();
					}
					break;
				}
				setState(705);
				match(SIME);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Else_rulseContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(ParserReact.ELSE, 0); }
		public TerminalNode OPEN_BRACE() { return getToken(ParserReact.OPEN_BRACE, 0); }
		public TerminalNode CLOSE_BRACE() { return getToken(ParserReact.CLOSE_BRACE, 0); }
		public TerminalNode SIME() { return getToken(ParserReact.SIME, 0); }
		public List<InstructionsContext> instructions() {
			return getRuleContexts(InstructionsContext.class);
		}
		public InstructionsContext instructions(int i) {
			return getRuleContext(InstructionsContext.class,i);
		}
		public Return_ruleContext return_rule() {
			return getRuleContext(Return_ruleContext.class,0);
		}
		public Else_rulseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else_rulse; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserReactListener ) ((ParserReactListener)listener).enterElse_rulse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserReactListener ) ((ParserReactListener)listener).exitElse_rulse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserReactVisitor ) return ((ParserReactVisitor<? extends T>)visitor).visitElse_rulse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Else_rulseContext else_rulse() throws RecognitionException {
		Else_rulseContext _localctx = new Else_rulseContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_else_rulse);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(708);
			match(ELSE);
			setState(727);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_BRACE:
				{
				setState(709);
				match(OPEN_BRACE);
				setState(713);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 342568739536896L) != 0) || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & 4210689L) != 0)) {
					{
					{
					setState(710);
					instructions();
					}
					}
					setState(715);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(719);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SIME || _la==RETURN) {
					{
					setState(716);
					return_rule();
					setState(717);
					match(SIME);
					}
				}

				setState(721);
				match(CLOSE_BRACE);
				}
				break;
			case PLPL:
			case SIME:
			case CONST:
			case RETURN:
			case IF:
			case FOR:
			case FOREACH:
			case WHILE:
			case DO:
			case VAR:
			case LET:
			case SWITCH:
			case CONSOLE_:
			case MINUS_MINUS:
			case RANDOM_NAME:
				{
				setState(724);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,80,_ctx) ) {
				case 1:
					{
					setState(722);
					return_rule();
					}
					break;
				case 2:
					{
					setState(723);
					instructions();
					}
					break;
				}
				setState(726);
				match(SIME);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class While_ruleContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(ParserReact.WHILE, 0); }
		public TerminalNode OPEN_PAREN() { return getToken(ParserReact.OPEN_PAREN, 0); }
		public TerminalNode CLOSE_PAREN() { return getToken(ParserReact.CLOSE_PAREN, 0); }
		public Bool_expressionContext bool_expression() {
			return getRuleContext(Bool_expressionContext.class,0);
		}
		public While_ruleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_rule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserReactListener ) ((ParserReactListener)listener).enterWhile_rule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserReactListener ) ((ParserReactListener)listener).exitWhile_rule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserReactVisitor ) return ((ParserReactVisitor<? extends T>)visitor).visitWhile_rule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final While_ruleContext while_rule() throws RecognitionException {
		While_ruleContext _localctx = new While_ruleContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_while_rule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(729);
			match(WHILE);
			setState(730);
			match(OPEN_PAREN);
			{
			setState(731);
			bool_expression();
			}
			setState(732);
			match(CLOSE_PAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Do_whileContext extends ParserRuleContext {
		public TerminalNode DO() { return getToken(ParserReact.DO, 0); }
		public While_ruleContext while_rule() {
			return getRuleContext(While_ruleContext.class,0);
		}
		public List<TerminalNode> SIME() { return getTokens(ParserReact.SIME); }
		public TerminalNode SIME(int i) {
			return getToken(ParserReact.SIME, i);
		}
		public TerminalNode OPEN_BRACE() { return getToken(ParserReact.OPEN_BRACE, 0); }
		public TerminalNode CLOSE_BRACE() { return getToken(ParserReact.CLOSE_BRACE, 0); }
		public Exiting_loopsContext exiting_loops() {
			return getRuleContext(Exiting_loopsContext.class,0);
		}
		public List<InstructionsContext> instructions() {
			return getRuleContexts(InstructionsContext.class);
		}
		public InstructionsContext instructions(int i) {
			return getRuleContext(InstructionsContext.class,i);
		}
		public Do_whileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_do_while; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserReactListener ) ((ParserReactListener)listener).enterDo_while(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserReactListener ) ((ParserReactListener)listener).exitDo_while(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserReactVisitor ) return ((ParserReactVisitor<? extends T>)visitor).visitDo_while(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Do_whileContext do_while() throws RecognitionException {
		Do_whileContext _localctx = new Do_whileContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_do_while);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(734);
			match(DO);
			setState(753);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,85,_ctx) ) {
			case 1:
				{
				setState(736);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,82,_ctx) ) {
				case 1:
					{
					setState(735);
					exiting_loops();
					}
					break;
				}
				setState(738);
				match(SIME);
				}
				break;
			case 2:
				{
				{
				setState(739);
				match(OPEN_BRACE);
				setState(743);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 342568739536896L) != 0) || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & 4210689L) != 0)) {
					{
					{
					setState(740);
					instructions();
					}
					}
					setState(745);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(749);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 60131639296L) != 0)) {
					{
					setState(746);
					exiting_loops();
					setState(747);
					match(SIME);
					}
				}

				setState(751);
				match(CLOSE_BRACE);
				}
				}
				break;
			case 3:
				{
				setState(752);
				match(SIME);
				}
				break;
			}
			setState(755);
			while_rule();
			setState(756);
			match(SIME);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class For_loop_ruleContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(ParserReact.FOR, 0); }
		public TerminalNode OPEN_PAREN() { return getToken(ParserReact.OPEN_PAREN, 0); }
		public List<TerminalNode> SIME() { return getTokens(ParserReact.SIME); }
		public TerminalNode SIME(int i) {
			return getToken(ParserReact.SIME, i);
		}
		public TerminalNode CLOSE_PAREN() { return getToken(ParserReact.CLOSE_PAREN, 0); }
		public Bool_expressionContext bool_expression() {
			return getRuleContext(Bool_expressionContext.class,0);
		}
		public List<Inside_for_loopContext> inside_for_loop() {
			return getRuleContexts(Inside_for_loopContext.class);
		}
		public Inside_for_loopContext inside_for_loop(int i) {
			return getRuleContext(Inside_for_loopContext.class,i);
		}
		public Create_varible_with_assignContext create_varible_with_assign() {
			return getRuleContext(Create_varible_with_assignContext.class,0);
		}
		public Create_varible_without_assignContext create_varible_without_assign() {
			return getRuleContext(Create_varible_without_assignContext.class,0);
		}
		public For_loop_ruleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_loop_rule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserReactListener ) ((ParserReactListener)listener).enterFor_loop_rule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserReactListener ) ((ParserReactListener)listener).exitFor_loop_rule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserReactVisitor ) return ((ParserReactVisitor<? extends T>)visitor).visitFor_loop_rule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_loop_ruleContext for_loop_rule() throws RecognitionException {
		For_loop_ruleContext _localctx = new For_loop_ruleContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_for_loop_rule);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(758);
			match(FOR);
			setState(759);
			match(OPEN_PAREN);
			setState(765);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 52783001108544L) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & 3900702915L) != 0)) {
				{
				setState(763);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,86,_ctx) ) {
				case 1:
					{
					setState(760);
					create_varible_with_assign();
					}
					break;
				case 2:
					{
					setState(761);
					create_varible_without_assign();
					}
					break;
				case 3:
					{
					setState(762);
					inside_for_loop();
					}
					break;
				}
				}
			}

			setState(767);
			match(SIME);
			setState(769);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,88,_ctx) ) {
			case 1:
				{
				setState(768);
				bool_expression();
				}
				break;
			}
			setState(771);
			match(SIME);
			setState(773);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 52783001108544L) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & 3900702915L) != 0)) {
				{
				setState(772);
				inside_for_loop();
				}
			}

			setState(775);
			match(CLOSE_PAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Inside_for_loopContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Assign_varibleContext assign_varible() {
			return getRuleContext(Assign_varibleContext.class,0);
		}
		public Assign_arrayContext assign_array() {
			return getRuleContext(Assign_arrayContext.class,0);
		}
		public Create_Array_without_assignContext create_Array_without_assign() {
			return getRuleContext(Create_Array_without_assignContext.class,0);
		}
		public Shortcut_statmentsContext shortcut_statments() {
			return getRuleContext(Shortcut_statmentsContext.class,0);
		}
		public Inside_for_loopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inside_for_loop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserReactListener ) ((ParserReactListener)listener).enterInside_for_loop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserReactListener ) ((ParserReactListener)listener).exitInside_for_loop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserReactVisitor ) return ((ParserReactVisitor<? extends T>)visitor).visitInside_for_loop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Inside_for_loopContext inside_for_loop() throws RecognitionException {
		Inside_for_loopContext _localctx = new Inside_for_loopContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_inside_for_loop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(782);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,90,_ctx) ) {
			case 1:
				{
				setState(777);
				expression(0);
				}
				break;
			case 2:
				{
				setState(778);
				assign_varible();
				}
				break;
			case 3:
				{
				setState(779);
				assign_array();
				}
				break;
			case 4:
				{
				setState(780);
				create_Array_without_assign();
				}
				break;
			case 5:
				{
				setState(781);
				shortcut_statments();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ForeachContext extends ParserRuleContext {
		public TerminalNode FOREACH() { return getToken(ParserReact.FOREACH, 0); }
		public TerminalNode OPEN_PAREN() { return getToken(ParserReact.OPEN_PAREN, 0); }
		public TerminalNode VAR() { return getToken(ParserReact.VAR, 0); }
		public List<Use_random_nameContext> use_random_name() {
			return getRuleContexts(Use_random_nameContext.class);
		}
		public Use_random_nameContext use_random_name(int i) {
			return getRuleContext(Use_random_nameContext.class,i);
		}
		public List<TerminalNode> OPEN_SQUARE() { return getTokens(ParserReact.OPEN_SQUARE); }
		public TerminalNode OPEN_SQUARE(int i) {
			return getToken(ParserReact.OPEN_SQUARE, i);
		}
		public TerminalNode COLON() { return getToken(ParserReact.COLON, 0); }
		public TerminalNode CLOSE_PAREN() { return getToken(ParserReact.CLOSE_PAREN, 0); }
		public List<TerminalNode> CLOSE_SQUARE() { return getTokens(ParserReact.CLOSE_SQUARE); }
		public TerminalNode CLOSE_SQUARE(int i) {
			return getToken(ParserReact.CLOSE_SQUARE, i);
		}
		public ForeachContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_foreach; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserReactListener ) ((ParserReactListener)listener).enterForeach(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserReactListener ) ((ParserReactListener)listener).exitForeach(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserReactVisitor ) return ((ParserReactVisitor<? extends T>)visitor).visitForeach(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForeachContext foreach() throws RecognitionException {
		ForeachContext _localctx = new ForeachContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_foreach);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(784);
			match(FOREACH);
			setState(785);
			match(OPEN_PAREN);
			setState(786);
			match(VAR);
			setState(787);
			use_random_name();
			setState(788);
			match(OPEN_SQUARE);
			setState(792);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CLOSE_SQUARE) {
				{
				{
				setState(789);
				match(CLOSE_SQUARE);
				}
				}
				setState(794);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(795);
			match(COLON);
			setState(796);
			use_random_name();
			setState(797);
			match(OPEN_SQUARE);
			setState(801);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CLOSE_SQUARE) {
				{
				{
				setState(798);
				match(CLOSE_SQUARE);
				}
				}
				setState(803);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(804);
			match(CLOSE_PAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Switch_ruleContext extends ParserRuleContext {
		public TerminalNode SWITCH() { return getToken(ParserReact.SWITCH, 0); }
		public TerminalNode OPEN_PAREN() { return getToken(ParserReact.OPEN_PAREN, 0); }
		public TerminalNode CLOSE_PAREN() { return getToken(ParserReact.CLOSE_PAREN, 0); }
		public TerminalNode OPEN_BRACE() { return getToken(ParserReact.OPEN_BRACE, 0); }
		public TerminalNode CLOSE_BRACE() { return getToken(ParserReact.CLOSE_BRACE, 0); }
		public Bool_expressionContext bool_expression() {
			return getRuleContext(Bool_expressionContext.class,0);
		}
		public Use_random_nameContext use_random_name() {
			return getRuleContext(Use_random_nameContext.class,0);
		}
		public TerminalNode ONE_CHAR_LETTER() { return getToken(ParserReact.ONE_CHAR_LETTER, 0); }
		public TerminalNode NUMERIC_LITERAL() { return getToken(ParserReact.NUMERIC_LITERAL, 0); }
		public Genral_assignContext genral_assign() {
			return getRuleContext(Genral_assignContext.class,0);
		}
		public Call_functionContext call_function() {
			return getRuleContext(Call_functionContext.class,0);
		}
		public Varible_from_objectContext varible_from_object() {
			return getRuleContext(Varible_from_objectContext.class,0);
		}
		public List<Case_ruleContext> case_rule() {
			return getRuleContexts(Case_ruleContext.class);
		}
		public Case_ruleContext case_rule(int i) {
			return getRuleContext(Case_ruleContext.class,i);
		}
		public DefultContext defult() {
			return getRuleContext(DefultContext.class,0);
		}
		public Switch_ruleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switch_rule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserReactListener ) ((ParserReactListener)listener).enterSwitch_rule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserReactListener ) ((ParserReactListener)listener).exitSwitch_rule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserReactVisitor ) return ((ParserReactVisitor<? extends T>)visitor).visitSwitch_rule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Switch_ruleContext switch_rule() throws RecognitionException {
		Switch_ruleContext _localctx = new Switch_ruleContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_switch_rule);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(806);
			match(SWITCH);
			setState(807);
			match(OPEN_PAREN);
			setState(815);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,93,_ctx) ) {
			case 1:
				{
				setState(808);
				bool_expression();
				}
				break;
			case 2:
				{
				setState(809);
				use_random_name();
				}
				break;
			case 3:
				{
				setState(810);
				match(ONE_CHAR_LETTER);
				}
				break;
			case 4:
				{
				setState(811);
				match(NUMERIC_LITERAL);
				}
				break;
			case 5:
				{
				setState(812);
				genral_assign();
				}
				break;
			case 6:
				{
				setState(813);
				call_function();
				}
				break;
			case 7:
				{
				setState(814);
				varible_from_object();
				}
				break;
			}
			setState(817);
			match(CLOSE_PAREN);
			setState(818);
			match(OPEN_BRACE);
			setState(828);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,96,_ctx) ) {
			case 1:
				{
				setState(822);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==CASE) {
					{
					{
					setState(819);
					case_rule();
					}
					}
					setState(824);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(826);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DEFAULT) {
					{
					setState(825);
					defult();
					}
				}

				}
				break;
			}
			setState(830);
			match(CLOSE_BRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DefultContext extends ParserRuleContext {
		public TerminalNode DEFAULT() { return getToken(ParserReact.DEFAULT, 0); }
		public TerminalNode COLON() { return getToken(ParserReact.COLON, 0); }
		public List<InstructionsContext> instructions() {
			return getRuleContexts(InstructionsContext.class);
		}
		public InstructionsContext instructions(int i) {
			return getRuleContext(InstructionsContext.class,i);
		}
		public TerminalNode SIME() { return getToken(ParserReact.SIME, 0); }
		public TerminalNode BREAK() { return getToken(ParserReact.BREAK, 0); }
		public Return_ruleContext return_rule() {
			return getRuleContext(Return_ruleContext.class,0);
		}
		public DefultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defult; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserReactListener ) ((ParserReactListener)listener).enterDefult(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserReactListener ) ((ParserReactListener)listener).exitDefult(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserReactVisitor ) return ((ParserReactVisitor<? extends T>)visitor).visitDefult(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefultContext defult() throws RecognitionException {
		DefultContext _localctx = new DefultContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_defult);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(832);
			match(DEFAULT);
			setState(833);
			match(COLON);
			setState(837);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 342568739536896L) != 0) || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & 4210689L) != 0)) {
				{
				{
				setState(834);
				instructions();
				}
				}
				setState(839);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(845);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 42951770112L) != 0)) {
				{
				setState(842);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case BREAK:
					{
					setState(840);
					match(BREAK);
					}
					break;
				case SIME:
				case RETURN:
					{
					setState(841);
					return_rule();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(844);
				match(SIME);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Case_ruleContext extends ParserRuleContext {
		public TerminalNode CASE() { return getToken(ParserReact.CASE, 0); }
		public TerminalNode COLON() { return getToken(ParserReact.COLON, 0); }
		public Bool_expressionContext bool_expression() {
			return getRuleContext(Bool_expressionContext.class,0);
		}
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public TerminalNode ONE_CHAR_LETTER() { return getToken(ParserReact.ONE_CHAR_LETTER, 0); }
		public TerminalNode NUMERIC_LITERAL() { return getToken(ParserReact.NUMERIC_LITERAL, 0); }
		public Varible_from_objectContext varible_from_object() {
			return getRuleContext(Varible_from_objectContext.class,0);
		}
		public List<InstructionsContext> instructions() {
			return getRuleContexts(InstructionsContext.class);
		}
		public InstructionsContext instructions(int i) {
			return getRuleContext(InstructionsContext.class,i);
		}
		public TerminalNode SIME() { return getToken(ParserReact.SIME, 0); }
		public TerminalNode BREAK() { return getToken(ParserReact.BREAK, 0); }
		public Return_ruleContext return_rule() {
			return getRuleContext(Return_ruleContext.class,0);
		}
		public Case_ruleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_case_rule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserReactListener ) ((ParserReactListener)listener).enterCase_rule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserReactListener ) ((ParserReactListener)listener).exitCase_rule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserReactVisitor ) return ((ParserReactVisitor<? extends T>)visitor).visitCase_rule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Case_ruleContext case_rule() throws RecognitionException {
		Case_ruleContext _localctx = new Case_ruleContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_case_rule);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(847);
			match(CASE);
			setState(853);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,100,_ctx) ) {
			case 1:
				{
				setState(848);
				bool_expression();
				}
				break;
			case 2:
				{
				setState(849);
				any_name();
				}
				break;
			case 3:
				{
				setState(850);
				match(ONE_CHAR_LETTER);
				}
				break;
			case 4:
				{
				setState(851);
				match(NUMERIC_LITERAL);
				}
				break;
			case 5:
				{
				setState(852);
				varible_from_object();
				}
				break;
			}
			setState(855);
			match(COLON);
			setState(859);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 342568739536896L) != 0) || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & 4210689L) != 0)) {
				{
				{
				setState(856);
				instructions();
				}
				}
				setState(861);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(867);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 42951770112L) != 0)) {
				{
				setState(864);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case BREAK:
					{
					setState(862);
					match(BREAK);
					}
					break;
				case SIME:
				case RETURN:
					{
					setState(863);
					return_rule();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(866);
				match(SIME);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Defination_typeContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(ParserReact.VAR, 0); }
		public TerminalNode CONST() { return getToken(ParserReact.CONST, 0); }
		public TerminalNode LET() { return getToken(ParserReact.LET, 0); }
		public Defination_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defination_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserReactListener ) ((ParserReactListener)listener).enterDefination_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserReactListener ) ((ParserReactListener)listener).exitDefination_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserReactVisitor ) return ((ParserReactVisitor<? extends T>)visitor).visitDefination_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Defination_typeContext defination_type() throws RecognitionException {
		Defination_typeContext _localctx = new Defination_typeContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_defination_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(869);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 52778705616896L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class General_creatingContext extends ParserRuleContext {
		public Create_without_assignContext create_without_assign() {
			return getRuleContext(Create_without_assignContext.class,0);
		}
		public Creating_with_assignContext creating_with_assign() {
			return getRuleContext(Creating_with_assignContext.class,0);
		}
		public General_creatingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_general_creating; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserReactListener ) ((ParserReactListener)listener).enterGeneral_creating(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserReactListener ) ((ParserReactListener)listener).exitGeneral_creating(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserReactVisitor ) return ((ParserReactVisitor<? extends T>)visitor).visitGeneral_creating(this);
			else return visitor.visitChildren(this);
		}
	}

	public final General_creatingContext general_creating() throws RecognitionException {
		General_creatingContext _localctx = new General_creatingContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_general_creating);
		try {
			setState(873);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,104,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(871);
				create_without_assign();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(872);
				creating_with_assign();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Creating_with_assignContext extends ParserRuleContext {
		public Create_varible_with_assignContext create_varible_with_assign() {
			return getRuleContext(Create_varible_with_assignContext.class,0);
		}
		public Create_json_with_assignContext create_json_with_assign() {
			return getRuleContext(Create_json_with_assignContext.class,0);
		}
		public Create_Array_with_assignContext create_Array_with_assign() {
			return getRuleContext(Create_Array_with_assignContext.class,0);
		}
		public Creating_with_assignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_creating_with_assign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserReactListener ) ((ParserReactListener)listener).enterCreating_with_assign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserReactListener ) ((ParserReactListener)listener).exitCreating_with_assign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserReactVisitor ) return ((ParserReactVisitor<? extends T>)visitor).visitCreating_with_assign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Creating_with_assignContext creating_with_assign() throws RecognitionException {
		Creating_with_assignContext _localctx = new Creating_with_assignContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_creating_with_assign);
		try {
			setState(878);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,105,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(875);
				create_varible_with_assign();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(876);
				create_json_with_assign();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(877);
				create_Array_with_assign();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Create_without_assignContext extends ParserRuleContext {
		public Create_varible_without_assignContext create_varible_without_assign() {
			return getRuleContext(Create_varible_without_assignContext.class,0);
		}
		public Create_Array_without_assignContext create_Array_without_assign() {
			return getRuleContext(Create_Array_without_assignContext.class,0);
		}
		public Create_json_object_without_assignContext create_json_object_without_assign() {
			return getRuleContext(Create_json_object_without_assignContext.class,0);
		}
		public Create_without_assignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_without_assign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserReactListener ) ((ParserReactListener)listener).enterCreate_without_assign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserReactListener ) ((ParserReactListener)listener).exitCreate_without_assign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserReactVisitor ) return ((ParserReactVisitor<? extends T>)visitor).visitCreate_without_assign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_without_assignContext create_without_assign() throws RecognitionException {
		Create_without_assignContext _localctx = new Create_without_assignContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_create_without_assign);
		try {
			setState(883);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,106,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(880);
				create_varible_without_assign();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(881);
				create_Array_without_assign();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(882);
				create_json_object_without_assign();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Genral_assignContext extends ParserRuleContext {
		public Assign_varibleContext assign_varible() {
			return getRuleContext(Assign_varibleContext.class,0);
		}
		public Assign_arrayContext assign_array() {
			return getRuleContext(Assign_arrayContext.class,0);
		}
		public Assign_jsonContext assign_json() {
			return getRuleContext(Assign_jsonContext.class,0);
		}
		public Genral_assignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_genral_assign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserReactListener ) ((ParserReactListener)listener).enterGenral_assign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserReactListener ) ((ParserReactListener)listener).exitGenral_assign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserReactVisitor ) return ((ParserReactVisitor<? extends T>)visitor).visitGenral_assign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Genral_assignContext genral_assign() throws RecognitionException {
		Genral_assignContext _localctx = new Genral_assignContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_genral_assign);
		try {
			setState(888);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,107,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(885);
				assign_varible();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(886);
				assign_array();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(887);
				assign_json();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Varible_nameContext extends ParserRuleContext {
		public Use_random_nameContext use_random_name() {
			return getRuleContext(Use_random_nameContext.class,0);
		}
		public Varible_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varible_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserReactListener ) ((ParserReactListener)listener).enterVarible_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserReactListener ) ((ParserReactListener)listener).exitVarible_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserReactVisitor ) return ((ParserReactVisitor<? extends T>)visitor).visitVarible_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Varible_nameContext varible_name() throws RecognitionException {
		Varible_nameContext _localctx = new Varible_nameContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_varible_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(890);
			use_random_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Assign_varibleContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Bool_expressionContext bool_expression() {
			return getRuleContext(Bool_expressionContext.class,0);
		}
		public TerminalNode NULL() { return getToken(ParserReact.NULL, 0); }
		public List<TerminalNode> ASSIGN() { return getTokens(ParserReact.ASSIGN); }
		public TerminalNode ASSIGN(int i) {
			return getToken(ParserReact.ASSIGN, i);
		}
		public List<Use_random_nameContext> use_random_name() {
			return getRuleContexts(Use_random_nameContext.class);
		}
		public Use_random_nameContext use_random_name(int i) {
			return getRuleContext(Use_random_nameContext.class,i);
		}
		public List<Any_arithmetic_opratorContext> any_arithmetic_oprator() {
			return getRuleContexts(Any_arithmetic_opratorContext.class);
		}
		public Any_arithmetic_opratorContext any_arithmetic_oprator(int i) {
			return getRuleContext(Any_arithmetic_opratorContext.class,i);
		}
		public Assign_varibleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign_varible; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserReactListener ) ((ParserReactListener)listener).enterAssign_varible(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserReactListener ) ((ParserReactListener)listener).exitAssign_varible(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserReactVisitor ) return ((ParserReactVisitor<? extends T>)visitor).visitAssign_varible(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assign_varibleContext assign_varible() throws RecognitionException {
		Assign_varibleContext _localctx = new Assign_varibleContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_assign_varible);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(898); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					{
					setState(892);
					use_random_name();
					}
					setState(894);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2305843009306103808L) != 0)) {
						{
						setState(893);
						any_arithmetic_oprator();
						}
					}

					setState(896);
					match(ASSIGN);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(900); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,109,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(905);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,110,_ctx) ) {
			case 1:
				{
				setState(902);
				expression(0);
				}
				break;
			case 2:
				{
				setState(903);
				bool_expression();
				}
				break;
			case 3:
				{
				setState(904);
				match(NULL);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Create_varible_without_assignContext extends ParserRuleContext {
		public Defination_typeContext defination_type() {
			return getRuleContext(Defination_typeContext.class,0);
		}
		public Varible_nameContext varible_name() {
			return getRuleContext(Varible_nameContext.class,0);
		}
		public Create_varible_without_assignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_varible_without_assign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserReactListener ) ((ParserReactListener)listener).enterCreate_varible_without_assign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserReactListener ) ((ParserReactListener)listener).exitCreate_varible_without_assign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserReactVisitor ) return ((ParserReactVisitor<? extends T>)visitor).visitCreate_varible_without_assign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_varible_without_assignContext create_varible_without_assign() throws RecognitionException {
		Create_varible_without_assignContext _localctx = new Create_varible_without_assignContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_create_varible_without_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(907);
			defination_type();
			setState(908);
			varible_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Create_varible_with_assignContext extends ParserRuleContext {
		public Defination_typeContext defination_type() {
			return getRuleContext(Defination_typeContext.class,0);
		}
		public Assign_varibleContext assign_varible() {
			return getRuleContext(Assign_varibleContext.class,0);
		}
		public Create_varible_with_assignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_varible_with_assign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserReactListener ) ((ParserReactListener)listener).enterCreate_varible_with_assign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserReactListener ) ((ParserReactListener)listener).exitCreate_varible_with_assign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserReactVisitor ) return ((ParserReactVisitor<? extends T>)visitor).visitCreate_varible_with_assign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_varible_with_assignContext create_varible_with_assign() throws RecognitionException {
		Create_varible_with_assignContext _localctx = new Create_varible_with_assignContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_create_varible_with_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(910);
			defination_type();
			setState(911);
			assign_varible();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Array_nameContext extends ParserRuleContext {
		public Use_random_nameContext use_random_name() {
			return getRuleContext(Use_random_nameContext.class,0);
		}
		public Array_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserReactListener ) ((ParserReactListener)listener).enterArray_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserReactListener ) ((ParserReactListener)listener).exitArray_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserReactVisitor ) return ((ParserReactVisitor<? extends T>)visitor).visitArray_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Array_nameContext array_name() throws RecognitionException {
		Array_nameContext _localctx = new Array_nameContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_array_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(913);
			use_random_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Assign_arrayContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Bool_expressionContext bool_expression() {
			return getRuleContext(Bool_expressionContext.class,0);
		}
		public TerminalNode NULL() { return getToken(ParserReact.NULL, 0); }
		public List<Array_base_form_with_indexContext> array_base_form_with_index() {
			return getRuleContexts(Array_base_form_with_indexContext.class);
		}
		public Array_base_form_with_indexContext array_base_form_with_index(int i) {
			return getRuleContext(Array_base_form_with_indexContext.class,i);
		}
		public List<TerminalNode> ASSIGN() { return getTokens(ParserReact.ASSIGN); }
		public TerminalNode ASSIGN(int i) {
			return getToken(ParserReact.ASSIGN, i);
		}
		public List<Any_arithmetic_opratorContext> any_arithmetic_oprator() {
			return getRuleContexts(Any_arithmetic_opratorContext.class);
		}
		public Any_arithmetic_opratorContext any_arithmetic_oprator(int i) {
			return getRuleContext(Any_arithmetic_opratorContext.class,i);
		}
		public Assign_arrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign_array; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserReactListener ) ((ParserReactListener)listener).enterAssign_array(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserReactListener ) ((ParserReactListener)listener).exitAssign_array(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserReactVisitor ) return ((ParserReactVisitor<? extends T>)visitor).visitAssign_array(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assign_arrayContext assign_array() throws RecognitionException {
		Assign_arrayContext _localctx = new Assign_arrayContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_assign_array);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(921); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(915);
					array_base_form_with_index();
					setState(917);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2305843009306103808L) != 0)) {
						{
						setState(916);
						any_arithmetic_oprator();
						}
					}

					setState(919);
					match(ASSIGN);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(923); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,112,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(928);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,113,_ctx) ) {
			case 1:
				{
				setState(925);
				expression(0);
				}
				break;
			case 2:
				{
				setState(926);
				bool_expression();
				}
				break;
			case 3:
				{
				setState(927);
				match(NULL);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Create_array_formContext extends ParserRuleContext {
		public Create_Array_without_assignContext create_Array_without_assign() {
			return getRuleContext(Create_Array_without_assignContext.class,0);
		}
		public Create_Array_with_assignContext create_Array_with_assign() {
			return getRuleContext(Create_Array_with_assignContext.class,0);
		}
		public Create_array_formContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_array_form; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserReactListener ) ((ParserReactListener)listener).enterCreate_array_form(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserReactListener ) ((ParserReactListener)listener).exitCreate_array_form(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserReactVisitor ) return ((ParserReactVisitor<? extends T>)visitor).visitCreate_array_form(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_array_formContext create_array_form() throws RecognitionException {
		Create_array_formContext _localctx = new Create_array_formContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_create_array_form);
		try {
			setState(932);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,114,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(930);
				create_Array_without_assign();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(931);
				create_Array_with_assign();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Create_Array_without_assignContext extends ParserRuleContext {
		public Defination_typeContext defination_type() {
			return getRuleContext(Defination_typeContext.class,0);
		}
		public Array_base_form_without_indexContext array_base_form_without_index() {
			return getRuleContext(Array_base_form_without_indexContext.class,0);
		}
		public Create_Array_without_assignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_Array_without_assign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserReactListener ) ((ParserReactListener)listener).enterCreate_Array_without_assign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserReactListener ) ((ParserReactListener)listener).exitCreate_Array_without_assign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserReactVisitor ) return ((ParserReactVisitor<? extends T>)visitor).visitCreate_Array_without_assign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_Array_without_assignContext create_Array_without_assign() throws RecognitionException {
		Create_Array_without_assignContext _localctx = new Create_Array_without_assignContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_create_Array_without_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(934);
			defination_type();
			setState(935);
			array_base_form_without_index();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Create_Array_with_assignContext extends ParserRuleContext {
		public Defination_typeContext defination_type() {
			return getRuleContext(Defination_typeContext.class,0);
		}
		public Array_base_form_without_indexContext array_base_form_without_index() {
			return getRuleContext(Array_base_form_without_indexContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(ParserReact.ASSIGN, 0); }
		public Left_side_arrayContext left_side_array() {
			return getRuleContext(Left_side_arrayContext.class,0);
		}
		public Create_Array_with_assignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_Array_with_assign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserReactListener ) ((ParserReactListener)listener).enterCreate_Array_with_assign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserReactListener ) ((ParserReactListener)listener).exitCreate_Array_with_assign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserReactVisitor ) return ((ParserReactVisitor<? extends T>)visitor).visitCreate_Array_with_assign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_Array_with_assignContext create_Array_with_assign() throws RecognitionException {
		Create_Array_with_assignContext _localctx = new Create_Array_with_assignContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_create_Array_with_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(937);
			defination_type();
			setState(938);
			array_base_form_without_index();
			{
			setState(939);
			match(ASSIGN);
			setState(940);
			left_side_array();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Array_base_form_without_indexContext extends ParserRuleContext {
		public Array_nameContext array_name() {
			return getRuleContext(Array_nameContext.class,0);
		}
		public List<TerminalNode> OPEN_SQUARE() { return getTokens(ParserReact.OPEN_SQUARE); }
		public TerminalNode OPEN_SQUARE(int i) {
			return getToken(ParserReact.OPEN_SQUARE, i);
		}
		public List<TerminalNode> CLOSE_SQUARE() { return getTokens(ParserReact.CLOSE_SQUARE); }
		public TerminalNode CLOSE_SQUARE(int i) {
			return getToken(ParserReact.CLOSE_SQUARE, i);
		}
		public Array_base_form_without_indexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_base_form_without_index; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserReactListener ) ((ParserReactListener)listener).enterArray_base_form_without_index(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserReactListener ) ((ParserReactListener)listener).exitArray_base_form_without_index(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserReactVisitor ) return ((ParserReactVisitor<? extends T>)visitor).visitArray_base_form_without_index(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Array_base_form_without_indexContext array_base_form_without_index() throws RecognitionException {
		Array_base_form_without_indexContext _localctx = new Array_base_form_without_indexContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_array_base_form_without_index);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(942);
			array_name();
			setState(945); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(943);
				match(OPEN_SQUARE);
				setState(944);
				match(CLOSE_SQUARE);
				}
				}
				setState(947); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==OPEN_SQUARE );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Array_base_form_with_indexContext extends ParserRuleContext {
		public Array_nameContext array_name() {
			return getRuleContext(Array_nameContext.class,0);
		}
		public List<TerminalNode> OPEN_SQUARE() { return getTokens(ParserReact.OPEN_SQUARE); }
		public TerminalNode OPEN_SQUARE(int i) {
			return getToken(ParserReact.OPEN_SQUARE, i);
		}
		public List<TerminalNode> CLOSE_SQUARE() { return getTokens(ParserReact.CLOSE_SQUARE); }
		public TerminalNode CLOSE_SQUARE(int i) {
			return getToken(ParserReact.CLOSE_SQUARE, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> NUMERIC_LITERAL() { return getTokens(ParserReact.NUMERIC_LITERAL); }
		public TerminalNode NUMERIC_LITERAL(int i) {
			return getToken(ParserReact.NUMERIC_LITERAL, i);
		}
		public List<Varible_nameContext> varible_name() {
			return getRuleContexts(Varible_nameContext.class);
		}
		public Varible_nameContext varible_name(int i) {
			return getRuleContext(Varible_nameContext.class,i);
		}
		public Array_base_form_with_indexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_base_form_with_index; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserReactListener ) ((ParserReactListener)listener).enterArray_base_form_with_index(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserReactListener ) ((ParserReactListener)listener).exitArray_base_form_with_index(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserReactVisitor ) return ((ParserReactVisitor<? extends T>)visitor).visitArray_base_form_with_index(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Array_base_form_with_indexContext array_base_form_with_index() throws RecognitionException {
		Array_base_form_with_indexContext _localctx = new Array_base_form_with_indexContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_array_base_form_with_index);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(949);
			array_name();
			setState(957); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(950);
					match(OPEN_SQUARE);
					setState(954);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,116,_ctx) ) {
					case 1:
						{
						setState(951);
						expression(0);
						}
						break;
					case 2:
						{
						setState(952);
						match(NUMERIC_LITERAL);
						}
						break;
					case 3:
						{
						setState(953);
						varible_name();
						}
						break;
					}
					setState(956);
					match(CLOSE_SQUARE);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(959); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,117,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Array_identifier_formContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(ParserReact.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(ParserReact.IDENTIFIER, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ParserReact.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ParserReact.COMMA, i);
		}
		public Array_identifier_formContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_identifier_form; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserReactListener ) ((ParserReactListener)listener).enterArray_identifier_form(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserReactListener ) ((ParserReactListener)listener).exitArray_identifier_form(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserReactVisitor ) return ((ParserReactVisitor<? extends T>)visitor).visitArray_identifier_form(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Array_identifier_formContext array_identifier_form() throws RecognitionException {
		Array_identifier_formContext _localctx = new Array_identifier_formContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_array_identifier_form);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(961);
			match(IDENTIFIER);
			setState(966);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,118,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(962);
					match(COMMA);
					setState(963);
					match(IDENTIFIER);
					}
					} 
				}
				setState(968);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,118,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Array_boolean_formContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode COMMA() { return getToken(ParserReact.COMMA, 0); }
		public Array_boolean_formContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_boolean_form; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserReactListener ) ((ParserReactListener)listener).enterArray_boolean_form(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserReactListener ) ((ParserReactListener)listener).exitArray_boolean_form(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserReactVisitor ) return ((ParserReactVisitor<? extends T>)visitor).visitArray_boolean_form(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Array_boolean_formContext array_boolean_form() throws RecognitionException {
		Array_boolean_formContext _localctx = new Array_boolean_formContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_array_boolean_form);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(969);
			expression(0);
			{
			setState(970);
			match(COMMA);
			setState(971);
			expression(0);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Array_integer_formContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ParserReact.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ParserReact.COMMA, i);
		}
		public Array_integer_formContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_integer_form; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserReactListener ) ((ParserReactListener)listener).enterArray_integer_form(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserReactListener ) ((ParserReactListener)listener).exitArray_integer_form(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserReactVisitor ) return ((ParserReactVisitor<? extends T>)visitor).visitArray_integer_form(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Array_integer_formContext array_integer_form() throws RecognitionException {
		Array_integer_formContext _localctx = new Array_integer_formContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_array_integer_form);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(973);
			expression(0);
			}
			setState(978);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,119,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(974);
					match(COMMA);
					{
					setState(975);
					expression(0);
					}
					}
					} 
				}
				setState(980);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,119,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Array_charecter_formContext extends ParserRuleContext {
		public List<TerminalNode> ONE_CHAR_LETTER() { return getTokens(ParserReact.ONE_CHAR_LETTER); }
		public TerminalNode ONE_CHAR_LETTER(int i) {
			return getToken(ParserReact.ONE_CHAR_LETTER, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ParserReact.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ParserReact.COMMA, i);
		}
		public Array_charecter_formContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_charecter_form; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserReactListener ) ((ParserReactListener)listener).enterArray_charecter_form(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserReactListener ) ((ParserReactListener)listener).exitArray_charecter_form(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserReactVisitor ) return ((ParserReactVisitor<? extends T>)visitor).visitArray_charecter_form(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Array_charecter_formContext array_charecter_form() throws RecognitionException {
		Array_charecter_formContext _localctx = new Array_charecter_formContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_array_charecter_form);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(981);
			match(ONE_CHAR_LETTER);
			setState(986);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,120,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(982);
					match(COMMA);
					setState(983);
					match(ONE_CHAR_LETTER);
					}
					} 
				}
				setState(988);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,120,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Array_objects_formContext extends ParserRuleContext {
		public List<Json_statmentContext> json_statment() {
			return getRuleContexts(Json_statmentContext.class);
		}
		public Json_statmentContext json_statment(int i) {
			return getRuleContext(Json_statmentContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ParserReact.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ParserReact.COMMA, i);
		}
		public Array_objects_formContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_objects_form; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserReactListener ) ((ParserReactListener)listener).enterArray_objects_form(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserReactListener ) ((ParserReactListener)listener).exitArray_objects_form(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserReactVisitor ) return ((ParserReactVisitor<? extends T>)visitor).visitArray_objects_form(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Array_objects_formContext array_objects_form() throws RecognitionException {
		Array_objects_formContext _localctx = new Array_objects_formContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_array_objects_form);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(989);
			json_statment();
			setState(994);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,121,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(990);
					match(COMMA);
					setState(991);
					json_statment();
					}
					} 
				}
				setState(996);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,121,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Array_objects_form2Context extends ParserRuleContext {
		public TerminalNode OPEN_SQUARE() { return getToken(ParserReact.OPEN_SQUARE, 0); }
		public Array_objects_formContext array_objects_form() {
			return getRuleContext(Array_objects_formContext.class,0);
		}
		public TerminalNode CLOSE_SQUARE() { return getToken(ParserReact.CLOSE_SQUARE, 0); }
		public Array_objects_form2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_objects_form2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserReactListener ) ((ParserReactListener)listener).enterArray_objects_form2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserReactListener ) ((ParserReactListener)listener).exitArray_objects_form2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserReactVisitor ) return ((ParserReactVisitor<? extends T>)visitor).visitArray_objects_form2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Array_objects_form2Context array_objects_form2() throws RecognitionException {
		Array_objects_form2Context _localctx = new Array_objects_form2Context(_ctx, getState());
		enterRule(_localctx, 160, RULE_array_objects_form2);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(997);
			match(OPEN_SQUARE);
			setState(998);
			array_objects_form();
			setState(999);
			match(CLOSE_SQUARE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Array_varible_formContext extends ParserRuleContext {
		public List<Varible_nameContext> varible_name() {
			return getRuleContexts(Varible_nameContext.class);
		}
		public Varible_nameContext varible_name(int i) {
			return getRuleContext(Varible_nameContext.class,i);
		}
		public List<Varible_from_objectContext> varible_from_object() {
			return getRuleContexts(Varible_from_objectContext.class);
		}
		public Varible_from_objectContext varible_from_object(int i) {
			return getRuleContext(Varible_from_objectContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ParserReact.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ParserReact.COMMA, i);
		}
		public Array_varible_formContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_varible_form; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserReactListener ) ((ParserReactListener)listener).enterArray_varible_form(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserReactListener ) ((ParserReactListener)listener).exitArray_varible_form(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserReactVisitor ) return ((ParserReactVisitor<? extends T>)visitor).visitArray_varible_form(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Array_varible_formContext array_varible_form() throws RecognitionException {
		Array_varible_formContext _localctx = new Array_varible_formContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_array_varible_form);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1003);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,122,_ctx) ) {
			case 1:
				{
				setState(1001);
				varible_name();
				}
				break;
			case 2:
				{
				setState(1002);
				varible_from_object();
				}
				break;
			}
			setState(1012);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,124,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1005);
					match(COMMA);
					setState(1008);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,123,_ctx) ) {
					case 1:
						{
						setState(1006);
						varible_name();
						}
						break;
					case 2:
						{
						setState(1007);
						varible_from_object();
						}
						break;
					}
					}
					} 
				}
				setState(1014);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,124,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Array_anyType_formContext extends ParserRuleContext {
		public List<Array_identifier_formContext> array_identifier_form() {
			return getRuleContexts(Array_identifier_formContext.class);
		}
		public Array_identifier_formContext array_identifier_form(int i) {
			return getRuleContext(Array_identifier_formContext.class,i);
		}
		public List<Array_integer_formContext> array_integer_form() {
			return getRuleContexts(Array_integer_formContext.class);
		}
		public Array_integer_formContext array_integer_form(int i) {
			return getRuleContext(Array_integer_formContext.class,i);
		}
		public List<Array_charecter_formContext> array_charecter_form() {
			return getRuleContexts(Array_charecter_formContext.class);
		}
		public Array_charecter_formContext array_charecter_form(int i) {
			return getRuleContext(Array_charecter_formContext.class,i);
		}
		public List<Array_objects_formContext> array_objects_form() {
			return getRuleContexts(Array_objects_formContext.class);
		}
		public Array_objects_formContext array_objects_form(int i) {
			return getRuleContext(Array_objects_formContext.class,i);
		}
		public List<Array_varible_formContext> array_varible_form() {
			return getRuleContexts(Array_varible_formContext.class);
		}
		public Array_varible_formContext array_varible_form(int i) {
			return getRuleContext(Array_varible_formContext.class,i);
		}
		public List<Array_boolean_formContext> array_boolean_form() {
			return getRuleContexts(Array_boolean_formContext.class);
		}
		public Array_boolean_formContext array_boolean_form(int i) {
			return getRuleContext(Array_boolean_formContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ParserReact.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ParserReact.COMMA, i);
		}
		public List<Array_arrayes_formContext> array_arrayes_form() {
			return getRuleContexts(Array_arrayes_formContext.class);
		}
		public Array_arrayes_formContext array_arrayes_form(int i) {
			return getRuleContext(Array_arrayes_formContext.class,i);
		}
		public Array_anyType_formContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_anyType_form; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserReactListener ) ((ParserReactListener)listener).enterArray_anyType_form(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserReactListener ) ((ParserReactListener)listener).exitArray_anyType_form(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserReactVisitor ) return ((ParserReactVisitor<? extends T>)visitor).visitArray_anyType_form(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Array_anyType_formContext array_anyType_form() throws RecognitionException {
		Array_anyType_formContext _localctx = new Array_anyType_formContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_array_anyType_form);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1021);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,125,_ctx) ) {
			case 1:
				{
				setState(1015);
				array_identifier_form();
				}
				break;
			case 2:
				{
				setState(1016);
				array_integer_form();
				}
				break;
			case 3:
				{
				setState(1017);
				array_charecter_form();
				}
				break;
			case 4:
				{
				setState(1018);
				array_objects_form();
				}
				break;
			case 5:
				{
				setState(1019);
				array_varible_form();
				}
				break;
			case 6:
				{
				setState(1020);
				array_boolean_form();
				}
				break;
			}
			setState(1035);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1023);
				match(COMMA);
				setState(1031);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,126,_ctx) ) {
				case 1:
					{
					setState(1024);
					array_identifier_form();
					}
					break;
				case 2:
					{
					setState(1025);
					array_integer_form();
					}
					break;
				case 3:
					{
					setState(1026);
					array_charecter_form();
					}
					break;
				case 4:
					{
					setState(1027);
					array_objects_form();
					}
					break;
				case 5:
					{
					setState(1028);
					array_arrayes_form();
					}
					break;
				case 6:
					{
					setState(1029);
					array_varible_form();
					}
					break;
				case 7:
					{
					setState(1030);
					array_boolean_form();
					}
					break;
				}
				}
				}
				setState(1037);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Array_arrayes_formContext extends ParserRuleContext {
		public List<Left_side_arrayContext> left_side_array() {
			return getRuleContexts(Left_side_arrayContext.class);
		}
		public Left_side_arrayContext left_side_array(int i) {
			return getRuleContext(Left_side_arrayContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ParserReact.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ParserReact.COMMA, i);
		}
		public Array_arrayes_formContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_arrayes_form; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserReactListener ) ((ParserReactListener)listener).enterArray_arrayes_form(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserReactListener ) ((ParserReactListener)listener).exitArray_arrayes_form(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserReactVisitor ) return ((ParserReactVisitor<? extends T>)visitor).visitArray_arrayes_form(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Array_arrayes_formContext array_arrayes_form() throws RecognitionException {
		Array_arrayes_formContext _localctx = new Array_arrayes_formContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_array_arrayes_form);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1038);
			left_side_array();
			setState(1043);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,128,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1039);
					match(COMMA);
					{
					setState(1040);
					left_side_array();
					}
					}
					} 
				}
				setState(1045);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,128,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Value_left_sideContext extends ParserRuleContext {
		public Array_identifier_formContext array_identifier_form() {
			return getRuleContext(Array_identifier_formContext.class,0);
		}
		public Array_integer_formContext array_integer_form() {
			return getRuleContext(Array_integer_formContext.class,0);
		}
		public Array_charecter_formContext array_charecter_form() {
			return getRuleContext(Array_charecter_formContext.class,0);
		}
		public Array_objects_formContext array_objects_form() {
			return getRuleContext(Array_objects_formContext.class,0);
		}
		public Array_objects_form2Context array_objects_form2() {
			return getRuleContext(Array_objects_form2Context.class,0);
		}
		public Array_arrayes_formContext array_arrayes_form() {
			return getRuleContext(Array_arrayes_formContext.class,0);
		}
		public Array_boolean_formContext array_boolean_form() {
			return getRuleContext(Array_boolean_formContext.class,0);
		}
		public Varible_from_objectContext varible_from_object() {
			return getRuleContext(Varible_from_objectContext.class,0);
		}
		public Array_anyType_formContext array_anyType_form() {
			return getRuleContext(Array_anyType_formContext.class,0);
		}
		public Array_varible_formContext array_varible_form() {
			return getRuleContext(Array_varible_formContext.class,0);
		}
		public Value_left_sideContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value_left_side; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserReactListener ) ((ParserReactListener)listener).enterValue_left_side(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserReactListener ) ((ParserReactListener)listener).exitValue_left_side(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserReactVisitor ) return ((ParserReactVisitor<? extends T>)visitor).visitValue_left_side(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Value_left_sideContext value_left_side() throws RecognitionException {
		Value_left_sideContext _localctx = new Value_left_sideContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_value_left_side);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1056);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,129,_ctx) ) {
			case 1:
				{
				setState(1046);
				array_identifier_form();
				}
				break;
			case 2:
				{
				setState(1047);
				array_integer_form();
				}
				break;
			case 3:
				{
				setState(1048);
				array_charecter_form();
				}
				break;
			case 4:
				{
				setState(1049);
				array_objects_form();
				}
				break;
			case 5:
				{
				setState(1050);
				array_objects_form2();
				}
				break;
			case 6:
				{
				setState(1051);
				array_arrayes_form();
				}
				break;
			case 7:
				{
				setState(1052);
				array_boolean_form();
				}
				break;
			case 8:
				{
				setState(1053);
				varible_from_object();
				}
				break;
			case 9:
				{
				setState(1054);
				array_anyType_form();
				}
				break;
			case 10:
				{
				setState(1055);
				array_varible_form();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Left_side_arrayContext extends ParserRuleContext {
		public TerminalNode OPEN_SQUARE() { return getToken(ParserReact.OPEN_SQUARE, 0); }
		public TerminalNode CLOSE_SQUARE() { return getToken(ParserReact.CLOSE_SQUARE, 0); }
		public Value_left_sideContext value_left_side() {
			return getRuleContext(Value_left_sideContext.class,0);
		}
		public Array_nameContext array_name() {
			return getRuleContext(Array_nameContext.class,0);
		}
		public Left_side_arrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_left_side_array; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserReactListener ) ((ParserReactListener)listener).enterLeft_side_array(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserReactListener ) ((ParserReactListener)listener).exitLeft_side_array(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserReactVisitor ) return ((ParserReactVisitor<? extends T>)visitor).visitLeft_side_array(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Left_side_arrayContext left_side_array() throws RecognitionException {
		Left_side_arrayContext _localctx = new Left_side_arrayContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_left_side_array);
		int _la;
		try {
			setState(1064);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_SQUARE:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(1058);
				match(OPEN_SQUARE);
				setState(1060);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4295491668L) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & 3900702915L) != 0)) {
					{
					setState(1059);
					value_left_side();
					}
				}

				setState(1062);
				match(CLOSE_SQUARE);
				}
				}
				break;
			case RANDOM_NAME:
				enterOuterAlt(_localctx, 2);
				{
				setState(1063);
				array_name();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Json_nameContext extends ParserRuleContext {
		public Use_random_nameContext use_random_name() {
			return getRuleContext(Use_random_nameContext.class,0);
		}
		public Json_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_json_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserReactListener ) ((ParserReactListener)listener).enterJson_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserReactListener ) ((ParserReactListener)listener).exitJson_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserReactVisitor ) return ((ParserReactVisitor<? extends T>)visitor).visitJson_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Json_nameContext json_name() throws RecognitionException {
		Json_nameContext _localctx = new Json_nameContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_json_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1066);
			use_random_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Assign_jsonContext extends ParserRuleContext {
		public List<Json_nameContext> json_name() {
			return getRuleContexts(Json_nameContext.class);
		}
		public Json_nameContext json_name(int i) {
			return getRuleContext(Json_nameContext.class,i);
		}
		public TerminalNode ASSIGN() { return getToken(ParserReact.ASSIGN, 0); }
		public Json_statmentContext json_statment() {
			return getRuleContext(Json_statmentContext.class,0);
		}
		public Assign_jsonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign_json; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserReactListener ) ((ParserReactListener)listener).enterAssign_json(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserReactListener ) ((ParserReactListener)listener).exitAssign_json(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserReactVisitor ) return ((ParserReactVisitor<? extends T>)visitor).visitAssign_json(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assign_jsonContext assign_json() throws RecognitionException {
		Assign_jsonContext _localctx = new Assign_jsonContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_assign_json);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1068);
			json_name();
			setState(1069);
			match(ASSIGN);
			setState(1072);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RANDOM_NAME:
				{
				setState(1070);
				json_name();
				}
				break;
			case OPEN_BRACE:
				{
				setState(1071);
				json_statment();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Create_json_formContext extends ParserRuleContext {
		public Create_json_object_without_assignContext create_json_object_without_assign() {
			return getRuleContext(Create_json_object_without_assignContext.class,0);
		}
		public Create_json_with_assignContext create_json_with_assign() {
			return getRuleContext(Create_json_with_assignContext.class,0);
		}
		public Create_json_formContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_json_form; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserReactListener ) ((ParserReactListener)listener).enterCreate_json_form(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserReactListener ) ((ParserReactListener)listener).exitCreate_json_form(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserReactVisitor ) return ((ParserReactVisitor<? extends T>)visitor).visitCreate_json_form(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_json_formContext create_json_form() throws RecognitionException {
		Create_json_formContext _localctx = new Create_json_formContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_create_json_form);
		try {
			setState(1076);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,133,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1074);
				create_json_object_without_assign();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1075);
				create_json_with_assign();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Create_json_object_without_assignContext extends ParserRuleContext {
		public Defination_typeContext defination_type() {
			return getRuleContext(Defination_typeContext.class,0);
		}
		public Json_nameContext json_name() {
			return getRuleContext(Json_nameContext.class,0);
		}
		public Create_json_object_without_assignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_json_object_without_assign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserReactListener ) ((ParserReactListener)listener).enterCreate_json_object_without_assign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserReactListener ) ((ParserReactListener)listener).exitCreate_json_object_without_assign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserReactVisitor ) return ((ParserReactVisitor<? extends T>)visitor).visitCreate_json_object_without_assign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_json_object_without_assignContext create_json_object_without_assign() throws RecognitionException {
		Create_json_object_without_assignContext _localctx = new Create_json_object_without_assignContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_create_json_object_without_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1078);
			defination_type();
			setState(1079);
			json_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Create_json_with_assignContext extends ParserRuleContext {
		public Defination_typeContext defination_type() {
			return getRuleContext(Defination_typeContext.class,0);
		}
		public Assign_jsonContext assign_json() {
			return getRuleContext(Assign_jsonContext.class,0);
		}
		public Create_json_with_assignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_json_with_assign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserReactListener ) ((ParserReactListener)listener).enterCreate_json_with_assign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserReactListener ) ((ParserReactListener)listener).exitCreate_json_with_assign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserReactVisitor ) return ((ParserReactVisitor<? extends T>)visitor).visitCreate_json_with_assign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_json_with_assignContext create_json_with_assign() throws RecognitionException {
		Create_json_with_assignContext _localctx = new Create_json_with_assignContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_create_json_with_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1081);
			defination_type();
			setState(1082);
			assign_json();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Inside_json_statmnetContext extends ParserRuleContext {
		public Use_random_nameContext use_random_name() {
			return getRuleContext(Use_random_nameContext.class,0);
		}
		public TerminalNode COLON() { return getToken(ParserReact.COLON, 0); }
		public Value_json_statmnetContext value_json_statmnet() {
			return getRuleContext(Value_json_statmnetContext.class,0);
		}
		public Inside_json_statmnetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inside_json_statmnet; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserReactListener ) ((ParserReactListener)listener).enterInside_json_statmnet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserReactListener ) ((ParserReactListener)listener).exitInside_json_statmnet(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserReactVisitor ) return ((ParserReactVisitor<? extends T>)visitor).visitInside_json_statmnet(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Inside_json_statmnetContext inside_json_statmnet() throws RecognitionException {
		Inside_json_statmnetContext _localctx = new Inside_json_statmnetContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_inside_json_statmnet);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1084);
			use_random_name();
			setState(1085);
			match(COLON);
			setState(1086);
			value_json_statmnet();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Json_statmentContext extends ParserRuleContext {
		public TerminalNode OPEN_BRACE() { return getToken(ParserReact.OPEN_BRACE, 0); }
		public TerminalNode CLOSE_BRACE() { return getToken(ParserReact.CLOSE_BRACE, 0); }
		public List<Inside_json_statmnetContext> inside_json_statmnet() {
			return getRuleContexts(Inside_json_statmnetContext.class);
		}
		public Inside_json_statmnetContext inside_json_statmnet(int i) {
			return getRuleContext(Inside_json_statmnetContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ParserReact.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ParserReact.COMMA, i);
		}
		public Json_statmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_json_statment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserReactListener ) ((ParserReactListener)listener).enterJson_statment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserReactListener ) ((ParserReactListener)listener).exitJson_statment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserReactVisitor ) return ((ParserReactVisitor<? extends T>)visitor).visitJson_statment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Json_statmentContext json_statment() throws RecognitionException {
		Json_statmentContext _localctx = new Json_statmentContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_json_statment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1088);
			match(OPEN_BRACE);
			setState(1097);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RANDOM_NAME) {
				{
				{
				setState(1089);
				inside_json_statmnet();
				}
				setState(1094);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1090);
					match(COMMA);
					setState(1091);
					inside_json_statmnet();
					}
					}
					setState(1096);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(1099);
			match(CLOSE_BRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Value_json_statmnetContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(ParserReact.IDENTIFIER, 0); }
		public TerminalNode NUMERIC_LITERAL() { return getToken(ParserReact.NUMERIC_LITERAL, 0); }
		public TerminalNode NULL() { return getToken(ParserReact.NULL, 0); }
		public Varible_nameContext varible_name() {
			return getRuleContext(Varible_nameContext.class,0);
		}
		public TerminalNode ONE_CHAR_LETTER() { return getToken(ParserReact.ONE_CHAR_LETTER, 0); }
		public Json_statmentContext json_statment() {
			return getRuleContext(Json_statmentContext.class,0);
		}
		public Varible_from_objectContext varible_from_object() {
			return getRuleContext(Varible_from_objectContext.class,0);
		}
		public Call_functionContext call_function() {
			return getRuleContext(Call_functionContext.class,0);
		}
		public Array_base_form_with_indexContext array_base_form_with_index() {
			return getRuleContext(Array_base_form_with_indexContext.class,0);
		}
		public Array_objects_form2Context array_objects_form2() {
			return getRuleContext(Array_objects_form2Context.class,0);
		}
		public TerminalNode OPEN_SQUARE() { return getToken(ParserReact.OPEN_SQUARE, 0); }
		public Value_left_sideContext value_left_side() {
			return getRuleContext(Value_left_sideContext.class,0);
		}
		public TerminalNode CLOSE_SQUARE() { return getToken(ParserReact.CLOSE_SQUARE, 0); }
		public Value_json_statmnetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value_json_statmnet; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserReactListener ) ((ParserReactListener)listener).enterValue_json_statmnet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserReactListener ) ((ParserReactListener)listener).exitValue_json_statmnet(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserReactVisitor ) return ((ParserReactVisitor<? extends T>)visitor).visitValue_json_statmnet(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Value_json_statmnetContext value_json_statmnet() throws RecognitionException {
		Value_json_statmnetContext _localctx = new Value_json_statmnetContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_value_json_statmnet);
		try {
			setState(1116);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,136,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1101);
				expression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1102);
				match(IDENTIFIER);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1103);
				match(NUMERIC_LITERAL);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1104);
				match(NULL);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1105);
				varible_name();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1106);
				match(ONE_CHAR_LETTER);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1107);
				json_statment();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1108);
				varible_from_object();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1109);
				call_function();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1110);
				array_base_form_with_index();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1111);
				array_objects_form2();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(1112);
				match(OPEN_SQUARE);
				setState(1113);
				value_left_side();
				setState(1114);
				match(CLOSE_SQUARE);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Varible_from_objectContext extends ParserRuleContext {
		public Json_nameContext json_name() {
			return getRuleContext(Json_nameContext.class,0);
		}
		public List<TerminalNode> DOT() { return getTokens(ParserReact.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(ParserReact.DOT, i);
		}
		public List<Varible_nameContext> varible_name() {
			return getRuleContexts(Varible_nameContext.class);
		}
		public Varible_nameContext varible_name(int i) {
			return getRuleContext(Varible_nameContext.class,i);
		}
		public Varible_from_objectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varible_from_object; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserReactListener ) ((ParserReactListener)listener).enterVarible_from_object(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserReactListener ) ((ParserReactListener)listener).exitVarible_from_object(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserReactVisitor ) return ((ParserReactVisitor<? extends T>)visitor).visitVarible_from_object(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Varible_from_objectContext varible_from_object() throws RecognitionException {
		Varible_from_objectContext _localctx = new Varible_from_objectContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_varible_from_object);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1118);
			json_name();
			setState(1121); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1119);
					match(DOT);
					setState(1120);
					varible_name();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1123); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,137,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Shortcut_statmentsContext extends ParserRuleContext {
		public TerminalNode MINUS_MINUS() { return getToken(ParserReact.MINUS_MINUS, 0); }
		public Use_random_nameContext use_random_name() {
			return getRuleContext(Use_random_nameContext.class,0);
		}
		public TerminalNode PLPL() { return getToken(ParserReact.PLPL, 0); }
		public Shortcut_statmentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shortcut_statments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserReactListener ) ((ParserReactListener)listener).enterShortcut_statments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserReactListener ) ((ParserReactListener)listener).exitShortcut_statments(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserReactVisitor ) return ((ParserReactVisitor<? extends T>)visitor).visitShortcut_statments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Shortcut_statmentsContext shortcut_statments() throws RecognitionException {
		Shortcut_statmentsContext _localctx = new Shortcut_statmentsContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_shortcut_statments);
		try {
			setState(1135);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,138,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1125);
				match(MINUS_MINUS);
				setState(1126);
				use_random_name();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1127);
				match(PLPL);
				setState(1128);
				use_random_name();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1129);
				use_random_name();
				setState(1130);
				match(MINUS_MINUS);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1132);
				use_random_name();
				setState(1133);
				match(PLPL);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Any_arithmetic_opratorContext extends ParserRuleContext {
		public TerminalNode MULTI() { return getToken(ParserReact.MULTI, 0); }
		public TerminalNode JSX_SLASH_OR_DIV() { return getToken(ParserReact.JSX_SLASH_OR_DIV, 0); }
		public TerminalNode POWER() { return getToken(ParserReact.POWER, 0); }
		public TerminalNode MOD() { return getToken(ParserReact.MOD, 0); }
		public TerminalNode PLUS() { return getToken(ParserReact.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(ParserReact.MINUS, 0); }
		public Any_arithmetic_opratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_any_arithmetic_oprator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserReactListener ) ((ParserReactListener)listener).enterAny_arithmetic_oprator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserReactListener ) ((ParserReactListener)listener).exitAny_arithmetic_oprator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserReactVisitor ) return ((ParserReactVisitor<? extends T>)visitor).visitAny_arithmetic_oprator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Any_arithmetic_opratorContext any_arithmetic_oprator() throws RecognitionException {
		Any_arithmetic_opratorContext _localctx = new Any_arithmetic_opratorContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_any_arithmetic_oprator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1137);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 2305843009306103808L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public Intral_expression_valueContext intral_expression_value() {
			return getRuleContext(Intral_expression_valueContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public Genral_assignContext genral_assign() {
			return getRuleContext(Genral_assignContext.class,0);
		}
		public List<TerminalNode> OPEN_PAREN() { return getTokens(ParserReact.OPEN_PAREN); }
		public TerminalNode OPEN_PAREN(int i) {
			return getToken(ParserReact.OPEN_PAREN, i);
		}
		public List<TerminalNode> CLOSE_PAREN() { return getTokens(ParserReact.CLOSE_PAREN); }
		public TerminalNode CLOSE_PAREN(int i) {
			return getToken(ParserReact.CLOSE_PAREN, i);
		}
		public TerminalNode PLPL() { return getToken(ParserReact.PLPL, 0); }
		public TerminalNode MINUS_MINUS() { return getToken(ParserReact.MINUS_MINUS, 0); }
		public TerminalNode JSX_SLASH_OR_DIV() { return getToken(ParserReact.JSX_SLASH_OR_DIV, 0); }
		public TerminalNode MOD() { return getToken(ParserReact.MOD, 0); }
		public TerminalNode MULTI() { return getToken(ParserReact.MULTI, 0); }
		public TerminalNode PLUS() { return getToken(ParserReact.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(ParserReact.MINUS, 0); }
		public TerminalNode QUESTION() { return getToken(ParserReact.QUESTION, 0); }
		public TerminalNode COLON() { return getToken(ParserReact.COLON, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserReactListener ) ((ParserReactListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserReactListener ) ((ParserReactListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserReactVisitor ) return ((ParserReactVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 194;
		enterRecursionRule(_localctx, 194, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1159);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,142,_ctx) ) {
			case 1:
				{
				setState(1140);
				intral_expression_value();
				}
				break;
			case 2:
				{
				setState(1142); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(1141);
						match(OPEN_PAREN);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(1144); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,139,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(1148);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,140,_ctx) ) {
				case 1:
					{
					setState(1146);
					expression(0);
					}
					break;
				case 2:
					{
					setState(1147);
					genral_assign();
					}
					break;
				}
				setState(1151); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(1150);
						match(CLOSE_PAREN);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(1153); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,141,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 3:
				{
				setState(1155);
				match(PLPL);
				setState(1156);
				expression(5);
				}
				break;
			case 4:
				{
				setState(1157);
				match(MINUS_MINUS);
				setState(1158);
				expression(4);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1179);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,144,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1177);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,143,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1161);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(1162);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 2305843009289191424L) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1163);
						expression(4);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1164);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(1165);
						_la = _input.LA(1);
						if ( !(_la==MINUS || _la==PLUS) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1166);
						expression(3);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1167);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(1168);
						match(QUESTION);
						setState(1169);
						expression(0);
						setState(1170);
						match(COLON);
						setState(1171);
						expression(2);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1173);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(1174);
						match(PLPL);
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1175);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(1176);
						match(MINUS_MINUS);
						}
						break;
					}
					} 
				}
				setState(1181);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,144,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Bool_expressionContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode LT() { return getToken(ParserReact.LT, 0); }
		public TerminalNode GT() { return getToken(ParserReact.GT, 0); }
		public TerminalNode GT_EQ() { return getToken(ParserReact.GT_EQ, 0); }
		public TerminalNode LT_EQ() { return getToken(ParserReact.LT_EQ, 0); }
		public TerminalNode EQ() { return getToken(ParserReact.EQ, 0); }
		public TerminalNode NOT_EQ1() { return getToken(ParserReact.NOT_EQ1, 0); }
		public TerminalNode AND() { return getToken(ParserReact.AND, 0); }
		public TerminalNode OR() { return getToken(ParserReact.OR, 0); }
		public Intral_expression_valueContext intral_expression_value() {
			return getRuleContext(Intral_expression_valueContext.class,0);
		}
		public Bool_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserReactListener ) ((ParserReactListener)listener).enterBool_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserReactListener ) ((ParserReactListener)listener).exitBool_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserReactVisitor ) return ((ParserReactVisitor<? extends T>)visitor).visitBool_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bool_expressionContext bool_expression() throws RecognitionException {
		Bool_expressionContext _localctx = new Bool_expressionContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_bool_expression);
		int _la;
		try {
			setState(1200);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,145,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(1183);
				expression(0);
				setState(1184);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 540431955284459520L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1185);
				expression(0);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(1187);
				expression(0);
				setState(1188);
				_la = _input.LA(1);
				if ( !(_la==EQ || _la==NOT_EQ1) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1189);
				expression(0);
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				{
				setState(1191);
				expression(0);
				setState(1192);
				match(AND);
				setState(1193);
				expression(0);
				}
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				{
				setState(1195);
				expression(0);
				setState(1196);
				match(OR);
				setState(1197);
				expression(0);
				}
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				{
				setState(1199);
				intral_expression_value();
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Intral_expression_valueContext extends ParserRuleContext {
		public TerminalNode TRUE() { return getToken(ParserReact.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(ParserReact.FALSE, 0); }
		public TerminalNode NUMERIC_LITERAL() { return getToken(ParserReact.NUMERIC_LITERAL, 0); }
		public Varible_nameContext varible_name() {
			return getRuleContext(Varible_nameContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(ParserReact.IDENTIFIER, 0); }
		public TerminalNode ONE_CHAR_LETTER() { return getToken(ParserReact.ONE_CHAR_LETTER, 0); }
		public Varible_from_objectContext varible_from_object() {
			return getRuleContext(Varible_from_objectContext.class,0);
		}
		public Array_base_form_with_indexContext array_base_form_with_index() {
			return getRuleContext(Array_base_form_with_indexContext.class,0);
		}
		public Call_functionContext call_function() {
			return getRuleContext(Call_functionContext.class,0);
		}
		public Function_declarationContext function_declaration() {
			return getRuleContext(Function_declarationContext.class,0);
		}
		public UseEffectContext useEffect() {
			return getRuleContext(UseEffectContext.class,0);
		}
		public UseStateContext useState() {
			return getRuleContext(UseStateContext.class,0);
		}
		public Intral_expression_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intral_expression_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserReactListener ) ((ParserReactListener)listener).enterIntral_expression_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserReactListener ) ((ParserReactListener)listener).exitIntral_expression_value(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserReactVisitor ) return ((ParserReactVisitor<? extends T>)visitor).visitIntral_expression_value(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Intral_expression_valueContext intral_expression_value() throws RecognitionException {
		Intral_expression_valueContext _localctx = new Intral_expression_valueContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_intral_expression_value);
		try {
			setState(1214);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,146,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1202);
				match(TRUE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1203);
				match(FALSE);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1204);
				match(NUMERIC_LITERAL);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1205);
				varible_name();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1206);
				match(IDENTIFIER);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1207);
				match(ONE_CHAR_LETTER);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1208);
				varible_from_object();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1209);
				array_base_form_with_index();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1210);
				call_function();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1211);
				function_declaration();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1212);
				useEffect();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(1213);
				useState();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Use_random_nameContext extends ParserRuleContext {
		public TerminalNode RANDOM_NAME() { return getToken(ParserReact.RANDOM_NAME, 0); }
		public Use_random_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_use_random_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserReactListener ) ((ParserReactListener)listener).enterUse_random_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserReactListener ) ((ParserReactListener)listener).exitUse_random_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserReactVisitor ) return ((ParserReactVisitor<? extends T>)visitor).visitUse_random_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Use_random_nameContext use_random_name() throws RecognitionException {
		Use_random_nameContext _localctx = new Use_random_nameContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_use_random_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1216);
			match(RANDOM_NAME);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 97:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
		case 1:
			return precpred(_ctx, 2);
		case 2:
			return precpred(_ctx, 1);
		case 3:
			return precpred(_ctx, 7);
		case 4:
			return precpred(_ctx, 6);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001d\u04c3\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0002"+
		"#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007\'\u0002"+
		"(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0002,\u0007,\u0002"+
		"-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u00070\u00021\u00071\u0002"+
		"2\u00072\u00023\u00073\u00024\u00074\u00025\u00075\u00026\u00076\u0002"+
		"7\u00077\u00028\u00078\u00029\u00079\u0002:\u0007:\u0002;\u0007;\u0002"+
		"<\u0007<\u0002=\u0007=\u0002>\u0007>\u0002?\u0007?\u0002@\u0007@\u0002"+
		"A\u0007A\u0002B\u0007B\u0002C\u0007C\u0002D\u0007D\u0002E\u0007E\u0002"+
		"F\u0007F\u0002G\u0007G\u0002H\u0007H\u0002I\u0007I\u0002J\u0007J\u0002"+
		"K\u0007K\u0002L\u0007L\u0002M\u0007M\u0002N\u0007N\u0002O\u0007O\u0002"+
		"P\u0007P\u0002Q\u0007Q\u0002R\u0007R\u0002S\u0007S\u0002T\u0007T\u0002"+
		"U\u0007U\u0002V\u0007V\u0002W\u0007W\u0002X\u0007X\u0002Y\u0007Y\u0002"+
		"Z\u0007Z\u0002[\u0007[\u0002\\\u0007\\\u0002]\u0007]\u0002^\u0007^\u0002"+
		"_\u0007_\u0002`\u0007`\u0002a\u0007a\u0002b\u0007b\u0002c\u0007c\u0002"+
		"d\u0007d\u0001\u0000\u0001\u0000\u0001\u0000\u0005\u0000\u00ce\b\u0000"+
		"\n\u0000\f\u0000\u00d1\t\u0000\u0001\u0000\u0003\u0000\u00d4\b\u0000\u0005"+
		"\u0000\u00d6\b\u0000\n\u0000\f\u0000\u00d9\t\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002"+
		"\u0001\u0002\u0003\u0002\u00e4\b\u0002\u0001\u0002\u0003\u0002\u00e7\b"+
		"\u0002\u0001\u0002\u0001\u0002\u0003\u0002\u00eb\b\u0002\u0001\u0002\u0005"+
		"\u0002\u00ee\b\u0002\n\u0002\f\u0002\u00f1\t\u0002\u0001\u0002\u0003\u0002"+
		"\u00f4\b\u0002\u0001\u0002\u0001\u0002\u0003\u0002\u00f8\b\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0005\u0006\u0107\b\u0006\n\u0006\f\u0006\u010a\t\u0006\u0001\u0006"+
		"\u0003\u0006\u010d\b\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0003\n\u011f\b\n\u0001\n\u0001\n\u0003\n\u0123"+
		"\b\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003"+
		"\u000b\u012a\b\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\r\u0001\r\u0005\r\u0136\b\r\n\r\f\r\u0139\t\r\u0001\r"+
		"\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0003\u000e\u0149\b\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0003"+
		"\u000f\u0154\b\u000f\u0001\u000f\u0003\u000f\u0157\b\u000f\u0005\u000f"+
		"\u0159\b\u000f\n\u000f\f\u000f\u015c\t\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0005"+
		"\u0011\u0166\b\u0011\n\u0011\f\u0011\u0169\t\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0003\u0011\u0170\b\u0011\u0005\u0011"+
		"\u0172\b\u0011\n\u0011\f\u0011\u0175\t\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001"+
		"\u0012\u0005\u0012\u0180\b\u0012\n\u0012\f\u0012\u0183\t\u0012\u0001\u0012"+
		"\u0003\u0012\u0186\b\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0003\u0013"+
		"\u018b\b\u0013\u0001\u0014\u0001\u0014\u0005\u0014\u018f\b\u0014\n\u0014"+
		"\f\u0014\u0192\t\u0014\u0001\u0014\u0005\u0014\u0195\b\u0014\n\u0014\f"+
		"\u0014\u0198\t\u0014\u0001\u0014\u0003\u0014\u019b\b\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0005\u0016\u01a5\b\u0016\n\u0016\f\u0016\u01a8\t\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0003"+
		"\u0017\u01b0\b\u0017\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0001"+
		"\u001a\u0003\u001a\u01b7\b\u001a\u0001\u001a\u0001\u001a\u0003\u001a\u01bb"+
		"\b\u001a\u0001\u001b\u0001\u001b\u0001\u001c\u0001\u001c\u0001\u001d\u0001"+
		"\u001d\u0003\u001d\u01c3\b\u001d\u0001\u001e\u0001\u001e\u0003\u001e\u01c7"+
		"\b\u001e\u0001\u001e\u0001\u001e\u0003\u001e\u01cb\b\u001e\u0001\u001e"+
		"\u0001\u001e\u0001\u001e\u0003\u001e\u01d0\b\u001e\u0005\u001e\u01d2\b"+
		"\u001e\n\u001e\f\u001e\u01d5\t\u001e\u0003\u001e\u01d7\b\u001e\u0001\u001e"+
		"\u0003\u001e\u01da\b\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e"+
		"\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001 \u0001 \u0001 "+
		"\u0001 \u0003 \u01e8\b \u0001 \u0001 \u0001 \u0003 \u01ed\b \u0005 \u01ef"+
		"\b \n \f \u01f2\t \u0003 \u01f4\b \u0001 \u0001 \u0001!\u0003!\u01f9\b"+
		"!\u0001!\u0001!\u0001!\u0005!\u01fe\b!\n!\f!\u0201\t!\u0001!\u0001!\u0001"+
		"!\u0003!\u0206\b!\u0001!\u0003!\u0209\b!\u0001\"\u0001\"\u0001\"\u0005"+
		"\"\u020e\b\"\n\"\f\"\u0211\t\"\u0001\"\u0001\"\u0001#\u0001#\u0003#\u0217"+
		"\b#\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0003$\u021f\b$\u0001$\u0003"+
		"$\u0222\b$\u0001$\u0001$\u0001$\u0005$\u0227\b$\n$\f$\u022a\t$\u0001$"+
		"\u0001$\u0001$\u0003$\u022f\b$\u0001$\u0001$\u0003$\u0233\b$\u0003$\u0235"+
		"\b$\u0001%\u0001%\u0001%\u0001%\u0001%\u0003%\u023c\b%\u0001%\u0001%\u0001"+
		"&\u0001&\u0001&\u0001&\u0001&\u0005&\u0245\b&\n&\f&\u0248\t&\u0005&\u024a"+
		"\b&\n&\f&\u024d\t&\u0001&\u0001&\u0001\'\u0001\'\u0001\'\u0001(\u0001"+
		"(\u0003(\u0256\b(\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001"+
		")\u0001)\u0003)\u0261\b)\u0001*\u0001*\u0003*\u0265\b*\u0001+\u0001+\u0003"+
		"+\u0269\b+\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0003"+
		",\u0273\b,\u0001-\u0001-\u0001-\u0001-\u0001-\u0001-\u0001-\u0005-\u027c"+
		"\b-\n-\f-\u027f\t-\u0001-\u0001-\u0001.\u0001.\u0001.\u0001.\u0001.\u0001"+
		".\u0003.\u0289\b.\u0001/\u0001/\u0005/\u028d\b/\n/\f/\u0290\t/\u0001/"+
		"\u0003/\u0293\b/\u00010\u00010\u00010\u00010\u00010\u00010\u00050\u029b"+
		"\b0\n0\f0\u029e\t0\u00010\u00010\u00010\u00030\u02a3\b0\u00010\u00010"+
		"\u00010\u00030\u02a8\b0\u00010\u00030\u02ab\b0\u00011\u00011\u00011\u0001"+
		"1\u00011\u00011\u00051\u02b3\b1\n1\f1\u02b6\t1\u00011\u00011\u00011\u0003"+
		"1\u02bb\b1\u00011\u00011\u00011\u00031\u02c0\b1\u00011\u00031\u02c3\b"+
		"1\u00012\u00012\u00012\u00052\u02c8\b2\n2\f2\u02cb\t2\u00012\u00012\u0001"+
		"2\u00032\u02d0\b2\u00012\u00012\u00012\u00032\u02d5\b2\u00012\u00032\u02d8"+
		"\b2\u00013\u00013\u00013\u00013\u00013\u00014\u00014\u00034\u02e1\b4\u0001"+
		"4\u00014\u00014\u00054\u02e6\b4\n4\f4\u02e9\t4\u00014\u00014\u00014\u0003"+
		"4\u02ee\b4\u00014\u00014\u00034\u02f2\b4\u00014\u00014\u00014\u00015\u0001"+
		"5\u00015\u00015\u00015\u00035\u02fc\b5\u00035\u02fe\b5\u00015\u00015\u0003"+
		"5\u0302\b5\u00015\u00015\u00035\u0306\b5\u00015\u00015\u00016\u00016\u0001"+
		"6\u00016\u00016\u00036\u030f\b6\u00017\u00017\u00017\u00017\u00017\u0001"+
		"7\u00057\u0317\b7\n7\f7\u031a\t7\u00017\u00017\u00017\u00017\u00057\u0320"+
		"\b7\n7\f7\u0323\t7\u00017\u00017\u00018\u00018\u00018\u00018\u00018\u0001"+
		"8\u00018\u00018\u00018\u00038\u0330\b8\u00018\u00018\u00018\u00058\u0335"+
		"\b8\n8\f8\u0338\t8\u00018\u00038\u033b\b8\u00038\u033d\b8\u00018\u0001"+
		"8\u00019\u00019\u00019\u00059\u0344\b9\n9\f9\u0347\t9\u00019\u00019\u0003"+
		"9\u034b\b9\u00019\u00039\u034e\b9\u0001:\u0001:\u0001:\u0001:\u0001:\u0001"+
		":\u0003:\u0356\b:\u0001:\u0001:\u0005:\u035a\b:\n:\f:\u035d\t:\u0001:"+
		"\u0001:\u0003:\u0361\b:\u0001:\u0003:\u0364\b:\u0001;\u0001;\u0001<\u0001"+
		"<\u0003<\u036a\b<\u0001=\u0001=\u0001=\u0003=\u036f\b=\u0001>\u0001>\u0001"+
		">\u0003>\u0374\b>\u0001?\u0001?\u0001?\u0003?\u0379\b?\u0001@\u0001@\u0001"+
		"A\u0001A\u0003A\u037f\bA\u0001A\u0001A\u0004A\u0383\bA\u000bA\fA\u0384"+
		"\u0001A\u0001A\u0001A\u0003A\u038a\bA\u0001B\u0001B\u0001B\u0001C\u0001"+
		"C\u0001C\u0001D\u0001D\u0001E\u0001E\u0003E\u0396\bE\u0001E\u0001E\u0004"+
		"E\u039a\bE\u000bE\fE\u039b\u0001E\u0001E\u0001E\u0003E\u03a1\bE\u0001"+
		"F\u0001F\u0003F\u03a5\bF\u0001G\u0001G\u0001G\u0001H\u0001H\u0001H\u0001"+
		"H\u0001H\u0001I\u0001I\u0001I\u0004I\u03b2\bI\u000bI\fI\u03b3\u0001J\u0001"+
		"J\u0001J\u0001J\u0001J\u0003J\u03bb\bJ\u0001J\u0004J\u03be\bJ\u000bJ\f"+
		"J\u03bf\u0001K\u0001K\u0001K\u0005K\u03c5\bK\nK\fK\u03c8\tK\u0001L\u0001"+
		"L\u0001L\u0001L\u0001M\u0001M\u0001M\u0005M\u03d1\bM\nM\fM\u03d4\tM\u0001"+
		"N\u0001N\u0001N\u0005N\u03d9\bN\nN\fN\u03dc\tN\u0001O\u0001O\u0001O\u0005"+
		"O\u03e1\bO\nO\fO\u03e4\tO\u0001P\u0001P\u0001P\u0001P\u0001Q\u0001Q\u0003"+
		"Q\u03ec\bQ\u0001Q\u0001Q\u0001Q\u0003Q\u03f1\bQ\u0005Q\u03f3\bQ\nQ\fQ"+
		"\u03f6\tQ\u0001R\u0001R\u0001R\u0001R\u0001R\u0001R\u0003R\u03fe\bR\u0001"+
		"R\u0001R\u0001R\u0001R\u0001R\u0001R\u0001R\u0001R\u0003R\u0408\bR\u0005"+
		"R\u040a\bR\nR\fR\u040d\tR\u0001S\u0001S\u0001S\u0005S\u0412\bS\nS\fS\u0415"+
		"\tS\u0001T\u0001T\u0001T\u0001T\u0001T\u0001T\u0001T\u0001T\u0001T\u0001"+
		"T\u0003T\u0421\bT\u0001U\u0001U\u0003U\u0425\bU\u0001U\u0001U\u0003U\u0429"+
		"\bU\u0001V\u0001V\u0001W\u0001W\u0001W\u0001W\u0003W\u0431\bW\u0001X\u0001"+
		"X\u0003X\u0435\bX\u0001Y\u0001Y\u0001Y\u0001Z\u0001Z\u0001Z\u0001[\u0001"+
		"[\u0001[\u0001[\u0001\\\u0001\\\u0001\\\u0001\\\u0005\\\u0445\b\\\n\\"+
		"\f\\\u0448\t\\\u0003\\\u044a\b\\\u0001\\\u0001\\\u0001]\u0001]\u0001]"+
		"\u0001]\u0001]\u0001]\u0001]\u0001]\u0001]\u0001]\u0001]\u0001]\u0001"+
		"]\u0001]\u0001]\u0003]\u045d\b]\u0001^\u0001^\u0001^\u0004^\u0462\b^\u000b"+
		"^\f^\u0463\u0001_\u0001_\u0001_\u0001_\u0001_\u0001_\u0001_\u0001_\u0001"+
		"_\u0001_\u0003_\u0470\b_\u0001`\u0001`\u0001a\u0001a\u0001a\u0004a\u0477"+
		"\ba\u000ba\fa\u0478\u0001a\u0001a\u0003a\u047d\ba\u0001a\u0004a\u0480"+
		"\ba\u000ba\fa\u0481\u0001a\u0001a\u0001a\u0001a\u0003a\u0488\ba\u0001"+
		"a\u0001a\u0001a\u0001a\u0001a\u0001a\u0001a\u0001a\u0001a\u0001a\u0001"+
		"a\u0001a\u0001a\u0001a\u0001a\u0001a\u0005a\u049a\ba\na\fa\u049d\ta\u0001"+
		"b\u0001b\u0001b\u0001b\u0001b\u0001b\u0001b\u0001b\u0001b\u0001b\u0001"+
		"b\u0001b\u0001b\u0001b\u0001b\u0001b\u0001b\u0001b\u0003b\u04b1\bb\u0001"+
		"c\u0001c\u0001c\u0001c\u0001c\u0001c\u0001c\u0001c\u0001c\u0001c\u0001"+
		"c\u0001c\u0003c\u04bf\bc\u0001d\u0001d\u0001d\u0000\u0001\u00c2e\u0000"+
		"\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c"+
		"\u001e \"$&(*,.02468:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084"+
		"\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c"+
		"\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4"+
		"\u00b6\u00b8\u00ba\u00bc\u00be\u00c0\u00c2\u00c4\u00c6\u00c8\u0000\u000b"+
		"\u0004\u0000DDGIZZ``\u0002\u0000ZZ__\u0002\u0000\u001f\u001f,-\u000b\u0000"+
		"\u0001\f\u0014\u0014\u0016\u0017\u0019\u0019\u001b\u001c6799==VVZZ__\u0002"+
		"\u0000\f\f\u0011\u0011\u0002\u0000]^``\u0001\u0000!\"\u0005\u0000\f\f"+
		"\u0011\u0011\u0017\u0018\u001a\u001a==\u0003\u0000\u0017\u0017\u001a\u001a"+
		"==\u0001\u00007:\u0001\u0000;<\u055c\u0000\u00d7\u0001\u0000\u0000\u0000"+
		"\u0002\u00dc\u0001\u0000\u0000\u0000\u0004\u00e1\u0001\u0000\u0000\u0000"+
		"\u0006\u00fb\u0001\u0000\u0000\u0000\b\u00fd\u0001\u0000\u0000\u0000\n"+
		"\u00ff\u0001\u0000\u0000\u0000\f\u0102\u0001\u0000\u0000\u0000\u000e\u010e"+
		"\u0001\u0000\u0000\u0000\u0010\u0112\u0001\u0000\u0000\u0000\u0012\u0114"+
		"\u0001\u0000\u0000\u0000\u0014\u0118\u0001\u0000\u0000\u0000\u0016\u0124"+
		"\u0001\u0000\u0000\u0000\u0018\u012b\u0001\u0000\u0000\u0000\u001a\u0133"+
		"\u0001\u0000\u0000\u0000\u001c\u0148\u0001\u0000\u0000\u0000\u001e\u014a"+
		"\u0001\u0000\u0000\u0000 \u015f\u0001\u0000\u0000\u0000\"\u0167\u0001"+
		"\u0000\u0000\u0000$\u017d\u0001\u0000\u0000\u0000&\u018a\u0001\u0000\u0000"+
		"\u0000(\u018c\u0001\u0000\u0000\u0000*\u019e\u0001\u0000\u0000\u0000,"+
		"\u01a0\u0001\u0000\u0000\u0000.\u01af\u0001\u0000\u0000\u00000\u01b1\u0001"+
		"\u0000\u0000\u00002\u01b3\u0001\u0000\u0000\u00004\u01ba\u0001\u0000\u0000"+
		"\u00006\u01bc\u0001\u0000\u0000\u00008\u01be\u0001\u0000\u0000\u0000:"+
		"\u01c2\u0001\u0000\u0000\u0000<\u01c4\u0001\u0000\u0000\u0000>\u01df\u0001"+
		"\u0000\u0000\u0000@\u01e3\u0001\u0000\u0000\u0000B\u01f8\u0001\u0000\u0000"+
		"\u0000D\u020a\u0001\u0000\u0000\u0000F\u0216\u0001\u0000\u0000\u0000H"+
		"\u0234\u0001\u0000\u0000\u0000J\u023b\u0001\u0000\u0000\u0000L\u023f\u0001"+
		"\u0000\u0000\u0000N\u0250\u0001\u0000\u0000\u0000P\u0255\u0001\u0000\u0000"+
		"\u0000R\u0260\u0001\u0000\u0000\u0000T\u0264\u0001\u0000\u0000\u0000V"+
		"\u0268\u0001\u0000\u0000\u0000X\u0272\u0001\u0000\u0000\u0000Z\u0274\u0001"+
		"\u0000\u0000\u0000\\\u0288\u0001\u0000\u0000\u0000^\u028a\u0001\u0000"+
		"\u0000\u0000`\u0294\u0001\u0000\u0000\u0000b\u02ac\u0001\u0000\u0000\u0000"+
		"d\u02c4\u0001\u0000\u0000\u0000f\u02d9\u0001\u0000\u0000\u0000h\u02de"+
		"\u0001\u0000\u0000\u0000j\u02f6\u0001\u0000\u0000\u0000l\u030e\u0001\u0000"+
		"\u0000\u0000n\u0310\u0001\u0000\u0000\u0000p\u0326\u0001\u0000\u0000\u0000"+
		"r\u0340\u0001\u0000\u0000\u0000t\u034f\u0001\u0000\u0000\u0000v\u0365"+
		"\u0001\u0000\u0000\u0000x\u0369\u0001\u0000\u0000\u0000z\u036e\u0001\u0000"+
		"\u0000\u0000|\u0373\u0001\u0000\u0000\u0000~\u0378\u0001\u0000\u0000\u0000"+
		"\u0080\u037a\u0001\u0000\u0000\u0000\u0082\u0382\u0001\u0000\u0000\u0000"+
		"\u0084\u038b\u0001\u0000\u0000\u0000\u0086\u038e\u0001\u0000\u0000\u0000"+
		"\u0088\u0391\u0001\u0000\u0000\u0000\u008a\u0399\u0001\u0000\u0000\u0000"+
		"\u008c\u03a4\u0001\u0000\u0000\u0000\u008e\u03a6\u0001\u0000\u0000\u0000"+
		"\u0090\u03a9\u0001\u0000\u0000\u0000\u0092\u03ae\u0001\u0000\u0000\u0000"+
		"\u0094\u03b5\u0001\u0000\u0000\u0000\u0096\u03c1\u0001\u0000\u0000\u0000"+
		"\u0098\u03c9\u0001\u0000\u0000\u0000\u009a\u03cd\u0001\u0000\u0000\u0000"+
		"\u009c\u03d5\u0001\u0000\u0000\u0000\u009e\u03dd\u0001\u0000\u0000\u0000"+
		"\u00a0\u03e5\u0001\u0000\u0000\u0000\u00a2\u03eb\u0001\u0000\u0000\u0000"+
		"\u00a4\u03fd\u0001\u0000\u0000\u0000\u00a6\u040e\u0001\u0000\u0000\u0000"+
		"\u00a8\u0420\u0001\u0000\u0000\u0000\u00aa\u0428\u0001\u0000\u0000\u0000"+
		"\u00ac\u042a\u0001\u0000\u0000\u0000\u00ae\u042c\u0001\u0000\u0000\u0000"+
		"\u00b0\u0434\u0001\u0000\u0000\u0000\u00b2\u0436\u0001\u0000\u0000\u0000"+
		"\u00b4\u0439\u0001\u0000\u0000\u0000\u00b6\u043c\u0001\u0000\u0000\u0000"+
		"\u00b8\u0440\u0001\u0000\u0000\u0000\u00ba\u045c\u0001\u0000\u0000\u0000"+
		"\u00bc\u045e\u0001\u0000\u0000\u0000\u00be\u046f\u0001\u0000\u0000\u0000"+
		"\u00c0\u0471\u0001\u0000\u0000\u0000\u00c2\u0487\u0001\u0000\u0000\u0000"+
		"\u00c4\u04b0\u0001\u0000\u0000\u0000\u00c6\u04be\u0001\u0000\u0000\u0000"+
		"\u00c8\u04c0\u0001\u0000\u0000\u0000\u00ca\u00cf\u0003\u0004\u0002\u0000"+
		"\u00cb\u00ce\u0003F#\u0000\u00cc\u00ce\u0003:\u001d\u0000\u00cd\u00cb"+
		"\u0001\u0000\u0000\u0000\u00cd\u00cc\u0001\u0000\u0000\u0000\u00ce\u00d1"+
		"\u0001\u0000\u0000\u0000\u00cf\u00cd\u0001\u0000\u0000\u0000\u00cf\u00d0"+
		"\u0001\u0000\u0000\u0000\u00d0\u00d3\u0001\u0000\u0000\u0000\u00d1\u00cf"+
		"\u0001\u0000\u0000\u0000\u00d2\u00d4\u0003\u0002\u0001\u0000\u00d3\u00d2"+
		"\u0001\u0000\u0000\u0000\u00d3\u00d4\u0001\u0000\u0000\u0000\u00d4\u00d6"+
		"\u0001\u0000\u0000\u0000\u00d5\u00ca\u0001\u0000\u0000\u0000\u00d6\u00d9"+
		"\u0001\u0000\u0000\u0000\u00d7\u00d5\u0001\u0000\u0000\u0000\u00d7\u00d8"+
		"\u0001\u0000\u0000\u0000\u00d8\u00da\u0001\u0000\u0000\u0000\u00d9\u00d7"+
		"\u0001\u0000\u0000\u0000\u00da\u00db\u0005\u0000\u0000\u0001\u00db\u0001"+
		"\u0001\u0000\u0000\u0000\u00dc\u00dd\u0005.\u0000\u0000\u00dd\u00de\u0005"+
		"/\u0000\u0000\u00de\u00df\u0005Z\u0000\u0000\u00df\u00e0\u0005\u0015\u0000"+
		"\u0000\u00e0\u0003\u0001\u0000\u0000\u0000\u00e1\u00e3\u00052\u0000\u0000"+
		"\u00e2\u00e4\u0003\b\u0004\u0000\u00e3\u00e2\u0001\u0000\u0000\u0000\u00e3"+
		"\u00e4\u0001\u0000\u0000\u0000\u00e4\u00f3\u0001\u0000\u0000\u0000\u00e5"+
		"\u00e7\u0005\u0001\u0000\u0000\u00e6\u00e5\u0001\u0000\u0000\u0000\u00e6"+
		"\u00e7\u0001\u0000\u0000\u0000\u00e7\u00e8\u0001\u0000\u0000\u0000\u00e8"+
		"\u00ef\u0005\u0004\u0000\u0000\u00e9\u00eb\u0005\u0001\u0000\u0000\u00ea"+
		"\u00e9\u0001\u0000\u0000\u0000\u00ea\u00eb\u0001\u0000\u0000\u0000\u00eb"+
		"\u00ec\u0001\u0000\u0000\u0000\u00ec\u00ee\u0003\b\u0004\u0000\u00ed\u00ea"+
		"\u0001\u0000\u0000\u0000\u00ee\u00f1\u0001\u0000\u0000\u0000\u00ef\u00ed"+
		"\u0001\u0000\u0000\u0000\u00ef\u00f0\u0001\u0000\u0000\u0000\u00f0\u00f2"+
		"\u0001\u0000\u0000\u0000\u00f1\u00ef\u0001\u0000\u0000\u0000\u00f2\u00f4"+
		"\u0005\u0005\u0000\u0000\u00f3\u00e6\u0001\u0000\u0000\u0000\u00f3\u00f4"+
		"\u0001\u0000\u0000\u0000\u00f4\u00f5\u0001\u0000\u0000\u0000\u00f5\u00f7"+
		"\u00055\u0000\u0000\u00f6\u00f8\u0003\u0006\u0003\u0000\u00f7\u00f6\u0001"+
		"\u0000\u0000\u0000\u00f7\u00f8\u0001\u0000\u0000\u0000\u00f8\u00f9\u0001"+
		"\u0000\u0000\u0000\u00f9\u00fa\u0005\u0015\u0000\u0000\u00fa\u0005\u0001"+
		"\u0000\u0000\u0000\u00fb\u00fc\u0005^\u0000\u0000\u00fc\u0007\u0001\u0000"+
		"\u0000\u0000\u00fd\u00fe\u0007\u0000\u0000\u0000\u00fe\t\u0001\u0000\u0000"+
		"\u0000\u00ff\u0100\u0005\\\u0000\u0000\u0100\u0101\u0005\u0015\u0000\u0000"+
		"\u0101\u000b\u0001\u0000\u0000\u0000\u0102\u0103\u0005\u0004\u0000\u0000"+
		"\u0103\u0108\u0003\u000e\u0007\u0000\u0104\u0105\u0005\u0001\u0000\u0000"+
		"\u0105\u0107\u0003\u000e\u0007\u0000\u0106\u0104\u0001\u0000\u0000\u0000"+
		"\u0107\u010a\u0001\u0000\u0000\u0000\u0108\u0106\u0001\u0000\u0000\u0000"+
		"\u0108\u0109\u0001\u0000\u0000\u0000\u0109\u010c\u0001\u0000\u0000\u0000"+
		"\u010a\u0108\u0001\u0000\u0000\u0000\u010b\u010d\u0005\u0005\u0000\u0000"+
		"\u010c\u010b\u0001\u0000\u0000\u0000\u010c\u010d\u0001\u0000\u0000\u0000"+
		"\u010d\r\u0001\u0000\u0000\u0000\u010e\u010f\u0005`\u0000\u0000\u010f"+
		"\u0110\u0005\b\u0000\u0000\u0110\u0111\u0003\u0010\b\u0000\u0111\u000f"+
		"\u0001\u0000\u0000\u0000\u0112\u0113\u0007\u0001\u0000\u0000\u0113\u0011"+
		"\u0001\u0000\u0000\u0000\u0114\u0115\u0005I\u0000\u0000\u0115\u0116\u0005"+
		"\u0006\u0000\u0000\u0116\u0117\u0005\u0007\u0000\u0000\u0117\u0013\u0001"+
		"\u0000\u0000\u0000\u0118\u0119\u0005G\u0000\u0000\u0119\u011e\u0005\u0006"+
		"\u0000\u0000\u011a\u011b\u0005Z\u0000\u0000\u011b\u011c\u0005\t\u0000"+
		"\u0000\u011c\u011f\u0005Z\u0000\u0000\u011d\u011f\u0005Z\u0000\u0000\u011e"+
		"\u011a\u0001\u0000\u0000\u0000\u011e\u011d\u0001\u0000\u0000\u0000\u011f"+
		"\u0120\u0001\u0000\u0000\u0000\u0120\u0122\u0005\u0007\u0000\u0000\u0121"+
		"\u0123\u0005\u0015\u0000\u0000\u0122\u0121\u0001\u0000\u0000\u0000\u0122"+
		"\u0123\u0001\u0000\u0000\u0000\u0123\u0015\u0001\u0000\u0000\u0000\u0124"+
		"\u0125\u0007\u0002\u0000\u0000\u0125\u0126\u0003\u001a\r\u0000\u0126\u0127"+
		"\u0005\u000b\u0000\u0000\u0127\u0129\u0003\u0014\n\u0000\u0128\u012a\u0005"+
		"\u0015\u0000\u0000\u0129\u0128\u0001\u0000\u0000\u0000\u0129\u012a\u0001"+
		"\u0000\u0000\u0000\u012a\u0017\u0001\u0000\u0000\u0000\u012b\u012c\u0005"+
		"H\u0000\u0000\u012c\u012d\u0005\u0006\u0000\u0000\u012d\u012e\u0003<\u001e"+
		"\u0000\u012e\u012f\u0005\u0001\u0000\u0000\u012f\u0130\u0003\u001a\r\u0000"+
		"\u0130\u0131\u0005\u0007\u0000\u0000\u0131\u0132\u0005\u0015\u0000\u0000"+
		"\u0132\u0019\u0001\u0000\u0000\u0000\u0133\u0137\u0005\u0002\u0000\u0000"+
		"\u0134\u0136\u0003\u001c\u000e\u0000\u0135\u0134\u0001\u0000\u0000\u0000"+
		"\u0136\u0139\u0001\u0000\u0000\u0000\u0137\u0135\u0001\u0000\u0000\u0000"+
		"\u0137\u0138\u0001\u0000\u0000\u0000\u0138\u013a\u0001\u0000\u0000\u0000"+
		"\u0139\u0137\u0001\u0000\u0000\u0000\u013a\u013b\u0005\u0003\u0000\u0000"+
		"\u013b\u001b\u0001\u0000\u0000\u0000\u013c\u0149\u0005@\u0000\u0000\u013d"+
		"\u0149\u0005\b\u0000\u0000\u013e\u0149\u0005Z\u0000\u0000\u013f\u0149"+
		"\u0005_\u0000\u0000\u0140\u0149\u0005>\u0000\u0000\u0141\u0149\u0005\t"+
		"\u0000\u0000\u0142\u0149\u0005\u0001\u0000\u0000\u0143\u0149\u0005\u001b"+
		"\u0000\u0000\u0144\u0149\u0005=\u0000\u0000\u0145\u0149\u0005\u0004\u0000"+
		"\u0000\u0146\u0149\u0005\u0005\u0000\u0000\u0147\u0149\u0005\u0002\u0000"+
		"\u0000\u0148\u013c\u0001\u0000\u0000\u0000\u0148\u013d\u0001\u0000\u0000"+
		"\u0000\u0148\u013e\u0001\u0000\u0000\u0000\u0148\u013f\u0001\u0000\u0000"+
		"\u0000\u0148\u0140\u0001\u0000\u0000\u0000\u0148\u0141\u0001\u0000\u0000"+
		"\u0000\u0148\u0142\u0001\u0000\u0000\u0000\u0148\u0143\u0001\u0000\u0000"+
		"\u0000\u0148\u0144\u0001\u0000\u0000\u0000\u0148\u0145\u0001\u0000\u0000"+
		"\u0000\u0148\u0146\u0001\u0000\u0000\u0000\u0148\u0147\u0001\u0000\u0000"+
		"\u0000\u0149\u001d\u0001\u0000\u0000\u0000\u014a\u015a\u0005\u0004\u0000"+
		"\u0000\u014b\u014c\u0005Z\u0000\u0000\u014c\u0153\u0005\b\u0000\u0000"+
		"\u014d\u0154\u0003\u0010\b\u0000\u014e\u014f\u0005\u0016\u0000\u0000\u014f"+
		"\u0150\u0005\u0004\u0000\u0000\u0150\u0151\u0005Z\u0000\u0000\u0151\u0154"+
		"\u0005\u0005\u0000\u0000\u0152\u0154\u0003\u001a\r\u0000\u0153\u014d\u0001"+
		"\u0000\u0000\u0000\u0153\u014e\u0001\u0000\u0000\u0000\u0153\u0152\u0001"+
		"\u0000\u0000\u0000\u0154\u0156\u0001\u0000\u0000\u0000\u0155\u0157\u0005"+
		"\u0001\u0000\u0000\u0156\u0155\u0001\u0000\u0000\u0000\u0156\u0157\u0001"+
		"\u0000\u0000\u0000\u0157\u0159\u0001\u0000\u0000\u0000\u0158\u014b\u0001"+
		"\u0000\u0000\u0000\u0159\u015c\u0001\u0000\u0000\u0000\u015a\u0158\u0001"+
		"\u0000\u0000\u0000\u015a\u015b\u0001\u0000\u0000\u0000\u015b\u015d\u0001"+
		"\u0000\u0000\u0000\u015c\u015a\u0001\u0000\u0000\u0000\u015d\u015e\u0005"+
		"\u0005\u0000\u0000\u015e\u001f\u0001\u0000\u0000\u0000\u015f\u0160\u0005"+
		"\u0004\u0000\u0000\u0160\u0161\u0003<\u001e\u0000\u0161\u0162\u0005\u0005"+
		"\u0000\u0000\u0162!\u0001\u0000\u0000\u0000\u0163\u0164\u0005Z\u0000\u0000"+
		"\u0164\u0166\u0005\t\u0000\u0000\u0165\u0163\u0001\u0000\u0000\u0000\u0166"+
		"\u0169\u0001\u0000\u0000\u0000\u0167\u0165\u0001\u0000\u0000\u0000\u0167"+
		"\u0168\u0001\u0000\u0000\u0000\u0168\u016a\u0001\u0000\u0000\u0000\u0169"+
		"\u0167\u0001\u0000\u0000\u0000\u016a\u016b\u0005V\u0000\u0000\u016b\u016c"+
		"\u0005\u0006\u0000\u0000\u016c\u0173\u0005\u0006\u0000\u0000\u016d\u016f"+
		"\u0005Z\u0000\u0000\u016e\u0170\u0005\u0001\u0000\u0000\u016f\u016e\u0001"+
		"\u0000\u0000\u0000\u016f\u0170\u0001\u0000\u0000\u0000\u0170\u0172\u0001"+
		"\u0000\u0000\u0000\u0171\u016d\u0001\u0000\u0000\u0000\u0172\u0175\u0001"+
		"\u0000\u0000\u0000\u0173\u0171\u0001\u0000\u0000\u0000\u0173\u0174\u0001"+
		"\u0000\u0000\u0000\u0174\u0176\u0001\u0000\u0000\u0000\u0175\u0173\u0001"+
		"\u0000\u0000\u0000\u0176\u0177\u0005\u0007\u0000\u0000\u0177\u0178\u0005"+
		"\n\u0000\u0000\u0178\u0179\u0005\u0006\u0000\u0000\u0179\u017a\u0003$"+
		"\u0012\u0000\u017a\u017b\u0005\u0007\u0000\u0000\u017b\u017c\u0005\u0007"+
		"\u0000\u0000\u017c#\u0001\u0000\u0000\u0000\u017d\u0181\u00057\u0000\u0000"+
		"\u017e\u0180\u0003&\u0013\u0000\u017f\u017e\u0001\u0000\u0000\u0000\u0180"+
		"\u0183\u0001\u0000\u0000\u0000\u0181\u017f\u0001\u0000\u0000\u0000\u0181"+
		"\u0182\u0001\u0000\u0000\u0000\u0182\u0185\u0001\u0000\u0000\u0000\u0183"+
		"\u0181\u0001\u0000\u0000\u0000\u0184\u0186\u00059\u0000\u0000\u0185\u0184"+
		"\u0001\u0000\u0000\u0000\u0185\u0186\u0001\u0000\u0000\u0000\u0186%\u0001"+
		"\u0000\u0000\u0000\u0187\u018b\u0003*\u0015\u0000\u0188\u018b\u0003$\u0012"+
		"\u0000\u0189\u018b\u0003,\u0016\u0000\u018a\u0187\u0001\u0000\u0000\u0000"+
		"\u018a\u0188\u0001\u0000\u0000\u0000\u018a\u0189\u0001\u0000\u0000\u0000"+
		"\u018b\'\u0001\u0000\u0000\u0000\u018c\u0190\u00057\u0000\u0000\u018d"+
		"\u018f\u0005Z\u0000\u0000\u018e\u018d\u0001\u0000\u0000\u0000\u018f\u0192"+
		"\u0001\u0000\u0000\u0000\u0190\u018e\u0001\u0000\u0000\u0000\u0190\u0191"+
		"\u0001\u0000\u0000\u0000\u0191\u0196\u0001\u0000\u0000\u0000\u0192\u0190"+
		"\u0001\u0000\u0000\u0000\u0193\u0195\u0003*\u0015\u0000\u0194\u0193\u0001"+
		"\u0000\u0000\u0000\u0195\u0198\u0001\u0000\u0000\u0000\u0196\u0194\u0001"+
		"\u0000\u0000\u0000\u0196\u0197\u0001\u0000\u0000\u0000\u0197\u019a\u0001"+
		"\u0000\u0000\u0000\u0198\u0196\u0001\u0000\u0000\u0000\u0199\u019b\u0005"+
		"=\u0000\u0000\u019a\u0199\u0001\u0000\u0000\u0000\u019a\u019b\u0001\u0000"+
		"\u0000\u0000\u019b\u019c\u0001\u0000\u0000\u0000\u019c\u019d\u00059\u0000"+
		"\u0000\u019d)\u0001\u0000\u0000\u0000\u019e\u019f\u0007\u0003\u0000\u0000"+
		"\u019f+\u0001\u0000\u0000\u0000\u01a0\u01a1\u0005\u0004\u0000\u0000\u01a1"+
		"\u01a2\u0005`\u0000\u0000\u01a2\u01a6\u0005\u0006\u0000\u0000\u01a3\u01a5"+
		"\u0003*\u0015\u0000\u01a4\u01a3\u0001\u0000\u0000\u0000\u01a5\u01a8\u0001"+
		"\u0000\u0000\u0000\u01a6\u01a4\u0001\u0000\u0000\u0000\u01a6\u01a7\u0001"+
		"\u0000\u0000\u0000\u01a7\u01a9\u0001\u0000\u0000\u0000\u01a8\u01a6\u0001"+
		"\u0000\u0000\u0000\u01a9\u01aa\u0005\u0007\u0000\u0000\u01aa\u01ab\u0005"+
		"\u0005\u0000\u0000\u01ab-\u0001\u0000\u0000\u0000\u01ac\u01b0\u0003(\u0014"+
		"\u0000\u01ad\u01b0\u0003$\u0012\u0000\u01ae\u01b0\u0003\n\u0005\u0000"+
		"\u01af\u01ac\u0001\u0000\u0000\u0000\u01af\u01ad\u0001\u0000\u0000\u0000"+
		"\u01af\u01ae\u0001\u0000\u0000\u0000\u01b0/\u0001\u0000\u0000\u0000\u01b1"+
		"\u01b2\u0003\u00c8d\u0000\u01b21\u0001\u0000\u0000\u0000\u01b3\u01b4\u0003"+
		"\u00c8d\u0000\u01b43\u0001\u0000\u0000\u0000\u01b5\u01b7\u0007\u0004\u0000"+
		"\u0000\u01b6\u01b5\u0001\u0000\u0000\u0000\u01b6\u01b7\u0001\u0000\u0000"+
		"\u0000\u01b7\u01b8\u0001\u0000\u0000\u0000\u01b8\u01bb\u0005_\u0000\u0000"+
		"\u01b9\u01bb\u0005\u001a\u0000\u0000\u01ba\u01b6\u0001\u0000\u0000\u0000"+
		"\u01ba\u01b9\u0001\u0000\u0000\u0000\u01bb5\u0001\u0000\u0000\u0000\u01bc"+
		"\u01bd\u0005]\u0000\u0000\u01bd7\u0001\u0000\u0000\u0000\u01be\u01bf\u0007"+
		"\u0005\u0000\u0000\u01bf9\u0001\u0000\u0000\u0000\u01c0\u01c3\u0003>\u001f"+
		"\u0000\u01c1\u01c3\u0003<\u001e\u0000\u01c2\u01c0\u0001\u0000\u0000\u0000"+
		"\u01c2\u01c1\u0001\u0000\u0000\u0000\u01c3;\u0001\u0000\u0000\u0000\u01c4"+
		"\u01c6\u0005\u0006\u0000\u0000\u01c5\u01c7\u0005\u0004\u0000\u0000\u01c6"+
		"\u01c5\u0001\u0000\u0000\u0000\u01c6\u01c7\u0001\u0000\u0000\u0000\u01c7"+
		"\u01d6\u0001\u0000\u0000\u0000\u01c8\u01cb\u0003P(\u0000\u01c9\u01cb\u0003"+
		"z=\u0000\u01ca\u01c8\u0001\u0000\u0000\u0000\u01ca\u01c9\u0001\u0000\u0000"+
		"\u0000\u01cb\u01d3\u0001\u0000\u0000\u0000\u01cc\u01cf\u0005\u0001\u0000"+
		"\u0000\u01cd\u01d0\u0003P(\u0000\u01ce\u01d0\u0003z=\u0000\u01cf\u01cd"+
		"\u0001\u0000\u0000\u0000\u01cf\u01ce\u0001\u0000\u0000\u0000\u01d0\u01d2"+
		"\u0001\u0000\u0000\u0000\u01d1\u01cc\u0001\u0000\u0000\u0000\u01d2\u01d5"+
		"\u0001\u0000\u0000\u0000\u01d3\u01d1\u0001\u0000\u0000\u0000\u01d3\u01d4"+
		"\u0001\u0000\u0000\u0000\u01d4\u01d7\u0001\u0000\u0000\u0000\u01d5\u01d3"+
		"\u0001\u0000\u0000\u0000\u01d6\u01ca\u0001\u0000\u0000\u0000\u01d6\u01d7"+
		"\u0001\u0000\u0000\u0000\u01d7\u01d9\u0001\u0000\u0000\u0000\u01d8\u01da"+
		"\u0005\u0005\u0000\u0000\u01d9\u01d8\u0001\u0000\u0000\u0000\u01d9\u01da"+
		"\u0001\u0000\u0000\u0000\u01da\u01db\u0001\u0000\u0000\u0000\u01db\u01dc"+
		"\u0005\u0007\u0000\u0000\u01dc\u01dd\u0005\n\u0000\u0000\u01dd\u01de\u0003"+
		"B!\u0000\u01de=\u0001\u0000\u0000\u0000\u01df\u01e0\u0005 \u0000\u0000"+
		"\u01e0\u01e1\u0003@ \u0000\u01e1\u01e2\u0003B!\u0000\u01e2?\u0001\u0000"+
		"\u0000\u0000\u01e3\u01e4\u0003\u00c8d\u0000\u01e4\u01f3\u0005\u0006\u0000"+
		"\u0000\u01e5\u01e8\u0003P(\u0000\u01e6\u01e8\u0003z=\u0000\u01e7\u01e5"+
		"\u0001\u0000\u0000\u0000\u01e7\u01e6\u0001\u0000\u0000\u0000\u01e8\u01f0"+
		"\u0001\u0000\u0000\u0000\u01e9\u01ec\u0005\u0001\u0000\u0000\u01ea\u01ed"+
		"\u0003P(\u0000\u01eb\u01ed\u0003z=\u0000\u01ec\u01ea\u0001\u0000\u0000"+
		"\u0000\u01ec\u01eb\u0001\u0000\u0000\u0000\u01ed\u01ef\u0001\u0000\u0000"+
		"\u0000\u01ee\u01e9\u0001\u0000\u0000\u0000\u01ef\u01f2\u0001\u0000\u0000"+
		"\u0000\u01f0\u01ee\u0001\u0000\u0000\u0000\u01f0\u01f1\u0001\u0000\u0000"+
		"\u0000\u01f1\u01f4\u0001\u0000\u0000\u0000\u01f2\u01f0\u0001\u0000\u0000"+
		"\u0000\u01f3\u01e7\u0001\u0000\u0000\u0000\u01f3\u01f4\u0001\u0000\u0000"+
		"\u0000\u01f4\u01f5\u0001\u0000\u0000\u0000\u01f5\u01f6\u0005\u0007\u0000"+
		"\u0000\u01f6A\u0001\u0000\u0000\u0000\u01f7\u01f9\u0005\u0004\u0000\u0000"+
		"\u01f8\u01f7\u0001\u0000\u0000\u0000\u01f8\u01f9\u0001\u0000\u0000\u0000"+
		"\u01f9\u01ff\u0001\u0000\u0000\u0000\u01fa\u01fe\u0003D\"\u0000\u01fb"+
		"\u01fe\u0003F#\u0000\u01fc\u01fe\u0003.\u0017\u0000\u01fd\u01fa\u0001"+
		"\u0000\u0000\u0000\u01fd\u01fb\u0001\u0000\u0000\u0000\u01fd\u01fc\u0001"+
		"\u0000\u0000\u0000\u01fe\u0201\u0001\u0000\u0000\u0000\u01ff\u01fd\u0001"+
		"\u0000\u0000\u0000\u01ff\u0200\u0001\u0000\u0000\u0000\u0200\u0205\u0001"+
		"\u0000\u0000\u0000\u0201\u01ff\u0001\u0000\u0000\u0000\u0202\u0203\u0003"+
		"T*\u0000\u0203\u0204\u0005\u0015\u0000\u0000\u0204\u0206\u0001\u0000\u0000"+
		"\u0000\u0205\u0202\u0001\u0000\u0000\u0000\u0205\u0206\u0001\u0000\u0000"+
		"\u0000\u0206\u0208\u0001\u0000\u0000\u0000\u0207\u0209\u0005\u0005\u0000"+
		"\u0000\u0208\u0207\u0001\u0000\u0000\u0000\u0208\u0209\u0001\u0000\u0000"+
		"\u0000\u0209C\u0001\u0000\u0000\u0000\u020a\u020f\u0005\u0004\u0000\u0000"+
		"\u020b\u020e\u0003D\"\u0000\u020c\u020e\u0003F#\u0000\u020d\u020b\u0001"+
		"\u0000\u0000\u0000\u020d\u020c\u0001\u0000\u0000\u0000\u020e\u0211\u0001"+
		"\u0000\u0000\u0000\u020f\u020d\u0001\u0000\u0000\u0000\u020f\u0210\u0001"+
		"\u0000\u0000\u0000\u0210\u0212\u0001\u0000\u0000\u0000\u0211\u020f\u0001"+
		"\u0000\u0000\u0000\u0212\u0213\u0005\u0005\u0000\u0000\u0213E\u0001\u0000"+
		"\u0000\u0000\u0214\u0217\u0003H$\u0000\u0215\u0217\u0003J%\u0000\u0216"+
		"\u0214\u0001\u0000\u0000\u0000\u0216\u0215\u0001\u0000\u0000\u0000\u0217"+
		"G\u0001\u0000\u0000\u0000\u0218\u0235\u0003h4\u0000\u0219\u0235\u0003"+
		"^/\u0000\u021a\u0235\u0003p8\u0000\u021b\u021f\u0003f3\u0000\u021c\u021f"+
		"\u0003n7\u0000\u021d\u021f\u0003j5\u0000\u021e\u021b\u0001\u0000\u0000"+
		"\u0000\u021e\u021c\u0001\u0000\u0000\u0000\u021e\u021d\u0001\u0000\u0000"+
		"\u0000\u021f\u0232\u0001\u0000\u0000\u0000\u0220\u0222\u0003V+\u0000\u0221"+
		"\u0220\u0001\u0000\u0000\u0000\u0221\u0222\u0001\u0000\u0000\u0000\u0222"+
		"\u0223\u0001\u0000\u0000\u0000\u0223\u0233\u0005\u0015\u0000\u0000\u0224"+
		"\u0228\u0005\u0004\u0000\u0000\u0225\u0227\u0003F#\u0000\u0226\u0225\u0001"+
		"\u0000\u0000\u0000\u0227\u022a\u0001\u0000\u0000\u0000\u0228\u0226\u0001"+
		"\u0000\u0000\u0000\u0228\u0229\u0001\u0000\u0000\u0000\u0229\u022e\u0001"+
		"\u0000\u0000\u0000\u022a\u0228\u0001\u0000\u0000\u0000\u022b\u022c\u0003"+
		"V+\u0000\u022c\u022d\u0005\u0015\u0000\u0000\u022d\u022f\u0001\u0000\u0000"+
		"\u0000\u022e\u022b\u0001\u0000\u0000\u0000\u022e\u022f\u0001\u0000\u0000"+
		"\u0000\u022f\u0230\u0001\u0000\u0000\u0000\u0230\u0233\u0005\u0005\u0000"+
		"\u0000\u0231\u0233\u0003F#\u0000\u0232\u0221\u0001\u0000\u0000\u0000\u0232"+
		"\u0224\u0001\u0000\u0000\u0000\u0232\u0231\u0001\u0000\u0000\u0000\u0233"+
		"\u0235\u0001\u0000\u0000\u0000\u0234\u0218\u0001\u0000\u0000\u0000\u0234"+
		"\u0219\u0001\u0000\u0000\u0000\u0234\u021a\u0001\u0000\u0000\u0000\u0234"+
		"\u021e\u0001\u0000\u0000\u0000\u0235I\u0001\u0000\u0000\u0000\u0236\u023c"+
		"\u0003L&\u0000\u0237\u023c\u0003Z-\u0000\u0238\u023c\u0003\u00be_\u0000"+
		"\u0239\u023c\u0003x<\u0000\u023a\u023c\u0003~?\u0000\u023b\u0236\u0001"+
		"\u0000\u0000\u0000\u023b\u0237\u0001\u0000\u0000\u0000\u023b\u0238\u0001"+
		"\u0000\u0000\u0000\u023b\u0239\u0001\u0000\u0000\u0000\u023b\u023a\u0001"+
		"\u0000\u0000\u0000\u023c\u023d\u0001\u0000\u0000\u0000\u023d\u023e\u0005"+
		"\u0015\u0000\u0000\u023eK\u0001\u0000\u0000\u0000\u023f\u0240\u0003\u00c8"+
		"d\u0000\u0240\u024b\u0005\u0006\u0000\u0000\u0241\u0246\u0003R)\u0000"+
		"\u0242\u0243\u0005\u0001\u0000\u0000\u0243\u0245\u0003R)\u0000\u0244\u0242"+
		"\u0001\u0000\u0000\u0000\u0245\u0248\u0001\u0000\u0000\u0000\u0246\u0244"+
		"\u0001\u0000\u0000\u0000\u0246\u0247\u0001\u0000\u0000\u0000\u0247\u024a"+
		"\u0001\u0000\u0000\u0000\u0248\u0246\u0001\u0000\u0000\u0000\u0249\u0241"+
		"\u0001\u0000\u0000\u0000\u024a\u024d\u0001\u0000\u0000\u0000\u024b\u0249"+
		"\u0001\u0000\u0000\u0000\u024b\u024c\u0001\u0000\u0000\u0000\u024c\u024e"+
		"\u0001\u0000\u0000\u0000\u024d\u024b\u0001\u0000\u0000\u0000\u024e\u024f"+
		"\u0005\u0007\u0000\u0000\u024fM\u0001\u0000\u0000\u0000\u0250\u0251\u0003"+
		"@ \u0000\u0251\u0252\u0003B!\u0000\u0252O\u0001\u0000\u0000\u0000\u0253"+
		"\u0256\u0003|>\u0000\u0254\u0256\u0003N\'\u0000\u0255\u0253\u0001\u0000"+
		"\u0000\u0000\u0255\u0254\u0001\u0000\u0000\u0000\u0256Q\u0001\u0000\u0000"+
		"\u0000\u0257\u0261\u0003\u00c2a\u0000\u0258\u0261\u0005_\u0000\u0000\u0259"+
		"\u0261\u0005\\\u0000\u0000\u025a\u0261\u0003L&\u0000\u025b\u0261\u0005"+
		"^\u0000\u0000\u025c\u0261\u0003\u00c8d\u0000\u025d\u0261\u0003\u00bc^"+
		"\u0000\u025e\u0261\u0003\u0094J\u0000\u025f\u0261\u0003~?\u0000\u0260"+
		"\u0257\u0001\u0000\u0000\u0000\u0260\u0258\u0001\u0000\u0000\u0000\u0260"+
		"\u0259\u0001\u0000\u0000\u0000\u0260\u025a\u0001\u0000\u0000\u0000\u0260"+
		"\u025b\u0001\u0000\u0000\u0000\u0260\u025c\u0001\u0000\u0000\u0000\u0260"+
		"\u025d\u0001\u0000\u0000\u0000\u0260\u025e\u0001\u0000\u0000\u0000\u0260"+
		"\u025f\u0001\u0000\u0000\u0000\u0261S\u0001\u0000\u0000\u0000\u0262\u0263"+
		"\u0005#\u0000\u0000\u0263\u0265\u0003X,\u0000\u0264\u0262\u0001\u0000"+
		"\u0000\u0000\u0264\u0265\u0001\u0000\u0000\u0000\u0265U\u0001\u0000\u0000"+
		"\u0000\u0266\u0269\u0003T*\u0000\u0267\u0269\u0007\u0006\u0000\u0000\u0268"+
		"\u0266\u0001\u0000\u0000\u0000\u0268\u0267\u0001\u0000\u0000\u0000\u0269"+
		"W\u0001\u0000\u0000\u0000\u026a\u0273\u0001\u0000\u0000\u0000\u026b\u0273"+
		"\u0003\u00c6c\u0000\u026c\u0273\u0003\u00c2a\u0000\u026d\u0273\u0003\u00c4"+
		"b\u0000\u026e\u0273\u0003 \u0010\u0000\u026f\u0273\u0003\"\u0011\u0000"+
		"\u0270\u0273\u0003$\u0012\u0000\u0271\u0273\u00053\u0000\u0000\u0272\u026a"+
		"\u0001\u0000\u0000\u0000\u0272\u026b\u0001\u0000\u0000\u0000\u0272\u026c"+
		"\u0001\u0000\u0000\u0000\u0272\u026d\u0001\u0000\u0000\u0000\u0272\u026e"+
		"\u0001\u0000\u0000\u0000\u0272\u026f\u0001\u0000\u0000\u0000\u0272\u0270"+
		"\u0001\u0000\u0000\u0000\u0272\u0271\u0001\u0000\u0000\u0000\u0273Y\u0001"+
		"\u0000\u0000\u0000\u0274\u0275\u0005J\u0000\u0000\u0275\u0276\u0005\t"+
		"\u0000\u0000\u0276\u0277\u0005K\u0000\u0000\u0277\u0278\u0005\u0006\u0000"+
		"\u0000\u0278\u027d\u0003\\.\u0000\u0279\u027a\u0005\u0011\u0000\u0000"+
		"\u027a\u027c\u0003\\.\u0000\u027b\u0279\u0001\u0000\u0000\u0000\u027c"+
		"\u027f\u0001\u0000\u0000\u0000\u027d\u027b\u0001\u0000\u0000\u0000\u027d"+
		"\u027e\u0001\u0000\u0000\u0000\u027e\u0280\u0001\u0000\u0000\u0000\u027f"+
		"\u027d\u0001\u0000\u0000\u0000\u0280\u0281\u0005\u0007\u0000\u0000\u0281"+
		"[\u0001\u0000\u0000\u0000\u0282\u0289\u0003\u00c2a\u0000\u0283\u0289\u0005"+
		"^\u0000\u0000\u0284\u0289\u0003\u00c8d\u0000\u0285\u0289\u0003L&\u0000"+
		"\u0286\u0289\u0003\u00bc^\u0000\u0287\u0289\u0003\u0094J\u0000\u0288\u0282"+
		"\u0001\u0000\u0000\u0000\u0288\u0283\u0001\u0000\u0000\u0000\u0288\u0284"+
		"\u0001\u0000\u0000\u0000\u0288\u0285\u0001\u0000\u0000\u0000\u0288\u0286"+
		"\u0001\u0000\u0000\u0000\u0288\u0287\u0001\u0000\u0000\u0000\u0289]\u0001"+
		"\u0000\u0000\u0000\u028a\u028e\u0003`0\u0000\u028b\u028d\u0003b1\u0000"+
		"\u028c\u028b\u0001\u0000\u0000\u0000\u028d\u0290\u0001\u0000\u0000\u0000"+
		"\u028e\u028c\u0001\u0000\u0000\u0000\u028e\u028f\u0001\u0000\u0000\u0000"+
		"\u028f\u0292\u0001\u0000\u0000\u0000\u0290\u028e\u0001\u0000\u0000\u0000"+
		"\u0291\u0293\u0003d2\u0000\u0292\u0291\u0001\u0000\u0000\u0000\u0292\u0293"+
		"\u0001\u0000\u0000\u0000\u0293_\u0001\u0000\u0000\u0000\u0294\u0295\u0005"+
		"$\u0000\u0000\u0295\u0296\u0005\u0006\u0000\u0000\u0296\u0297\u0003\u00c4"+
		"b\u0000\u0297\u02aa\u0005\u0007\u0000\u0000\u0298\u029c\u0005\u0004\u0000"+
		"\u0000\u0299\u029b\u0003F#\u0000\u029a\u0299\u0001\u0000\u0000\u0000\u029b"+
		"\u029e\u0001\u0000\u0000\u0000\u029c\u029a\u0001\u0000\u0000\u0000\u029c"+
		"\u029d\u0001\u0000\u0000\u0000\u029d\u02a2\u0001\u0000\u0000\u0000\u029e"+
		"\u029c\u0001\u0000\u0000\u0000\u029f\u02a0\u0003T*\u0000\u02a0\u02a1\u0005"+
		"\u0015\u0000\u0000\u02a1\u02a3\u0001\u0000\u0000\u0000\u02a2\u029f\u0001"+
		"\u0000\u0000\u0000\u02a2\u02a3\u0001\u0000\u0000\u0000\u02a3\u02a4\u0001"+
		"\u0000\u0000\u0000\u02a4\u02ab\u0005\u0005\u0000\u0000\u02a5\u02a8\u0003"+
		"T*\u0000\u02a6\u02a8\u0003F#\u0000\u02a7\u02a5\u0001\u0000\u0000\u0000"+
		"\u02a7\u02a6\u0001\u0000\u0000\u0000\u02a7\u02a8\u0001\u0000\u0000\u0000"+
		"\u02a8\u02a9\u0001\u0000\u0000\u0000\u02a9\u02ab\u0005\u0015\u0000\u0000"+
		"\u02aa\u0298\u0001\u0000\u0000\u0000\u02aa\u02a7\u0001\u0000\u0000\u0000"+
		"\u02aba\u0001\u0000\u0000\u0000\u02ac\u02ad\u0005&\u0000\u0000\u02ad\u02ae"+
		"\u0005\u0006\u0000\u0000\u02ae\u02af\u0003\u00c4b\u0000\u02af\u02c2\u0005"+
		"\u0007\u0000\u0000\u02b0\u02b4\u0005\u0004\u0000\u0000\u02b1\u02b3\u0003"+
		"F#\u0000\u02b2\u02b1\u0001\u0000\u0000\u0000\u02b3\u02b6\u0001\u0000\u0000"+
		"\u0000\u02b4\u02b2\u0001\u0000\u0000\u0000\u02b4\u02b5\u0001\u0000\u0000"+
		"\u0000\u02b5\u02ba\u0001\u0000\u0000\u0000\u02b6\u02b4\u0001\u0000\u0000"+
		"\u0000\u02b7\u02b8\u0003T*\u0000\u02b8\u02b9\u0005\u0015\u0000\u0000\u02b9"+
		"\u02bb\u0001\u0000\u0000\u0000\u02ba\u02b7\u0001\u0000\u0000\u0000\u02ba"+
		"\u02bb\u0001\u0000\u0000\u0000\u02bb\u02bc\u0001\u0000\u0000\u0000\u02bc"+
		"\u02c3\u0005\u0005\u0000\u0000\u02bd\u02c0\u0003T*\u0000\u02be\u02c0\u0003"+
		"F#\u0000\u02bf\u02bd\u0001\u0000\u0000\u0000\u02bf\u02be\u0001\u0000\u0000"+
		"\u0000\u02bf\u02c0\u0001\u0000\u0000\u0000\u02c0\u02c1\u0001\u0000\u0000"+
		"\u0000\u02c1\u02c3\u0005\u0015\u0000\u0000\u02c2\u02b0\u0001\u0000\u0000"+
		"\u0000\u02c2\u02bf\u0001\u0000\u0000\u0000\u02c3c\u0001\u0000\u0000\u0000"+
		"\u02c4\u02d7\u0005%\u0000\u0000\u02c5\u02c9\u0005\u0004\u0000\u0000\u02c6"+
		"\u02c8\u0003F#\u0000\u02c7\u02c6\u0001\u0000\u0000\u0000\u02c8\u02cb\u0001"+
		"\u0000\u0000\u0000\u02c9\u02c7\u0001\u0000\u0000\u0000\u02c9\u02ca\u0001"+
		"\u0000\u0000\u0000\u02ca\u02cf\u0001\u0000\u0000\u0000\u02cb\u02c9\u0001"+
		"\u0000\u0000\u0000\u02cc\u02cd\u0003T*\u0000\u02cd\u02ce\u0005\u0015\u0000"+
		"\u0000\u02ce\u02d0\u0001\u0000\u0000\u0000\u02cf\u02cc\u0001\u0000\u0000"+
		"\u0000\u02cf\u02d0\u0001\u0000\u0000\u0000\u02d0\u02d1\u0001\u0000\u0000"+
		"\u0000\u02d1\u02d8\u0005\u0005\u0000\u0000\u02d2\u02d5\u0003T*\u0000\u02d3"+
		"\u02d5\u0003F#\u0000\u02d4\u02d2\u0001\u0000\u0000\u0000\u02d4\u02d3\u0001"+
		"\u0000\u0000\u0000\u02d4\u02d5\u0001\u0000\u0000\u0000\u02d5\u02d6\u0001"+
		"\u0000\u0000\u0000\u02d6\u02d8\u0005\u0015\u0000\u0000\u02d7\u02c5\u0001"+
		"\u0000\u0000\u0000\u02d7\u02d4\u0001\u0000\u0000\u0000\u02d8e\u0001\u0000"+
		"\u0000\u0000\u02d9\u02da\u0005)\u0000\u0000\u02da\u02db\u0005\u0006\u0000"+
		"\u0000\u02db\u02dc\u0003\u00c4b\u0000\u02dc\u02dd\u0005\u0007\u0000\u0000"+
		"\u02ddg\u0001\u0000\u0000\u0000\u02de\u02f1\u0005*\u0000\u0000\u02df\u02e1"+
		"\u0003V+\u0000\u02e0\u02df\u0001\u0000\u0000\u0000\u02e0\u02e1\u0001\u0000"+
		"\u0000\u0000\u02e1\u02e2\u0001\u0000\u0000\u0000\u02e2\u02f2\u0005\u0015"+
		"\u0000\u0000\u02e3\u02e7\u0005\u0004\u0000\u0000\u02e4\u02e6\u0003F#\u0000"+
		"\u02e5\u02e4\u0001\u0000\u0000\u0000\u02e6\u02e9\u0001\u0000\u0000\u0000"+
		"\u02e7\u02e5\u0001\u0000\u0000\u0000\u02e7\u02e8\u0001\u0000\u0000\u0000"+
		"\u02e8\u02ed\u0001\u0000\u0000\u0000\u02e9\u02e7\u0001\u0000\u0000\u0000"+
		"\u02ea\u02eb\u0003V+\u0000\u02eb\u02ec\u0005\u0015\u0000\u0000\u02ec\u02ee"+
		"\u0001\u0000\u0000\u0000\u02ed\u02ea\u0001\u0000\u0000\u0000\u02ed\u02ee"+
		"\u0001\u0000\u0000\u0000\u02ee\u02ef\u0001\u0000\u0000\u0000\u02ef\u02f2"+
		"\u0005\u0005\u0000\u0000\u02f0\u02f2\u0005\u0015\u0000\u0000\u02f1\u02e0"+
		"\u0001\u0000\u0000\u0000\u02f1\u02e3\u0001\u0000\u0000\u0000\u02f1\u02f0"+
		"\u0001\u0000\u0000\u0000\u02f2\u02f3\u0001\u0000\u0000\u0000\u02f3\u02f4"+
		"\u0003f3\u0000\u02f4\u02f5\u0005\u0015\u0000\u0000\u02f5i\u0001\u0000"+
		"\u0000\u0000\u02f6\u02f7\u0005\'\u0000\u0000\u02f7\u02fd\u0005\u0006\u0000"+
		"\u0000\u02f8\u02fc\u0003\u0086C\u0000\u02f9\u02fc\u0003\u0084B\u0000\u02fa"+
		"\u02fc\u0003l6\u0000\u02fb\u02f8\u0001\u0000\u0000\u0000\u02fb\u02f9\u0001"+
		"\u0000\u0000\u0000\u02fb\u02fa\u0001\u0000\u0000\u0000\u02fc\u02fe\u0001"+
		"\u0000\u0000\u0000\u02fd\u02fb\u0001\u0000\u0000\u0000\u02fd\u02fe\u0001"+
		"\u0000\u0000\u0000\u02fe\u02ff\u0001\u0000\u0000\u0000\u02ff\u0301\u0005"+
		"\u0015\u0000\u0000\u0300\u0302\u0003\u00c4b\u0000\u0301\u0300\u0001\u0000"+
		"\u0000\u0000\u0301\u0302\u0001\u0000\u0000\u0000\u0302\u0303\u0001\u0000"+
		"\u0000\u0000\u0303\u0305\u0005\u0015\u0000\u0000\u0304\u0306\u0003l6\u0000"+
		"\u0305\u0304\u0001\u0000\u0000\u0000\u0305\u0306\u0001\u0000\u0000\u0000"+
		"\u0306\u0307\u0001\u0000\u0000\u0000\u0307\u0308\u0005\u0007\u0000\u0000"+
		"\u0308k\u0001\u0000\u0000\u0000\u0309\u030f\u0003\u00c2a\u0000\u030a\u030f"+
		"\u0003\u0082A\u0000\u030b\u030f\u0003\u008aE\u0000\u030c\u030f\u0003\u008e"+
		"G\u0000\u030d\u030f\u0003\u00be_\u0000\u030e\u0309\u0001\u0000\u0000\u0000"+
		"\u030e\u030a\u0001\u0000\u0000\u0000\u030e\u030b\u0001\u0000\u0000\u0000"+
		"\u030e\u030c\u0001\u0000\u0000\u0000\u030e\u030d\u0001\u0000\u0000\u0000"+
		"\u030fm\u0001\u0000\u0000\u0000\u0310\u0311\u0005(\u0000\u0000\u0311\u0312"+
		"\u0005\u0006\u0000\u0000\u0312\u0313\u0005,\u0000\u0000\u0313\u0314\u0003"+
		"\u00c8d\u0000\u0314\u0318\u0005\u0002\u0000\u0000\u0315\u0317\u0005\u0003"+
		"\u0000\u0000\u0316\u0315\u0001\u0000\u0000\u0000\u0317\u031a\u0001\u0000"+
		"\u0000\u0000\u0318\u0316\u0001\u0000\u0000\u0000\u0318\u0319\u0001\u0000"+
		"\u0000\u0000\u0319\u031b\u0001\u0000\u0000\u0000\u031a\u0318\u0001\u0000"+
		"\u0000\u0000\u031b\u031c\u0005\b\u0000\u0000\u031c\u031d\u0003\u00c8d"+
		"\u0000\u031d\u0321\u0005\u0002\u0000\u0000\u031e\u0320\u0005\u0003\u0000"+
		"\u0000\u031f\u031e\u0001\u0000\u0000\u0000\u0320\u0323\u0001\u0000\u0000"+
		"\u0000\u0321\u031f\u0001\u0000\u0000\u0000\u0321\u0322\u0001\u0000\u0000"+
		"\u0000\u0322\u0324\u0001\u0000\u0000\u0000\u0323\u0321\u0001\u0000\u0000"+
		"\u0000\u0324\u0325\u0005\u0007\u0000\u0000\u0325o\u0001\u0000\u0000\u0000"+
		"\u0326\u0327\u00050\u0000\u0000\u0327\u032f\u0005\u0006\u0000\u0000\u0328"+
		"\u0330\u0003\u00c4b\u0000\u0329\u0330\u0003\u00c8d\u0000\u032a\u0330\u0005"+
		"\\\u0000\u0000\u032b\u0330\u0005_\u0000\u0000\u032c\u0330\u0003~?\u0000"+
		"\u032d\u0330\u0003L&\u0000\u032e\u0330\u0003\u00bc^\u0000\u032f\u0328"+
		"\u0001\u0000\u0000\u0000\u032f\u0329\u0001\u0000\u0000\u0000\u032f\u032a"+
		"\u0001\u0000\u0000\u0000\u032f\u032b\u0001\u0000\u0000\u0000\u032f\u032c"+
		"\u0001\u0000\u0000\u0000\u032f\u032d\u0001\u0000\u0000\u0000\u032f\u032e"+
		"\u0001\u0000\u0000\u0000\u0330\u0331\u0001\u0000\u0000\u0000\u0331\u0332"+
		"\u0005\u0007\u0000\u0000\u0332\u033c\u0005\u0004\u0000\u0000\u0333\u0335"+
		"\u0003t:\u0000\u0334\u0333\u0001\u0000\u0000\u0000\u0335\u0338\u0001\u0000"+
		"\u0000\u0000\u0336\u0334\u0001\u0000\u0000\u0000\u0336\u0337\u0001\u0000"+
		"\u0000\u0000\u0337\u033a\u0001\u0000\u0000\u0000\u0338\u0336\u0001\u0000"+
		"\u0000\u0000\u0339\u033b\u0003r9\u0000\u033a\u0339\u0001\u0000\u0000\u0000"+
		"\u033a\u033b\u0001\u0000\u0000\u0000\u033b\u033d\u0001\u0000\u0000\u0000"+
		"\u033c\u0336\u0001\u0000\u0000\u0000\u033c\u033d\u0001\u0000\u0000\u0000"+
		"\u033d\u033e\u0001\u0000\u0000\u0000\u033e\u033f\u0005\u0005\u0000\u0000"+
		"\u033fq\u0001\u0000\u0000\u0000\u0340\u0341\u0005/\u0000\u0000\u0341\u0345"+
		"\u0005\b\u0000\u0000\u0342\u0344\u0003F#\u0000\u0343\u0342\u0001\u0000"+
		"\u0000\u0000\u0344\u0347\u0001\u0000\u0000\u0000\u0345\u0343\u0001\u0000"+
		"\u0000\u0000\u0345\u0346\u0001\u0000\u0000\u0000\u0346\u034d\u0001\u0000"+
		"\u0000\u0000\u0347\u0345\u0001\u0000\u0000\u0000\u0348\u034b\u0005!\u0000"+
		"\u0000\u0349\u034b\u0003T*\u0000\u034a\u0348\u0001\u0000\u0000\u0000\u034a"+
		"\u0349\u0001\u0000\u0000\u0000\u034b\u034c\u0001\u0000\u0000\u0000\u034c"+
		"\u034e\u0005\u0015\u0000\u0000\u034d\u034a\u0001\u0000\u0000\u0000\u034d"+
		"\u034e\u0001\u0000\u0000\u0000\u034es\u0001\u0000\u0000\u0000\u034f\u0355"+
		"\u00051\u0000\u0000\u0350\u0356\u0003\u00c4b\u0000\u0351\u0356\u00038"+
		"\u001c\u0000\u0352\u0356\u0005\\\u0000\u0000\u0353\u0356\u0005_\u0000"+
		"\u0000\u0354\u0356\u0003\u00bc^\u0000\u0355\u0350\u0001\u0000\u0000\u0000"+
		"\u0355\u0351\u0001\u0000\u0000\u0000\u0355\u0352\u0001\u0000\u0000\u0000"+
		"\u0355\u0353\u0001\u0000\u0000\u0000\u0355\u0354\u0001\u0000\u0000\u0000"+
		"\u0356\u0357\u0001\u0000\u0000\u0000\u0357\u035b\u0005\b\u0000\u0000\u0358"+
		"\u035a\u0003F#\u0000\u0359\u0358\u0001\u0000\u0000\u0000\u035a\u035d\u0001"+
		"\u0000\u0000\u0000\u035b\u0359\u0001\u0000\u0000\u0000\u035b\u035c\u0001"+
		"\u0000\u0000\u0000\u035c\u0363\u0001\u0000\u0000\u0000\u035d\u035b\u0001"+
		"\u0000\u0000\u0000\u035e\u0361\u0005!\u0000\u0000\u035f\u0361\u0003T*"+
		"\u0000\u0360\u035e\u0001\u0000\u0000\u0000\u0360\u035f\u0001\u0000\u0000"+
		"\u0000\u0361\u0362\u0001\u0000\u0000\u0000\u0362\u0364\u0005\u0015\u0000"+
		"\u0000\u0363\u0360\u0001\u0000\u0000\u0000\u0363\u0364\u0001\u0000\u0000"+
		"\u0000\u0364u\u0001\u0000\u0000\u0000\u0365\u0366\u0007\u0002\u0000\u0000"+
		"\u0366w\u0001\u0000\u0000\u0000\u0367\u036a\u0003|>\u0000\u0368\u036a"+
		"\u0003z=\u0000\u0369\u0367\u0001\u0000\u0000\u0000\u0369\u0368\u0001\u0000"+
		"\u0000\u0000\u036ay\u0001\u0000\u0000\u0000\u036b\u036f\u0003\u0086C\u0000"+
		"\u036c\u036f\u0003\u00b4Z\u0000\u036d\u036f\u0003\u0090H\u0000\u036e\u036b"+
		"\u0001\u0000\u0000\u0000\u036e\u036c\u0001\u0000\u0000\u0000\u036e\u036d"+
		"\u0001\u0000\u0000\u0000\u036f{\u0001\u0000\u0000\u0000\u0370\u0374\u0003"+
		"\u0084B\u0000\u0371\u0374\u0003\u008eG\u0000\u0372\u0374\u0003\u00b2Y"+
		"\u0000\u0373\u0370\u0001\u0000\u0000\u0000\u0373\u0371\u0001\u0000\u0000"+
		"\u0000\u0373\u0372\u0001\u0000\u0000\u0000\u0374}\u0001\u0000\u0000\u0000"+
		"\u0375\u0379\u0003\u0082A\u0000\u0376\u0379\u0003\u008aE\u0000\u0377\u0379"+
		"\u0003\u00aeW\u0000\u0378\u0375\u0001\u0000\u0000\u0000\u0378\u0376\u0001"+
		"\u0000\u0000\u0000\u0378\u0377\u0001\u0000\u0000\u0000\u0379\u007f\u0001"+
		"\u0000\u0000\u0000\u037a\u037b\u0003\u00c8d\u0000\u037b\u0081\u0001\u0000"+
		"\u0000\u0000\u037c\u037e\u0003\u00c8d\u0000\u037d\u037f\u0003\u00c0`\u0000"+
		"\u037e\u037d\u0001\u0000\u0000\u0000\u037e\u037f\u0001\u0000\u0000\u0000"+
		"\u037f\u0380\u0001\u0000\u0000\u0000\u0380\u0381\u0005\u000b\u0000\u0000"+
		"\u0381\u0383\u0001\u0000\u0000\u0000\u0382\u037c\u0001\u0000\u0000\u0000"+
		"\u0383\u0384\u0001\u0000\u0000\u0000\u0384\u0382\u0001\u0000\u0000\u0000"+
		"\u0384\u0385\u0001\u0000\u0000\u0000\u0385\u0389\u0001\u0000\u0000\u0000"+
		"\u0386\u038a\u0003\u00c2a\u0000\u0387\u038a\u0003\u00c4b\u0000\u0388\u038a"+
		"\u00053\u0000\u0000\u0389\u0386\u0001\u0000\u0000\u0000\u0389\u0387\u0001"+
		"\u0000\u0000\u0000\u0389\u0388\u0001\u0000\u0000\u0000\u038a\u0083\u0001"+
		"\u0000\u0000\u0000\u038b\u038c\u0003v;\u0000\u038c\u038d\u0003\u0080@"+
		"\u0000\u038d\u0085\u0001\u0000\u0000\u0000\u038e\u038f\u0003v;\u0000\u038f"+
		"\u0390\u0003\u0082A\u0000\u0390\u0087\u0001\u0000\u0000\u0000\u0391\u0392"+
		"\u0003\u00c8d\u0000\u0392\u0089\u0001\u0000\u0000\u0000\u0393\u0395\u0003"+
		"\u0094J\u0000\u0394\u0396\u0003\u00c0`\u0000\u0395\u0394\u0001\u0000\u0000"+
		"\u0000\u0395\u0396\u0001\u0000\u0000\u0000\u0396\u0397\u0001\u0000\u0000"+
		"\u0000\u0397\u0398\u0005\u000b\u0000\u0000\u0398\u039a\u0001\u0000\u0000"+
		"\u0000\u0399\u0393\u0001\u0000\u0000\u0000\u039a\u039b\u0001\u0000\u0000"+
		"\u0000\u039b\u0399\u0001\u0000\u0000\u0000\u039b\u039c\u0001\u0000\u0000"+
		"\u0000\u039c\u03a0\u0001\u0000\u0000\u0000\u039d\u03a1\u0003\u00c2a\u0000"+
		"\u039e\u03a1\u0003\u00c4b\u0000\u039f\u03a1\u00053\u0000\u0000\u03a0\u039d"+
		"\u0001\u0000\u0000\u0000\u03a0\u039e\u0001\u0000\u0000\u0000\u03a0\u039f"+
		"\u0001\u0000\u0000\u0000\u03a1\u008b\u0001\u0000\u0000\u0000\u03a2\u03a5"+
		"\u0003\u008eG\u0000\u03a3\u03a5\u0003\u0090H\u0000\u03a4\u03a2\u0001\u0000"+
		"\u0000\u0000\u03a4\u03a3\u0001\u0000\u0000\u0000\u03a5\u008d\u0001\u0000"+
		"\u0000\u0000\u03a6\u03a7\u0003v;\u0000\u03a7\u03a8\u0003\u0092I\u0000"+
		"\u03a8\u008f\u0001\u0000\u0000\u0000\u03a9\u03aa\u0003v;\u0000\u03aa\u03ab"+
		"\u0003\u0092I\u0000\u03ab\u03ac\u0005\u000b\u0000\u0000\u03ac\u03ad\u0003"+
		"\u00aaU\u0000\u03ad\u0091\u0001\u0000\u0000\u0000\u03ae\u03b1\u0003\u0088"+
		"D\u0000\u03af\u03b0\u0005\u0002\u0000\u0000\u03b0\u03b2\u0005\u0003\u0000"+
		"\u0000\u03b1\u03af\u0001\u0000\u0000\u0000\u03b2\u03b3\u0001\u0000\u0000"+
		"\u0000\u03b3\u03b1\u0001\u0000\u0000\u0000\u03b3\u03b4\u0001\u0000\u0000"+
		"\u0000\u03b4\u0093\u0001\u0000\u0000\u0000\u03b5\u03bd\u0003\u0088D\u0000"+
		"\u03b6\u03ba\u0005\u0002\u0000\u0000\u03b7\u03bb\u0003\u00c2a\u0000\u03b8"+
		"\u03bb\u0005_\u0000\u0000\u03b9\u03bb\u0003\u0080@\u0000\u03ba\u03b7\u0001"+
		"\u0000\u0000\u0000\u03ba\u03b8\u0001\u0000\u0000\u0000\u03ba\u03b9\u0001"+
		"\u0000\u0000\u0000\u03bb\u03bc\u0001\u0000\u0000\u0000\u03bc\u03be\u0005"+
		"\u0003\u0000\u0000\u03bd\u03b6\u0001\u0000\u0000\u0000\u03be\u03bf\u0001"+
		"\u0000\u0000\u0000\u03bf\u03bd\u0001\u0000\u0000\u0000\u03bf\u03c0\u0001"+
		"\u0000\u0000\u0000\u03c0\u0095\u0001\u0000\u0000\u0000\u03c1\u03c6\u0005"+
		"^\u0000\u0000\u03c2\u03c3\u0005\u0001\u0000\u0000\u03c3\u03c5\u0005^\u0000"+
		"\u0000\u03c4\u03c2\u0001\u0000\u0000\u0000\u03c5\u03c8\u0001\u0000\u0000"+
		"\u0000\u03c6\u03c4\u0001\u0000\u0000\u0000\u03c6\u03c7\u0001\u0000\u0000"+
		"\u0000\u03c7\u0097\u0001\u0000\u0000\u0000\u03c8\u03c6\u0001\u0000\u0000"+
		"\u0000\u03c9\u03ca\u0003\u00c2a\u0000\u03ca\u03cb\u0005\u0001\u0000\u0000"+
		"\u03cb\u03cc\u0003\u00c2a\u0000\u03cc\u0099\u0001\u0000\u0000\u0000\u03cd"+
		"\u03d2\u0003\u00c2a\u0000\u03ce\u03cf\u0005\u0001\u0000\u0000\u03cf\u03d1"+
		"\u0003\u00c2a\u0000\u03d0\u03ce\u0001\u0000\u0000\u0000\u03d1\u03d4\u0001"+
		"\u0000\u0000\u0000\u03d2\u03d0\u0001\u0000\u0000\u0000\u03d2\u03d3\u0001"+
		"\u0000\u0000\u0000\u03d3\u009b\u0001\u0000\u0000\u0000\u03d4\u03d2\u0001"+
		"\u0000\u0000\u0000\u03d5\u03da\u0005\\\u0000\u0000\u03d6\u03d7\u0005\u0001"+
		"\u0000\u0000\u03d7\u03d9\u0005\\\u0000\u0000\u03d8\u03d6\u0001\u0000\u0000"+
		"\u0000\u03d9\u03dc\u0001\u0000\u0000\u0000\u03da\u03d8\u0001\u0000\u0000"+
		"\u0000\u03da\u03db\u0001\u0000\u0000\u0000\u03db\u009d\u0001\u0000\u0000"+
		"\u0000\u03dc\u03da\u0001\u0000\u0000\u0000\u03dd\u03e2\u0003\u00b8\\\u0000"+
		"\u03de\u03df\u0005\u0001\u0000\u0000\u03df\u03e1\u0003\u00b8\\\u0000\u03e0"+
		"\u03de\u0001\u0000\u0000\u0000\u03e1\u03e4\u0001\u0000\u0000\u0000\u03e2"+
		"\u03e0\u0001\u0000\u0000\u0000\u03e2\u03e3\u0001\u0000\u0000\u0000\u03e3"+
		"\u009f\u0001\u0000\u0000\u0000\u03e4\u03e2\u0001\u0000\u0000\u0000\u03e5"+
		"\u03e6\u0005\u0002\u0000\u0000\u03e6\u03e7\u0003\u009eO\u0000\u03e7\u03e8"+
		"\u0005\u0003\u0000\u0000\u03e8\u00a1\u0001\u0000\u0000\u0000\u03e9\u03ec"+
		"\u0003\u0080@\u0000\u03ea\u03ec\u0003\u00bc^\u0000\u03eb\u03e9\u0001\u0000"+
		"\u0000\u0000\u03eb\u03ea\u0001\u0000\u0000\u0000\u03ec\u03f4\u0001\u0000"+
		"\u0000\u0000\u03ed\u03f0\u0005\u0001\u0000\u0000\u03ee\u03f1\u0003\u0080"+
		"@\u0000\u03ef\u03f1\u0003\u00bc^\u0000\u03f0\u03ee\u0001\u0000\u0000\u0000"+
		"\u03f0\u03ef\u0001\u0000\u0000\u0000\u03f1\u03f3\u0001\u0000\u0000\u0000"+
		"\u03f2\u03ed\u0001\u0000\u0000\u0000\u03f3\u03f6\u0001\u0000\u0000\u0000"+
		"\u03f4\u03f2\u0001\u0000\u0000\u0000\u03f4\u03f5\u0001\u0000\u0000\u0000"+
		"\u03f5\u00a3\u0001\u0000\u0000\u0000\u03f6\u03f4\u0001\u0000\u0000\u0000"+
		"\u03f7\u03fe\u0003\u0096K\u0000\u03f8\u03fe\u0003\u009aM\u0000\u03f9\u03fe"+
		"\u0003\u009cN\u0000\u03fa\u03fe\u0003\u009eO\u0000\u03fb\u03fe\u0003\u00a2"+
		"Q\u0000\u03fc\u03fe\u0003\u0098L\u0000\u03fd\u03f7\u0001\u0000\u0000\u0000"+
		"\u03fd\u03f8\u0001\u0000\u0000\u0000\u03fd\u03f9\u0001\u0000\u0000\u0000"+
		"\u03fd\u03fa\u0001\u0000\u0000\u0000\u03fd\u03fb\u0001\u0000\u0000\u0000"+
		"\u03fd\u03fc\u0001\u0000\u0000\u0000\u03fe\u040b\u0001\u0000\u0000\u0000"+
		"\u03ff\u0407\u0005\u0001\u0000\u0000\u0400\u0408\u0003\u0096K\u0000\u0401"+
		"\u0408\u0003\u009aM\u0000\u0402\u0408\u0003\u009cN\u0000\u0403\u0408\u0003"+
		"\u009eO\u0000\u0404\u0408\u0003\u00a6S\u0000\u0405\u0408\u0003\u00a2Q"+
		"\u0000\u0406\u0408\u0003\u0098L\u0000\u0407\u0400\u0001\u0000\u0000\u0000"+
		"\u0407\u0401\u0001\u0000\u0000\u0000\u0407\u0402\u0001\u0000\u0000\u0000"+
		"\u0407\u0403\u0001\u0000\u0000\u0000\u0407\u0404\u0001\u0000\u0000\u0000"+
		"\u0407\u0405\u0001\u0000\u0000\u0000\u0407\u0406\u0001\u0000\u0000\u0000"+
		"\u0408\u040a\u0001\u0000\u0000\u0000\u0409\u03ff\u0001\u0000\u0000\u0000"+
		"\u040a\u040d\u0001\u0000\u0000\u0000\u040b\u0409\u0001\u0000\u0000\u0000"+
		"\u040b\u040c\u0001\u0000\u0000\u0000\u040c\u00a5\u0001\u0000\u0000\u0000"+
		"\u040d\u040b\u0001\u0000\u0000\u0000\u040e\u0413\u0003\u00aaU\u0000\u040f"+
		"\u0410\u0005\u0001\u0000\u0000\u0410\u0412\u0003\u00aaU\u0000\u0411\u040f"+
		"\u0001\u0000\u0000\u0000\u0412\u0415\u0001\u0000\u0000\u0000\u0413\u0411"+
		"\u0001\u0000\u0000\u0000\u0413\u0414\u0001\u0000\u0000\u0000\u0414\u00a7"+
		"\u0001\u0000\u0000\u0000\u0415\u0413\u0001\u0000\u0000\u0000\u0416\u0421"+
		"\u0003\u0096K\u0000\u0417\u0421\u0003\u009aM\u0000\u0418\u0421\u0003\u009c"+
		"N\u0000\u0419\u0421\u0003\u009eO\u0000\u041a\u0421\u0003\u00a0P\u0000"+
		"\u041b\u0421\u0003\u00a6S\u0000\u041c\u0421\u0003\u0098L\u0000\u041d\u0421"+
		"\u0003\u00bc^\u0000\u041e\u0421\u0003\u00a4R\u0000\u041f\u0421\u0003\u00a2"+
		"Q\u0000\u0420\u0416\u0001\u0000\u0000\u0000\u0420\u0417\u0001\u0000\u0000"+
		"\u0000\u0420\u0418\u0001\u0000\u0000\u0000\u0420\u0419\u0001\u0000\u0000"+
		"\u0000\u0420\u041a\u0001\u0000\u0000\u0000\u0420\u041b\u0001\u0000\u0000"+
		"\u0000\u0420\u041c\u0001\u0000\u0000\u0000\u0420\u041d\u0001\u0000\u0000"+
		"\u0000\u0420\u041e\u0001\u0000\u0000\u0000\u0420\u041f\u0001\u0000\u0000"+
		"\u0000\u0421\u00a9\u0001\u0000\u0000\u0000\u0422\u0424\u0005\u0002\u0000"+
		"\u0000\u0423\u0425\u0003\u00a8T\u0000\u0424\u0423\u0001\u0000\u0000\u0000"+
		"\u0424\u0425\u0001\u0000\u0000\u0000\u0425\u0426\u0001\u0000\u0000\u0000"+
		"\u0426\u0429\u0005\u0003\u0000\u0000\u0427\u0429\u0003\u0088D\u0000\u0428"+
		"\u0422\u0001\u0000\u0000\u0000\u0428\u0427\u0001\u0000\u0000\u0000\u0429"+
		"\u00ab\u0001\u0000\u0000\u0000\u042a\u042b\u0003\u00c8d\u0000\u042b\u00ad"+
		"\u0001\u0000\u0000\u0000\u042c\u042d\u0003\u00acV\u0000\u042d\u0430\u0005"+
		"\u000b\u0000\u0000\u042e\u0431\u0003\u00acV\u0000\u042f\u0431\u0003\u00b8"+
		"\\\u0000\u0430\u042e\u0001\u0000\u0000\u0000\u0430\u042f\u0001\u0000\u0000"+
		"\u0000\u0431\u00af\u0001\u0000\u0000\u0000\u0432\u0435\u0003\u00b2Y\u0000"+
		"\u0433\u0435\u0003\u00b4Z\u0000\u0434\u0432\u0001\u0000\u0000\u0000\u0434"+
		"\u0433\u0001\u0000\u0000\u0000\u0435\u00b1\u0001\u0000\u0000\u0000\u0436"+
		"\u0437\u0003v;\u0000\u0437\u0438\u0003\u00acV\u0000\u0438\u00b3\u0001"+
		"\u0000\u0000\u0000\u0439\u043a\u0003v;\u0000\u043a\u043b\u0003\u00aeW"+
		"\u0000\u043b\u00b5\u0001\u0000\u0000\u0000\u043c\u043d\u0003\u00c8d\u0000"+
		"\u043d\u043e\u0005\b\u0000\u0000\u043e\u043f\u0003\u00ba]\u0000\u043f"+
		"\u00b7\u0001\u0000\u0000\u0000\u0440\u0449\u0005\u0004\u0000\u0000\u0441"+
		"\u0446\u0003\u00b6[\u0000\u0442\u0443\u0005\u0001\u0000\u0000\u0443\u0445"+
		"\u0003\u00b6[\u0000\u0444\u0442\u0001\u0000\u0000\u0000\u0445\u0448\u0001"+
		"\u0000\u0000\u0000\u0446\u0444\u0001\u0000\u0000\u0000\u0446\u0447\u0001"+
		"\u0000\u0000\u0000\u0447\u044a\u0001\u0000\u0000\u0000\u0448\u0446\u0001"+
		"\u0000\u0000\u0000\u0449\u0441\u0001\u0000\u0000\u0000\u0449\u044a\u0001"+
		"\u0000\u0000\u0000\u044a\u044b\u0001\u0000\u0000\u0000\u044b\u044c\u0005"+
		"\u0005\u0000\u0000\u044c\u00b9\u0001\u0000\u0000\u0000\u044d\u045d\u0003"+
		"\u00c2a\u0000\u044e\u045d\u0005^\u0000\u0000\u044f\u045d\u0005_\u0000"+
		"\u0000\u0450\u045d\u00053\u0000\u0000\u0451\u045d\u0003\u0080@\u0000\u0452"+
		"\u045d\u0005\\\u0000\u0000\u0453\u045d\u0003\u00b8\\\u0000\u0454\u045d"+
		"\u0003\u00bc^\u0000\u0455\u045d\u0003L&\u0000\u0456\u045d\u0003\u0094"+
		"J\u0000\u0457\u045d\u0003\u00a0P\u0000\u0458\u0459\u0005\u0002\u0000\u0000"+
		"\u0459\u045a\u0003\u00a8T\u0000\u045a\u045b\u0005\u0003\u0000\u0000\u045b"+
		"\u045d\u0001\u0000\u0000\u0000\u045c\u044d\u0001\u0000\u0000\u0000\u045c"+
		"\u044e\u0001\u0000\u0000\u0000\u045c\u044f\u0001\u0000\u0000\u0000\u045c"+
		"\u0450\u0001\u0000\u0000\u0000\u045c\u0451\u0001\u0000\u0000\u0000\u045c"+
		"\u0452\u0001\u0000\u0000\u0000\u045c\u0453\u0001\u0000\u0000\u0000\u045c"+
		"\u0454\u0001\u0000\u0000\u0000\u045c\u0455\u0001\u0000\u0000\u0000\u045c"+
		"\u0456\u0001\u0000\u0000\u0000\u045c\u0457\u0001\u0000\u0000\u0000\u045c"+
		"\u0458\u0001\u0000\u0000\u0000\u045d\u00bb\u0001\u0000\u0000\u0000\u045e"+
		"\u0461\u0003\u00acV\u0000\u045f\u0460\u0005\t\u0000\u0000\u0460\u0462"+
		"\u0003\u0080@\u0000\u0461\u045f\u0001\u0000\u0000\u0000\u0462\u0463\u0001"+
		"\u0000\u0000\u0000\u0463\u0461\u0001\u0000\u0000\u0000\u0463\u0464\u0001"+
		"\u0000\u0000\u0000\u0464\u00bd\u0001\u0000\u0000\u0000\u0465\u0466\u0005"+
		"X\u0000\u0000\u0466\u0470\u0003\u00c8d\u0000\u0467\u0468\u0005\u0013\u0000"+
		"\u0000\u0468\u0470\u0003\u00c8d\u0000\u0469\u046a\u0003\u00c8d\u0000\u046a"+
		"\u046b\u0005X\u0000\u0000\u046b\u0470\u0001\u0000\u0000\u0000\u046c\u046d"+
		"\u0003\u00c8d\u0000\u046d\u046e\u0005\u0013\u0000\u0000\u046e\u0470\u0001"+
		"\u0000\u0000\u0000\u046f\u0465\u0001\u0000\u0000\u0000\u046f\u0467\u0001"+
		"\u0000\u0000\u0000\u046f\u0469\u0001\u0000\u0000\u0000\u046f\u046c\u0001"+
		"\u0000\u0000\u0000\u0470\u00bf\u0001\u0000\u0000\u0000\u0471\u0472\u0007"+
		"\u0007\u0000\u0000\u0472\u00c1\u0001\u0000\u0000\u0000\u0473\u0474\u0006"+
		"a\uffff\uffff\u0000\u0474\u0488\u0003\u00c6c\u0000\u0475\u0477\u0005\u0006"+
		"\u0000\u0000\u0476\u0475\u0001\u0000\u0000\u0000\u0477\u0478\u0001\u0000"+
		"\u0000\u0000\u0478\u0476\u0001\u0000\u0000\u0000\u0478\u0479\u0001\u0000"+
		"\u0000\u0000\u0479\u047c\u0001\u0000\u0000\u0000\u047a\u047d\u0003\u00c2"+
		"a\u0000\u047b\u047d\u0003~?\u0000\u047c\u047a\u0001\u0000\u0000\u0000"+
		"\u047c\u047b\u0001\u0000\u0000\u0000\u047d\u047f\u0001\u0000\u0000\u0000"+
		"\u047e\u0480\u0005\u0007\u0000\u0000\u047f\u047e\u0001\u0000\u0000\u0000"+
		"\u0480\u0481\u0001\u0000\u0000\u0000\u0481\u047f\u0001\u0000\u0000\u0000"+
		"\u0481\u0482\u0001\u0000\u0000\u0000\u0482\u0488\u0001\u0000\u0000\u0000"+
		"\u0483\u0484\u0005\u0013\u0000\u0000\u0484\u0488\u0003\u00c2a\u0005\u0485"+
		"\u0486\u0005X\u0000\u0000\u0486\u0488\u0003\u00c2a\u0004\u0487\u0473\u0001"+
		"\u0000\u0000\u0000\u0487\u0476\u0001\u0000\u0000\u0000\u0487\u0483\u0001"+
		"\u0000\u0000\u0000\u0487\u0485\u0001\u0000\u0000\u0000\u0488\u049b\u0001"+
		"\u0000\u0000\u0000\u0489\u048a\n\u0003\u0000\u0000\u048a\u048b\u0007\b"+
		"\u0000\u0000\u048b\u049a\u0003\u00c2a\u0004\u048c\u048d\n\u0002\u0000"+
		"\u0000\u048d\u048e\u0007\u0004\u0000\u0000\u048e\u049a\u0003\u00c2a\u0003"+
		"\u048f\u0490\n\u0001\u0000\u0000\u0490\u0491\u0005\u0014\u0000\u0000\u0491"+
		"\u0492\u0003\u00c2a\u0000\u0492\u0493\u0005\b\u0000\u0000\u0493\u0494"+
		"\u0003\u00c2a\u0002\u0494\u049a\u0001\u0000\u0000\u0000\u0495\u0496\n"+
		"\u0007\u0000\u0000\u0496\u049a\u0005\u0013\u0000\u0000\u0497\u0498\n\u0006"+
		"\u0000\u0000\u0498\u049a\u0005X\u0000\u0000\u0499\u0489\u0001\u0000\u0000"+
		"\u0000\u0499\u048c\u0001\u0000\u0000\u0000\u0499\u048f\u0001\u0000\u0000"+
		"\u0000\u0499\u0495\u0001\u0000\u0000\u0000\u0499\u0497\u0001\u0000\u0000"+
		"\u0000\u049a\u049d\u0001\u0000\u0000\u0000\u049b\u0499\u0001\u0000\u0000"+
		"\u0000\u049b\u049c\u0001\u0000\u0000\u0000\u049c\u00c3\u0001\u0000\u0000"+
		"\u0000\u049d\u049b\u0001\u0000\u0000\u0000\u049e\u04b1\u0001\u0000\u0000"+
		"\u0000\u049f\u04a0\u0003\u00c2a\u0000\u04a0\u04a1\u0007\t\u0000\u0000"+
		"\u04a1\u04a2\u0003\u00c2a\u0000\u04a2\u04b1\u0001\u0000\u0000\u0000\u04a3"+
		"\u04a4\u0003\u00c2a\u0000\u04a4\u04a5\u0007\n\u0000\u0000\u04a5\u04a6"+
		"\u0003\u00c2a\u0000\u04a6\u04b1\u0001\u0000\u0000\u0000\u04a7\u04a8\u0003"+
		"\u00c2a\u0000\u04a8\u04a9\u0005\u0010\u0000\u0000\u04a9\u04aa\u0003\u00c2"+
		"a\u0000\u04aa\u04b1\u0001\u0000\u0000\u0000\u04ab\u04ac\u0003\u00c2a\u0000"+
		"\u04ac\u04ad\u0005\u000f\u0000\u0000\u04ad\u04ae\u0003\u00c2a\u0000\u04ae"+
		"\u04b1\u0001\u0000\u0000\u0000\u04af\u04b1\u0003\u00c6c\u0000\u04b0\u049e"+
		"\u0001\u0000\u0000\u0000\u04b0\u049f\u0001\u0000\u0000\u0000\u04b0\u04a3"+
		"\u0001\u0000\u0000\u0000\u04b0\u04a7\u0001\u0000\u0000\u0000\u04b0\u04ab"+
		"\u0001\u0000\u0000\u0000\u04b0\u04af\u0001\u0000\u0000\u0000\u04b1\u00c5"+
		"\u0001\u0000\u0000\u0000\u04b2\u04bf\u0005A\u0000\u0000\u04b3\u04bf\u0005"+
		"B\u0000\u0000\u04b4\u04bf\u0005_\u0000\u0000\u04b5\u04bf\u0003\u0080@"+
		"\u0000\u04b6\u04bf\u0005^\u0000\u0000\u04b7\u04bf\u0005\\\u0000\u0000"+
		"\u04b8\u04bf\u0003\u00bc^\u0000\u04b9\u04bf\u0003\u0094J\u0000\u04ba\u04bf"+
		"\u0003L&\u0000\u04bb\u04bf\u0003:\u001d\u0000\u04bc\u04bf\u0003\u0018"+
		"\f\u0000\u04bd\u04bf\u0003\u0014\n\u0000\u04be\u04b2\u0001\u0000\u0000"+
		"\u0000\u04be\u04b3\u0001\u0000\u0000\u0000\u04be\u04b4\u0001\u0000\u0000"+
		"\u0000\u04be\u04b5\u0001\u0000\u0000\u0000\u04be\u04b6\u0001\u0000\u0000"+
		"\u0000\u04be\u04b7\u0001\u0000\u0000\u0000\u04be\u04b8\u0001\u0000\u0000"+
		"\u0000\u04be\u04b9\u0001\u0000\u0000\u0000\u04be\u04ba\u0001\u0000\u0000"+
		"\u0000\u04be\u04bb\u0001\u0000\u0000\u0000\u04be\u04bc\u0001\u0000\u0000"+
		"\u0000\u04be\u04bd\u0001\u0000\u0000\u0000\u04bf\u00c7\u0001\u0000\u0000"+
		"\u0000\u04c0\u04c1\u0005`\u0000\u0000\u04c1\u00c9\u0001\u0000\u0000\u0000"+
		"\u0093\u00cd\u00cf\u00d3\u00d7\u00e3\u00e6\u00ea\u00ef\u00f3\u00f7\u0108"+
		"\u010c\u011e\u0122\u0129\u0137\u0148\u0153\u0156\u015a\u0167\u016f\u0173"+
		"\u0181\u0185\u018a\u0190\u0196\u019a\u01a6\u01af\u01b6\u01ba\u01c2\u01c6"+
		"\u01ca\u01cf\u01d3\u01d6\u01d9\u01e7\u01ec\u01f0\u01f3\u01f8\u01fd\u01ff"+
		"\u0205\u0208\u020d\u020f\u0216\u021e\u0221\u0228\u022e\u0232\u0234\u023b"+
		"\u0246\u024b\u0255\u0260\u0264\u0268\u0272\u027d\u0288\u028e\u0292\u029c"+
		"\u02a2\u02a7\u02aa\u02b4\u02ba\u02bf\u02c2\u02c9\u02cf\u02d4\u02d7\u02e0"+
		"\u02e7\u02ed\u02f1\u02fb\u02fd\u0301\u0305\u030e\u0318\u0321\u032f\u0336"+
		"\u033a\u033c\u0345\u034a\u034d\u0355\u035b\u0360\u0363\u0369\u036e\u0373"+
		"\u0378\u037e\u0384\u0389\u0395\u039b\u03a0\u03a4\u03b3\u03ba\u03bf\u03c6"+
		"\u03d2\u03da\u03e2\u03eb\u03f0\u03f4\u03fd\u0407\u040b\u0413\u0420\u0424"+
		"\u0428\u0430\u0434\u0446\u0449\u045c\u0463\u046f\u0478\u047c\u0481\u0487"+
		"\u0499\u049b\u04b0\u04be";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}