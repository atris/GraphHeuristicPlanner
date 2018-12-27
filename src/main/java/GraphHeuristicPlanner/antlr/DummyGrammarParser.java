// Generated from DummyGrammar.g4 by ANTLR 4.7.1
package GraphHeuristicPlanner.antlr;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class DummyGrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, TEXT=7, CRLF=8;
	public static final int
		RULE_dummygrammar = 0, RULE_query = 1, RULE_matchesclause = 2, RULE_whereclause = 3, 
		RULE_matchespredicate = 4, RULE_literal = 5, RULE_nodename = 6;
	public static final String[] ruleNames = {
		"dummygrammar", "query", "matchesclause", "whereclause", "matchespredicate", 
		"literal", "nodename"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'.'", "'MATCHES'", "'WHERE'", "'('", "')'", "' '"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, "TEXT", "CRLF"
	};
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
	public String getGrammarFileName() { return "DummyGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public DummyGrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class DummygrammarContext extends ParserRuleContext {
		public List<QueryContext> query() {
			return getRuleContexts(QueryContext.class);
		}
		public QueryContext query(int i) {
			return getRuleContext(QueryContext.class,i);
		}
		public DummygrammarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dummygrammar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DummyGrammarListener ) ((DummyGrammarListener)listener).enterDummygrammar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DummyGrammarListener ) ((DummyGrammarListener)listener).exitDummygrammar(this);
		}
	}

	public final DummygrammarContext dummygrammar() throws RecognitionException {
		DummygrammarContext _localctx = new DummygrammarContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_dummygrammar);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(15); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(14);
				query();
				}
				}
				setState(17); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==TEXT );
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

	public static class QueryContext extends ParserRuleContext {
		public NodenameContext nodename() {
			return getRuleContext(NodenameContext.class,0);
		}
		public List<MatchespredicateContext> matchespredicate() {
			return getRuleContexts(MatchespredicateContext.class);
		}
		public MatchespredicateContext matchespredicate(int i) {
			return getRuleContext(MatchespredicateContext.class,i);
		}
		public TerminalNode CRLF() { return getToken(DummyGrammarParser.CRLF, 0); }
		public QueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_query; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DummyGrammarListener ) ((DummyGrammarListener)listener).enterQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DummyGrammarListener ) ((DummyGrammarListener)listener).exitQuery(this);
		}
	}

	public final QueryContext query() throws RecognitionException {
		QueryContext _localctx = new QueryContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_query);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(19);
			nodename();
			setState(20);
			match(T__0);
			setState(21);
			matchespredicate();
			setState(22);
			match(T__0);
			setState(23);
			matchespredicate();
			setState(24);
			match(CRLF);
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

	public static class MatchesclauseContext extends ParserRuleContext {
		public MatchesclauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_matchesclause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DummyGrammarListener ) ((DummyGrammarListener)listener).enterMatchesclause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DummyGrammarListener ) ((DummyGrammarListener)listener).exitMatchesclause(this);
		}
	}

	public final MatchesclauseContext matchesclause() throws RecognitionException {
		MatchesclauseContext _localctx = new MatchesclauseContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_matchesclause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(26);
			match(T__1);
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

	public static class WhereclauseContext extends ParserRuleContext {
		public WhereclauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whereclause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DummyGrammarListener ) ((DummyGrammarListener)listener).enterWhereclause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DummyGrammarListener ) ((DummyGrammarListener)listener).exitWhereclause(this);
		}
	}

	public final WhereclauseContext whereclause() throws RecognitionException {
		WhereclauseContext _localctx = new WhereclauseContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_whereclause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(28);
			match(T__2);
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

	public static class MatchespredicateContext extends ParserRuleContext {
		public MatchesclauseContext matchesclause() {
			return getRuleContext(MatchesclauseContext.class,0);
		}
		public WhereclauseContext whereclause() {
			return getRuleContext(WhereclauseContext.class,0);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public MatchespredicateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_matchespredicate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DummyGrammarListener ) ((DummyGrammarListener)listener).enterMatchespredicate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DummyGrammarListener ) ((DummyGrammarListener)listener).exitMatchespredicate(this);
		}
	}

	public final MatchespredicateContext matchespredicate() throws RecognitionException {
		MatchespredicateContext _localctx = new MatchespredicateContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_matchespredicate);
		try {
			setState(37);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				enterOuterAlt(_localctx, 1);
				{
				setState(30);
				matchesclause();
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 2);
				{
				setState(31);
				whereclause();
				setState(32);
				match(T__3);
				setState(33);
				literal();
				setState(34);
				match(T__4);
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 3);
				{
				setState(36);
				match(T__5);
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

	public static class LiteralContext extends ParserRuleContext {
		public List<TerminalNode> TEXT() { return getTokens(DummyGrammarParser.TEXT); }
		public TerminalNode TEXT(int i) {
			return getToken(DummyGrammarParser.TEXT, i);
		}
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DummyGrammarListener ) ((DummyGrammarListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DummyGrammarListener ) ((DummyGrammarListener)listener).exitLiteral(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(40); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(39);
				_la = _input.LA(1);
				if ( !(_la==T__5 || _la==TEXT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(42); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__5 || _la==TEXT );
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

	public static class NodenameContext extends ParserRuleContext {
		public List<TerminalNode> TEXT() { return getTokens(DummyGrammarParser.TEXT); }
		public TerminalNode TEXT(int i) {
			return getToken(DummyGrammarParser.TEXT, i);
		}
		public NodenameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nodename; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DummyGrammarListener ) ((DummyGrammarListener)listener).enterNodename(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DummyGrammarListener ) ((DummyGrammarListener)listener).exitNodename(this);
		}
	}

	public final NodenameContext nodename() throws RecognitionException {
		NodenameContext _localctx = new NodenameContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_nodename);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(45); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(44);
				match(TEXT);
				}
				}
				setState(47); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==TEXT );
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\n\64\4\2\t\2\4\3"+
		"\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\3\2\6\2\22\n\2\r\2\16\2\23"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\5\6(\n\6\3\7\6\7+\n\7\r\7\16\7,\3\b\6\b\60\n\b\r\b\16\b\61\3\b\2\2"+
		"\t\2\4\6\b\n\f\16\2\3\3\2\b\t\2\61\2\21\3\2\2\2\4\25\3\2\2\2\6\34\3\2"+
		"\2\2\b\36\3\2\2\2\n\'\3\2\2\2\f*\3\2\2\2\16/\3\2\2\2\20\22\5\4\3\2\21"+
		"\20\3\2\2\2\22\23\3\2\2\2\23\21\3\2\2\2\23\24\3\2\2\2\24\3\3\2\2\2\25"+
		"\26\5\16\b\2\26\27\7\3\2\2\27\30\5\n\6\2\30\31\7\3\2\2\31\32\5\n\6\2\32"+
		"\33\7\n\2\2\33\5\3\2\2\2\34\35\7\4\2\2\35\7\3\2\2\2\36\37\7\5\2\2\37\t"+
		"\3\2\2\2 (\5\6\4\2!\"\5\b\5\2\"#\7\6\2\2#$\5\f\7\2$%\7\7\2\2%(\3\2\2\2"+
		"&(\7\b\2\2\' \3\2\2\2\'!\3\2\2\2\'&\3\2\2\2(\13\3\2\2\2)+\t\2\2\2*)\3"+
		"\2\2\2+,\3\2\2\2,*\3\2\2\2,-\3\2\2\2-\r\3\2\2\2.\60\7\t\2\2/.\3\2\2\2"+
		"\60\61\3\2\2\2\61/\3\2\2\2\61\62\3\2\2\2\62\17\3\2\2\2\6\23\',\61";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}