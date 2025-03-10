package com.jhlabs.composite;

import java.awt.*;
import java.awt.image.*;

public final class OverlayComposite extends RGBComposite {

    public static void main(String[] args) throws Exception {
        test(new OverlayComposite(1));
    }

    public OverlayComposite(float alpha) {
        super(alpha);
    }

    public CompositeContext createContext(ColorModel srcColorModel, ColorModel dstColorModel, RenderingHints hints) {
        return new Context(extraAlpha, srcColorModel, dstColorModel);
    }

    static class Context extends RGBCompositeContext {

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

                int t;
                if (dir < 128) {
                    t = dir * sr + 0x80;
                    dor = 2 * (((t >> 8) + t) >> 8);
                } else {
                    t = (255 - dir) * (255 - sr) + 0x80;
                    dor = 2 * (255 - (((t >> 8) + t) >> 8));
                }
                if (dig < 128) {
                    t = dig * sg + 0x80;
                    dog = 2 * (((t >> 8) + t) >> 8);
                } else {
                    t = (255 - dig) * (255 - sg) + 0x80;
                    dog = 2 * (255 - (((t >> 8) + t) >> 8));
                }
                if (dib < 128) {
                    t = dib * sb + 0x80;
                    dob = 2 * (((t >> 8) + t) >> 8);
                } else {
                    t = (255 - dib) * (255 - sb) + 0x80;
                    dob = 2 * (255 - (((t >> 8) + t) >> 8));
                }

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
