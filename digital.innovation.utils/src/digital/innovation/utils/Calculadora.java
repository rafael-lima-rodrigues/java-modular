package digital.innovation.utils;


import digital.innovation.utils.internal.DivHelper;
import digital.innovation.utils.internal.MultiHelper;
import digital.innovation.utils.internal.SubHelper;
import digital.innovation.utils.internal.SumHelper;

public class Calculadora {

    private DivHelper divHelper;
    private MultiHelper multiHelper;
    private SubHelper subHelper;
    private SumHelper sumHelper;

    public Calculadora() {
        this.divHelper = new DivHelper();
        this.multiHelper = new MultiHelper();
        this.subHelper = new SubHelper();
        this.sumHelper = new SumHelper();
    }

    public int sum(int a, int b){
        return sumHelper.execute(a,b);
    }

    public int sub(int a, int b){
        return subHelper.execute(a,b);
    }

    public int divide(int a, int b){
        return divHelper.execute(a,b);
    }

    public int multi(int a, int b){
        return multiHelper.execute(a,b);
    }
}
