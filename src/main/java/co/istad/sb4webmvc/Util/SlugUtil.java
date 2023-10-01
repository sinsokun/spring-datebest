package co.istad.sb4webmvc.Util;

import java.text.Normalizer;
import java.util.Locale;
import java.util.regex.Pattern;

public class SlugUtil {
    private static final Pattern NONLATIN = Pattern.compile("[^\\w-]");

    private static final Pattern WHITESPACE = Pattern.compile("[\\s]");

    /**
     * Convert the String input to a slug.
     */
    public static String toSlug(String input) {
        if (input == null) {
            throw new IllegalArgumentException("Input cannot be null");
        }
        String nowhitespace = WHITESPACE.matcher(input).replaceAll("-");
        String normalized = Normalizer.normalize(nowhitespace, Normalizer.Form.NFD);
        String slug = NONLATIN.matcher(normalized).replaceAll("");
        return slug.toLowerCase(Locale.ENGLISH);
    }


    }

