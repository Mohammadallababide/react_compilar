parser grammar ParserReact;

options { tokenVocab = LexerReact; }

app :
(
importR
(
//function1 |
instructions | function_declaration
)*
export?
)*
EOF
;

export: EXPORT DEFAULT SYNTAX SIME;

importR: IMPORT (react_libraries)?
           (COMMA? OPEN_BRACE (COMMA? react_libraries)* CLOSE_BRACE)?
           FROM destination_name?
           SIME;

destination_name : IDENTIFIER ;

react_libraries :  USESTATE_ | USEREF_ | USEEFFECT_ | SYNTAX | REACT_ | RANDOM_NAME ;


syntax: ONE_CHAR_LETTER SIME;

attributes: OPEN_BRACE attribute (COMMA attribute)* CLOSE_BRACE?;

attribute: RANDOM_NAME COLON attributeValue;
attributeValue: NUMERIC_LITERAL
               | SYNTAX;

useRef: USEREF_ OPEN_PAREN CLOSE_PAREN;

useState: USESTATE_ OPEN_PAREN (SYNTAX DOT SYNTAX | SYNTAX) CLOSE_PAREN SIME?;

array: (VAR | CONST | LET) arrayy ASSIGN useState SIME?;

useEffect: USEEFFECT_ OPEN_PAREN arrow_function COMMA arrayy CLOSE_PAREN SIME;

arrayy: OPEN_SQUARE  par* CLOSE_SQUARE;

par: TYPE|COLON | SYNTAX | NUMERIC_LITERAL | BACKSLASH | DOT | COMMA|SINGLE_QUOTE|(JSX_SLASH_OR_DIV)|OPEN_BRACE|CLOSE_BRACE|OPEN_SQUARE;

map: OPEN_BRACE (SYNTAX COLON (attributeValue | DOLLAR OPEN_BRACE (SYNTAX) CLOSE_BRACE | arrayy) COMMA?)* CLOSE_BRACE;

onClick: OPEN_BRACE arrow_function CLOSE_BRACE;

mapMethod: (SYNTAX DOT)* MAP_ OPEN_PAREN OPEN_PAREN (SYNTAX COMMA?)* CLOSE_PAREN ARROW OPEN_PAREN jsxElement CLOSE_PAREN CLOSE_PAREN;

jsxElement: LT jsxChild2* GT?;

jsxChild2: jsxChild
          | jsxElement
          | functionCall;

jsxOpenTag: LT SYNTAX* jsxChild* JSX_SLASH_OR_DIV? GT;

jsxChild: ASSIGN |OPEN_SQUARE |CLOSE_SQUARE  | LT| GT| DOLLAR | OPEN_PAREN | CLOSE_PAREN | OPEN_BRACE
         | CLOSE_BRACE| ASSIGN| QUESTION | MOD | D_C | SINGLE_QUOTE| COLON| HASHTAG | MINUS| JSX_SLASH_OR_DIV| NUMERIC_LITERAL | DOT
         | Backtick| ARROW | COMMA | SYNTAX |MAP_;

functionCall: OPEN_BRACE RANDOM_NAME OPEN_PAREN jsxChild* CLOSE_PAREN CLOSE_BRACE;

jsxCode: jsxOpenTag  | jsxElement | syntax;

// ------------------------------------------------------------------------------------------
name
 : use_random_name
 ;

function_name
 : use_random_name
 ;

signed_number
 : ( ( PLUS | MINUS )? NUMERIC_LITERAL | MULTI )
 ;

error_message
 : STRING_LITERAL
 ;

any_name
 : IDENTIFIER
 |RANDOM_NAME
 //| keyword
 | STRING_LITERAL
 //| '(' any_name ')'
 ;

function_declaration:
        normal_function
       |arrow_function
   ;

arrow_function : OPEN_PAREN OPEN_BRACE? (((args|creating_with_assign)
(COMMA (args|creating_with_assign))*))?
 CLOSE_BRACE? CLOSE_PAREN ARROW  function_body ;


