public abstract class Functions
{
    public static double[] iForce(double p, double d, int w, int s, int b, boolean r, double a)
    {
        //p = target damage
        //d = attack damage
        //w = target weight
        //s = attack scaling
        //b = attack base
        //r = rage
        //a = angle
        double kbg = ((((((p/10)*(p*d/20))*(200/(w+100)))*1.5)*s/100)+b);
        if (r == true)
            kbg *= 1.1;
        a *= Math.PI / 180;
        double v = kbg * 0.03;
        double vX = kbg*Math.cos(a);
        vX = (double)(Math.round(vX * 10000) / 10000);
        double vY = kbg*Math.sin(a);
        vY = (double)(Math.round(vY * 10000) / 10000);
        double[] force = {vX, vY};
        return force;
    }
}
