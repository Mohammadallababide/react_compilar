package com.company;

import AST.App.App;
import gen.*;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import symbolTable.Symbol;
import symbolTable.SymbolTable;

import java.io.IOException;


import static org.antlr.v4.runtime.CharStreams.fromFileName;


public class Main {
    public static SymbolTable symbolTable = new SymbolTable();

    public static void main(String[] args) throws IOException {
        // write your code here
        String source = "C:\\Users\\moha lebo\\Desktop\\Reactjs\\MyLanguage.txt";
        CharStream cs = fromFileName(source);
        LexerReact lexer = new LexerReact(cs);
        CommonTokenStream token = new CommonTokenStream(lexer);
        ParserReact parser = new ParserReact(token);
        ParseTree tree0 = parser.app();
        App App = (App) new BaseVisitor().visit(tree0);
        System.out.println(App);
        showSymboleTable();
    }

    public static void showSymboleTable() {
        System.out.println("_______________ symbol Table info ----------------");
        System.out.println("scopes stored :" + symbolTable.getScopes().size());
        System.out.println("_______________");
        for (int i = 0; i < symbolTable.getScopes().size(); i++) {
            for (Object symbol : symbolTable.getScopes().get(i).getSymbolMap().values().toArray()) {
                System.out.println("-Symbol: " + ((Symbol) symbol).getName());
                System.out.println("-Symbol Scope: " + ((Symbol) symbol).getScope().getId());
                if( ((Symbol) symbol).isFunction() ){
                    System.out.println("* this Symbol is function *");
                }
                System.out.println("-Symbol type: " + ((Symbol) symbol).getType().getName());

                System.out.println("_______________");
            }
//            for (function_header function : symbolTable.getScopes().get(i).getFunctionsMap().values()) {
//                System.out.println("-function name: " + function.getName());
//                System.out.println("_______________");
//            }
        }

    }
}