normal_function :  (  FUNCTION function_header  function_body) ;

    function_header:

         use_random_name
         OPEN_PAREN
        (
              (((args|creating_with_assign)  (COMMA (args|creating_with_assign))*))?
        )

         CLOSE_PAREN
         ;

   function_body:
       OPEN_BRACE?
       (sub_function_body | instructions | jsxCode )* (return_rule SIME)?
       CLOSE_BRACE?
   ;

    sub_function_body:
       OPEN_BRACE (sub_function_body | instructions )* CLOSE_BRACE
      ;

   instructions
     :(functional_instruction | nonfunctional_instruction )
   ;

    functional_instruction :
    (do_while | if_else_rule|switch_rule|(while_rule|foreach|for_loop_rule)
    ((exiting_loops)?SIME | OPEN_BRACE instructions*  (exiting_loops SIME)?CLOSE_BRACE| instructions));

 nonfunctional_instruction
      :( call_function
       | print_statment
       | shortcut_statments
       | general_creating
       | genral_assign
       ) SIME
   ;

   call_function : // if we put first expr no error but when we put prameters it gives us error
         use_random_name//IDENTIFIER
       OPEN_PAREN
        ( prameters (','  prameters)*)*
       CLOSE_PAREN
   ;

    callback_func :
     function_header
     function_body
     ;

     args
      :  create_without_assign//grnral_creating//create_varible_without_assign
      | callback_func;
      //| create_Array_without_assign
      //| create_json_object_without_assign)
     prameters
     : expression
     | NUMERIC_LITERAL
     | ONE_CHAR_LETTER
     | call_function
     | IDENTIFIER
     | use_random_name
     | varible_from_object
     | array_base_form_with_index
     | genral_assign
      ;

      return_rule:
         (RETURN(return_type))?
         ;

         exiting_loops:
         (return_rule)|(BREAK|CONTINUE)
         ;

    return_type:
        | intral_expression_value
        | expression
        | bool_expression
        | onClick
        | mapMethod
        | jsxElement
        | NULL


   ;

     print_statment :
     CONSOLE_ DOT LOG_ OPEN_PAREN (indisde_the_print)(PLUS indisde_the_print)* CLOSE_PAREN ;


        indisde_the_print:
         (expression| IDENTIFIER |use_random_name | call_function |varible_from_object| array_base_form_with_index )
        ;


     if_else_rule
      : if_rule
      else_if_rule*
      else_rulse?;
     //:K_IF '('boolean_infunction_statment')'
    // |K_IF '('boolean_infunction_statment')' '{'(sub_function_body)'}' K_ELSE '{'(sub_function_body)'}'
    // | K_IF '('boolean_infunction_statment')''{'(sub_function_body)'}' K_ELSE K_IF'('boolean_infunction_statment ')''{'(sub_function_body)'}'
     if_rule
     :   IF OPEN_PAREN ( bool_expression  ) CLOSE_PAREN
       ( OPEN_BRACE (instructions)* (return_rule SIME) ?  CLOSE_BRACE
       | (return_rule | instructions)? SIME)
     ;

     else_if_rule:
     ELSE_IF OPEN_PAREN ( bool_expression ) CLOSE_PAREN
     ( OPEN_BRACE instructions* (return_rule SIME) ?  CLOSE_BRACE
            | (return_rule | instructions)? SIME)
     ;

     else_rulse:
         ELSE
      ( OPEN_BRACE instructions* (return_rule SIME) ?  CLOSE_BRACE
             | (return_rule | instructions)? SIME)
     ;

     while_rule:
        WHILE OPEN_PAREN ( bool_expression )  CLOSE_PAREN
     ;

     do_while:
         DO
         ((exiting_loops)? SIME
         |
         (OPEN_BRACE
         instructions*
         (exiting_loops SIME)?
         CLOSE_BRACE)
         | SIME
         ) //SCOL
         while_rule SIME
      ;

    for_loop_rule:
    FOR
     OPEN_PAREN ( (create_varible_with_assign|create_varible_without_assign| inside_for_loop)   /*arithmetic_infunction_statment*/ )?
       SIME( bool_expression )?
       SIME ( inside_for_loop)? CLOSE_PAREN
    ;

    inside_for_loop:
        (expression | assign_varible | assign_array | create_Array_without_assign | shortcut_statments)
    ;

    foreach:
    FOREACH OPEN_PAREN
    VAR use_random_name OPEN_SQUARE CLOSE_SQUARE* ':'use_random_name OPEN_SQUARE CLOSE_SQUARE *
    CLOSE_PAREN
    ;
   switch_rule:
       SWITCH OPEN_PAREN ( bool_expression | use_random_name| ONE_CHAR_LETTER|NUMERIC_LITERAL|genral_assign|call_function|varible_from_object ) CLOSE_PAREN
       OPEN_BRACE
       (case_rule*
       defult?)?
       CLOSE_BRACE
       ;
       defult:
       DEFAULT COLON
       (instructions)*
        ((BREAK | return_rule) SIME)?
       ;
       case_rule:
        CASE ( bool_expression |any_name|ONE_CHAR_LETTER|NUMERIC_LITERAL|varible_from_object )COLON
       (instructions)*
       ((BREAK
       | return_rule)
       SIME)?
       ;

    defination_type :  (VAR | CONST | LET) ;

 general_creating:
         create_without_assign
       | creating_with_assign
       ;

   creating_with_assign:
       create_varible_with_assign
      |create_json_with_assign
      |create_Array_with_assign
   ;

     create_without_assign:
     create_varible_without_assign
     | create_Array_without_assign
    | create_json_object_without_assign
     ;


    genral_assign
    : assign_varible // like: a=5
    | assign_array //like: a[2]=3
    | assign_json //like: jsonObject = {}
    ;

    varible_name:
    use_random_name
    ;

    assign_varible:
     (( use_random_name ) (any_arithmetic_oprator)? ASSIGN )+
      (
            expression
           |bool_expression
           | NULL
           //| arithmetic_infunction_statment
      )
    ;

    create_varible_without_assign
    :  defination_type varible_name
    ;

    create_varible_with_assign:
     defination_type assign_varible
    ;

     array_name:
     use_random_name
     ;

     assign_array:
      (array_base_form_with_index (any_arithmetic_oprator)? ASSIGN)+
       (
                    expression
                   |bool_expression
                   |NULL
             )
     ;

      create_array_form:
       create_Array_without_assign | create_Array_with_assign
      ;

        create_Array_without_assign:
        defination_type array_base_form_without_index
        ;

        create_Array_with_assign:
        defination_type array_base_form_without_index (ASSIGN left_side_array )
        ;

