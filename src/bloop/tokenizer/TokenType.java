
package bloop.tokenizer;
public enum TokenType {

    // -----------------------------------------------
    // CORE KEYWORDS
    // these are the main words our BLOOP language uses
    // -----------------------------------------------

    PUT,        // the word "put" — we use this to start storing a value, like: put 10 into x
    INTO,       // the word "into" — comes after the value in assignment, like: put 10 into x
    PRINT,      // the word "print" — used to show output on screen, like: print x
    IF,         // the word "if" — used to check a condition, like: if score > 50 then:
    THEN,       // the word "then" — comes after the condition in an if statement
    REPEAT,     // the word "repeat" — used to run a block of code multiple times, like: repeat 4 times:
    TIMES,      // the word "times" — comes after the number in a repeat loop

    // -----------------------------------------------
    // EXTENSION KEYWORDS
    // these are extra keywords we added for the optional features
    // -----------------------------------------------

    ELSE,       // the word "else" — runs a block when the if condition is false
    WHILE,      // the word "while" — keeps looping as long as a condition is true, like: while x > 0 then:

    // -----------------------------------------------
    // LITERAL VALUE TYPES
    // these represent the actual values written in the source code
    // -----------------------------------------------

    NUMBER,     // any number the user writes, like 10 or 3.14
    STRING,     // any text inside quotes, like "hello" or "Sitare"
    IDENTIFIER, // variable names that the user creates, like x, y, result, score

    //
    // ARITHMETIC OPERATORS
    // these are the math symbols we support
    //

    PLUS,       // the + symbol — for addition
    MINUS,      // the - symbol — for subtraction
    STAR,       // the * symbol — for multiplication
    SLASH,      // the / symbol — for division

    //
    // COMPARISON OPERATORS
    // these are used in conditions like if statements
    //

    GREATER,    // the > symbol — checks if left side is greater than right side
    LESS,       // the < symbol — checks if left side is less than right side
    EQUALS,     // the == symbol — checks if two values are equal (this is an extension we added)

    //
    // PUNCTUATION
    // small symbols that help structure the code
    //

    COLON,      // the : symbol — goes at the end of if, else, repeat, while header lines
    LPAREN,     // the ( symbol — used for built-in functions like length(x)
    RPAREN,     // the ) symbol — closes the built-in function call like length(x)


    // CONTROL TOKENS
    // these are not visible keywords but the tokenizer produces them
    // to help the parser know where one instruction ends and another begins


    // INDENT carries the number of leading spaces as its value
    // for example Token(INDENT, "4", line=3) means line 3 starts with 4 spaces
    INDENT,
    NEWLINE,    // marks the end of a line — parser uses this to separate instructions
    EOF         // marks the end of the file — parser uses this to stop reading
}
