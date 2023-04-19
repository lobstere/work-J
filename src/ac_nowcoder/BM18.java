package ac_nowcoder;

public class BM18 {
    public static void main(String[] args) {
        int target=102721;
        int [][] array = {{241,348,801,822,1204,1438,1917,1954,2030,2253,2547,2723,3147,3259,3635,3963,4251,4440,4848,5195,5264,5410,5537,5844,6138,6604,6693,6876,7148,7307,7504,7788,7821,7990,8112,8447,8588,8988,9104,9532,9742,10148,10391,10828,11296,11699,12059,12245,12741,12754,13119,13178,13436,13798,14233,14510,14775,15049,15154,15192,15395,15803,15941,16388,16655,16676,16901,17220,17686,18077,18239,18666,18973,19323,19356,19464,19743,19933,20030,20183,20228,20515,20974,21429,21524,21896,22298,22447,22622,23109,23214,23701,24096,24434,24514,24834,25029,25303,25336,25747,26012,26455,26844,27226,27291,27566,27885,28343,28412,28625,28806,29107,29358,29637,29649,29970,30137,30253,30657,31069,31177,31576,31988,32146,32545,32715,32963,32971,33096,33530,33603,33721,34091,34449,34630,34886,35129,35211,35659,36136,36429,36734,36956,37137,37625,37905,37980,38138,38553,38563,38877,38984,39065,39501,39623,40118,40504,40782,40860,41168,41508,41833,42278,42757,43127,43206,43399,43450,43725,43884,44155,44457,44818,44894,45018,45072,45274,45572,45615,45720,45952,46031,46057,46258,46638,47024,47249,47420,47582,47884,48276,48766,48859,48936,49104,49494,49848,49989,50376,50691,50931,51005,51116,51484,51847,52177,52414,52480,52813,53254,53739,54067,54305,54426,54525,54714,54932},
                {390,404,1251,1525,1683,2039,2053,2139,2148,2315,2578,2821,3464,3618,4088,4483,4544,4690,5010,5256,5448,5768,5938,6383,6528,6720,6728,7118,7528,7602,7898,8017,8240,8261,8355,8584,8875,9361,9569,9829,9848,10501,10769,11059,11330,11862,12270,12753,12880,13040,13152,13530,13833,14056,14343,14843,14934,15150,15310,15496,15600,16147,16184,16498,17088,17504,17790,17913,18130,18470,18611,18832,19376,19818,19909,20363,20596,20927,21045,21283,21453,21781,21994,22130,22546,22615,22736,22760,23203,23523,23619,24084,24525,25017,25116,25122,25163,25523,25667,26063,26154,26858,27314,27585,27648,28132,28420,28648,28940,29094,29354,29490,29727,29903,29903,30408,30846,30993,31188,31225,31472,31765,32036,32599,32866,33200,33311,33556,33938,3}};
//        for(int i=0;i<array.length;i++){
//            for(int j=0;j<array.length;j++){
//                if(array[i][j]==target){
//                    System.out.println(array[i][j]);
//                }
//                System.out.println(array[i][j]);
//            }
//        }
        for (int i = 0; i < array.length; i++) {
            for(int j=0;j<array.length;j++){
                System.out.println(array[i][j]);
            }
        }
//        System.out.println(array.length);
        System.out.println(Find(target,array));
    }
    public static boolean Find(int target, int[][] array) {
        if(array == null || array.length < 1 || array[0].length < 1){
            return false;
        }
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array.length;j++){
                if(array[i][j]==target){
                    return true;
                }
            }
        }
        return false;
    }
}