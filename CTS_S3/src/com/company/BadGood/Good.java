package com.company.BadGood;

public class Good {
    //final==const
    public static final int VECHIME_MAX = 10;
    public static final float DISCOUNT_VECHIME_MAX = 0.15f;

    public static final float DISCOUNT_10 = 0.1f;
    public static final float DISCOUNT_25 = 0.25f;
    public static final float DISCOUNT_35 = 0.35f;

    public static float getDiscount(int vechime) {
        return (vechime > VECHIME_MAX) ?
                DISCOUNT_VECHIME_MAX : (float) vechime / 100;
    }

    public static float aplicaDiscount(float pretInitial, float valoareDiscount,
                                       float discountExtra) {

        return (pretInitial - (discountExtra * pretInitial)) -
                valoareDiscount * (pretInitial - (discountExtra * pretInitial));
    }

    public float calculeazaPretFinal(TipProdus tipProdus, float pretInitial, int vechime) {

        float pretFinal = 0;
        float discount = getDiscount(vechime);

        pretFinal = switch (tipProdus) {
            case NOU -> pretInitial;
            case DISCOUNT -> aplicaDiscount(pretInitial, discount, DISCOUNT_10);
            case STOC_LIMITAT -> aplicaDiscount(pretInitial, discount, DISCOUNT_25);
            case SFARSIT_DE_SEZON -> aplicaDiscount(pretInitial, discount, DISCOUNT_35);
            default -> throw new UnsupportedOperationException("Ceva nu a mers");
        };

        return pretFinal;
    }
}