//        array_base_form:
//        (array_base_form_without_index|array_base_form_with_index)
//        ;

         array_base_form_without_index:
         array_name (OPEN_SQUARE CLOSE_SQUARE)+
         ;

        array_base_form_with_index:
        array_name ( OPEN_SQUARE ( expression | NUMERIC_LITERAL | varible_name)CLOSE_SQUARE )+

         ;
        array_identifier_form:
              IDENTIFIER (COMMA IDENTIFIER)*
        ;

        array_boolean_form:
         expression (COMMA expression)
        ;

        array_integer_form:
             (expression) (COMMA (expression))*
        ;

        array_charecter_form:
              ONE_CHAR_LETTER (COMMA ONE_CHAR_LETTER)*
        ;

        array_objects_form:
               json_statment(COMMA json_statment)*
        ;

        array_objects_form2:
        OPEN_SQUARE array_objects_form CLOSE_SQUARE
        ;

        array_varible_form:
        (varible_name|varible_from_object)(COMMA(varible_name|varible_from_object))*
        ;

        array_anyType_form:
        (
         array_identifier_form
        |array_integer_form
        |array_charecter_form
        |array_objects_form
        |array_varible_form
        |array_boolean_form
        )
        (COMMA
         (array_identifier_form
         |array_integer_form
         |array_charecter_form
         |array_objects_form
         |array_arrayes_form
         |array_varible_form
         |array_boolean_form
         ))*
        ;

        array_arrayes_form:
        left_side_array (COMMA (left_side_array))*
        ;

        value_left_side:
        (           array_identifier_form
                   |array_integer_form
                   |array_charecter_form
                   |array_objects_form
                   |array_objects_form2
                   |array_arrayes_form
                   |array_boolean_form
                   |varible_from_object
                   |array_anyType_form
                   |array_varible_form
                   )
        ;

         left_side_array:
          (OPEN_SQUARE
           value_left_side?
          CLOSE_SQUARE)
          | array_name

         ;


    json_name:
    use_random_name
    ;


    assign_json:
    json_name ASSIGN (json_name|json_statment)
    ;

    create_json_form:
    create_json_object_without_assign|create_json_with_assign
    ;

     create_json_object_without_assign:
     defination_type  json_name
     ;

     create_json_with_assign:
     defination_type assign_json
     ;
    inside_json_statmnet :
    use_random_name ':'value_json_statmnet
    ;

     json_statment:
     OPEN_BRACE ((inside_json_statmnet)(COMMA inside_json_statmnet )*)? CLOSE_BRACE
     ;

    value_json_statmnet:
       expression
     | IDENTIFIER
     | NUMERIC_LITERAL
     | NULL
     | varible_name
     | ONE_CHAR_LETTER
     | json_statment
     | varible_from_object
     | call_function
     | array_base_form_with_index //(ASSIGN left_side_array)?
     | array_objects_form2
     | OPEN_SQUARE value_left_side CLOSE_SQUARE
     //|expression //
     //|expression //

    ;

    varible_from_object:
    json_name (DOT varible_name)+ // todo AST change (DOT varible_name)*
    ;
     shortcut_statments
          : MINUS_MINUS use_random_name
          | PLPL use_random_name
          | use_random_name MINUS_MINUS
          | use_random_name PLPL
     ;

     any_arithmetic_oprator
         : MULTI
         | JSX_SLASH_OR_DIV
         | POWER
         | MOD
         | PLUS
         | MINUS
       ;

     expression
        : intral_expression_value
        | (OPEN_PAREN)+ (expression | genral_assign ) (CLOSE_PAREN)+
        | expression PLPL
        | expression MINUS_MINUS
        | PLPL expression
        | MINUS_MINUS expression
        |expression (JSX_SLASH_OR_DIV | MOD |MULTI ) expression
        |expression (PLUS | MINUS) expression
        | expression QUESTION expression COLON expression
     ;

        bool_expression :
        | (expression (LT | GT | GT_EQ | LT_EQ ) expression)
        | (expression (EQ | NOT_EQ1) expression)
        | (expression AND expression)
        | (expression OR expression )
        | (intral_expression_value) ;

     intral_expression_value
        : TRUE
        | FALSE
        | NUMERIC_LITERAL
        | varible_name
        | IDENTIFIER
        | ONE_CHAR_LETTER
        | varible_from_object
        | array_base_form_with_index
        | call_function
        | function_declaration
        | useEffect
        | useState

        ;




         //statmint end section----------------------------------------------------------------------
        use_random_name
        : RANDOM_NAME
        ;
