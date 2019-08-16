package org.sniper.jack.base.operator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Operator {

    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("^/uc/sso/*");
        System.out.println(pattern.pattern());
        Matcher matcher = pattern.matcher("/uc/sso/");
        System.out.println(matcher.matches());
    }
}
