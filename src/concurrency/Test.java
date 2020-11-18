package concurrency;

import java.util.*;

public class Test {




        public static int getPrizeIndex(List<Prize> prizes) {
            int random = -1;
            try{
                //计算总权重
                double sumWeight = 0;
                for(Prize p : prizes){
                    sumWeight += p.getPrize_weight();
                }

                //产生随机数
                double randomNumber = Math.random();


                //根据随机数在所有奖品分布的区域并确定所抽奖品
                double d1 = 0;
                double d2 = 0;
                for(int i=0;i<prizes.size();i++){
                    d2 += Double.parseDouble(String.valueOf(prizes.get(i).getPrize_weight()))/sumWeight;
                    if(i==0){
                        d1 = 0;
                    }else{
                        d1 +=Double.parseDouble(String.valueOf(prizes.get(i-1).getPrize_weight()))/sumWeight;
                    }
                    if(randomNumber >= d1 && randomNumber <= d2){
                   //     System.out.println("randomNumber:"+randomNumber+"~~~~~~~d1:"+d1+"~~~~~~~d2:"+d2);
                        random = i;
                        break;
                    }
                }
            }catch(Exception e){
                System.out.println("生成抽奖随机数出错，出错原因：" +e.getMessage());
            }
            return random;
        }

    public static void main(String[] agrs) {

        int s = 0;
        int[] result=new int[3];

        List<Prize> prizes = new ArrayList<Prize>();


        Prize p2 = new Prize();
        p2.setPrize_name("上海紫园1号别墅");
        p2.setPrize_weight(0);
        prizes.add(p2);

        Prize p3 = new Prize();
        p3.setPrize_name("奥迪a9");
        p3.setPrize_weight(5);
        prizes.add(p3);

        Prize p4 = new Prize();
        p4.setPrize_name("双色球彩票");
        p4.setPrize_weight(5);
        prizes.add(p4);

        System.out.println("抽奖开始");
        for (s = 0; s < 15; s++)
        {
            int selected=getPrizeIndex(prizes);
           /* System.out.println("第"+i+"次抽中的奖品为："+prizes.get(selected).getPrize_name());
            System.out.println(selected);*/
            result[selected]++;
         //   System.out.println("--------------------------------");


        }
        System.out.println("抽奖结束");
        System.out.println("每种奖品抽到的数量为：");
        System.out.println("一等奖："+result[0]);
        System.out.println("二等奖："+result[1]);
        System.out.println("三等奖："+result[2]);


     /*  String conf = "sms:2#call:4#auto:4";
        //解析分流规则
        List<String> pool = new ArrayList<>();
        String[] rules = conf.split("#");
        for (String r : rules) {
            String[] rule = r.split(":");
            for (int i=0;i<Integer.valueOf(rule[1]);i++) {
                pool.add(rule[0]);
            }
        }
        //分流
        int listsms = 0;
        int listcall = 0;
        int listauto = 0;

        for (int i = 0; i < 20; i++) {
            int index = (int) (Math.random() * (pool.size()));
         //   System.err.println("index="+index);
            if("sms".equals(pool.get(index))){
                listsms = listsms+1;
            }
            if("call".equals(pool.get(index))){
                listcall= listcall+1;
            }
            if("auto".equals(pool.get(index))){
                listauto= listauto+1;
            }
        }

        System.err.println("listsms="+listsms+",listcall="+listcall+", listauto="+listauto);


        // 重建一个Map，避免服务器的上下线导致的并发问题
        Map<String, Integer> serverMap = new HashMap<String, Integer>();

        serverMap.put("A",2);
        serverMap.put("B",4);
        serverMap.put("C",4);

        int sms = 0;
        int call = 0;
        int auto = 0;

        for (int i = 0; i < 20; i++) {
            // 取得Ip地址List
            String ll=getList(serverMap);


            if("A".equals(ll)){
                sms = sms+1;
            }
            if("B".equals(ll)){
                call= call+1;
            }
            if("C".equals(ll)){
                auto= auto+1;
            }
        }
        System.err.println("sms="+sms+",call="+call+", auto="+auto);*/
    }

    private static String  getList(Map<String, Integer> serverMap) {
        Set<String> keySet = serverMap.keySet();
        Iterator<String> iterator = keySet.iterator();
        List<String> serverList = new ArrayList<String>();
        while (iterator.hasNext()){
            String server = iterator.next();
            int weight = serverMap.get(server);
            for (int i = 0; i < weight; i++){
                serverList.add(server);
            }

        }
        Random random = new Random();
        int randomPos = random.nextInt(serverList.size());

       // System.err.println("randomPos="+randomPos);

       return serverList.get(randomPos);
    }


}
