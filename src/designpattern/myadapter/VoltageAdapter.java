package designpattern.myadapter;

/**
 * 适配器
 */
public class VoltageAdapter  extends Voltage220 implements Voltage5{

    @Override
    public int output5v() {
        int src = output220V();
        System.out.println("适配器工作开始适配电压");
        int dst = src / 44;
        System.out.println("适配完成后输出电压：" + dst);
        return dst;
    }
}
