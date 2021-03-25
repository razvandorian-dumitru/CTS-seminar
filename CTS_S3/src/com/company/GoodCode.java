package com.company;

public class GoodCode {
    public static final int VECHIME_MAXIMA = 10;
    public static final float DISCOUNT_VECHIME_MAXIMA = 0.15f;

    public static final float DISCOUNT_EXTRA_10 = 0.1f;
    public static final float DISCOUNT_EXTRA_25 = 0.25f;
    public static final float DISCOUNT_EXTRA_35 = 0.35f;

    public static float getDiscount(int vechime) {
        return (vechime > VECHIME_MAXIMA) ? DISCOUNT_VECHIME_MAXIMA : (float) vechime / 100;
    }

    public static float aplicaDiscount(float pretInitial, float valoareDiscount, float discountExtra) {
        return (pretInitial - (discountExtra * pretInitial)) - valoareDiscount * (pretInitial - (discountExtra * pretInitial));
    }

    public float calculeazaPretFinal(TipProdus tipProdus, float pretInitial, int vechime) {
        float discount = getDiscount(vechime);
        return (tipProdus != TipProdus.NOU) ? aplicaDiscount(pretInitial, discount, tipProdus.getDiscount()) : pretInitial;

    }
}
