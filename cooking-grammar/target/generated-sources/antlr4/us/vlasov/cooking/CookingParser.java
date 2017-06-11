// Generated from Cooking.g4 by ANTLR 4.4

    package us.vlasov.cooking;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CookingParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__24=1, T__23=2, T__22=3, T__21=4, T__20=5, T__19=6, T__18=7, T__17=8, 
		T__16=9, T__15=10, T__14=11, T__13=12, T__12=13, T__11=14, T__10=15, T__9=16, 
		T__8=17, T__7=18, T__6=19, T__5=20, T__4=21, T__3=22, T__2=23, T__1=24, 
		T__0=25;
	public static final String[] tokenNames = {
		"<INVALID>", "'grill'", "'season'", "'shrimp'", "'lamb'", "'freeze'", 
		"'sous_vide'", "'chops'", "'electric'", "'tenderloin'", "'corvina'", "'rack'", 
		"'toaster oven'", "'Costco'", "'steak'", "'chicken'", "'charcoal'", "'strip'", 
		"'ribs'", "'leg'", "'salmon'", "'bag'", "'Fisherman's Dock'", "'pan'", 
		"'consume'", "'pork'"
	};
	public static final int
		RULE_nutrition = 0, RULE_shop = 1, RULE_costco = 2, RULE_costco_food = 3, 
		RULE_steak = 4, RULE_lamb = 5, RULE_pork = 6, RULE_fishermans_dock = 7, 
		RULE_fd_food = 8, RULE_prepare = 9, RULE_step = 10, RULE_grill = 11, RULE_sous_vide = 12;
	public static final String[] ruleNames = {
		"nutrition", "shop", "costco", "costco_food", "steak", "lamb", "pork", 
		"fishermans_dock", "fd_food", "prepare", "step", "grill", "sous_vide"
	};

	@Override
	public String getGrammarFileName() { return "Cooking.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CookingParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class NutritionContext extends ParserRuleContext {
		public PrepareContext prepare() {
			return getRuleContext(PrepareContext.class,0);
		}
		public ShopContext shop() {
			return getRuleContext(ShopContext.class,0);
		}
		public NutritionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nutrition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CookingListener ) ((CookingListener)listener).enterNutrition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CookingListener ) ((CookingListener)listener).exitNutrition(this);
		}
	}

	public final NutritionContext nutrition() throws RecognitionException {
		NutritionContext _localctx = new NutritionContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_nutrition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(26); shop();
			setState(27); prepare();
			setState(28); match(T__1);
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

	public static class ShopContext extends ParserRuleContext {
		public CostcoContext costco() {
			return getRuleContext(CostcoContext.class,0);
		}
		public Fishermans_dockContext fishermans_dock() {
			return getRuleContext(Fishermans_dockContext.class,0);
		}
		public ShopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CookingListener ) ((CookingListener)listener).enterShop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CookingListener ) ((CookingListener)listener).exitShop(this);
		}
	}

	public final ShopContext shop() throws RecognitionException {
		ShopContext _localctx = new ShopContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_shop);
		try {
			setState(32);
			switch (_input.LA(1)) {
			case T__12:
				enterOuterAlt(_localctx, 1);
				{
				setState(30); costco();
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 2);
				{
				setState(31); fishermans_dock();
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

	public static class CostcoContext extends ParserRuleContext {
		public Costco_foodContext costco_food() {
			return getRuleContext(Costco_foodContext.class,0);
		}
		public CostcoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_costco; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CookingListener ) ((CookingListener)listener).enterCostco(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CookingListener ) ((CookingListener)listener).exitCostco(this);
		}
	}

	public final CostcoContext costco() throws RecognitionException {
		CostcoContext _localctx = new CostcoContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_costco);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(34); match(T__12);
			setState(35); costco_food();
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

	public static class Costco_foodContext extends ParserRuleContext {
		public LambContext lamb() {
			return getRuleContext(LambContext.class,0);
		}
		public PorkContext pork() {
			return getRuleContext(PorkContext.class,0);
		}
		public SteakContext steak() {
			return getRuleContext(SteakContext.class,0);
		}
		public Costco_foodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_costco_food; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CookingListener ) ((CookingListener)listener).enterCostco_food(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CookingListener ) ((CookingListener)listener).exitCostco_food(this);
		}
	}

	public final Costco_foodContext costco_food() throws RecognitionException {
		Costco_foodContext _localctx = new Costco_foodContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_costco_food);
		try {
			setState(42);
			switch (_input.LA(1)) {
			case T__16:
			case T__8:
				enterOuterAlt(_localctx, 1);
				{
				setState(37); steak();
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 2);
				{
				setState(38); match(T__10);
				}
				break;
			case T__21:
				enterOuterAlt(_localctx, 3);
				{
				setState(39); lamb();
				}
				break;
			case T__15:
				enterOuterAlt(_localctx, 4);
				{
				setState(40); match(T__15);
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 5);
				{
				setState(41); pork();
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

	public static class SteakContext extends ParserRuleContext {
		public SteakContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_steak; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CookingListener ) ((CookingListener)listener).enterSteak(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CookingListener ) ((CookingListener)listener).exitSteak(this);
		}
	}

	public final SteakContext steak() throws RecognitionException {
		SteakContext _localctx = new SteakContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_steak);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44);
			_la = _input.LA(1);
			if ( !(_la==T__16 || _la==T__8) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(45); match(T__11);
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

	public static class LambContext extends ParserRuleContext {
		public LambContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lamb; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CookingListener ) ((CookingListener)listener).enterLamb(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CookingListener ) ((CookingListener)listener).exitLamb(this);
		}
	}

	public final LambContext lamb() throws RecognitionException {
		LambContext _localctx = new LambContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_lamb);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(47); match(T__21);
			setState(48);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__18) | (1L << T__14) | (1L << T__6))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class PorkContext extends ParserRuleContext {
		public PorkContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pork; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CookingListener ) ((CookingListener)listener).enterPork(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CookingListener ) ((CookingListener)listener).exitPork(this);
		}
	}

	public final PorkContext pork() throws RecognitionException {
		PorkContext _localctx = new PorkContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_pork);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50); match(T__0);
			setState(51); match(T__7);
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

	public static class Fishermans_dockContext extends ParserRuleContext {
		public Fd_foodContext fd_food() {
			return getRuleContext(Fd_foodContext.class,0);
		}
		public Fishermans_dockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fishermans_dock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CookingListener ) ((CookingListener)listener).enterFishermans_dock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CookingListener ) ((CookingListener)listener).exitFishermans_dock(this);
		}
	}

	public final Fishermans_dockContext fishermans_dock() throws RecognitionException {
		Fishermans_dockContext _localctx = new Fishermans_dockContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_fishermans_dock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(53); match(T__3);
			setState(54); fd_food();
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

	public static class Fd_foodContext extends ParserRuleContext {
		public Fd_foodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fd_food; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CookingListener ) ((CookingListener)listener).enterFd_food(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CookingListener ) ((CookingListener)listener).exitFd_food(this);
		}
	}

	public final Fd_foodContext fd_food() throws RecognitionException {
		Fd_foodContext _localctx = new Fd_foodContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_fd_food);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
			_la = _input.LA(1);
			if ( !(_la==T__22 || _la==T__5) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class PrepareContext extends ParserRuleContext {
		public StepContext step(int i) {
			return getRuleContext(StepContext.class,i);
		}
		public List<StepContext> step() {
			return getRuleContexts(StepContext.class);
		}
		public PrepareContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prepare; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CookingListener ) ((CookingListener)listener).enterPrepare(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CookingListener ) ((CookingListener)listener).exitPrepare(this);
		}
	}

	public final PrepareContext prepare() throws RecognitionException {
		PrepareContext _localctx = new PrepareContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_prepare);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__24) | (1L << T__23) | (1L << T__20) | (1L << T__4))) != 0)) {
				{
				{
				setState(58); step();
				}
				}
				setState(63);
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

	public static class StepContext extends ParserRuleContext {
		public Sous_videContext sous_vide() {
			return getRuleContext(Sous_videContext.class,0);
		}
		public GrillContext grill() {
			return getRuleContext(GrillContext.class,0);
		}
		public StepContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_step; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CookingListener ) ((CookingListener)listener).enterStep(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CookingListener ) ((CookingListener)listener).exitStep(this);
		}
	}

	public final StepContext step() throws RecognitionException {
		StepContext _localctx = new StepContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_step);
		try {
			setState(69);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(64); match(T__23);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(65); grill();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(66); match(T__4);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(67); match(T__20);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(68); sous_vide();
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

	public static class GrillContext extends ParserRuleContext {
		public GrillContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_grill; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CookingListener ) ((CookingListener)listener).enterGrill(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CookingListener ) ((CookingListener)listener).exitGrill(this);
		}
	}

	public final GrillContext grill() throws RecognitionException {
		GrillContext _localctx = new GrillContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_grill);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71); match(T__24);
			setState(72);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__17) | (1L << T__13) | (1L << T__9) | (1L << T__2))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class Sous_videContext extends ParserRuleContext {
		public Sous_videContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sous_vide; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CookingListener ) ((CookingListener)listener).enterSous_vide(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CookingListener ) ((CookingListener)listener).exitSous_vide(this);
		}
	}

	public final Sous_videContext sous_vide() throws RecognitionException {
		Sous_videContext _localctx = new Sous_videContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_sous_vide);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74); match(T__4);
			setState(76);
			_la = _input.LA(1);
			if (_la==T__20) {
				{
				setState(75); match(T__20);
				}
			}

			setState(78); match(T__19);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\33S\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4"+
		"\f\t\f\4\r\t\r\4\16\t\16\3\2\3\2\3\2\3\2\3\3\3\3\5\3#\n\3\3\4\3\4\3\4"+
		"\3\5\3\5\3\5\3\5\3\5\5\5-\n\5\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\t"+
		"\3\t\3\t\3\n\3\n\3\13\7\13>\n\13\f\13\16\13A\13\13\3\f\3\f\3\f\3\f\3\f"+
		"\5\fH\n\f\3\r\3\r\3\r\3\16\3\16\5\16O\n\16\3\16\3\16\3\16\2\2\17\2\4\6"+
		"\b\n\f\16\20\22\24\26\30\32\2\6\4\2\13\13\23\23\5\2\t\t\r\r\25\25\4\2"+
		"\5\5\26\26\6\2\n\n\16\16\22\22\31\31P\2\34\3\2\2\2\4\"\3\2\2\2\6$\3\2"+
		"\2\2\b,\3\2\2\2\n.\3\2\2\2\f\61\3\2\2\2\16\64\3\2\2\2\20\67\3\2\2\2\22"+
		":\3\2\2\2\24?\3\2\2\2\26G\3\2\2\2\30I\3\2\2\2\32L\3\2\2\2\34\35\5\4\3"+
		"\2\35\36\5\24\13\2\36\37\7\32\2\2\37\3\3\2\2\2 #\5\6\4\2!#\5\20\t\2\""+
		" \3\2\2\2\"!\3\2\2\2#\5\3\2\2\2$%\7\17\2\2%&\5\b\5\2&\7\3\2\2\2\'-\5\n"+
		"\6\2(-\7\21\2\2)-\5\f\7\2*-\7\f\2\2+-\5\16\b\2,\'\3\2\2\2,(\3\2\2\2,)"+
		"\3\2\2\2,*\3\2\2\2,+\3\2\2\2-\t\3\2\2\2./\t\2\2\2/\60\7\20\2\2\60\13\3"+
		"\2\2\2\61\62\7\6\2\2\62\63\t\3\2\2\63\r\3\2\2\2\64\65\7\33\2\2\65\66\7"+
		"\24\2\2\66\17\3\2\2\2\678\7\30\2\289\5\22\n\29\21\3\2\2\2:;\t\4\2\2;\23"+
		"\3\2\2\2<>\5\26\f\2=<\3\2\2\2>A\3\2\2\2?=\3\2\2\2?@\3\2\2\2@\25\3\2\2"+
		"\2A?\3\2\2\2BH\7\4\2\2CH\5\30\r\2DH\7\27\2\2EH\7\7\2\2FH\5\32\16\2GB\3"+
		"\2\2\2GC\3\2\2\2GD\3\2\2\2GE\3\2\2\2GF\3\2\2\2H\27\3\2\2\2IJ\7\3\2\2J"+
		"K\t\5\2\2K\31\3\2\2\2LN\7\27\2\2MO\7\7\2\2NM\3\2\2\2NO\3\2\2\2OP\3\2\2"+
		"\2PQ\7\b\2\2Q\33\3\2\2\2\7\",?GN";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}