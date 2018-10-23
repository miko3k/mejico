package org.deletethis.iconized;

import org.junit.Assert;
import org.junit.Test;

public class ArrayImageTests {
    @Test
    public void factory() {
        Image image = ArrayImage.FACTORY.createImage(1, 2);
        Assert.assertEquals(1, image.getWidth());
        Assert.assertEquals(2, image.getHeight());
    }

    @Test(expected = IllegalArgumentException.class)
    public void outside1() { new ArrayImage(1,1).setARGB(-1, 0, 0); }
    @Test(expected = IllegalArgumentException.class)
    public void outside2() { new ArrayImage(1,1).setARGB(0, -1, 0); }
    @Test(expected = IllegalArgumentException.class)
    public void outside3() { new ArrayImage(1,1).setARGB(1, 0, 0); }
    @Test(expected = IllegalArgumentException.class)
    public void outside4() { new ArrayImage(1,1).setARGB(0, 1, 0); }
    @Test(expected = IllegalArgumentException.class)
    public void outside5() { new ArrayImage(1,1).getARGB(-1, 0); }
    @Test(expected = IllegalArgumentException.class)
    public void outside6() { new ArrayImage(1,1).getARGB(0, -1); }
    @Test(expected = IllegalArgumentException.class)
    public void outside7() { new ArrayImage(1,1).getARGB(1, 0); }
    @Test(expected = IllegalArgumentException.class)
    public void outside8() { new ArrayImage(1,1).getARGB(0, 1); }

    @Test
    public void tests() {
        ArrayImage pixmap = new ArrayImage(4,4);

        Assert.assertEquals(pixmap, new ArrayImage(4, 4));
        Assert.assertNotEquals(pixmap, new ArrayImage(5, 4));
        Assert.assertEquals(pixmap.hashCode(), new ArrayImage(4, 4).hashCode());

        Assert.assertEquals(0, pixmap.getData()[0]);
        Assert.assertEquals("ArrayImage(4x4)", pixmap.toString());
        pixmap.setARGB(0,0,1);

        Assert.assertEquals(1, pixmap.getARGB(0, 0));
        pixmap.setARGB(0,0,0);
        Assert.assertEquals(0, pixmap.getARGB(0, 0));

    }

}
