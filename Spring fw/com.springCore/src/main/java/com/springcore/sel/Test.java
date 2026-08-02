package com.springcore.sel;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.spel.standard.SpelExpressionParser;
//spring expression language
public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new FileSystemXmlApplicationContext("src/main/java/com/springcore/sel/el.xml");
        Demo d1 = context.getBean("demo", Demo.class);
        System.out.println(d1);
        SpelExpressionParser temp = new SpelExpressionParser();
        Expression expression = temp.parseExpression("{22+24}"); //if expression passed in curly braces it will return array else integer
        System.out.println(expression.getValue());
    }

}
