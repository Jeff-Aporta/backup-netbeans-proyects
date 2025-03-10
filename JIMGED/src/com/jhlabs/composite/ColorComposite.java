package com.jhlabs.composite;

import java.awt.*;
import java.awt.image.*;

public final class ColorComposite extends RGBComposite {

    public static void main(String[] args) throws Exception {
        test(new ColorComposite(1));
    }

    public ColorComposite(float alpha) {
        super(alpha);
    }

    public CompositeContext createContext(ColorModel srcColorModel, ColorModel dstColorModel, RenderingHints hints) {
        return new Context(extraAlpha, srcColorModel, dstColorModel);
    }

    static class Context extends RGBCompositeContext {

        private float[] sHSB = new float[3];
        private float[] dHSB = new float[3];

        public Context(float alpha, ColorModel srcColorModel, ColorModel dstColorModel) {
            super(alpha, srcColorModel, dstColorModel);
        }

        public void composeRGB(int[] src, int[] dst, float alpha) {
            int w = src.length;

            for (int i = 0; i < w; i += 4) {
                int sr = src[i];
                int dir = dst[i];
                int sg = src[i + 1];
                int dig = dst[i + 1];
                int sb = src[i + 2];
                int dib = dst[i + 2];
                int sa = src[i + 3];
                int dia = dst[i + 3];
                int dor, dog, dob;

                Color.RGBtoHSB(sr, sg, sb, sHSB);
                Color.RGBtoHSB(dir, dig, dib, dHSB);

                dHSB[0] = sHSB[0];
                dHSB[1] = sHSB[1];

                int doRGB = Color.HSBtoRGB(dHSB[0], dHSB[1], dHSB[2]);
                dor = (doRGB & 0xff0000) >> 16;
                dog = (doRGB & 0xff00) >> 8;
                dob = (doRGB & 0xff);

                float a = alpha * sa / 255f;
                float ac = 1 - a;

                dst[i] = (int) (a * dor + ac * dir);
                dst[i + 1] = (int) (a * dog + ac * dig);
                dst[i + 2] = (int) (a * dob + ac * dib);
                dst[i + 3] = (int) (sa * alpha + dia * ac);
            }
        }
    }

}
