package com.compiler.lexer;

import com.compiler.interpreter.variables.Fraction;

import java.util.Optional;


public class Token {

    public final TokenType type;
    public final String lexeme;
    Fraction fraction = null;
    private final int column;
    private final int line;
    private final int signNumber;


    public Token(TokenType type, String lexeme, int line, int column, int signNumber) {
        this.type = type;
        this.lexeme = lexeme;
        this.line = line;
        this.column = column;
        this.signNumber = signNumber;

        // todo: filling fraction class with value will be done in Interpreter
//        if(type==TokenType.FRACTION){
//            Fraction f = new Fraction(lexeme);
//            this.fraction = f;
//        }
    }

    public TokenType getType() {
        return type;
    }

    public String getLexeme() {
        return lexeme;
    }

    public Optional<Fraction> getFraction() {
        return Optional.of(fraction);
    }

    public int getColumn() {
        return column;
    }

    public int getLine() {
        return line;
    }

    public int getSignNumber(){
        return signNumber;
    }

    public String toString() {
        return "type: " + type + " \"" + lexeme + "\"" + " line: " + line +" column: " + column + " signNumber: " + signNumber ;
    }

    // TODO: Konrad mówi ze zawsze string a Fraction klase przenieść do interpretera !
    public static Object tokenConverter(Token token) {
        //if(token.type == TokenType.FRACTION) return new Fraction(token.lexeme);
        //if(token.type == TokenType.STRING) return token.lexeme;
        return token.lexeme;
        //throw new NotImplementedException();
    }
}

