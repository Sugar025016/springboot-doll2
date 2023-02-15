//package com.xxxx.springsecuritydemo;
//
//import com.mysql.cj.x.protobuf.MysqlxCrud;
//import org.apache.logging.log4j.util.Chars;
//import org.junit.jupiter.api.Test;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.data.redis.core.RedisTemplate;
//
//import javax.persistence.criteria.CriteriaBuilder;
//import java.io.FileInputStream;
//import java.io.FileNotFoundException;
//import java.io.IOException;
//import java.util.*;
//import java.util.stream.Collectors;
//import java.util.stream.Stream;
//
//@SpringBootTest
//class SpringSecurityDemoApplicationTests {
//
//    @Test
//    void contextLoads() {
//
//        RedisTemplate redisTemplate = new RedisTemplate();
//
//
//    }
//
//    @Test
//    public void threeSum() {
//        int[] nums = {-1, 0, 1, 2, -1, -4};
//        List<List<Integer>> arrayLists = new ArrayList<List<Integer>>();
//
//        for (int i = 0; i < nums.length; i++) {
//            for (int j = i + 1; j < nums.length; j++) {
//                for (int k = j + 1; k < nums.length; k++) {
//                    if (nums[i] + nums[j] + nums[k] == 0) {
//                        ArrayList<Integer> integers = new ArrayList<>();
//                        integers.add(nums[i]);
//                        integers.add(nums[j]);
//                        integers.add(nums[k]);
//                        arrayLists.add(integers);
//                    }
//                }
//            }
//        }
//        System.out.println(arrayLists);
//    }
//
//    @Test
//    public void isMatch() {
////        String s = "aabcbcbcaccbcaabc";
////        String p = ".*a*aa*.*b*.c*.*a*";//true
////        boolean sp=true;
//
////        String s = "aa";
////        String p = ".c*";
////        boolean sp=false;
//
////        String s = "a";
////        String p = "ab*";
////        boolean sp=true;
//
////        String s = "bbab";
////        String p = "b*a*";
////        boolean sp=false;
//
//
////        String s = "cbaacacaaccbaabcb";
////
//////        String s = "cbaacacaaccbaabcb";
////        String p = "c*b*b*.*ac*.*bc*a*";
////        boolean sp = true;
//
//
////        String s = "aab";
////        String p = "c*a*b";
////        boolean sp=true;
//
////        String s = "aaa";
////        String p = "ab*ac*a";
////        boolean sp=true;
//
//        String s = "a";
//        String p = ".*..a*";
//        boolean sp = false;
//
//        boolean ans = true;
//        s = s + "+";
//        char[] Schars = s.toCharArray();
//        char[] Pchars = p.toCharArray();
//        int j = 0;
//        List<String> regular = new ArrayList<>();
//        for (int i = 0; i < Pchars.length; i++) {
//            switch (Pchars[i]) {
//                case '.':
//
////                    System.out.println("i:" + i);
////                    System.out.println("Pchars:" + Arrays.toString(Pchars));
//                    if (i < Pchars.length - 1 && Pchars[i + 1] == '*') {
//
////                        System.out.println("------------i:" + i);
//                        regular.add(String.valueOf(Pchars[i]) + Pchars[i + 1]);
////                        System.out.println(regular);
//                        i++;
//                    } else {
//                        regular.add(String.valueOf(Pchars[i]));
//                    }
//                    break;
//
////                case '*':
////                    System.out.println("i:" + i);
////                    System.out.println("Pchars:" + Arrays.toString(Pchars));
////                    strings.add(String.valueOf(Pchars[i]) );
////                    System.out.println(strings);
////                    break;
//
//                default:
////                    System.out.println("i:" + i);
////                    System.out.println("Pchars:" + Arrays.toString(Pchars));
//                    if (i < Pchars.length - 1 && Pchars[i + 1] == '*') {
//
////                        System.out.println("------------i:" + i);
//                        regular.add(String.valueOf(Pchars[i]) + Pchars[i + 1]);
////                        System.out.println(regular);
//                        i++;
//                    } else {
//                        regular.add(String.valueOf(Pchars[i]));
//                    }
//                    break;
//            }
//        }
//        List<String> strings = new ArrayList<String>();
//        for (char schar : Schars) {
//            strings.add(String.valueOf(schar));
//        }
//        System.out.println("ssssssssssss:" + s);
//        System.out.println("regularregularregularregularregular:" + regular);
//        boolean b = find(regular, Schars, 0, 0);
////        boolean b = findA(regular, 0, s, 0);
//        System.out.println("bbbbbbbbbbbbbbbbbbbbbbbb:" + b);
//        System.out.println("sp:" + sp);
//
//    }
//
//
//    int aa = 0;
//    int bb = 0;
//    boolean max = false;
//
//    boolean n = true;
//
//    public boolean find(List regular, char[] Schars, int regularI, int ScharsI) {
////        aa=regularI;
//        if (ScharsI == 16) {
//            aa = 0;
//        }
//        if (aa < ScharsI) {
//            aa = ScharsI;
//
//            System.out.println("-----------------------------------------");
//        }
//        if (ScharsI < Schars.length) {
//
//            System.out.println(ScharsI + "--Schars:" + Schars[ScharsI]);
//        } else {
//
//
//            System.out.println(ScharsI + "Schars:");
//        }
//        if (regularI < regular.size()) {
//
//            System.out.println(regularI + "regular:" + regular.get(regularI));
//        } else {
//
//            System.out.println(regularI + "regular:");
//        }
//
//        switch (regular.get(regularI).toString()) {
//            case ".*":
//                n = true;
//                if (regularI == regular.size() - 1) {
//                    return true;
//                } else {
//                    for (int i = ScharsI; i < Schars.length; i++) {
//                        if (find(regular, Schars, regularI + 1, i)) {
//                            return true;
//                        }
//                    }
//                }
//
//                break;
//            case ".":
//                n = false;
//                if (regularI == regular.size() - 1) {
//                    if (ScharsI == Schars.length - 2) {
////                        System.out.println("***********|.|***********true********************");
//                        return true;
//                    } else {
//                        return false;
//                    }
//
//                } else {
//                    if (ScharsI < Schars.length - 1) {
//
//                        return find(regular, Schars, regularI + 1, ScharsI + 1);
//                    } else {
//                        return false;
//                    }
//                }
//
//            default:
//                char[] chars = regular.get(regularI).toString().toCharArray();
//
//                if (chars.length == 2) {
//                    if (regularI == regular.size() - 1) {
//                        if (ScharsI == Schars.length - 1) {
//                            return true;
//                        } else {
//                            for (int i = ScharsI; i < Schars.length - 1; i++) {
//                                if (chars[0] != Schars[i]) {
//                                    return false;
//                                }
//                            }
//                            return true;
//                        }
//                    } else {
//                        for (int i = ScharsI; i < Schars.length; i++) {
//                            if (chars[0] == Schars[i]) {
//                                if (find(regular, Schars, regularI + 1, i)) {
//
//                                    return true;
//                                }
//                            } else {
//                                return find(regular, Schars, regularI + 1, i);
//                            }
//
//                        }
//                        return false;
//                    }
//
//                } else {
//                    n = false;
//                    if (regularI == regular.size() - 1) {
//
////                        System.out.println("---------------////////--------------" + regular.get(regularI));
//                        if (ScharsI == Schars.length - 2 && chars[0] == Schars[ScharsI]) {
////                            System.out.println("*******|a|***************true********************");
//                            return true;
//                        } else {
//                            return false;
//                        }
//
//                    } else if (ScharsI < Schars.length) {
//                        if (chars[0] == Schars[ScharsI]) {
//                            return find(regular, Schars, regularI + 1, ScharsI + 1);
//                        } else {
//                            return false;
//                        }
//                    } else {
//                        return false;
//                    }
//                }
//
//        }
//
//        return false;
//    }
//
//
//    @Test
//    public void lengthOfLIS5() {
//
////        int[] nums= {7,4,5,1,8,12,4,7};
////        int k=5;
////        int ans=4;
//
////        int[] nums = {4, 2, 1, 4, 3, 4, 5, 8, 15};
////        int k = 3;
////        int ans = 5;
//
////        int[] nums = {1};
////        int k = 1;
////        int ans = 1;
//
////        int[] nums = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50,51,52,53};
////        int k = 1;
////        int ans = 0;
//
////        int[] nums = {2,1,2,3};
////        int k = 3;
////        int ans = 3;
//
//        int[] nums = {1709, 5955, 4331, 1386, 9131, 385, 814, 573, 569, 7114, 8628, 2545, 7082, 6467, 6980, 3368, 3331, 7256, 4243, 2461, 7306, 5998, 6703, 5357, 6676, 8857, 2978, 3217, 2762, 5304, 3473, 2589, 704, 2662, 5183, 1874, 6282, 5685, 152, 6947, 2439, 5215, 8070, 4244, 6364, 1149, 3257, 1123, 7928, 1465, 673, 2797, 3996, 7253, 1705, 2163, 3267, 6465, 4906, 578, 7135, 4879, 8774, 2690, 4474, 1742, 4218, 2988, 6241, 7527, 1779, 2280, 9011, 9431, 2175, 6750, 1263, 3969, 6770, 6155, 8371, 722, 8156, 793, 9550, 5425, 2478, 4687, 9359, 5552, 9590, 3111, 7081, 1091, 883, 2682, 4582, 7592, 2777, 85, 1096, 513, 6998, 1818, 1920, 7762, 2331, 8093, 2563, 5361, 4210, 6563, 7112, 1061, 6542, 7234, 3683, 7429, 8583, 4111, 9184, 5794, 780, 8414, 1522, 5113, 2618, 7798, 4432, 7951, 4507, 9723, 7754, 7513, 574, 4627, 7271, 8511, 2739, 6258, 9089, 6803, 8692, 13, 4147, 3356, 2539, 7321, 6301, 3693, 2944, 2658, 3396, 639, 2758, 3833, 4531, 4658, 7831, 3935, 143, 5533, 1268, 498, 8636, 827, 5569, 5564, 5277, 9273, 7890, 6382, 1635, 8877, 1567, 1977, 9458, 1495, 4529, 8306, 8556, 881, 1994, 3961, 1370, 2616, 9684, 5480, 8656, 5829, 8563, 9197, 8046, 6478, 1965, 1885, 4613, 6457, 8696, 4669, 5301, 8709, 1656, 8820, 8254, 89, 4300, 5670, 3300, 2806, 2761, 9249, 8658, 3023, 2584, 5111, 9006, 7636, 1888, 7519, 40, 5987, 3397, 9960, 3875, 8185, 4727, 4059, 4720, 1602, 9853, 8774, 7854, 6547, 2601, 5544, 5308, 9454, 2954, 1243, 233, 9280, 2441, 2189, 4559, 8594, 5887, 7612, 5982, 3264, 9343, 9380, 9488, 7587, 4851, 6498, 4020, 8047, 5122, 168, 3924, 8957, 6410, 5542, 6650, 3342, 9695, 7693, 6370, 9675, 9314, 3310, 3338, 3004, 6649, 3821, 6112, 719, 5455, 5249, 4969, 5267, 6934, 1249, 2726, 1028, 2029, 6048, 9267, 9189, 8457, 1872, 7290, 4169, 7733, 344, 7145, 4275, 8852, 3560, 9930, 6386, 9271, 1504, 1157, 7657, 2982, 3328, 7143, 2607, 7025, 4683, 2293, 9759, 115, 7200, 3826, 299, 3562, 8695, 7361, 9496, 3810, 1030, 3879, 1882, 776, 691, 2300, 7219, 5195, 609, 3421, 7977, 9909, 4573, 1818, 8651, 4074, 892, 409, 2836, 1844, 9706, 7262, 1827, 5845, 8796, 3926, 1687, 108, 7345, 1565, 3100, 1732, 4404, 3027, 2586, 2783, 9981, 8880, 1326, 1751, 4370, 4929, 9223, 5269, 2215, 7795, 8735, 699, 6151, 2764, 834, 8201, 3990, 5897, 9623, 2563, 4775, 2685, 3292, 4724, 3553, 2246, 1889, 7694, 9593, 428, 5220, 9895, 4618, 7861, 6508, 3521, 5291, 3487, 8736, 2309, 7250, 7621, 4879, 7998, 5167, 6548, 360, 4336, 6534, 2180, 6600, 2006, 2002, 8783, 7714, 5322, 5003, 1859, 3237, 5491, 4346, 6179, 7911, 5800, 3784, 8763, 1321, 1864, 125, 7399, 2192, 71, 2984, 7490, 1831, 3853, 8010, 9291, 2674, 1335, 2809, 859, 4822, 4418, 290, 1662, 2227, 8190, 9145, 6890, 9623, 5745, 9739, 5066, 5004, 3749, 8703, 5165, 6412, 8687, 698, 559, 4671, 5020, 2934, 6239, 4632, 6223, 7776, 3850, 2613, 8056, 8879, 9599, 8758, 4429, 9475, 3305, 4720, 9135, 3345, 618, 8328, 4655, 5507, 9108, 4836, 528, 732, 5811, 3330, 1781, 3940, 2471, 7953, 8057, 5039, 3987, 8459, 9053, 5273, 8710, 2990, 6411, 1299, 5101, 6741, 3701, 6241, 6960, 7690, 7078, 8873, 5222, 4117, 2355, 5376, 7386, 7626, 9742, 7849, 3212, 4201, 4192, 4496, 5641, 4354, 3222, 2767, 8015, 5933, 2535, 6314, 2968, 5328, 3328, 4551, 1510, 1054, 9586, 502, 1616, 7586, 219, 8212, 7361, 1213, 7708, 3785, 142, 1852, 1176, 7009, 2472, 1259, 6415, 3531, 512, 5293, 7410, 5368, 8448, 5245, 3482, 3004, 6085, 2293, 883, 5648, 4233, 2845, 8019, 1706, 5051, 7240, 903, 9722, 3702, 791, 5979, 3820, 5855, 4475, 4850, 5433, 8568, 5354, 7212, 9979, 5023, 4076, 9308, 201, 1772, 5291, 6206, 7432, 9820, 8893, 2510, 9332, 6778, 4706, 1192, 3346, 8837, 2237, 8965, 5940, 9336, 3186, 591, 5099, 993, 6105, 3037, 4955, 6395, 4755, 4816, 2599, 5798, 2123, 8785, 8298, 3750, 2632, 1240, 209, 2672, 8295, 8016, 9865, 2453, 7076, 2875, 9982, 7573, 3498, 3709, 6598, 4059, 7489, 1702, 5511, 2605, 3355, 1622, 3548, 5635, 7258, 7866, 7358, 7284, 2586, 5604, 2461, 4347, 6439, 5101, 451, 4375, 7160, 2806, 1944, 9322, 9967, 6053, 1413, 5597, 4336, 9562, 2387, 7114, 931, 3981, 7488, 4619, 5988, 4902, 3259, 8895, 5889, 8229, 4732, 2369, 123, 8119, 5870, 185, 5858, 434, 9181, 933, 6941, 3484, 4246, 4170, 8620, 2610, 399, 5750, 9419, 9801, 3381, 7466, 7495, 3730, 5713, 3887, 9723, 4226, 9477, 160, 8153, 9747, 700, 1373, 3184, 2141, 8854, 8599, 8920, 9550, 6360, 6622, 7157, 2677, 7148, 5528, 665, 1836, 5313, 5653, 3477, 4521, 3102, 9813, 1597, 6509, 3979, 685, 8367, 4483, 1236, 3075, 2944, 6076, 3400, 3368, 7184, 1086, 1416, 7410, 3150, 6043, 6726, 3854, 9495, 7765, 5530, 8894, 4235, 6914, 6378, 9879, 4655, 4191, 184, 2221, 7460, 3567, 2809, 9145, 9918, 1565, 1068, 3362, 4474, 5501, 5231, 1151, 2249, 337, 7918, 363, 309, 3998, 8907, 2247, 5078, 6130, 7571, 8437, 7036, 3586, 2378, 3414, 7447, 7338, 1103, 5915, 1530, 4510, 7847, 94, 1458, 2608, 8634, 828, 5813, 1461, 6408, 5272, 9431, 8230, 7408, 8369, 3620, 1511, 1066, 6220, 8451, 3536, 2739, 2169, 7295, 114, 2020, 1688, 9631, 1384, 70, 9373, 1277, 1099, 1334, 3979, 9482, 8004, 9413, 8595, 5441, 157, 2123, 7037, 8455, 2973, 5486, 2989, 790, 3746, 8505, 8178, 5493, 6266, 8632, 258, 9282, 7766, 9282, 3826, 6174, 5845, 819, 8982, 2560, 2716, 8583, 9494, 597, 6149, 745, 2670, 946, 1339, 5315, 7785, 7334, 3147, 5740, 1431, 5212, 9333, 8424, 8020, 1096, 828, 3546, 3900, 9342, 5223, 439, 4698, 1814, 9027, 4537, 2190, 3007, 7464, 2153, 4515, 5433, 6868, 9113, 9982, 6157, 8578, 317, 7545, 1504, 9082, 3327, 2545, 6741, 8455, 8287, 3298, 3330, 8696, 6863, 1107, 6603, 7846, 5435, 1933, 9184, 8073, 6056, 2258, 5200, 7035, 4473, 1296, 4732, 7882, 8095, 7012, 6407, 7511, 7016, 4385, 9683, 6084, 8443, 1460, 4809, 7599, 6950, 3279, 3599, 2186, 7987, 5128, 9377, 212, 8133, 3337, 9763, 3874, 4111, 7879, 2353, 1182, 5281, 6449, 8515, 3890, 1766, 222, 7680, 9438, 7058, 7134, 8373, 8713, 9019, 8364, 6439, 4316, 9482, 5898, 8008, 5733, 2079, 7674, 6680, 2061, 5657, 9472, 2467, 8418, 1982, 762, 4764, 5201, 8125, 4306, 6754, 7836, 3121};
////        int[] nums = {1709,5955,4331,1386,9131,385,814,573,569,7114,8628,2545,7082,6467,6980,3368,3331,7256,4243,2461,7306,5998,6703,5357,6676,8857,2978,3217,2762};
//        int k = 4331;
//        int ans = 63;
//
////        int[] nums = {1,3,3,4};
////        int k = 1;
////        int ans = 2;
//
////                int[] nums = {4,4,4,3,4};
////        int k = 3;
////        int ans = 2;
//
////        int[] nums = {14,20,3,10,14,20,9};
////        int k = 6;
////        int ans = 3;
////        int[] nums = {1,100000};
////        int k = 100000;
////        int ans = 2;
////        if (nums.length == 1) {
////            System.out.println("asInt:" + 1);
////        }
//
//        List<List<Integer>> integerList = new ArrayList<>();
//        HashSet<Integer> use = new HashSet<>();
//        int max = 0;
//        for (int i = 0; i < nums.length - max; i++) {
//            int num = nums[i];
//            if (use.stream().anyMatch(v -> v == num)) {
//                continue;
//            }
//            System.out.println("/////////////////////////////////////////////");
//            for (int j = i + 1; j < nums.length - (max > 0 ? max - 1 : 0); j++) {
////                System.out.println("**********************************************************" );
//                List<Integer> integers = new ArrayList<>();
//                integers.add(nums[i]);
////                System.out.println("**********************************************************" );
//
//                for (int m = j; m < nums.length - (max - integerList.size() > 0 ? max - integerList.size() : 0); m++) {
//                    int i1 = nums[m] - integers.get(integers.size() - 1);
//                    if (i1 <= k && i1 > 0) {
//                        integers.add(nums[m]);
//                        use.add(nums[m]);
//                    }
//                }
//                System.out.println("integers:" + integers);
//
//                integerList.add(integers);
//                max = integerList.stream().mapToInt(v -> v.size()).max().getAsInt();
////
//            }
//        }
//        int asInt = integerList.stream().mapToInt(i -> i.size()).max().getAsInt();
//        List<List<Integer>> collect = integerList.stream().filter(v -> v.size() == asInt).collect(Collectors.toList());
//
//        for (List<Integer> integers : collect) {
//
//            System.out.println("integers:" + integers);
//        }
//        System.out.println("nums:" + Arrays.stream(nums).toArray());
//        System.out.println("integerList.size:" + integerList.size());
//        System.out.println("k:" + k);
//        System.out.println("ans:" + ans);
//        System.out.println("asInt:" + asInt);
//    }
//
//
////    @Test
////    public void lengthOfLIS6() {
////
//////        int[] nums= {7,4,5,1,8,12,4,7};
//////        int k=5;
//////        int ans=4;
////
//////        int[] nums = {4, 2, 1, 4, 3, 4, 5, 8, 15};
//////        int k = 3;
//////        int ans = 5;
////
//////        int[] nums = {1};
//////        int k = 1;
//////        int ans = 1;
////
//////        int[] nums = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50,51,52,53};
//////        int k = 1;
//////        int ans = 0;
////
//////        int[] nums = {2,1,2,3};
//////        int k = 3;
//////        int ans = 3;
////
////        int[] nums = {1709, 5955, 4331, 1386, 9131, 385, 814, 573, 569, 7114, 8628, 2545, 7082, 6467, 6980, 3368, 3331, 7256, 4243, 2461, 7306, 5998, 6703, 5357, 6676, 8857, 2978, 3217, 2762, 5304, 3473, 2589, 704, 2662, 5183, 1874, 6282, 5685, 152, 6947, 2439, 5215, 8070, 4244, 6364, 1149, 3257, 1123, 7928, 1465, 673, 2797, 3996, 7253, 1705, 2163, 3267, 6465, 4906, 578, 7135, 4879, 8774, 2690, 4474, 1742, 4218, 2988, 6241, 7527, 1779, 2280, 9011, 9431, 2175, 6750, 1263, 3969, 6770, 6155, 8371, 722, 8156, 793, 9550, 5425, 2478, 4687, 9359, 5552, 9590, 3111, 7081, 1091, 883, 2682, 4582, 7592, 2777, 85, 1096, 513, 6998, 1818, 1920, 7762, 2331, 8093, 2563, 5361, 4210, 6563, 7112, 1061, 6542, 7234, 3683, 7429, 8583, 4111, 9184, 5794, 780, 8414, 1522, 5113, 2618, 7798, 4432, 7951, 4507, 9723, 7754, 7513, 574, 4627, 7271, 8511, 2739, 6258, 9089, 6803, 8692, 13, 4147, 3356, 2539, 7321, 6301, 3693, 2944, 2658, 3396, 639, 2758, 3833, 4531, 4658, 7831, 3935, 143, 5533, 1268, 498, 8636, 827, 5569, 5564, 5277, 9273, 7890, 6382, 1635, 8877, 1567, 1977, 9458, 1495, 4529, 8306, 8556, 881, 1994, 3961, 1370, 2616, 9684, 5480, 8656, 5829, 8563, 9197, 8046, 6478, 1965, 1885, 4613, 6457, 8696, 4669, 5301, 8709, 1656, 8820, 8254, 89, 4300, 5670, 3300, 2806, 2761, 9249, 8658, 3023, 2584, 5111, 9006, 7636, 1888, 7519, 40, 5987, 3397, 9960, 3875, 8185, 4727, 4059, 4720, 1602, 9853, 8774, 7854, 6547, 2601, 5544, 5308, 9454, 2954, 1243, 233, 9280, 2441, 2189, 4559, 8594, 5887, 7612, 5982, 3264, 9343, 9380, 9488, 7587, 4851, 6498, 4020, 8047, 5122, 168, 3924, 8957, 6410, 5542, 6650, 3342, 9695, 7693, 6370, 9675, 9314, 3310, 3338, 3004, 6649, 3821, 6112, 719, 5455, 5249, 4969, 5267, 6934, 1249, 2726, 1028, 2029, 6048, 9267, 9189, 8457, 1872, 7290, 4169, 7733, 344, 7145, 4275, 8852, 3560, 9930, 6386, 9271, 1504, 1157, 7657, 2982, 3328, 7143, 2607, 7025, 4683, 2293, 9759, 115, 7200, 3826, 299, 3562, 8695, 7361, 9496, 3810, 1030, 3879, 1882, 776, 691, 2300, 7219, 5195, 609, 3421, 7977, 9909, 4573, 1818, 8651, 4074, 892, 409, 2836, 1844, 9706, 7262, 1827, 5845, 8796, 3926, 1687, 108, 7345, 1565, 3100, 1732, 4404, 3027, 2586, 2783, 9981, 8880, 1326, 1751, 4370, 4929, 9223, 5269, 2215, 7795, 8735, 699, 6151, 2764, 834, 8201, 3990, 5897, 9623, 2563, 4775, 2685, 3292, 4724, 3553, 2246, 1889, 7694, 9593, 428, 5220, 9895, 4618, 7861, 6508, 3521, 5291, 3487, 8736, 2309, 7250, 7621, 4879, 7998, 5167, 6548, 360, 4336, 6534, 2180, 6600, 2006, 2002, 8783, 7714, 5322, 5003, 1859, 3237, 5491, 4346, 6179, 7911, 5800, 3784, 8763, 1321, 1864, 125, 7399, 2192, 71, 2984, 7490, 1831, 3853, 8010, 9291, 2674, 1335, 2809, 859, 4822, 4418, 290, 1662, 2227, 8190, 9145, 6890, 9623, 5745, 9739, 5066, 5004, 3749, 8703, 5165, 6412, 8687, 698, 559, 4671, 5020, 2934, 6239, 4632, 6223, 7776, 3850, 2613, 8056, 8879, 9599, 8758, 4429, 9475, 3305, 4720, 9135, 3345, 618, 8328, 4655, 5507, 9108, 4836, 528, 732, 5811, 3330, 1781, 3940, 2471, 7953, 8057, 5039, 3987, 8459, 9053, 5273, 8710, 2990, 6411, 1299, 5101, 6741, 3701, 6241, 6960, 7690, 7078, 8873, 5222, 4117, 2355, 5376, 7386, 7626, 9742, 7849, 3212, 4201, 4192, 4496, 5641, 4354, 3222, 2767, 8015, 5933, 2535, 6314, 2968, 5328, 3328, 4551, 1510, 1054, 9586, 502, 1616, 7586, 219, 8212, 7361, 1213, 7708, 3785, 142, 1852, 1176, 7009, 2472, 1259, 6415, 3531, 512, 5293, 7410, 5368, 8448, 5245, 3482, 3004, 6085, 2293, 883, 5648, 4233, 2845, 8019, 1706, 5051, 7240, 903, 9722, 3702, 791, 5979, 3820, 5855, 4475, 4850, 5433, 8568, 5354, 7212, 9979, 5023, 4076, 9308, 201, 1772, 5291, 6206, 7432, 9820, 8893, 2510, 9332, 6778, 4706, 1192, 3346, 8837, 2237, 8965, 5940, 9336, 3186, 591, 5099, 993, 6105, 3037, 4955, 6395, 4755, 4816, 2599, 5798, 2123, 8785, 8298, 3750, 2632, 1240, 209, 2672, 8295, 8016, 9865, 2453, 7076, 2875, 9982, 7573, 3498, 3709, 6598, 4059, 7489, 1702, 5511, 2605, 3355, 1622, 3548, 5635, 7258, 7866, 7358, 7284, 2586, 5604, 2461, 4347, 6439, 5101, 451, 4375, 7160, 2806, 1944, 9322, 9967, 6053, 1413, 5597, 4336, 9562, 2387, 7114, 931, 3981, 7488, 4619, 5988, 4902, 3259, 8895, 5889, 8229, 4732, 2369, 123, 8119, 5870, 185, 5858, 434, 9181, 933, 6941, 3484, 4246, 4170, 8620, 2610, 399, 5750, 9419, 9801, 3381, 7466, 7495, 3730, 5713, 3887, 9723, 4226, 9477, 160, 8153, 9747, 700, 1373, 3184, 2141, 8854, 8599, 8920, 9550, 6360, 6622, 7157, 2677, 7148, 5528, 665, 1836, 5313, 5653, 3477, 4521, 3102, 9813, 1597, 6509, 3979, 685, 8367, 4483, 1236, 3075, 2944, 6076, 3400, 3368, 7184, 1086, 1416, 7410, 3150, 6043, 6726, 3854, 9495, 7765, 5530, 8894, 4235, 6914, 6378, 9879, 4655, 4191, 184, 2221, 7460, 3567, 2809, 9145, 9918, 1565, 1068, 3362, 4474, 5501, 5231, 1151, 2249, 337, 7918, 363, 309, 3998, 8907, 2247, 5078, 6130, 7571, 8437, 7036, 3586, 2378, 3414, 7447, 7338, 1103, 5915, 1530, 4510, 7847, 94, 1458, 2608, 8634, 828, 5813, 1461, 6408, 5272, 9431, 8230, 7408, 8369, 3620, 1511, 1066, 6220, 8451, 3536, 2739, 2169, 7295, 114, 2020, 1688, 9631, 1384, 70, 9373, 1277, 1099, 1334, 3979, 9482, 8004, 9413, 8595, 5441, 157, 2123, 7037, 8455, 2973, 5486, 2989, 790, 3746, 8505, 8178, 5493, 6266, 8632, 258, 9282, 7766, 9282, 3826, 6174, 5845, 819, 8982, 2560, 2716, 8583, 9494, 597, 6149, 745, 2670, 946, 1339, 5315, 7785, 7334, 3147, 5740, 1431, 5212, 9333, 8424, 8020, 1096, 828, 3546, 3900, 9342, 5223, 439, 4698, 1814, 9027, 4537, 2190, 3007, 7464, 2153, 4515, 5433, 6868, 9113, 9982, 6157, 8578, 317, 7545, 1504, 9082, 3327, 2545, 6741, 8455, 8287, 3298, 3330, 8696, 6863, 1107, 6603, 7846, 5435, 1933, 9184, 8073, 6056, 2258, 5200, 7035, 4473, 1296, 4732, 7882, 8095, 7012, 6407, 7511, 7016, 4385, 9683, 6084, 8443, 1460, 4809, 7599, 6950, 3279, 3599, 2186, 7987, 5128, 9377, 212, 8133, 3337, 9763, 3874, 4111, 7879, 2353, 1182, 5281, 6449, 8515, 3890, 1766, 222, 7680, 9438, 7058, 7134, 8373, 8713, 9019, 8364, 6439, 4316, 9482, 5898, 8008, 5733, 2079, 7674, 6680, 2061, 5657, 9472, 2467, 8418, 1982, 762, 4764, 5201, 8125, 4306, 6754, 7836, 3121};
//////        int[] nums = {1709, 5955, 4331, 1386, 9131, 385, 814, 573, 569, 7114, 8628, 2545, 7082, 6467, 6980, 3368, 3331, 7256, 4243, 2461, 7306, 5998, 6703, 5357, 6676, 8857, 2978, 3217, 2762, 5304, 3473, 2589, 704, 2662, 5183, 1874, 6282, 5685, 152, 6947, 2439, 5215, 8070, 4244, 6364, 1149, 3257, 1123, 7928, 1465, 673, 2797, 3996, 7253, 1705, 2163, 3267, 6465, 4906, 578, 7135, 4879, 8774, 2690, 4474, 1742, 4218, 2988, 6241, 7527, 1779, 2280, 9011, 9431, 2175, 6750, 1263, 3969, 6770, 6155, 8371, 722, 8156, 793, 9550, 5425, 2478, 4687, 9359, 5552, 9590, 3111, 7081, 1091, 883, 2682, 4582, 7592, 2777, 85, 1096, 513, 6998, 1818, 1920, 7762, 2331, 8093, 2563, 5361, 4210, 6563, 7112};
//////        int[] nums = {1709,5955,4331,1386,7114,9131,385,814,573,569,7114,8628,2545,7082,6467,6980,3368,3331,7256,4243,2461,7306,5998,6703,5357,6676,8857,2978,3217,2762};
//////        int[] nums = {1709,5955,4331,1386};
////        int k = 4331;
////
////        int ans = 63;
////
//////        int[] nums = {1,3,3,4};
//////        int k = 1;
//////        int ans = 2;
////
//////                int[] nums = {4,4,4,3,4};
//////        int k = 3;
//////        int ans = 2;
////
//////        int[] nums = {14,20,3,10,14,20,9};
//////        int k = 6;
//////        int ans = 3;
//////        int[] nums = {1,100000};
//////        int k = 100000;
//////        int ans = 2;
//////        if (nums.length == 1) {
//////            System.out.println("asInt:" + 1);
//////        }
////        System.out.println("k :" + k);
////        List<Integer> integerList = new ArrayList<>();
////        integerList.addAll(Arrays.stream(nums).boxed().collect(Collectors.toList()));
//////        List<Integer> círculo = Círculo(integerList, k);
////
////        List<Integer> ansList = new ArrayList<>();
//////        List<Integer> círculo = Círculo2(integerList, k,ansList);
////        List<Integer> círculo = new ArrayList<>();
////        List<Integer> círculo2 = new ArrayList<>();
////        int aa = 0;
////        for (int i = 0; i < integerList.size() - aa; i++) {
////            círculo2 = Círculo3(integerList.subList(i, integerList.size()), k, ansList, 1);
////            int i1 = círculo == null ? 0 : círculo.size();
////            int x = círculo2 != null ? círculo2.size() : 0;
//////            System.out.println("XXXXXXXXXXXXXXXX"+x);
//////            System.out.println("%%%%%%%%%%%%%%%:"+i1);
////            if (x > i1) {
////                círculo = círculo2;
////                aa = círculo.size();
////                System.out.println("&&&&&&&&&&&&" + círculo2);
////            }
////        }
////        Arrays.stream(nums).forEach(v -> System.out.print(v + ","));
////        System.out.println();
////        System.out.println("integerList:" + integerList);
////        System.out.println("sum:" + sum);
////        System.out.println("nums:" + nums.length);
////        System.out.println("círculo:" + círculo);
////        System.out.println("k:" + k);
////        System.out.println("ans:" + ans);
////        System.out.println("asInt:" + círculo.size());
////    }
//
//
//    //    List<Integer> Círculo(List<Integer> integers,int k){
////        sum++;
////
////        int asInt =1;
////                System.out.println("integers :"+integers );
////        List<List<Integer>> integerLists = new ArrayList<>();
////            for (int m = 1; m < integers.size() -asInt; m++) {
////                List<Integer> integerList = new ArrayList<>();
////                int integer = integers.get(m);
////                if(integerList.size()>0){
////                    System.out.println("----------------------------------?????????//:" );
////                    if (integerList.stream().anyMatch(v -> v ==integer)){
////                System.out.println("--------------------------------continue:" );
////                        continue;
////                    }
////                }
////                int i1 = integers.get(m) - integers.get(0);
//////                System.out.println("integers.get(m) :"+integers.get(m) );
//////                System.out.println("integers.get(0):"+integers.get(0) );
//////                System.out.println(integers.get(m) + " - "+integers.get(0) +  ":"+i1  );
////                if (i1 <= k && i1 > 0) {
//////                    System.out.println("true:");
////
////                    integerList.add(integers.get(m));
////                    List<Integer> círculo = Círculo( integers.subList(m ,integers.size()), k);
////                    if(círculo!=null&&círculo.size()>0){
////                        integerList.addAll(círculo);
////                    }
//////                    System.out.println(integerList);
////                    integerLists.add(integerList);
////                }
////            }
//////        for (List<Integer> i : integerLists) {
//////
//////            System.out.println("integers:" + i);
//////        }
////            int asInt2 = integerLists.size()>0?integerLists.stream().mapToInt(i -> i.size()).max().getAsInt():0;
////            asInt=asInt2;
////            List<List<Integer>> collect = integerLists.stream().filter(v -> v.size() == asInt2).collect(Collectors.toList());
////            return collect.size()>0?collect.get(0):null;
////
////    }
////    List<Integer> Círculo2(List<Integer> numsList,int k,List<Integer> ansList){
////        sum++;
////
////        int asInt =1;
////        System.out.println("numsList :"+numsList );
////        List<List<Integer>> integerLists = new ArrayList<>();
////        for (int m = 1; m < numsList.size() -asInt; m++) {
////            List<Integer> integerList = new ArrayList<>();
////            int integer = numsList.get(m);
////            if(ansList.size()>0){
//////                System.out.println("----------------------------------?????????//:" );
////                if (ansList.stream().anyMatch(v -> v == integer)){
//////                    System.out.println("--------------------------------continue:" +ansList);
////                    continue;
////                }
////            }
////            int i1 = numsList.get(m) - numsList.get(0);
//////                System.out.println("numsList.get(m) :"+numsList.get(m) );
//////                System.out.println("numsList.get(0):"+numsList.get(0) );
//////                System.out.println(numsList.get(m) + " - "+numsList.get(0) +  ":"+i1  );
////            if (i1 <= k && i1 > 0) {
//////                    System.out.println("true:");
////
////                integerList.add(numsList.get(m));
////                ansList.add(numsList.get(m));
////                List<Integer> círculo = Círculo2( numsList.subList(m ,numsList.size()), k,integerList);
////                if(círculo!=null&&círculo.size()>0){
////                    integerList.addAll(círculo);
////                }
//////                    System.out.println(integerList);
////                integerLists.add(integerList);
////            }
////        }
//////        for (List<Integer> i : integerLists) {
//////
//////            System.out.println("numsList:" + i);
//////        }
////        int asInt2 = integerLists.size()>0?integerLists.stream().mapToInt(i -> i.size()).max().getAsInt():0;
////        asInt=asInt2;
////        List<List<Integer>> collect = integerLists.stream().filter(v -> v.size() == asInt2).collect(Collectors.toList());
////        return collect.size()>0?collect.get(0):null;
////
////    }
//
////    比大小
////    List<
////
////    Integer> Círculo3(List<Integer> numsList, int k, List<Integer> ansList, int Círculo) {
////        sum++;
////        Círculo++;
////        int asInt = 1;
////        ansList.add(numsList.get(0));
//////        System.out.println("ansList :"+ansList );
//////        System.out.println("Círculo :"+Círculo );
////        List<List<Integer>> integerLists = new ArrayList<>();
////        List<Integer> AAAAAAAAAAa = new ArrayList<>();
////        for (int m = 1; m < numsList.size() - asInt; m++) {
////
////            List<Integer> integerList = new ArrayList<>();
//////            int integer = numsList.get(m);
//////                System.out.println("----------------------------------?????????//:" );
//////            if (ansList.size() > 0) {
//////                if (ansList.stream().anyMatch(v -> v == integer)) {
//////                    System.out.println("--------------------------------continue:" + ansList);
//////                    continue;
//////                }
//////            }
////            int i1 = numsList.get(m) - numsList.get(0);
//////                System.out.println("integers.get(m) :"+integers.get(m) );
//////                System.out.println("integers.get(0):"+integers.get(0) );
//////                System.out.println(integers.get(m) + " - "+integers.get(0) +  ":"+i1  );
////            if (i1 <= k && i1 > 0) {
////                AAAAAAAAAAa.add(numsList.get(m));
////                if (i1 < AAAAAAAAAAa.stream().mapToInt(v -> v).min().getAsInt()) {
////
////
//////                    System.out.println("true:");
////
////                    integerList.add(numsList.get(m));
//////                if(ansList.size()>0&& ansList.size()>Círculo){
////////                    if(ansList.get(ansList.size()-1)>numsList.get(m)){
//////                        ansList.remove(ansList.size()-1);
////////                    }
//////                }
////
//////                ansList.add(numsList.get(m));
//////                AAAAAAAAAAa.add(numsList.get(m));
////                    List<Integer> círculo = Círculo3(numsList.subList(m, numsList.size()), k, ansList, Círculo);
////                    if (círculo != null && círculo.size() > 0) {
////                        integerList.addAll(círculo);
////
////                    }
////                    asInt = integerList.size() > asInt ? integerList.size() : asInt;
//////                    System.out.println(integerList);
////                    integerLists.add(integerList);
////                }
////            }
////        }
//////        for (List<Integer> i : integerLists) {
//////
//////            System.out.println("integers:" + i);
//////        }
////        int asInt2 = integerLists.size() > 0 ? integerLists.stream().mapToInt(i -> i.size()).max().getAsInt() : 0;
//////        asInt = asInt2;
////        List<List<Integer>> collect = integerLists.stream().filter(v -> v.size() == asInt2).collect(Collectors.toList());
////
//////        for (List<Integer> integerList : collect) {
//////
////////            System.out.println("integerList:" + integerList);
//////        }
////
////        Círculo--;
////        ansList.remove(ansList.size() - 1);
////        return collect.size() > 0 ? collect.get(0) : null;
////
////    }
//
//
//    //座標 error
////    List<Integer> Círculo3(int x, List<Integer> numsList, int k, List<Integer> ansList, int Círculo) {
////        sum++;
////        Círculo++;
////        int asInt = 1;
////        ansList.add(numsList.get(0));
//////        System.out.println("ansList :"+ansList );
//////        System.out.println("Círculo :"+Círculo );
////        List<List<Integer>> integerLists = new ArrayList<>();
////        List<Integer> AAAAAAAAAAa = new ArrayList<>();
////        List<Integer> BBBBBBB = new ArrayList<>();
////        for (int m = x; m < numsList.size() - asInt; m++) {
////
////            List<Integer> integerList = new ArrayList<>();
//////            int integer = numsList.get(m);
//////                System.out.println("----------------------------------?????????//:" );
//////            if (ansList.size() > 0) {
//////                if (ansList.stream().anyMatch(v -> v == integer)) {
//////                    System.out.println("--------------------------------continue:" + ansList);
//////                    continue;
//////                }
//////            }
////            int i1 = numsList.get(m) - numsList.get(0);
//////                System.out.println("integers.get(m) :"+integers.get(m) );
//////                System.out.println("integers.get(0):"+integers.get(0) );
//////                System.out.println(integers.get(m) + " - "+integers.get(0) +  ":"+i1  );
////            if (i1 <= k && i1 > 0) {
////                AAAAAAAAAAa.add(numsList.get(m));
////                if (i1 < AAAAAAAAAAa.stream().mapToInt(v -> v).min().getAsInt() || i1 > AAAAAAAAAAa.stream().mapToInt(v -> v).max().getAsInt() + k) {
////                    boolean jon = false;
////                    for (Integer integer : BBBBBBB) {
////                        if (integer == m) {
////                            jon = true;
////                        }
////                    }
////                    if (jon) {
////                        continue;
////                    }
////
//////                    System.out.println("true:");
////
////                    integerList.add(numsList.get(m));
//////                if(ansList.size()>0&& ansList.size()>Círculo){
////////                    if(ansList.get(ansList.size()-1)>numsList.get(m)){
//////                        ansList.remove(ansList.size()-1);
////////                    }
//////                }
////
//////                ansList.add(numsList.get(m));
//////                AAAAAAAAAAa.add(numsList.get(m));
////                    BBBBBBB.add(m);
////                    List<Integer> círculo = Círculo3(m, numsList, k, ansList, Círculo);
////                    if (círculo != null && círculo.size() > 0) {
////                        integerList.addAll(círculo);
////
////                    }
////                    asInt = integerList.size() > asInt ? integerList.size() : asInt;
//////                    System.out.println(integerList);
////                    integerLists.add(integerList);
////                }
////            }
////        }
//////        for (List<Integer> i : integerLists) {
//////
//////            System.out.println("integers:" + i);
//////        }
////        int asInt2 = integerLists.size() > 0 ? integerLists.stream().mapToInt(i -> i.size()).max().getAsInt() : 0;
//////        asInt = asInt2;
////        List<List<Integer>> collect = integerLists.stream().filter(v -> v.size() == asInt2).collect(Collectors.toList());
////
//////        for (List<Integer> integerList : collect) {
//////
////////            System.out.println("integerList:" + integerList);
//////        }
////
////        Círculo--;
////        ansList.remove(ansList.size() - 1);
////        return collect.size() > 0 ? collect.get(0) : null;
////
////    }
//
//
//// ＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊ok
//
////    @Test
////    public void lengthOfLIS7() {
////
//////        int[] nums= {7,4,5,1,8,12,4,7};
//////        int k=5;
//////        int ans=4;
////
//////        int[] nums = {4, 2, 1, 4, 3, 4, 5, 8, 15};
//////        int k = 3;
//////        int ans = 5;
////
//////        int[] nums = {1};
//////        int k = 1;
//////        int ans = 1;
////
//////        int[] nums = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50,51,52,53};
//////        int k = 1;
//////        int ans = 0;
////
//////        int[] nums = {2,1,2,3};
//////        int k = 3;
//////        int ans = 3;
////
////        int[] nums = {1709, 5955, 4331, 1386, 9131, 385, 814, 573, 569, 7114, 8628, 2545, 7082, 6467, 6980, 3368, 3331, 7256, 4243, 2461, 7306, 5998, 6703, 5357, 6676, 8857, 2978, 3217, 2762, 5304, 3473, 2589, 704, 2662, 5183, 1874, 6282, 5685, 152, 6947, 2439, 5215, 8070, 4244, 6364, 1149, 3257, 1123, 7928, 1465, 673, 2797, 3996, 7253, 1705, 2163, 3267, 6465, 4906, 578, 7135, 4879, 8774, 2690, 4474, 1742, 4218, 2988, 6241, 7527, 1779, 2280, 9011, 9431, 2175, 6750, 1263, 3969, 6770, 6155, 8371, 722, 8156, 793, 9550, 5425, 2478, 4687, 9359, 5552, 9590, 3111, 7081, 1091, 883, 2682, 4582, 7592, 2777, 85, 1096, 513, 6998, 1818, 1920, 7762, 2331, 8093, 2563, 5361, 4210, 6563, 7112, 1061, 6542, 7234, 3683, 7429, 8583, 4111, 9184, 5794, 780, 8414, 1522, 5113, 2618, 7798, 4432, 7951, 4507, 9723, 7754, 7513, 574, 4627, 7271, 8511, 2739, 6258, 9089, 6803, 8692, 13, 4147, 3356, 2539, 7321, 6301, 3693, 2944, 2658, 3396, 639, 2758, 3833, 4531, 4658, 7831, 3935, 143, 5533, 1268, 498, 8636, 827, 5569, 5564, 5277, 9273, 7890, 6382, 1635, 8877, 1567, 1977, 9458, 1495, 4529, 8306, 8556, 881, 1994, 3961, 1370, 2616, 9684, 5480, 8656, 5829, 8563, 9197, 8046, 6478, 1965, 1885, 4613, 6457, 8696, 4669, 5301, 8709, 1656, 8820, 8254, 89, 4300, 5670, 3300, 2806, 2761, 9249, 8658, 3023, 2584, 5111, 9006, 7636, 1888, 7519, 40, 5987, 3397, 9960, 3875, 8185, 4727, 4059, 4720, 1602, 9853, 8774, 7854, 6547, 2601, 5544, 5308, 9454, 2954, 1243, 233, 9280, 2441, 2189, 4559, 8594, 5887, 7612, 5982, 3264, 9343, 9380, 9488, 7587, 4851, 6498, 4020, 8047, 5122, 168, 3924, 8957, 6410, 5542, 6650, 3342, 9695, 7693, 6370, 9675, 9314, 3310, 3338, 3004, 6649, 3821, 6112, 719, 5455, 5249, 4969, 5267, 6934, 1249, 2726, 1028, 2029, 6048, 9267, 9189, 8457, 1872, 7290, 4169, 7733, 344, 7145, 4275, 8852, 3560, 9930, 6386, 9271, 1504, 1157, 7657, 2982, 3328, 7143, 2607, 7025, 4683, 2293, 9759, 115, 7200, 3826, 299, 3562, 8695, 7361, 9496, 3810, 1030, 3879, 1882, 776, 691, 2300, 7219, 5195, 609, 3421, 7977, 9909, 4573, 1818, 8651, 4074, 892, 409, 2836, 1844, 9706, 7262, 1827, 5845, 8796, 3926, 1687, 108, 7345, 1565, 3100, 1732, 4404, 3027, 2586, 2783, 9981, 8880, 1326, 1751, 4370, 4929, 9223, 5269, 2215, 7795, 8735, 699, 6151, 2764, 834, 8201, 3990, 5897, 9623, 2563, 4775, 2685, 3292, 4724, 3553, 2246, 1889, 7694, 9593, 428, 5220, 9895, 4618, 7861, 6508, 3521, 5291, 3487, 8736, 2309, 7250, 7621, 4879, 7998, 5167, 6548, 360, 4336, 6534, 2180, 6600, 2006, 2002, 8783, 7714, 5322, 5003, 1859, 3237, 5491, 4346, 6179, 7911, 5800, 3784, 8763, 1321, 1864, 125, 7399, 2192, 71, 2984, 7490, 1831, 3853, 8010, 9291, 2674, 1335, 2809, 859, 4822, 4418, 290, 1662, 2227, 8190, 9145, 6890, 9623, 5745, 9739, 5066, 5004, 3749, 8703, 5165, 6412, 8687, 698, 559, 4671, 5020, 2934, 6239, 4632, 6223, 7776, 3850, 2613, 8056, 8879, 9599, 8758, 4429, 9475, 3305, 4720, 9135, 3345, 618, 8328, 4655, 5507, 9108, 4836, 528, 732, 5811, 3330, 1781, 3940, 2471, 7953, 8057, 5039, 3987, 8459, 9053, 5273, 8710, 2990, 6411, 1299, 5101, 6741, 3701, 6241, 6960, 7690, 7078, 8873, 5222, 4117, 2355, 5376, 7386, 7626, 9742, 7849, 3212, 4201, 4192, 4496, 5641, 4354, 3222, 2767, 8015, 5933, 2535, 6314, 2968, 5328, 3328, 4551, 1510, 1054, 9586, 502, 1616, 7586, 219, 8212, 7361, 1213, 7708, 3785, 142, 1852, 1176, 7009, 2472, 1259, 6415, 3531, 512, 5293, 7410, 5368, 8448, 5245, 3482, 3004, 6085, 2293, 883, 5648, 4233, 2845, 8019, 1706, 5051, 7240, 903, 9722, 3702, 791, 5979, 3820, 5855, 4475, 4850, 5433, 8568, 5354, 7212, 9979, 5023, 4076, 9308, 201, 1772, 5291, 6206, 7432, 9820, 8893, 2510, 9332, 6778, 4706, 1192, 3346, 8837, 2237, 8965, 5940, 9336, 3186, 591, 5099, 993, 6105, 3037, 4955, 6395, 4755, 4816, 2599, 5798, 2123, 8785, 8298, 3750, 2632, 1240, 209, 2672, 8295, 8016, 9865, 2453, 7076, 2875, 9982, 7573, 3498, 3709, 6598, 4059, 7489, 1702, 5511, 2605, 3355, 1622, 3548, 5635, 7258, 7866, 7358, 7284, 2586, 5604, 2461, 4347, 6439, 5101, 451, 4375, 7160, 2806, 1944, 9322, 9967, 6053, 1413, 5597, 4336, 9562, 2387, 7114, 931, 3981, 7488, 4619, 5988, 4902, 3259, 8895, 5889, 8229, 4732, 2369, 123, 8119, 5870, 185, 5858, 434, 9181, 933, 6941, 3484, 4246, 4170, 8620, 2610, 399, 5750, 9419, 9801, 3381, 7466, 7495, 3730, 5713, 3887, 9723, 4226, 9477, 160, 8153, 9747, 700, 1373, 3184, 2141, 8854, 8599, 8920, 9550, 6360, 6622, 7157, 2677, 7148, 5528, 665, 1836, 5313, 5653, 3477, 4521, 3102, 9813, 1597, 6509, 3979, 685, 8367, 4483, 1236, 3075, 2944, 6076, 3400, 3368, 7184, 1086, 1416, 7410, 3150, 6043, 6726, 3854, 9495, 7765, 5530, 8894, 4235, 6914, 6378, 9879, 4655, 4191, 184, 2221, 7460, 3567, 2809, 9145, 9918, 1565, 1068, 3362, 4474, 5501, 5231, 1151, 2249, 337, 7918, 363, 309, 3998, 8907, 2247, 5078, 6130, 7571, 8437, 7036, 3586, 2378, 3414, 7447, 7338, 1103, 5915, 1530, 4510, 7847, 94, 1458, 2608, 8634, 828, 5813, 1461, 6408, 5272, 9431, 8230, 7408, 8369, 3620, 1511, 1066, 6220, 8451, 3536, 2739, 2169, 7295, 114, 2020, 1688, 9631, 1384, 70, 9373, 1277, 1099, 1334, 3979, 9482, 8004, 9413, 8595, 5441, 157, 2123, 7037, 8455, 2973, 5486, 2989, 790, 3746, 8505, 8178, 5493, 6266, 8632, 258, 9282, 7766, 9282, 3826, 6174, 5845, 819, 8982, 2560, 2716, 8583, 9494, 597, 6149, 745, 2670, 946, 1339, 5315, 7785, 7334, 3147, 5740, 1431, 5212, 9333, 8424, 8020, 1096, 828, 3546, 3900, 9342, 5223, 439, 4698, 1814, 9027, 4537, 2190, 3007, 7464, 2153, 4515, 5433, 6868, 9113, 9982, 6157, 8578, 317, 7545, 1504, 9082, 3327, 2545, 6741, 8455, 8287, 3298, 3330, 8696, 6863, 1107, 6603, 7846, 5435, 1933, 9184, 8073, 6056, 2258, 5200, 7035, 4473, 1296, 4732, 7882, 8095, 7012, 6407, 7511, 7016, 4385, 9683, 6084, 8443, 1460, 4809, 7599, 6950, 3279, 3599, 2186, 7987, 5128, 9377, 212, 8133, 3337, 9763, 3874, 4111, 7879, 2353, 1182, 5281, 6449, 8515, 3890, 1766, 222, 7680, 9438, 7058, 7134, 8373, 8713, 9019, 8364, 6439, 4316, 9482, 5898, 8008, 5733, 2079, 7674, 6680, 2061, 5657, 9472, 2467, 8418, 1982, 762, 4764, 5201, 8125, 4306, 6754, 7836, 3121};
//////        int[] nums = {1709, 5955, 4331, 1386, 9131, 385, 814, 573, 569, 7114, 8628, 2545, 7082, 6467, 6980, 3368, 3331, 7256, 4243, 2461, 7306, 5998, 6703, 5357, 6676, 8857, 2978, 3217, 2762, 5304, 3473, 2589, 704, 2662, 5183, 1874, 6282, 5685, 152, 6947, 2439, 5215, 8070, 4244, 6364, 1149, 3257, 1123, 7928, 1465, 673, 2797, 3996, 7253, 1705, 2163, 3267, 6465, 4906, 578, 7135, 4879, 8774, 2690, 4474, 1742, 4218, 2988, 6241, 7527, 1779, 2280, 9011, 9431, 2175, 6750, 1263, 3969, 6770, 6155, 8371, 722, 8156, 793, 9550, 5425, 2478, 4687, 9359, 5552, 9590, 3111, 7081, 1091, 883, 2682, 4582, 7592, 2777, 85, 1096, 513, 6998, 1818, 1920, 7762, 2331, 8093, 2563, 5361, 4210, 6563, 7112};
//////        int[] nums = {1709,5955,4331,1386,7114,9131,385,814,573,569,7114,8628,2545,7082,6467,6980,3368,3331,7256,4243,2461,7306,5998,6703,5357,6676,8857,2978,3217,2762};
//////        int[] nums = {1709,5955,4331,1386};
////        int k = 4331;
////
////        int ans = 63;
////
//////        int[] nums = {1,3,3,4};
//////        int k = 1;
//////        int ans = 2;
////
//////                int[] nums = {4,4,4,3,4};
//////        int k = 3;
//////        int ans = 2;
////
//////        int[] nums = {14,20,3,10,14,20,9};
//////        int k = 6;
//////        int ans = 3;
//////        int[] nums = {1,100000};
//////        int k = 100000;
//////        int ans = 2;
//////        if (nums.length == 1) {
//////            System.out.println("asInt:" + 1);
//////        }
////        System.out.println("k :" + k);
////        List<Integer> integerList = new ArrayList<>();
////        numsList=Arrays.stream(nums).boxed().collect(Collectors.toList());
//////        List<Integer> círculo = Círculo(integerList, k);
////
////        List<Integer> ansList = new ArrayList<>();
////        List<Map<Integer,Integer>> mapList = new ArrayList<>();
////        Map<Integer,Integer> map = new HashMap<>();
////        map.put(1,2);
////        System.out.println("map："+map);
////        mapList.add(map);
////        System.out.println("mapList："+mapList);
//////        List<Integer> círculo = Círculo2(integerList, k,ansList);
////        List<Integer> círculo = new ArrayList<>();
////        List<Integer> círculo2 = new ArrayList<>();
////        int aa = 0;
//////        for (int i = 0; i < integerList.size() - aa; i++) {
////        círculo = Círculo3(0,  k, ansList, 1);
//////            int i1 = círculo == null ? 0 : círculo.size();
//////            int x = círculo2 != null ? círculo2.size() : 0;
////////            System.out.println("XXXXXXXXXXXXXXXX"+x);
////////            System.out.println("%%%%%%%%%%%%%%%:"+i1);
//////            if (x > i1) {
//////                círculo = círculo2;
//////                aa = círculo.size();
//////                System.out.println("&&&&&&&&&&&&" + círculo2);
//////            }
//////        }
////        Arrays.stream(nums).forEach(v -> System.out.print(v + ","));
////        System.out.println();
////        System.out.println("integerList:" + integerList);
////        System.out.println("sum:" + sum);
////        System.out.println("nums:" + nums.length);
////        System.out.println("círculo:" + círculo);
////        System.out.println("k:" + k);
////        System.out.println("ans:" + ans);
////        System.out.println("asInt:" + círculo.size());
////    }
//
////    int sum = 1;
////    List<Integer> numsList;
//
//    //座標
////    List<Integer> Círculo3(int x,  int k, Map<Integer,Integer> ansList, int Círculo) {
////        sum++;
////        Círculo++;
////        int asInt = 1;
////        ansList.put(x,numsList.get(x));
//////        System.out.println("x :"+x );
//////        System.out.println("ansList :"+ansList );
//////        System.out.println("Círculo :"+Círculo );
////        List<List<Integer>> integerLists = new ArrayList<>();
////        List<Integer> AAAAAAAAAAa = new ArrayList<>();
////        for (int m = x+1; m < numsList.size() - asInt; m++) {
////
////            List<Integer> integerList = new ArrayList<>();
//////            int integer = numsList.get(m);
//////                System.out.println("----------------------------------?????????//:" );
//////            if (ansList.size() > 0) {
//////                if (ansList.stream().anyMatch(v -> v == integer)) {
//////                    System.out.println("--------------------------------continue:" + ansList);
//////                    continue;
//////                }
//////            }
////            int i1 = numsList.get(m) - numsList.get(x);
//////                System.out.println("integers.get(m) :"+integers.get(m) );
//////                System.out.println("integers.get(0):"+integers.get(0) );
//////                System.out.println(integers.get(m) + " - "+integers.get(0) +  ":"+i1  );
////            if (i1 <= k && i1 > 0) {
////                AAAAAAAAAAa.add(numsList.get(m));
////                if (i1 < AAAAAAAAAAa.stream().mapToInt(v -> v).min().getAsInt()) {
////
////
//////                    System.out.println("true:");
////
////                    integerList.add(numsList.get(m));
//////                if(ansList.size()>0&& ansList.size()>Círculo){
////////                    if(ansList.get(ansList.size()-1)>numsList.get(m)){
//////                        ansList.remove(ansList.size()-1);
////////                    }
//////                }
////
//////                ansList.add(numsList.get(m));
//////                AAAAAAAAAAa.add(numsList.get(m));
////                    List<Integer> círculo = Círculo3(m, k, ansList, Círculo);
////                    if (círculo != null && círculo.size() > 0) {
////                        integerList.addAll(círculo);
////
////                    }
////                    asInt = integerList.size() > asInt ? integerList.size() : asInt;
//////                    System.out.println(integerList);
////                    integerLists.add(integerList);
////                }
////            }
////        }
////        for (List<Integer> i : integerLists) {
////
////            System.out.println("integers:" + i);
////        }
////        int asInt2 = integerLists.size() > 0 ? integerLists.stream().mapToInt(i -> i.size()).max().getAsInt() : 0;
//////        asInt = asInt2;
////        List<List<Integer>> collect = integerLists.stream().filter(v -> v.size() == asInt2).collect(Collectors.toList());
////
//////        for (List<Integer> integerList : collect) {
//////
////////            System.out.println("integerList:" + integerList);
//////        }
////
////        Círculo--;
//////        ansList.remove(ansList.size() - 1);
//////        System.out.println(ansList);
////        return collect.size() > 0 ? collect.get(0) : null;
////
////    }
//
//
////    @Test
////    public void lengthOfLIS7() {
////
//////        int[] nums= {7,4,5,1,8,12,4,7};
//////        int k=5;
//////        int ans=4;
////
//////        int[] nums = {4, 2, 1, 4, 3, 4, 5, 8, 15};
//////        int k = 3;
//////        int ans = 5;
////
//////        int[] nums = {1};
//////        int k = 1;
//////        int ans = 1;
////
//////        int[] nums = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50,51,52,53};
//////        int k = 1;
//////        int ans = 0;
////
//////        int[] nums = {2,1,2,3};
//////        int k = 3;
//////        int ans = 3;
////
//////        int[] nums = {1709, 5955, 4331, 1386, 9131, 385, 814, 573, 569, 7114, 8628, 2545, 7082, 6467, 6980, 3368, 3331, 7256, 4243, 2461, 7306, 5998, 6703, 5357, 6676, 8857, 2978, 3217, 2762, 5304, 3473, 2589, 704, 2662, 5183, 1874, 6282, 5685, 152, 6947, 2439, 5215, 8070, 4244, 6364, 1149, 3257, 1123, 7928, 1465, 673, 2797, 3996, 7253, 1705, 2163, 3267, 6465, 4906, 578, 7135, 4879, 8774, 2690, 4474, 1742, 4218, 2988, 6241, 7527, 1779, 2280, 9011, 9431, 2175, 6750, 1263, 3969, 6770, 6155, 8371, 722, 8156, 793, 9550, 5425, 2478, 4687, 9359, 5552, 9590, 3111, 7081, 1091, 883, 2682, 4582, 7592, 2777, 85, 1096, 513, 6998, 1818, 1920, 7762, 2331, 8093, 2563, 5361, 4210, 6563, 7112, 1061, 6542, 7234, 3683, 7429, 8583, 4111, 9184, 5794, 780, 8414, 1522, 5113, 2618, 7798, 4432, 7951, 4507, 9723, 7754, 7513, 574, 4627, 7271, 8511, 2739, 6258, 9089, 6803, 8692, 13, 4147, 3356, 2539, 7321, 6301, 3693, 2944, 2658, 3396, 639, 2758, 3833, 4531, 4658, 7831, 3935, 143, 5533, 1268, 498, 8636, 827, 5569, 5564, 5277, 9273, 7890, 6382, 1635, 8877, 1567, 1977, 9458, 1495, 4529, 8306, 8556, 881, 1994, 3961, 1370, 2616, 9684, 5480, 8656, 5829, 8563, 9197, 8046, 6478, 1965, 1885, 4613, 6457, 8696, 4669, 5301, 8709, 1656, 8820, 8254, 89, 4300, 5670, 3300, 2806, 2761, 9249, 8658, 3023, 2584, 5111, 9006, 7636, 1888, 7519, 40, 5987, 3397, 9960, 3875, 8185, 4727, 4059, 4720, 1602, 9853, 8774, 7854, 6547, 2601, 5544, 5308, 9454, 2954, 1243, 233, 9280, 2441, 2189, 4559, 8594, 5887, 7612, 5982, 3264, 9343, 9380, 9488, 7587, 4851, 6498, 4020, 8047, 5122, 168, 3924, 8957, 6410, 5542, 6650, 3342, 9695, 7693, 6370, 9675, 9314, 3310, 3338, 3004, 6649, 3821, 6112, 719, 5455, 5249, 4969, 5267, 6934, 1249, 2726, 1028, 2029, 6048, 9267, 9189, 8457, 1872, 7290, 4169, 7733, 344, 7145, 4275, 8852, 3560, 9930, 6386, 9271, 1504, 1157, 7657, 2982, 3328, 7143, 2607, 7025, 4683, 2293, 9759, 115, 7200, 3826, 299, 3562, 8695, 7361, 9496, 3810, 1030, 3879, 1882, 776, 691, 2300, 7219, 5195, 609, 3421, 7977, 9909, 4573, 1818, 8651, 4074, 892, 409, 2836, 1844, 9706, 7262, 1827, 5845, 8796, 3926, 1687, 108, 7345, 1565, 3100, 1732, 4404, 3027, 2586, 2783, 9981, 8880, 1326, 1751, 4370, 4929, 9223, 5269, 2215, 7795, 8735, 699, 6151, 2764, 834, 8201, 3990, 5897, 9623, 2563, 4775, 2685, 3292, 4724, 3553, 2246, 1889, 7694, 9593, 428, 5220, 9895, 4618, 7861, 6508, 3521, 5291, 3487, 8736, 2309, 7250, 7621, 4879, 7998, 5167, 6548, 360, 4336, 6534, 2180, 6600, 2006, 2002, 8783, 7714, 5322, 5003, 1859, 3237, 5491, 4346, 6179, 7911, 5800, 3784, 8763, 1321, 1864, 125, 7399, 2192, 71, 2984, 7490, 1831, 3853, 8010, 9291, 2674, 1335, 2809, 859, 4822, 4418, 290, 1662, 2227, 8190, 9145, 6890, 9623, 5745, 9739, 5066, 5004, 3749, 8703, 5165, 6412, 8687, 698, 559, 4671, 5020, 2934, 6239, 4632, 6223, 7776, 3850, 2613, 8056, 8879, 9599, 8758, 4429, 9475, 3305, 4720, 9135, 3345, 618, 8328, 4655, 5507, 9108, 4836, 528, 732, 5811, 3330, 1781, 3940, 2471, 7953, 8057, 5039, 3987, 8459, 9053, 5273, 8710, 2990, 6411, 1299, 5101, 6741, 3701, 6241, 6960, 7690, 7078, 8873, 5222, 4117, 2355, 5376, 7386, 7626, 9742, 7849, 3212, 4201, 4192, 4496, 5641, 4354, 3222, 2767, 8015, 5933, 2535, 6314, 2968, 5328, 3328, 4551, 1510, 1054, 9586, 502, 1616, 7586, 219, 8212, 7361, 1213, 7708, 3785, 142, 1852, 1176, 7009, 2472, 1259, 6415, 3531, 512, 5293, 7410, 5368, 8448, 5245, 3482, 3004, 6085, 2293, 883, 5648, 4233, 2845, 8019, 1706, 5051, 7240, 903, 9722, 3702, 791, 5979, 3820, 5855, 4475, 4850, 5433, 8568, 5354, 7212, 9979, 5023, 4076, 9308, 201, 1772, 5291, 6206, 7432, 9820, 8893, 2510, 9332, 6778, 4706, 1192, 3346, 8837, 2237, 8965, 5940, 9336, 3186, 591, 5099, 993, 6105, 3037, 4955, 6395, 4755, 4816, 2599, 5798, 2123, 8785, 8298, 3750, 2632, 1240, 209, 2672, 8295, 8016, 9865, 2453, 7076, 2875, 9982, 7573, 3498, 3709, 6598, 4059, 7489, 1702, 5511, 2605, 3355, 1622, 3548, 5635, 7258, 7866, 7358, 7284, 2586, 5604, 2461, 4347, 6439, 5101, 451, 4375, 7160, 2806, 1944, 9322, 9967, 6053, 1413, 5597, 4336, 9562, 2387, 7114, 931, 3981, 7488, 4619, 5988, 4902, 3259, 8895, 5889, 8229, 4732, 2369, 123, 8119, 5870, 185, 5858, 434, 9181, 933, 6941, 3484, 4246, 4170, 8620, 2610, 399, 5750, 9419, 9801, 3381, 7466, 7495, 3730, 5713, 3887, 9723, 4226, 9477, 160, 8153, 9747, 700, 1373, 3184, 2141, 8854, 8599, 8920, 9550, 6360, 6622, 7157, 2677, 7148, 5528, 665, 1836, 5313, 5653, 3477, 4521, 3102, 9813, 1597, 6509, 3979, 685, 8367, 4483, 1236, 3075, 2944, 6076, 3400, 3368, 7184, 1086, 1416, 7410, 3150, 6043, 6726, 3854, 9495, 7765, 5530, 8894, 4235, 6914, 6378, 9879, 4655, 4191, 184, 2221, 7460, 3567, 2809, 9145, 9918, 1565, 1068, 3362, 4474, 5501, 5231, 1151, 2249, 337, 7918, 363, 309, 3998, 8907, 2247, 5078, 6130, 7571, 8437, 7036, 3586, 2378, 3414, 7447, 7338, 1103, 5915, 1530, 4510, 7847, 94, 1458, 2608, 8634, 828, 5813, 1461, 6408, 5272, 9431, 8230, 7408, 8369, 3620, 1511, 1066, 6220, 8451, 3536, 2739, 2169, 7295, 114, 2020, 1688, 9631, 1384, 70, 9373, 1277, 1099, 1334, 3979, 9482, 8004, 9413, 8595, 5441, 157, 2123, 7037, 8455, 2973, 5486, 2989, 790, 3746, 8505, 8178, 5493, 6266, 8632, 258, 9282, 7766, 9282, 3826, 6174, 5845, 819, 8982, 2560, 2716, 8583, 9494, 597, 6149, 745, 2670, 946, 1339, 5315, 7785, 7334, 3147, 5740, 1431, 5212, 9333, 8424, 8020, 1096, 828, 3546, 3900, 9342, 5223, 439, 4698, 1814, 9027, 4537, 2190, 3007, 7464, 2153, 4515, 5433, 6868, 9113, 9982, 6157, 8578, 317, 7545, 1504, 9082, 3327, 2545, 6741, 8455, 8287, 3298, 3330, 8696, 6863, 1107, 6603, 7846, 5435, 1933, 9184, 8073, 6056, 2258, 5200, 7035, 4473, 1296, 4732, 7882, 8095, 7012, 6407, 7511, 7016, 4385, 9683, 6084, 8443, 1460, 4809, 7599, 6950, 3279, 3599, 2186, 7987, 5128, 9377, 212, 8133, 3337, 9763, 3874, 4111, 7879, 2353, 1182, 5281, 6449, 8515, 3890, 1766, 222, 7680, 9438, 7058, 7134, 8373, 8713, 9019, 8364, 6439, 4316, 9482, 5898, 8008, 5733, 2079, 7674, 6680, 2061, 5657, 9472, 2467, 8418, 1982, 762, 4764, 5201, 8125, 4306, 6754, 7836, 3121};
////        int[] nums = {1709, 5955, 4331, 1386, 9131, 385, 814, 573, 569, 7114, 8628, 2545, 7082, 6467, 6980, 3368, 3331, 7256, 4243, 2461, 7306, 5998, 6703, 5357, 6676, 8857, 2978, 3217, 2762, 5304, 3473, 2589, 704, 2662, 5183, 1874, 6282, 5685, 152, 6947, 2439, 5215, 8070, 4244, 6364, 1149, 3257, 1123, 7928, 1465, 673, 2797, 3996, 7253, 1705, 2163, 3267, 6465, 4906, 578, 7135, 4879, 8774, 2690, 4474, 1742, 4218, 2988, 6241, 7527, 1779, 2280, 9011, 9431, 2175, 6750, 1263, 3969, 6770, 6155, 8371, 722, 8156, 793, 9550, 5425, 2478, 4687, 9359, 5552, 9590, 3111, 7081, 1091, 883, 2682, 4582, 7592, 2777, 85, 1096, 513, 6998, 1818, 1920, 7762, 2331, 8093, 2563, 5361, 4210, 6563, 7112};
//////        int[] nums = {1709,5955,4331,1386,7114,9131,385,814,573,569,7114,8628,2545,7082,6467,6980,3368,3331,7256,4243,2461,7306,5998,6703,5357,6676,8857,2978,3217,2762};
//////        int[] nums = {1709,5955,4331,1386,7114,9131,385,814,573,569,7114,8628};
//////                int[] nums = {1709,5955,1386,1387,4331,7114};
////        int k = 4331;
////
////        int ans = 63;
////
//////        int[] nums = {1,3,3,4};
//////        int k = 1;
//////        int ans = 2;
////
//////                int[] nums = {4,4,4,3,4};
//////        int k = 3;
//////        int ans = 2;
////
//////        int[] nums = {14,20,3,10,14,20,9};
//////        int k = 6;
//////        int ans = 3;
//////        int[] nums = {1,100000};
//////        int k = 100000;
//////        int ans = 2;
//////        if (nums.length == 1) {
//////            System.out.println("asInt:" + 1);
//////        }
////        System.out.println("k :" + k);
////        List<Integer> integerList = new ArrayList<>();
////        numsList = Arrays.stream(nums).boxed().collect(Collectors.toList());
////
////        List<Integer> ansList = new ArrayList<>();
////        List<Map<Integer, Integer>> círculo = new ArrayList<>();
////        for(int i=0;i<numsList.size();i++){
////
////            círculo.addAll(Círculo3(i, k, ansList, 1));
////        }
////        int i2 = círculo.size() > 0 ? círculo.stream().mapToInt(i -> i.size()).max().getAsInt() : 0;
////        List<Map<Integer, Integer>> collect = círculo.stream().filter(v -> v.size() == i2).collect(Collectors.toList());
////        for (Map<Integer, Integer> integerIntegerMap : collect) {
////
////            System.out.println("círculo:" + integerIntegerMap);
////        }
////        Arrays.stream(nums).forEach(v -> System.out.print(v + ","));
////        System.out.println();
////        System.out.println("integerList:" + integerList);
////        System.out.println("sum:" + sum);
////        System.out.println("nums:" + nums.length);
////        System.out.println("k:" + k);
////        System.out.println("ans:" + ans);
////        System.out.println("asInt:" + i2);
////    }
////
////    int sum = 1;
////    List<Integer> numsList;
//
//    //座標 error
////    List<Map<Integer, Integer>> Círculo3(int x, int k, List<Integer> ansList, int Círculo) {
////        sum++;
////        Círculo++;
////        int asInt = 1;
////        ansList.add(x);
////        List<Map<Integer, Integer>> integerLists = new ArrayList<>();
//////        System.out.println("numsList.size():"+numsList.size());
//////        System.out.println("x"+x);
////        for (int m = x + 1; m < numsList.size(); m++) {
//////            System.out.println("numsList.get(m):"+numsList.get(m));
//////            System.out.println("numsList.get(x):"+numsList.get(x));
//////            System.out.println(numsList.get(m) - numsList.get(x));
////            int i1 = numsList.get(m) - numsList.get(x);
////            if (i1 <= k && i1 > 0) {
//////                System.out.println("********************************");
////                Map<Integer, Integer> integerList = new HashMap<>();
////                integerList.put(m, numsList.get(m));
//////                System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
//////                System.out.println("mmmmmmmmmmmmmmmm:"+m);
//////                System.out.println(integerList);
////                List<Map<Integer, Integer>> círculo = Círculo3(m, k, ansList, Círculo);
//////                System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
////                if (círculo != null && círculo.size() > 0) {
////                    int i2 = integerLists.size() > 0 ? integerLists.stream().mapToInt(i -> i.size()).max().getAsInt() : 0;
////                    círculo.stream().filter(v -> v.size() == i2).collect(Collectors.toList());
////                    if(círculo.size()>0){
////
////                        integerList.putAll(círculo.get(0));
////                    }
////                }
////                asInt = integerList.size() > asInt ? integerList.size() : asInt;
////                integerLists.add(integerList);
////            }
////        }
////        ansList.remove(ansList.size()-1);
////        return integerLists;
////
////    }
//
////    List<Map<Integer, Integer>> Círculo3(int x, int k, List<Integer> ansList, int Círculo) {
////        sum++;
////        Círculo++;
////        int asInt = 1;
////        ansList.add(x);
////        List<Map<Integer, Integer>> integerLists = new ArrayList<>();
////        System.out.println("pppppppppppppp:"+numsList.get(x));
////        if(numsList.get(x)==9131){
////            System.out.println("--------------------------");
////        }
////
////        for (int m = x + 1; m < numsList.size(); m++) {
////
////
////            int i1 = numsList.get(m) - numsList.get(x);
////            if (i1 <= k && i1 > 0) {
////                Map<Integer, Integer> integerList = new HashMap<>();
////                integerList.put(m, numsList.get(m));
////                System.out.println(numsList.get(m));
////                List<Map<Integer, Integer>> círculo = Círculo3(m, k, ansList, Círculo);
//////                System.out.println("-------------------------");
////                if (círculo != null && círculo.size() > 0) {
////                    int i2 = integerLists.size() > 0 ? integerLists.stream().mapToInt(i -> i.size()).max().getAsInt() : 0;
////                    círculo.stream().filter(v -> v.size() == i2).collect(Collectors.toList());
////                    System.out.println("círculo.get(0):"+círculo.get(0));
////                    if(círculo.size()>0){
////                        integerList.putAll(círculo.get(0));
////                    }
////                }
////                asInt = integerList.size() > asInt ? integerList.size() : asInt;
////                integerLists.add(integerList);
////            }
////        }
////        ansList.remove(ansList.size()-1);
////        return integerLists;
////
////    }
//
//
//    // 最好的*****************************************************************************
//    @Test
//    public void lengthOfLIS7() {
//
//
////        int[] nums = {};
////        int k = 1;
////        int ans = 0;
//
//
////        int[] nums= {7,4,5,1,8,12,4,7};
////        int k=5;
////        int ans=4;
//
////        int[] nums = {4, 2, 1, 4, 3, 4, 5, 8, 15};
////        int k = 3;
////        int ans = 5;
//
////        int[] nums = {1};
////        int k = 1;
////        int ans = 1;
//
//
////        int[] nums = {2,1,2,3};
////        int k = 3;
////        int ans = 3;
//
////        int[] nums = {1709, 5955, 4331, 1386, 9131, 385, 814, 573, 569, 7114, 8628, 2545, 7082, 6467, 6980, 3368, 3331, 7256, 4243, 2461, 7306, 5998, 6703, 5357, 6676, 8857, 2978, 3217, 2762, 5304, 3473, 2589, 704, 2662, 5183, 1874, 6282, 5685, 152, 6947, 2439, 5215, 8070, 4244, 6364, 1149, 3257, 1123, 7928, 1465, 673, 2797, 3996, 7253, 1705, 2163, 3267, 6465, 4906, 578, 7135, 4879, 8774, 2690, 4474, 1742, 4218, 2988, 6241, 7527, 1779, 2280, 9011, 9431, 2175, 6750, 1263, 3969, 6770, 6155, 8371, 722, 8156, 793, 9550, 5425, 2478, 4687, 9359, 5552, 9590, 3111, 7081, 1091, 883, 2682, 4582, 7592, 2777, 85, 1096, 513, 6998, 1818, 1920, 7762, 2331, 8093, 2563, 5361, 4210, 6563, 7112, 1061, 6542, 7234, 3683, 7429, 8583, 4111, 9184, 5794, 780, 8414, 1522, 5113, 2618, 7798, 4432, 7951, 4507, 9723, 7754, 7513, 574, 4627, 7271, 8511, 2739, 6258, 9089, 6803, 8692, 13, 4147, 3356, 2539, 7321, 6301, 3693, 2944, 2658, 3396, 639, 2758, 3833, 4531, 4658, 7831, 3935, 143, 5533, 1268, 498, 8636, 827, 5569, 5564, 5277, 9273, 7890, 6382, 1635, 8877, 1567, 1977, 9458, 1495, 4529, 8306, 8556, 881, 1994, 3961, 1370, 2616, 9684, 5480, 8656, 5829, 8563, 9197, 8046, 6478, 1965, 1885, 4613, 6457, 8696, 4669, 5301, 8709, 1656, 8820, 8254, 89, 4300, 5670, 3300, 2806, 2761, 9249, 8658, 3023, 2584, 5111, 9006, 7636, 1888, 7519, 40, 5987, 3397, 9960, 3875, 8185, 4727, 4059, 4720, 1602, 9853, 8774, 7854, 6547, 2601, 5544, 5308, 9454, 2954, 1243, 233, 9280, 2441, 2189, 4559, 8594, 5887, 7612, 5982, 3264, 9343, 9380, 9488, 7587, 4851, 6498, 4020, 8047, 5122, 168, 3924, 8957, 6410, 5542, 6650, 3342, 9695, 7693, 6370, 9675, 9314, 3310, 3338, 3004, 6649, 3821, 6112, 719, 5455, 5249, 4969, 5267, 6934, 1249, 2726, 1028, 2029, 6048, 9267, 9189, 8457, 1872, 7290, 4169, 7733, 344, 7145, 4275, 8852, 3560, 9930, 6386, 9271, 1504, 1157, 7657, 2982, 3328, 7143, 2607, 7025, 4683, 2293, 9759, 115, 7200, 3826, 299, 3562, 8695, 7361, 9496, 3810, 1030, 3879, 1882, 776, 691, 2300, 7219, 5195, 609, 3421, 7977, 9909, 4573, 1818, 8651, 4074, 892, 409, 2836, 1844, 9706, 7262, 1827, 5845, 8796, 3926, 1687, 108, 7345, 1565, 3100, 1732, 4404, 3027, 2586, 2783, 9981, 8880, 1326, 1751, 4370, 4929, 9223, 5269, 2215, 7795, 8735, 699, 6151, 2764, 834, 8201, 3990, 5897, 9623, 2563, 4775, 2685, 3292, 4724, 3553, 2246, 1889, 7694, 9593, 428, 5220, 9895, 4618, 7861, 6508, 3521, 5291, 3487, 8736, 2309, 7250, 7621, 4879, 7998, 5167, 6548, 360, 4336, 6534, 2180, 6600, 2006, 2002, 8783, 7714, 5322, 5003, 1859, 3237, 5491, 4346, 6179, 7911, 5800, 3784, 8763, 1321, 1864, 125, 7399, 2192, 71, 2984, 7490, 1831, 3853, 8010, 9291, 2674, 1335, 2809, 859, 4822, 4418, 290, 1662, 2227, 8190, 9145, 6890, 9623, 5745, 9739, 5066, 5004, 3749, 8703, 5165, 6412, 8687, 698, 559, 4671, 5020, 2934, 6239, 4632, 6223, 7776, 3850, 2613, 8056, 8879, 9599, 8758, 4429, 9475, 3305, 4720, 9135, 3345, 618, 8328, 4655, 5507, 9108, 4836, 528, 732, 5811, 3330, 1781, 3940, 2471, 7953, 8057, 5039, 3987, 8459, 9053, 5273, 8710, 2990, 6411, 1299, 5101, 6741, 3701, 6241, 6960, 7690, 7078, 8873, 5222, 4117, 2355, 5376, 7386, 7626, 9742, 7849, 3212, 4201, 4192, 4496, 5641, 4354, 3222, 2767, 8015, 5933, 2535, 6314, 2968, 5328, 3328, 4551, 1510, 1054, 9586, 502, 1616, 7586, 219, 8212, 7361, 1213, 7708, 3785, 142, 1852, 1176, 7009, 2472, 1259, 6415, 3531, 512, 5293, 7410, 5368, 8448, 5245, 3482, 3004, 6085, 2293, 883, 5648, 4233, 2845, 8019, 1706, 5051, 7240, 903, 9722, 3702, 791, 5979, 3820, 5855, 4475, 4850, 5433, 8568, 5354, 7212, 9979, 5023, 4076, 9308, 201, 1772, 5291, 6206, 7432, 9820, 8893, 2510, 9332, 6778, 4706, 1192, 3346, 8837, 2237, 8965, 5940, 9336, 3186, 591, 5099, 993, 6105, 3037, 4955, 6395, 4755, 4816, 2599, 5798, 2123, 8785, 8298, 3750, 2632, 1240, 209, 2672, 8295, 8016, 9865, 2453, 7076, 2875, 9982, 7573, 3498, 3709, 6598, 4059, 7489, 1702, 5511, 2605, 3355, 1622, 3548, 5635, 7258, 7866, 7358, 7284, 2586, 5604, 2461, 4347, 6439, 5101, 451, 4375, 7160, 2806, 1944, 9322, 9967, 6053, 1413, 5597, 4336, 9562, 2387, 7114, 931, 3981, 7488, 4619, 5988, 4902, 3259, 8895, 5889, 8229, 4732, 2369, 123, 8119, 5870, 185, 5858, 434, 9181, 933, 6941, 3484, 4246, 4170, 8620, 2610, 399, 5750, 9419, 9801, 3381, 7466, 7495, 3730, 5713, 3887, 9723, 4226, 9477, 160, 8153, 9747, 700, 1373, 3184, 2141, 8854, 8599, 8920, 9550, 6360, 6622, 7157, 2677, 7148, 5528, 665, 1836, 5313, 5653, 3477, 4521, 3102, 9813, 1597, 6509, 3979, 685, 8367, 4483, 1236, 3075, 2944, 6076, 3400, 3368, 7184, 1086, 1416, 7410, 3150, 6043, 6726, 3854, 9495, 7765, 5530, 8894, 4235, 6914, 6378, 9879, 4655, 4191, 184, 2221, 7460, 3567, 2809, 9145, 9918, 1565, 1068, 3362, 4474, 5501, 5231, 1151, 2249, 337, 7918, 363, 309, 3998, 8907, 2247, 5078, 6130, 7571, 8437, 7036, 3586, 2378, 3414, 7447, 7338, 1103, 5915, 1530, 4510, 7847, 94, 1458, 2608, 8634, 828, 5813, 1461, 6408, 5272, 9431, 8230, 7408, 8369, 3620, 1511, 1066, 6220, 8451, 3536, 2739, 2169, 7295, 114, 2020, 1688, 9631, 1384, 70, 9373, 1277, 1099, 1334, 3979, 9482, 8004, 9413, 8595, 5441, 157, 2123, 7037, 8455, 2973, 5486, 2989, 790, 3746, 8505, 8178, 5493, 6266, 8632, 258, 9282, 7766, 9282, 3826, 6174, 5845, 819, 8982, 2560, 2716, 8583, 9494, 597, 6149, 745, 2670, 946, 1339, 5315, 7785, 7334, 3147, 5740, 1431, 5212, 9333, 8424, 8020, 1096, 828, 3546, 3900, 9342, 5223, 439, 4698, 1814, 9027, 4537, 2190, 3007, 7464, 2153, 4515, 5433, 6868, 9113, 9982, 6157, 8578, 317, 7545, 1504, 9082, 3327, 2545, 6741, 8455, 8287, 3298, 3330, 8696, 6863, 1107, 6603, 7846, 5435, 1933, 9184, 8073, 6056, 2258, 5200, 7035, 4473, 1296, 4732, 7882, 8095, 7012, 6407, 7511, 7016, 4385, 9683, 6084, 8443, 1460, 4809, 7599, 6950, 3279, 3599, 2186, 7987, 5128, 9377, 212, 8133, 3337, 9763, 3874, 4111, 7879, 2353, 1182, 5281, 6449, 8515, 3890, 1766, 222, 7680, 9438, 7058, 7134, 8373, 8713, 9019, 8364, 6439, 4316, 9482, 5898, 8008, 5733, 2079, 7674, 6680, 2061, 5657, 9472, 2467, 8418, 1982, 762, 4764, 5201, 8125, 4306, 6754, 7836, 3121};
//////        int[] nums = {1709, 5955, 4331, 1386, 9131, 385, 814, 573, 569, 7114, 8628, 2545, 7082, 6467, 6980, 3368, 3331, 7256, 4243, 2461, 7306, 5998, 6703, 5357, 6676, 8857, 2978, 3217, 2762, 5304, 3473, 2589, 704, 2662, 5183, 1874, 6282, 5685, 152, 6947, 2439, 5215, 8070, 4244, 6364, 1149, 3257, 1123, 7928, 1465, 673, 2797, 3996, 7253, 1705, 2163, 3267, 6465, 4906, 578, 7135, 4879, 8774, 2690, 4474, 1742, 4218, 2988, 6241, 7527, 1779, 2280, 9011, 9431, 2175, 6750, 1263, 3969, 6770, 6155, 8371, 722, 8156, 793, 9550, 5425, 2478, 4687, 9359, 5552, 9590, 3111, 7081, 1091, 883, 2682, 4582, 7592, 2777, 85, 1096, 513, 6998, 1818, 1920, 7762, 2331, 8093, 2563, 5361, 4210, 6563, 7112};
////        int[] nums = {1709,5955,4331,1386,7114,9131,385,814,573,569,7114,8628,2545,7082,6467,6980,3368,3331,7256,4243,2461,7306,5998,6703,5357,6676,8857,2978,3217,2762};
////        int[] nums = {1709,5955,4331,1386,7114,9131,385,814,573,569,7114,8628,2545,7082,6467,6980,3368,3331,7256,4243,2461,7306,5998};//7
//        int[] nums = {1709, 5955, 4331, 1386, 7114, 9131, 385, 814, 573, 569, 7114, 8628, 2545, 7082, 6467, 6980, 3368, 3331, 7256, 4243, 2461};//6
////        int[] nums = {1709,5955,4331,1386,7114,9131,385,814,573,569,7114,8628,2545,7082,6467};//4
////        int[] nums = {1709,5955,4331,1386};
//        int k = 4331;
//        int ans = 63;
//
////        int[] nums = {1,3,3,4};
////        int k = 1;
////        int ans = 2;
//
////                int[] nums = {4,4,4,3,4};
////        int k = 3;
////        int ans = 2;
//
////        int[] nums = {14,20,3,10,14,20,9};
////        int k = 6;
////        int ans = 3;
////        int[] nums = {1,100000};
////        int k = 100000;
////        int ans = 2;
////        if (nums.length == 1) {
////            System.out.println("asInt:" + 1);
////        }
//
//
//        Map<Integer, Integer> numMap = new HashMap<>();
//        for (int num = 0; num < nums.length; num++) {
//            numMap.put(num, 1);
//        }
//
//        for (int i = nums.length - 2; i >= 0; i--) {
//            List<Integer> integerList = new ArrayList<>();
//            for (int j = i + 1; j < nums.length; j++) {
//                int i1 = nums[j] - nums[i];
//                if (i1 <= k && i1 > 0) {
//
//                    integerList.add(numMap.get(j));
//                    if (numMap.get(j) >= nums.length - j) {
//                        break;
//                    }
//                }
//            }
//            if (integerList != null && integerList.size() > 0) {
//
//                int asInt = integerList.stream().mapToInt(v -> v).max().getAsInt();
//                numMap.put(i, asInt + 1);
//            }
//        }
//
//
//        Arrays.stream(nums).forEach(v -> System.out.print(v + ","));
//        System.out.println();
//        System.out.println("nums:" + nums.length);
//        System.out.println("k:" + k);
//        System.out.println("numMap:" + numMap);
//        int max = 0;
//        for (int i = 0; i < numMap.size(); i++) {
//            Integer integer = numMap.get(i);
//            if (integer > max) {
//                max = integer;
//            }
//
//        }
//
//        System.out.println("numMap:MAX:" + max);
//
//        System.out.println("ans:" + ans);
//    }
//
//    final int[] nums = {};
//
//    @Test
//    public void lengthOfLIS8() throws IOException {
//        int[] nums = {};
//        int k = 5000;
//        int ans = 0;
//
//
//        FileInputStream fis = new FileInputStream("src/test/resources/string.txt");
//        int content;
//        String s = "";
//        List<String> stringList = new ArrayList<>();
//        while ((content = fis.read()) != -1) {
//            char content1 = (char) content;
//            if (content1 == ',') {
//                stringList.add(s);
//                s = "";
//            } else {
//                s = s + content1;
//            }
////            System.out.println(content1);
//        }
//
//
////            System.out.println(stringList);
////        String s = fis.toString();
////        String[] split = s.split(",");
//
//
////        String stringTooLong = IOUtils.toString(fis, "UTF-8");
////        assertThat(stringTooLong).isNotEmpty();
////        int[] nums= {7,4,5,1,8,12,4,7};
////        int k=5;
////        int ans=4;
//
////        int[] nums = {4, 2, 1, 4, 3, 4, 5, 8, 15};
////        int k = 3;
////        int ans = 5;
//
////        int[] nums = {1};
////        int k = 1;
////        int ans = 1;
//
//
////        int[] nums = {2,1,2,3};
////        int k = 3;
////        int ans = 3;
//
////        int[] nums = {1709, 5955, 4331, 1386, 9131, 385, 814, 573, 569, 7114, 8628, 2545, 7082, 6467, 6980, 3368, 3331, 7256, 4243, 2461, 7306, 5998, 6703, 5357, 6676, 8857, 2978, 3217, 2762, 5304, 3473, 2589, 704, 2662, 5183, 1874, 6282, 5685, 152, 6947, 2439, 5215, 8070, 4244, 6364, 1149, 3257, 1123, 7928, 1465, 673, 2797, 3996, 7253, 1705, 2163, 3267, 6465, 4906, 578, 7135, 4879, 8774, 2690, 4474, 1742, 4218, 2988, 6241, 7527, 1779, 2280, 9011, 9431, 2175, 6750, 1263, 3969, 6770, 6155, 8371, 722, 8156, 793, 9550, 5425, 2478, 4687, 9359, 5552, 9590, 3111, 7081, 1091, 883, 2682, 4582, 7592, 2777, 85, 1096, 513, 6998, 1818, 1920, 7762, 2331, 8093, 2563, 5361, 4210, 6563, 7112, 1061, 6542, 7234, 3683, 7429, 8583, 4111, 9184, 5794, 780, 8414, 1522, 5113, 2618, 7798, 4432, 7951, 4507, 9723, 7754, 7513, 574, 4627, 7271, 8511, 2739, 6258, 9089, 6803, 8692, 13, 4147, 3356, 2539, 7321, 6301, 3693, 2944, 2658, 3396, 639, 2758, 3833, 4531, 4658, 7831, 3935, 143, 5533, 1268, 498, 8636, 827, 5569, 5564, 5277, 9273, 7890, 6382, 1635, 8877, 1567, 1977, 9458, 1495, 4529, 8306, 8556, 881, 1994, 3961, 1370, 2616, 9684, 5480, 8656, 5829, 8563, 9197, 8046, 6478, 1965, 1885, 4613, 6457, 8696, 4669, 5301, 8709, 1656, 8820, 8254, 89, 4300, 5670, 3300, 2806, 2761, 9249, 8658, 3023, 2584, 5111, 9006, 7636, 1888, 7519, 40, 5987, 3397, 9960, 3875, 8185, 4727, 4059, 4720, 1602, 9853, 8774, 7854, 6547, 2601, 5544, 5308, 9454, 2954, 1243, 233, 9280, 2441, 2189, 4559, 8594, 5887, 7612, 5982, 3264, 9343, 9380, 9488, 7587, 4851, 6498, 4020, 8047, 5122, 168, 3924, 8957, 6410, 5542, 6650, 3342, 9695, 7693, 6370, 9675, 9314, 3310, 3338, 3004, 6649, 3821, 6112, 719, 5455, 5249, 4969, 5267, 6934, 1249, 2726, 1028, 2029, 6048, 9267, 9189, 8457, 1872, 7290, 4169, 7733, 344, 7145, 4275, 8852, 3560, 9930, 6386, 9271, 1504, 1157, 7657, 2982, 3328, 7143, 2607, 7025, 4683, 2293, 9759, 115, 7200, 3826, 299, 3562, 8695, 7361, 9496, 3810, 1030, 3879, 1882, 776, 691, 2300, 7219, 5195, 609, 3421, 7977, 9909, 4573, 1818, 8651, 4074, 892, 409, 2836, 1844, 9706, 7262, 1827, 5845, 8796, 3926, 1687, 108, 7345, 1565, 3100, 1732, 4404, 3027, 2586, 2783, 9981, 8880, 1326, 1751, 4370, 4929, 9223, 5269, 2215, 7795, 8735, 699, 6151, 2764, 834, 8201, 3990, 5897, 9623, 2563, 4775, 2685, 3292, 4724, 3553, 2246, 1889, 7694, 9593, 428, 5220, 9895, 4618, 7861, 6508, 3521, 5291, 3487, 8736, 2309, 7250, 7621, 4879, 7998, 5167, 6548, 360, 4336, 6534, 2180, 6600, 2006, 2002, 8783, 7714, 5322, 5003, 1859, 3237, 5491, 4346, 6179, 7911, 5800, 3784, 8763, 1321, 1864, 125, 7399, 2192, 71, 2984, 7490, 1831, 3853, 8010, 9291, 2674, 1335, 2809, 859, 4822, 4418, 290, 1662, 2227, 8190, 9145, 6890, 9623, 5745, 9739, 5066, 5004, 3749, 8703, 5165, 6412, 8687, 698, 559, 4671, 5020, 2934, 6239, 4632, 6223, 7776, 3850, 2613, 8056, 8879, 9599, 8758, 4429, 9475, 3305, 4720, 9135, 3345, 618, 8328, 4655, 5507, 9108, 4836, 528, 732, 5811, 3330, 1781, 3940, 2471, 7953, 8057, 5039, 3987, 8459, 9053, 5273, 8710, 2990, 6411, 1299, 5101, 6741, 3701, 6241, 6960, 7690, 7078, 8873, 5222, 4117, 2355, 5376, 7386, 7626, 9742, 7849, 3212, 4201, 4192, 4496, 5641, 4354, 3222, 2767, 8015, 5933, 2535, 6314, 2968, 5328, 3328, 4551, 1510, 1054, 9586, 502, 1616, 7586, 219, 8212, 7361, 1213, 7708, 3785, 142, 1852, 1176, 7009, 2472, 1259, 6415, 3531, 512, 5293, 7410, 5368, 8448, 5245, 3482, 3004, 6085, 2293, 883, 5648, 4233, 2845, 8019, 1706, 5051, 7240, 903, 9722, 3702, 791, 5979, 3820, 5855, 4475, 4850, 5433, 8568, 5354, 7212, 9979, 5023, 4076, 9308, 201, 1772, 5291, 6206, 7432, 9820, 8893, 2510, 9332, 6778, 4706, 1192, 3346, 8837, 2237, 8965, 5940, 9336, 3186, 591, 5099, 993, 6105, 3037, 4955, 6395, 4755, 4816, 2599, 5798, 2123, 8785, 8298, 3750, 2632, 1240, 209, 2672, 8295, 8016, 9865, 2453, 7076, 2875, 9982, 7573, 3498, 3709, 6598, 4059, 7489, 1702, 5511, 2605, 3355, 1622, 3548, 5635, 7258, 7866, 7358, 7284, 2586, 5604, 2461, 4347, 6439, 5101, 451, 4375, 7160, 2806, 1944, 9322, 9967, 6053, 1413, 5597, 4336, 9562, 2387, 7114, 931, 3981, 7488, 4619, 5988, 4902, 3259, 8895, 5889, 8229, 4732, 2369, 123, 8119, 5870, 185, 5858, 434, 9181, 933, 6941, 3484, 4246, 4170, 8620, 2610, 399, 5750, 9419, 9801, 3381, 7466, 7495, 3730, 5713, 3887, 9723, 4226, 9477, 160, 8153, 9747, 700, 1373, 3184, 2141, 8854, 8599, 8920, 9550, 6360, 6622, 7157, 2677, 7148, 5528, 665, 1836, 5313, 5653, 3477, 4521, 3102, 9813, 1597, 6509, 3979, 685, 8367, 4483, 1236, 3075, 2944, 6076, 3400, 3368, 7184, 1086, 1416, 7410, 3150, 6043, 6726, 3854, 9495, 7765, 5530, 8894, 4235, 6914, 6378, 9879, 4655, 4191, 184, 2221, 7460, 3567, 2809, 9145, 9918, 1565, 1068, 3362, 4474, 5501, 5231, 1151, 2249, 337, 7918, 363, 309, 3998, 8907, 2247, 5078, 6130, 7571, 8437, 7036, 3586, 2378, 3414, 7447, 7338, 1103, 5915, 1530, 4510, 7847, 94, 1458, 2608, 8634, 828, 5813, 1461, 6408, 5272, 9431, 8230, 7408, 8369, 3620, 1511, 1066, 6220, 8451, 3536, 2739, 2169, 7295, 114, 2020, 1688, 9631, 1384, 70, 9373, 1277, 1099, 1334, 3979, 9482, 8004, 9413, 8595, 5441, 157, 2123, 7037, 8455, 2973, 5486, 2989, 790, 3746, 8505, 8178, 5493, 6266, 8632, 258, 9282, 7766, 9282, 3826, 6174, 5845, 819, 8982, 2560, 2716, 8583, 9494, 597, 6149, 745, 2670, 946, 1339, 5315, 7785, 7334, 3147, 5740, 1431, 5212, 9333, 8424, 8020, 1096, 828, 3546, 3900, 9342, 5223, 439, 4698, 1814, 9027, 4537, 2190, 3007, 7464, 2153, 4515, 5433, 6868, 9113, 9982, 6157, 8578, 317, 7545, 1504, 9082, 3327, 2545, 6741, 8455, 8287, 3298, 3330, 8696, 6863, 1107, 6603, 7846, 5435, 1933, 9184, 8073, 6056, 2258, 5200, 7035, 4473, 1296, 4732, 7882, 8095, 7012, 6407, 7511, 7016, 4385, 9683, 6084, 8443, 1460, 4809, 7599, 6950, 3279, 3599, 2186, 7987, 5128, 9377, 212, 8133, 3337, 9763, 3874, 4111, 7879, 2353, 1182, 5281, 6449, 8515, 3890, 1766, 222, 7680, 9438, 7058, 7134, 8373, 8713, 9019, 8364, 6439, 4316, 9482, 5898, 8008, 5733, 2079, 7674, 6680, 2061, 5657, 9472, 2467, 8418, 1982, 762, 4764, 5201, 8125, 4306, 6754, 7836, 3121};
//
////        int[] nums = {1709, 5955, 4331, 1386, 9131, 385, 814, 573, 569, 7114, 8628, 2545, 7082, 6467, 6980, 3368, 3331, 7256, 4243, 2461, 7306, 5998, 6703, 5357, 6676, 8857, 2978, 3217, 2762, 5304, 3473, 2589, 704, 2662, 5183, 1874, 6282, 5685, 152, 6947, 2439, 5215, 8070, 4244, 6364, 1149, 3257, 1123, 7928, 1465, 673, 2797, 3996, 7253, 1705, 2163, 3267, 6465, 4906, 578, 7135, 4879, 8774, 2690, 4474, 1742, 4218, 2988, 6241, 7527, 1779, 2280, 9011, 9431, 2175, 6750, 1263, 3969, 6770, 6155, 8371, 722, 8156, 793, 9550, 5425, 2478, 4687, 9359, 5552, 9590, 3111, 7081, 1091, 883, 2682, 4582, 7592, 2777, 85, 1096, 513, 6998, 1818, 1920, 7762, 2331, 8093, 2563, 5361, 4210, 6563, 7112};
////        int[] nums = {1709,5955,4331,1386,7114,9131,385,814,573,569,7114,8628,2545,7082,6467,6980,3368,3331,7256,4243,2461,7306,5998,6703,5357,6676,8857,2978,3217,2762};
////        int[] nums = {1709,5955,4331,1386,7114,9131,385,814,573,569,7114,8628,2545,7082};
////        int[] nums = {1709,5955,4331,1386};
////        int k = 4331;
////        int ans = 63;
//
////        int[] nums = {1,3,3,4};
////        int k = 1;
////        int ans = 2;
//
////                int[] nums = {4,4,4,3,4};
////        int k = 3;
////        int ans = 2;
//
////        int[] nums = {14,20,3,10,14,20,9};
////        int k = 6;
////        int ans = 3;
////        int[] nums = {1,100000};
////        int k = 100000;
////        int ans = 2;
//
//        long time1, time2, time3;
//
//        Map<Integer, Integer> numMap = new HashMap<>();
//        List<Integer> integers = new ArrayList<>();
//
//        int x = 0;
////        for (int num = 0; num < 100000; num++) {
////            if (x != num) {
////                x = num;
////                integers.add(num);
////                numMap.put(num, 1);
////            }
////        }
//        int node = 0;
////        for (int num = 0; num < nums.length; num++) {
////            if (x != nums[num]) {
////                x = nums[num];
////                integers.add(nums[num]);
////                numMap.put(node++, 1);
////            }
////        }
//
//        time1 = System.currentTimeMillis();
//        for (int num = 0; num < stringList.size(); num++) {
//            String s1 = stringList.get(num);
////            System.out.println(s1);
//            Integer integer = Integer.valueOf(s1);
//
//            if (x != integer) {
//                x = integer;
//                integers.add(integer);
//                numMap.put(node++, 1);
//            }
//        }
//
////        System.out.println("stringList.size():" + stringList.size());
////        System.out.println("integers.size():" + integers.size());
////        System.out.println(integers);
//
//        int y = 0;
//        for (int i = integers.size() - 2; i >= 0; i--) {
//            List<Integer> integerList = new ArrayList<>();
//            for (int j = i + 1; j < integers.size(); j++) {
//                int i1 = integers.get(j) - integers.get(i);
//                if (i1 <= k && i1 > 0) {
//                    integerList.add(numMap.get(j));
//                    if (numMap.get(j) >= integers.size() - j) {
//                        break;
//                    }
//                }
//            }
//            if (integerList != null && integerList.size() > 0) {
//
//                int asInt = integerList.stream().mapToInt(v -> v).max().getAsInt();
//                numMap.put(i, asInt + 1);
//            }
//        }
//        time2 = System.currentTimeMillis();
//
////        System.out.println("花了：" + (time2 - time1) + "秒");
////        System.out.println();
////        System.out.println("nums:" + nums.length);
////        System.out.println("k:" + k);
//        int max = 0;
//        for (int i = 0; i < numMap.size(); i++) {
//            Integer integer = numMap.get(i);
//            if (integer > max) {
//                max = integer;
//            }
//
//        }
//
//        System.out.println("numMap:MAX:" + max);
//
////        System.out.println("ans:" + ans);
//    }
//
//
////    @Test
////    public void lengthOfLIS9() throws IOException {
//////        int[] nums={};
//////        int k = 5000;
//////        int ans = 0;
////
////
//////        FileInputStream fis = new FileInputStream("src/test/resources/string.txt");
//////        int content;
//////        String s="";
//////        List<String> stringList = new ArrayList<>();
//////        while ((content = fis.read()) != -1) {
//////            char content1 = (char) content;
//////            if(content1==','){
//////                stringList.add(s);
//////                s="";
//////            }else {
//////                s=s+content1;
//////            }
////////            System.out.println(content1);
//////        }
////
////
//////            System.out.println(stringList);
//////        String s = fis.toString();
//////        String[] split = s.split(",");
////
////
//////        String stringTooLong = IOUtils.toString(fis, "UTF-8");
//////        assertThat(stringTooLong).isNotEmpty();
//////        int[] nums= {7,4,5,1,8,12,4,7};
//////        int k=5;
//////        int ans=4;
////
//////        int[] nums = {4, 2, 1, 4, 3, 4, 5, 8, 15};
//////        int k = 3;
//////        int ans = 5;
////
//////        int[] nums = {1};
//////        int k = 1;
//////        int ans = 1;
////
////
//////        int[] nums = {2,1,2,3};
//////        int k = 3;
//////        int ans = 3;
////
//////        int[] nums = {1709, 5955, 4331, 1386, 9131, 385, 814, 573, 569, 7114, 8628, 2545, 7082, 6467, 6980, 3368, 3331, 7256, 4243, 2461, 7306, 5998, 6703, 5357, 6676, 8857, 2978, 3217, 2762, 5304, 3473, 2589, 704, 2662, 5183, 1874, 6282, 5685, 152, 6947, 2439, 5215, 8070, 4244, 6364, 1149, 3257, 1123, 7928, 1465, 673, 2797, 3996, 7253, 1705, 2163, 3267, 6465, 4906, 578, 7135, 4879, 8774, 2690, 4474, 1742, 4218, 2988, 6241, 7527, 1779, 2280, 9011, 9431, 2175, 6750, 1263, 3969, 6770, 6155, 8371, 722, 8156, 793, 9550, 5425, 2478, 4687, 9359, 5552, 9590, 3111, 7081, 1091, 883, 2682, 4582, 7592, 2777, 85, 1096, 513, 6998, 1818, 1920, 7762, 2331, 8093, 2563, 5361, 4210, 6563, 7112, 1061, 6542, 7234, 3683, 7429, 8583, 4111, 9184, 5794, 780, 8414, 1522, 5113, 2618, 7798, 4432, 7951, 4507, 9723, 7754, 7513, 574, 4627, 7271, 8511, 2739, 6258, 9089, 6803, 8692, 13, 4147, 3356, 2539, 7321, 6301, 3693, 2944, 2658, 3396, 639, 2758, 3833, 4531, 4658, 7831, 3935, 143, 5533, 1268, 498, 8636, 827, 5569, 5564, 5277, 9273, 7890, 6382, 1635, 8877, 1567, 1977, 9458, 1495, 4529, 8306, 8556, 881, 1994, 3961, 1370, 2616, 9684, 5480, 8656, 5829, 8563, 9197, 8046, 6478, 1965, 1885, 4613, 6457, 8696, 4669, 5301, 8709, 1656, 8820, 8254, 89, 4300, 5670, 3300, 2806, 2761, 9249, 8658, 3023, 2584, 5111, 9006, 7636, 1888, 7519, 40, 5987, 3397, 9960, 3875, 8185, 4727, 4059, 4720, 1602, 9853, 8774, 7854, 6547, 2601, 5544, 5308, 9454, 2954, 1243, 233, 9280, 2441, 2189, 4559, 8594, 5887, 7612, 5982, 3264, 9343, 9380, 9488, 7587, 4851, 6498, 4020, 8047, 5122, 168, 3924, 8957, 6410, 5542, 6650, 3342, 9695, 7693, 6370, 9675, 9314, 3310, 3338, 3004, 6649, 3821, 6112, 719, 5455, 5249, 4969, 5267, 6934, 1249, 2726, 1028, 2029, 6048, 9267, 9189, 8457, 1872, 7290, 4169, 7733, 344, 7145, 4275, 8852, 3560, 9930, 6386, 9271, 1504, 1157, 7657, 2982, 3328, 7143, 2607, 7025, 4683, 2293, 9759, 115, 7200, 3826, 299, 3562, 8695, 7361, 9496, 3810, 1030, 3879, 1882, 776, 691, 2300, 7219, 5195, 609, 3421, 7977, 9909, 4573, 1818, 8651, 4074, 892, 409, 2836, 1844, 9706, 7262, 1827, 5845, 8796, 3926, 1687, 108, 7345, 1565, 3100, 1732, 4404, 3027, 2586, 2783, 9981, 8880, 1326, 1751, 4370, 4929, 9223, 5269, 2215, 7795, 8735, 699, 6151, 2764, 834, 8201, 3990, 5897, 9623, 2563, 4775, 2685, 3292, 4724, 3553, 2246, 1889, 7694, 9593, 428, 5220, 9895, 4618, 7861, 6508, 3521, 5291, 3487, 8736, 2309, 7250, 7621, 4879, 7998, 5167, 6548, 360, 4336, 6534, 2180, 6600, 2006, 2002, 8783, 7714, 5322, 5003, 1859, 3237, 5491, 4346, 6179, 7911, 5800, 3784, 8763, 1321, 1864, 125, 7399, 2192, 71, 2984, 7490, 1831, 3853, 8010, 9291, 2674, 1335, 2809, 859, 4822, 4418, 290, 1662, 2227, 8190, 9145, 6890, 9623, 5745, 9739, 5066, 5004, 3749, 8703, 5165, 6412, 8687, 698, 559, 4671, 5020, 2934, 6239, 4632, 6223, 7776, 3850, 2613, 8056, 8879, 9599, 8758, 4429, 9475, 3305, 4720, 9135, 3345, 618, 8328, 4655, 5507, 9108, 4836, 528, 732, 5811, 3330, 1781, 3940, 2471, 7953, 8057, 5039, 3987, 8459, 9053, 5273, 8710, 2990, 6411, 1299, 5101, 6741, 3701, 6241, 6960, 7690, 7078, 8873, 5222, 4117, 2355, 5376, 7386, 7626, 9742, 7849, 3212, 4201, 4192, 4496, 5641, 4354, 3222, 2767, 8015, 5933, 2535, 6314, 2968, 5328, 3328, 4551, 1510, 1054, 9586, 502, 1616, 7586, 219, 8212, 7361, 1213, 7708, 3785, 142, 1852, 1176, 7009, 2472, 1259, 6415, 3531, 512, 5293, 7410, 5368, 8448, 5245, 3482, 3004, 6085, 2293, 883, 5648, 4233, 2845, 8019, 1706, 5051, 7240, 903, 9722, 3702, 791, 5979, 3820, 5855, 4475, 4850, 5433, 8568, 5354, 7212, 9979, 5023, 4076, 9308, 201, 1772, 5291, 6206, 7432, 9820, 8893, 2510, 9332, 6778, 4706, 1192, 3346, 8837, 2237, 8965, 5940, 9336, 3186, 591, 5099, 993, 6105, 3037, 4955, 6395, 4755, 4816, 2599, 5798, 2123, 8785, 8298, 3750, 2632, 1240, 209, 2672, 8295, 8016, 9865, 2453, 7076, 2875, 9982, 7573, 3498, 3709, 6598, 4059, 7489, 1702, 5511, 2605, 3355, 1622, 3548, 5635, 7258, 7866, 7358, 7284, 2586, 5604, 2461, 4347, 6439, 5101, 451, 4375, 7160, 2806, 1944, 9322, 9967, 6053, 1413, 5597, 4336, 9562, 2387, 7114, 931, 3981, 7488, 4619, 5988, 4902, 3259, 8895, 5889, 8229, 4732, 2369, 123, 8119, 5870, 185, 5858, 434, 9181, 933, 6941, 3484, 4246, 4170, 8620, 2610, 399, 5750, 9419, 9801, 3381, 7466, 7495, 3730, 5713, 3887, 9723, 4226, 9477, 160, 8153, 9747, 700, 1373, 3184, 2141, 8854, 8599, 8920, 9550, 6360, 6622, 7157, 2677, 7148, 5528, 665, 1836, 5313, 5653, 3477, 4521, 3102, 9813, 1597, 6509, 3979, 685, 8367, 4483, 1236, 3075, 2944, 6076, 3400, 3368, 7184, 1086, 1416, 7410, 3150, 6043, 6726, 3854, 9495, 7765, 5530, 8894, 4235, 6914, 6378, 9879, 4655, 4191, 184, 2221, 7460, 3567, 2809, 9145, 9918, 1565, 1068, 3362, 4474, 5501, 5231, 1151, 2249, 337, 7918, 363, 309, 3998, 8907, 2247, 5078, 6130, 7571, 8437, 7036, 3586, 2378, 3414, 7447, 7338, 1103, 5915, 1530, 4510, 7847, 94, 1458, 2608, 8634, 828, 5813, 1461, 6408, 5272, 9431, 8230, 7408, 8369, 3620, 1511, 1066, 6220, 8451, 3536, 2739, 2169, 7295, 114, 2020, 1688, 9631, 1384, 70, 9373, 1277, 1099, 1334, 3979, 9482, 8004, 9413, 8595, 5441, 157, 2123, 7037, 8455, 2973, 5486, 2989, 790, 3746, 8505, 8178, 5493, 6266, 8632, 258, 9282, 7766, 9282, 3826, 6174, 5845, 819, 8982, 2560, 2716, 8583, 9494, 597, 6149, 745, 2670, 946, 1339, 5315, 7785, 7334, 3147, 5740, 1431, 5212, 9333, 8424, 8020, 1096, 828, 3546, 3900, 9342, 5223, 439, 4698, 1814, 9027, 4537, 2190, 3007, 7464, 2153, 4515, 5433, 6868, 9113, 9982, 6157, 8578, 317, 7545, 1504, 9082, 3327, 2545, 6741, 8455, 8287, 3298, 3330, 8696, 6863, 1107, 6603, 7846, 5435, 1933, 9184, 8073, 6056, 2258, 5200, 7035, 4473, 1296, 4732, 7882, 8095, 7012, 6407, 7511, 7016, 4385, 9683, 6084, 8443, 1460, 4809, 7599, 6950, 3279, 3599, 2186, 7987, 5128, 9377, 212, 8133, 3337, 9763, 3874, 4111, 7879, 2353, 1182, 5281, 6449, 8515, 3890, 1766, 222, 7680, 9438, 7058, 7134, 8373, 8713, 9019, 8364, 6439, 4316, 9482, 5898, 8008, 5733, 2079, 7674, 6680, 2061, 5657, 9472, 2467, 8418, 1982, 762, 4764, 5201, 8125, 4306, 6754, 7836, 3121};
////
//////        int[] nums = {1709, 5955, 4331, 1386, 9131, 385, 814, 573, 569, 7114, 8628, 2545, 7082, 6467, 6980, 3368, 3331, 7256, 4243, 2461, 7306, 5998, 6703, 5357, 6676, 8857, 2978, 3217, 2762, 5304, 3473, 2589, 704, 2662, 5183, 1874, 6282, 5685, 152, 6947, 2439, 5215, 8070, 4244, 6364, 1149, 3257, 1123, 7928, 1465, 673, 2797, 3996, 7253, 1705, 2163, 3267, 6465, 4906, 578, 7135, 4879, 8774, 2690, 4474, 1742, 4218, 2988, 6241, 7527, 1779, 2280, 9011, 9431, 2175, 6750, 1263, 3969, 6770, 6155, 8371, 722, 8156, 793, 9550, 5425, 2478, 4687, 9359, 5552, 9590, 3111, 7081, 1091, 883, 2682, 4582, 7592, 2777, 85, 1096, 513, 6998, 1818, 1920, 7762, 2331, 8093, 2563, 5361, 4210, 6563, 7112};
//////        int[] nums = {1709,5955,4331,1386,7114,9131,385,814,573,569,7114,8628,2545,7082,6467,6980,3368,3331,7256,4243,2461,7306,5998,6703,5357,6676,8857,2978,3217,2762};
////        int[] nums = {1709,5955,4331,1386,7114,9131,385,814,573,569,7114,8628,2545,7082};
//////        int[] nums = {1709,5955,4331,1386};
////        int k = 4331;
////        int ans = 63;
////
//////        int[] nums = {1,3,3,4};
//////        int k = 1;
//////        int ans = 2;
////
//////                int[] nums = {4,4,4,3,4};
//////        int k = 3;
//////        int ans = 2;
////
//////        int[] nums = {14,20,3,10,14,20,9};
//////        int k = 6;
//////        int ans = 3;
//////        int[] nums = {1,100000};
//////        int k = 100000;
//////        int ans = 2;
////
////        long time1, time2, time3;
////
////        Map<Integer, Integer> numMap = new HashMap<>();
////        List<Integer> integers = new ArrayList<>();
////
////        int x = 0;
//////        for (int num = 0; num < 100000; num++) {
//////            if (x != num) {
//////                x = num;
//////                integers.add(num);
//////                numMap.put(num, 1);
//////            }
//////        }
////        int node = 0;
////        for (int num = 0; num < nums.length; num++) {
////            if (x != nums[num]) {
////                x = nums[num];
////                integers.add(nums[num]);
////                numMap.put(node++, 1);
////            }
////        }
////
////        time1 = System.currentTimeMillis();
//////        for (int num = 0; num < stringList.size(); num++) {
//////            String s1 = stringList.get(num);
////////            System.out.println(s1);
//////            Integer integer = Integer.valueOf(s1);
//////
//////            if (x != integer) {
//////                x = integer;
//////                integers.add(integer);
//////                numMap.put(node++, 1);
//////            }
//////        }
////
//////        System.out.println("stringList.size():"+stringList.size());
//////        System.out.println("integers.size():"+integers.size());
//////        System.out.println(integers);
////        List<Map<Integer, Integer>> mapList = new ArrayList<>();
////        for (int i = integers.size() - 2; i >= 0; i--) {
////            List<Integer> integerList = new ArrayList<>();
////            int m = 0;
////            for (int j = i + 1; j < integers.size(); j++) {
////                boolean no = false;
////                if (j != i + 1) {
////                    if (numMap.get(i + 1) < numMap.get(j)) {
////                        numMap.put(j, numMap.get(j) + 1);
////                        int a = numMap.get(i + 1);
////                        numMap.put(i + 1, numMap.get(j));
////                        numMap.put(j, numMap.get(a));
////                        Collections.swap(integers, i + 1, j);
////                        no = true;
////                    }
////                }
////                int i1 = integers.get(j) - integers.get(i);
////                if (i1 <= k && i1 > 0) {
////                    if (no) {
////
////                        numMap.put(i+1,numMap.get(i+1)  + 1);
////                        break;
////                    }else {
////
////                        numMap.put(j,numMap.get(j)  + 1);
////                    }
////                    break;
////                }
////                m++;
////            }
////
////        }
////
////        time2 = System.currentTimeMillis();
////
////        System.out.println("花了：" + (time2 - time1) + "秒");
////        //        System.out.println();
////        System.out.println("nums:" + nums.length);
////        System.out.println("k:" + k);
////        System.out.println("numMap:" + numMap);
////        int max = 0;
////        for (
////                int i = 0; i < numMap.size(); i++) {
////            Integer integer = numMap.get(i);
////            if (integer > max) {
////                max = integer;
////            }
////
////        }
////
////        System.out.println("numMap:MAX:" + max);
////
////        System.out.println("ans:" + ans);
////    }
//
//
//    @Test
//    public void lengthOfLIS9() throws IOException {
////        int[] nums={};
////        int k = 1;
////        int ans = 0;
//
//
//        //  資料太大須存在txt，取txt檔
//        FileInputStream fis = new FileInputStream("src/test/resources/string.txt");
//        int content;
//        String s = "";
//        List<String> stringList = new ArrayList<>();
//        while ((content = fis.read()) != -1) {
//            char content1 = (char) content;
//            if (content1 == ',') {
//                stringList.add(s);
//                s = "";
//            } else {
//                s = s + content1;
//            }
////            System.out.println(content1);
//        }
//
//
////            System.out.println(stringList);
////        String s = fis.toString();
////        String[] split = s.split(",");
//
//
////        String stringTooLong = IOUtils.toString(fis, "UTF-8");
////        assertThat(stringTooLong).isNotEmpty();
////        int[] nums= {7,4,5,1,8,12,4,7};
////        int k=5;
////        int ans=4;
//
////        int[] nums = {4, 2, 1, 4, 3, 4, 5, 8, 15};
////        int k = 3;
////        int ans = 5;
//
////        int[] nums = {1};
////        int k = 1;
////        int ans = 1;
//
//
////        int[] nums = {2,1,2,3};
////        int k = 3;
////        int ans = 3;
//
//        int[] nums = {1709, 5955, 4331, 1386, 9131, 385, 814, 573, 569, 7114, 8628, 2545, 7082, 6467, 6980, 3368, 3331, 7256, 4243, 2461, 7306, 5998, 6703, 5357, 6676, 8857, 2978, 3217, 2762, 5304, 3473, 2589, 704, 2662, 5183, 1874, 6282, 5685, 152, 6947, 2439, 5215, 8070, 4244, 6364, 1149, 3257, 1123, 7928, 1465, 673, 2797, 3996, 7253, 1705, 2163, 3267, 6465, 4906, 578, 7135, 4879, 8774, 2690, 4474, 1742, 4218, 2988, 6241, 7527, 1779, 2280, 9011, 9431, 2175, 6750, 1263, 3969, 6770, 6155, 8371, 722, 8156, 793, 9550, 5425, 2478, 4687, 9359, 5552, 9590, 3111, 7081, 1091, 883, 2682, 4582, 7592, 2777, 85, 1096, 513, 6998, 1818, 1920, 7762, 2331, 8093, 2563, 5361, 4210, 6563, 7112, 1061, 6542, 7234, 3683, 7429, 8583, 4111, 9184, 5794, 780, 8414, 1522, 5113, 2618, 7798, 4432, 7951, 4507, 9723, 7754, 7513, 574, 4627, 7271, 8511, 2739, 6258, 9089, 6803, 8692, 13, 4147, 3356, 2539, 7321, 6301, 3693, 2944, 2658, 3396, 639, 2758, 3833, 4531, 4658, 7831, 3935, 143, 5533, 1268, 498, 8636, 827, 5569, 5564, 5277, 9273, 7890, 6382, 1635, 8877, 1567, 1977, 9458, 1495, 4529, 8306, 8556, 881, 1994, 3961, 1370, 2616, 9684, 5480, 8656, 5829, 8563, 9197, 8046, 6478, 1965, 1885, 4613, 6457, 8696, 4669, 5301, 8709, 1656, 8820, 8254, 89, 4300, 5670, 3300, 2806, 2761, 9249, 8658, 3023, 2584, 5111, 9006, 7636, 1888, 7519, 40, 5987, 3397, 9960, 3875, 8185, 4727, 4059, 4720, 1602, 9853, 8774, 7854, 6547, 2601, 5544, 5308, 9454, 2954, 1243, 233, 9280, 2441, 2189, 4559, 8594, 5887, 7612, 5982, 3264, 9343, 9380, 9488, 7587, 4851, 6498, 4020, 8047, 5122, 168, 3924, 8957, 6410, 5542, 6650, 3342, 9695, 7693, 6370, 9675, 9314, 3310, 3338, 3004, 6649, 3821, 6112, 719, 5455, 5249, 4969, 5267, 6934, 1249, 2726, 1028, 2029, 6048, 9267, 9189, 8457, 1872, 7290, 4169, 7733, 344, 7145, 4275, 8852, 3560, 9930, 6386, 9271, 1504, 1157, 7657, 2982, 3328, 7143, 2607, 7025, 4683, 2293, 9759, 115, 7200, 3826, 299, 3562, 8695, 7361, 9496, 3810, 1030, 3879, 1882, 776, 691, 2300, 7219, 5195, 609, 3421, 7977, 9909, 4573, 1818, 8651, 4074, 892, 409, 2836, 1844, 9706, 7262, 1827, 5845, 8796, 3926, 1687, 108, 7345, 1565, 3100, 1732, 4404, 3027, 2586, 2783, 9981, 8880, 1326, 1751, 4370, 4929, 9223, 5269, 2215, 7795, 8735, 699, 6151, 2764, 834, 8201, 3990, 5897, 9623, 2563, 4775, 2685, 3292, 4724, 3553, 2246, 1889, 7694, 9593, 428, 5220, 9895, 4618, 7861, 6508, 3521, 5291, 3487, 8736, 2309, 7250, 7621, 4879, 7998, 5167, 6548, 360, 4336, 6534, 2180, 6600, 2006, 2002, 8783, 7714, 5322, 5003, 1859, 3237, 5491, 4346, 6179, 7911, 5800, 3784, 8763, 1321, 1864, 125, 7399, 2192, 71, 2984, 7490, 1831, 3853, 8010, 9291, 2674, 1335, 2809, 859, 4822, 4418, 290, 1662, 2227, 8190, 9145, 6890, 9623, 5745, 9739, 5066, 5004, 3749, 8703, 5165, 6412, 8687, 698, 559, 4671, 5020, 2934, 6239, 4632, 6223, 7776, 3850, 2613, 8056, 8879, 9599, 8758, 4429, 9475, 3305, 4720, 9135, 3345, 618, 8328, 4655, 5507, 9108, 4836, 528, 732, 5811, 3330, 1781, 3940, 2471, 7953, 8057, 5039, 3987, 8459, 9053, 5273, 8710, 2990, 6411, 1299, 5101, 6741, 3701, 6241, 6960, 7690, 7078, 8873, 5222, 4117, 2355, 5376, 7386, 7626, 9742, 7849, 3212, 4201, 4192, 4496, 5641, 4354, 3222, 2767, 8015, 5933, 2535, 6314, 2968, 5328, 3328, 4551, 1510, 1054, 9586, 502, 1616, 7586, 219, 8212, 7361, 1213, 7708, 3785, 142, 1852, 1176, 7009, 2472, 1259, 6415, 3531, 512, 5293, 7410, 5368, 8448, 5245, 3482, 3004, 6085, 2293, 883, 5648, 4233, 2845, 8019, 1706, 5051, 7240, 903, 9722, 3702, 791, 5979, 3820, 5855, 4475, 4850, 5433, 8568, 5354, 7212, 9979, 5023, 4076, 9308, 201, 1772, 5291, 6206, 7432, 9820, 8893, 2510, 9332, 6778, 4706, 1192, 3346, 8837, 2237, 8965, 5940, 9336, 3186, 591, 5099, 993, 6105, 3037, 4955, 6395, 4755, 4816, 2599, 5798, 2123, 8785, 8298, 3750, 2632, 1240, 209, 2672, 8295, 8016, 9865, 2453, 7076, 2875, 9982, 7573, 3498, 3709, 6598, 4059, 7489, 1702, 5511, 2605, 3355, 1622, 3548, 5635, 7258, 7866, 7358, 7284, 2586, 5604, 2461, 4347, 6439, 5101, 451, 4375, 7160, 2806, 1944, 9322, 9967, 6053, 1413, 5597, 4336, 9562, 2387, 7114, 931, 3981, 7488, 4619, 5988, 4902, 3259, 8895, 5889, 8229, 4732, 2369, 123, 8119, 5870, 185, 5858, 434, 9181, 933, 6941, 3484, 4246, 4170, 8620, 2610, 399, 5750, 9419, 9801, 3381, 7466, 7495, 3730, 5713, 3887, 9723, 4226, 9477, 160, 8153, 9747, 700, 1373, 3184, 2141, 8854, 8599, 8920, 9550, 6360, 6622, 7157, 2677, 7148, 5528, 665, 1836, 5313, 5653, 3477, 4521, 3102, 9813, 1597, 6509, 3979, 685, 8367, 4483, 1236, 3075, 2944, 6076, 3400, 3368, 7184, 1086, 1416, 7410, 3150, 6043, 6726, 3854, 9495, 7765, 5530, 8894, 4235, 6914, 6378, 9879, 4655, 4191, 184, 2221, 7460, 3567, 2809, 9145, 9918, 1565, 1068, 3362, 4474, 5501, 5231, 1151, 2249, 337, 7918, 363, 309, 3998, 8907, 2247, 5078, 6130, 7571, 8437, 7036, 3586, 2378, 3414, 7447, 7338, 1103, 5915, 1530, 4510, 7847, 94, 1458, 2608, 8634, 828, 5813, 1461, 6408, 5272, 9431, 8230, 7408, 8369, 3620, 1511, 1066, 6220, 8451, 3536, 2739, 2169, 7295, 114, 2020, 1688, 9631, 1384, 70, 9373, 1277, 1099, 1334, 3979, 9482, 8004, 9413, 8595, 5441, 157, 2123, 7037, 8455, 2973, 5486, 2989, 790, 3746, 8505, 8178, 5493, 6266, 8632, 258, 9282, 7766, 9282, 3826, 6174, 5845, 819, 8982, 2560, 2716, 8583, 9494, 597, 6149, 745, 2670, 946, 1339, 5315, 7785, 7334, 3147, 5740, 1431, 5212, 9333, 8424, 8020, 1096, 828, 3546, 3900, 9342, 5223, 439, 4698, 1814, 9027, 4537, 2190, 3007, 7464, 2153, 4515, 5433, 6868, 9113, 9982, 6157, 8578, 317, 7545, 1504, 9082, 3327, 2545, 6741, 8455, 8287, 3298, 3330, 8696, 6863, 1107, 6603, 7846, 5435, 1933, 9184, 8073, 6056, 2258, 5200, 7035, 4473, 1296, 4732, 7882, 8095, 7012, 6407, 7511, 7016, 4385, 9683, 6084, 8443, 1460, 4809, 7599, 6950, 3279, 3599, 2186, 7987, 5128, 9377, 212, 8133, 3337, 9763, 3874, 4111, 7879, 2353, 1182, 5281, 6449, 8515, 3890, 1766, 222, 7680, 9438, 7058, 7134, 8373, 8713, 9019, 8364, 6439, 4316, 9482, 5898, 8008, 5733, 2079, 7674, 6680, 2061, 5657, 9472, 2467, 8418, 1982, 762, 4764, 5201, 8125, 4306, 6754, 7836, 3121};
//
////        int[] nums = {1709, 5955, 4331, 1386, 9131, 385, 814, 573, 569, 7114, 8628, 2545, 7082, 6467, 6980, 3368, 3331, 7256, 4243, 2461, 7306, 5998, 6703, 5357, 6676, 8857, 2978, 3217, 2762, 5304, 3473, 2589, 704, 2662, 5183, 1874, 6282, 5685, 152, 6947, 2439, 5215, 8070, 4244, 6364, 1149, 3257, 1123, 7928, 1465, 673, 2797, 3996, 7253, 1705, 2163, 3267, 6465, 4906, 578, 7135, 4879, 8774, 2690, 4474, 1742, 4218, 2988, 6241, 7527, 1779, 2280, 9011, 9431, 2175, 6750, 1263, 3969, 6770, 6155, 8371, 722, 8156, 793, 9550, 5425, 2478, 4687, 9359, 5552, 9590, 3111, 7081, 1091, 883, 2682, 4582, 7592, 2777, 85, 1096, 513, 6998, 1818, 1920, 7762, 2331, 8093, 2563, 5361, 4210, 6563, 7112};
////        int[] nums = {1709,5955,4331,1386,7114,9131,385,814,573,569,7114,8628,2545,7082,6467,6980,3368,3331,7256,4243,2461,7306,5998,6703,5357,6676,8857,2978,3217,2762};
////        int[] nums = {1709,5955,4331,1386,7114,9131,385,814,573,569,7114,8628,2545,7082,6467,6980,3368,3331,7256,4243,2461,7306,5998,6703,5357,6676,8857,2978,3217,2762};//8
////                int[] nums = {1709,5955,4331,1386,7114,9131,385,814,573,569,7114,8628,2545,7082,6467,6980,3368,3331,7256,4243,2461,7306,5998};//7
////        int[] nums = {1709,5955,4331,1386,7114,9131,385,814,573,569,7114,8628,2545,7082,6467,6980,3368,3331,7256,4243,2461};//6
////        int[] nums = {1709,5955,4331,1386,7114,9131,385,814,573,569,7114,8628,2545,7082,6467};//4
////        int[] nums = {1709,5955,4331,1386,7114,9131,385,814,573,569,7114,8628,2545,7282};
////        int[] nums = {1709,5955,4331,1386};
//        int k = 4331;
//        int ans = 63;
//
////        int[] nums = {1,3,3,4};
////        int k = 1;
////        int ans = 2;
//
////                int[] nums = {4,4,4,3,4};
////        int k = 3;
////        int ans = 2;
//
////        int[] nums = {14,20,3,10,14,20,9};
////        int k = 6;
////        int ans = 3;
////        int[] nums = {1,100000};
////        int k = 100000;
////        int ans = 2;
//
//        long time1, time2, time3;
//
//        Map<Integer, Integer> numMap = new HashMap<>();
//        List<Integer> integers = new ArrayList<>();
//        List<List<Integer>> mapList = new ArrayList<>();
//
//        int x = 0;
//
//
//        int node = 0;
//        for (int num = 0; num < nums.length; num++) {
//            if (x != nums[num]) {
//                x = nums[num];
//                List<Integer> map = new ArrayList<>();
//                map.add(nums[num]);
//                map.add(1);
//                mapList.add(map);
//            }
//        }
//
//        time1 = System.currentTimeMillis();
//
//        // txt 轉 list
////        for (int num = 0; num < stringList.size(); num++) {
////            String s1 = stringList.get(num);
//////            System.out.println(s1);
////            Integer integer = Integer.valueOf(s1);
////
//////            if (x != integer) {
//////                x = integer;
//////                integers.add(integer);
//////                numMap.put(node++, 1);
//////            }
////                        if (x != integer) {
////                x = integer;
////                List<Integer> map = new ArrayList<>();
////                map.add(integer);
////                map.add(1);
////                mapList.add(map);
////            }
////        }
//
//
//        for (int i = mapList.size() - 2; i >= 0; i--) {
////            int size=0;
//            int m = i;
//            for (int j = i + 1; j < mapList.size(); j++) {
//                int i1 = mapList.get(j).get(0) - mapList.get(i).get(0);
//                if (mapList.get(j - 1).get(1) > mapList.get(j).get(1)) {
//                    m = j;
//                }
//                if (i1 <= k && i1 > 0) {
//                    mapList.get(i).set(1, mapList.get(j).get(1) + 1);
//                    break;
//                }
//            }
//            mapList.add(m, mapList.get(i));
//            mapList.remove(i);
//
////            System.out.println(mapList);
//
//        }
//
//        time2 = System.currentTimeMillis();
//
//        System.out.println("花了：" + (time2 - time1) + "秒");
//        //        System.out.println();
//        System.out.println("nums:" + nums.length);
//        System.out.println("k:" + k);
////        System.out.println("numMap:" + numMap);
//        int max = 0;
//
//        for (
//                int i = 0; i < mapList.size(); i++) {
//            Integer integer = mapList.get(i).get(1);
//            if (integer > max) {
//                max = integer;
//            }
//
//        }
//
//        System.out.println("numMap:MAX:" + max);
//
//        System.out.println("ans:" + ans);
//    }
//
//
//    @Test
//    public void lengthOfLIS9_txt() throws IOException {
//
//        //string.txt
////        int[] nums={};
////        int k = 1;//int k = 5000;
////        int ans = 0;
//
//        //string2.txt
//        int[] nums = {};
//        int k = 500;
//        int ans = 0;
//
////string2==89
////string==50000
//        FileInputStream fis = new FileInputStream("src/test/resources/string2.txt");
//        int content;
//        String s = "";
//        List<String> stringList = new ArrayList<>();
//        while ((content = fis.read()) != -1) {
//            char content1 = (char) content;
//            if (content1 == ',') {
//                stringList.add(s);
//                s = "";
//            } else {
//                s = s + content1;
//            }
////            System.out.println(content1);
//        }
//
//
//        long time1, time2, time3;
//        List<List<Integer>> mapList = new ArrayList<>();
//        int x = 0;
//
//        for (int num = 0; num < stringList.size(); num++) {
//            String s1 = stringList.get(num);
////            System.out.println(s1);
//            Integer integer = Integer.valueOf(s1);
//
////            if (x != integer) {
////                x = integer;
////                integers.add(integer);
////                numMap.put(node++, 1);
////            }
//            if (x != integer) {
//                x = integer;
//                List<Integer> map = new ArrayList<>();
//                map.add(integer);
//                map.add(1);
//                mapList.add(map);
//            }
//        }
//
////        System.out.println(mapList);
//        time1 = System.currentTimeMillis();
//
//        for (int i = mapList.size() - 2; i >= 0; i--) {
//            int m = i;
//            int max = mapList.get(i).get(0);
//            int e = i;
//            for (int j = i + 1; j < mapList.size(); j++) {
////                int i1 = mapList.get(j).get(0) - mapList.get(i).get(0);
////                if(mapList.get(j-1).get(1) >mapList.get(j).get(1)){
////                    m=j;
////                }
////                if (i1 <= k && i1 > 0) {
////                    mapList.get(i).set(1,mapList.get(j).get(1)+1);
////                    break;
////                }
//
//                if (j - i > 1 && mapList.get(j - 1).get(1) > mapList.get(j).get(1)) {
//                    m = e;
//                    e = j;
//                }
//                if (mapList.get(i).get(0) > mapList.get(j).get(0)) {
//                    e = j + 1;
//                }
//                int i1 = mapList.get(j).get(0) - mapList.get(i).get(0);
//                if (i1 <= k && i1 > 0) {
//                    mapList.get(i).set(1, mapList.get(j).get(1) + 1);
//                    break;
//                }
//                if (mapList.size() - 1 == j) {
//                    m = j + 1;
//                }
//
//            }
//            mapList.add(m, mapList.get(i));
//            mapList.remove(i);
//
////            System.out.println(mapList);
//
//        }
//
//        System.out.println(mapList);
//        time2 = System.currentTimeMillis();
//        System.out.println("stringList.size:" + stringList.size());
//        System.out.println("mapList.size:" + mapList.size());
//
//        System.out.println("花了：" + (time2 - time1) + "秒");
//        System.out.println("nums:" + nums.length);
//        System.out.println("k:" + k);
//        int max = 0;
//
//        for (
//                int i = 0; i < mapList.size(); i++) {
//            Integer integer = mapList.get(i).get(1);
//            if (integer > max) {
//                max = integer;
//            }
//
//        }
//        System.out.println("numMap:MAX:" + max);
//        System.out.println("ans:" + ans);
//    }
//
//
//    @Test
//    public void lengthOfLIS9_nums() throws IOException {
//
//
////        String stringTooLong = IOUtils.toString(fis, "UTF-8");
////        assertThat(stringTooLong).isNotEmpty();
////        int[] nums= {7,4,5,1,8,12,4,7};
////        int k=5;
////        int ans=4;
//
////        int[] nums = {4, 2, 1, 4, 3, 4, 5, 8, 15};
////        int k = 3;
////        int ans = 5;
//
////        int[] nums = {1};
////        int k = 1;
////        int ans = 1;
//
//
////        int[] nums = {2,1,2,3};
////        int k = 3;
////        int ans = 3;
//
//        int[] nums = {1709, 5955, 4331, 1386, 9131, 385, 814, 573, 569, 7114, 8628, 2545, 7082, 6467, 6980, 3368, 3331, 7256, 4243, 2461, 7306, 5998, 6703, 5357, 6676, 8857, 2978, 3217, 2762, 5304, 3473, 2589, 704, 2662, 5183, 1874, 6282, 5685, 152, 6947, 2439, 5215, 8070, 4244, 6364, 1149, 3257, 1123, 7928, 1465, 673, 2797, 3996, 7253, 1705, 2163, 3267, 6465, 4906, 578, 7135, 4879, 8774, 2690, 4474, 1742, 4218, 2988, 6241, 7527, 1779, 2280, 9011, 9431, 2175, 6750, 1263, 3969, 6770, 6155, 8371, 722, 8156, 793, 9550, 5425, 2478, 4687, 9359, 5552, 9590, 3111, 7081, 1091, 883, 2682, 4582, 7592, 2777, 85, 1096, 513, 6998, 1818, 1920, 7762, 2331, 8093, 2563, 5361, 4210, 6563, 7112, 1061, 6542, 7234, 3683, 7429, 8583, 4111, 9184, 5794, 780, 8414, 1522, 5113, 2618, 7798, 4432, 7951, 4507, 9723, 7754, 7513, 574, 4627, 7271, 8511, 2739, 6258, 9089, 6803, 8692, 13, 4147, 3356, 2539, 7321, 6301, 3693, 2944, 2658, 3396, 639, 2758, 3833, 4531, 4658, 7831, 3935, 143, 5533, 1268, 498, 8636, 827, 5569, 5564, 5277, 9273, 7890, 6382, 1635, 8877, 1567, 1977, 9458, 1495, 4529, 8306, 8556, 881, 1994, 3961, 1370, 2616, 9684, 5480, 8656, 5829, 8563, 9197, 8046, 6478, 1965, 1885, 4613, 6457, 8696, 4669, 5301, 8709, 1656, 8820, 8254, 89, 4300, 5670, 3300, 2806, 2761, 9249, 8658, 3023, 2584, 5111, 9006, 7636, 1888, 7519, 40, 5987, 3397, 9960, 3875, 8185, 4727, 4059, 4720, 1602, 9853, 8774, 7854, 6547, 2601, 5544, 5308, 9454, 2954, 1243, 233, 9280, 2441, 2189, 4559, 8594, 5887, 7612, 5982, 3264, 9343, 9380, 9488, 7587, 4851, 6498, 4020, 8047, 5122, 168, 3924, 8957, 6410, 5542, 6650, 3342, 9695, 7693, 6370, 9675, 9314, 3310, 3338, 3004, 6649, 3821, 6112, 719, 5455, 5249, 4969, 5267, 6934, 1249, 2726, 1028, 2029, 6048, 9267, 9189, 8457, 1872, 7290, 4169, 7733, 344, 7145, 4275, 8852, 3560, 9930, 6386, 9271, 1504, 1157, 7657, 2982, 3328, 7143, 2607, 7025, 4683, 2293, 9759, 115, 7200, 3826, 299, 3562, 8695, 7361, 9496, 3810, 1030, 3879, 1882, 776, 691, 2300, 7219, 5195, 609, 3421, 7977, 9909, 4573, 1818, 8651, 4074, 892, 409, 2836, 1844, 9706, 7262, 1827, 5845, 8796, 3926, 1687, 108, 7345, 1565, 3100, 1732, 4404, 3027, 2586, 2783, 9981, 8880, 1326, 1751, 4370, 4929, 9223, 5269, 2215, 7795, 8735, 699, 6151, 2764, 834, 8201, 3990, 5897, 9623, 2563, 4775, 2685, 3292, 4724, 3553, 2246, 1889, 7694, 9593, 428, 5220, 9895, 4618, 7861, 6508, 3521, 5291, 3487, 8736, 2309, 7250, 7621, 4879, 7998, 5167, 6548, 360, 4336, 6534, 2180, 6600, 2006, 2002, 8783, 7714, 5322, 5003, 1859, 3237, 5491, 4346, 6179, 7911, 5800, 3784, 8763, 1321, 1864, 125, 7399, 2192, 71, 2984, 7490, 1831, 3853, 8010, 9291, 2674, 1335, 2809, 859, 4822, 4418, 290, 1662, 2227, 8190, 9145, 6890, 9623, 5745, 9739, 5066, 5004, 3749, 8703, 5165, 6412, 8687, 698, 559, 4671, 5020, 2934, 6239, 4632, 6223, 7776, 3850, 2613, 8056, 8879, 9599, 8758, 4429, 9475, 3305, 4720, 9135, 3345, 618, 8328, 4655, 5507, 9108, 4836, 528, 732, 5811, 3330, 1781, 3940, 2471, 7953, 8057, 5039, 3987, 8459, 9053, 5273, 8710, 2990, 6411, 1299, 5101, 6741, 3701, 6241, 6960, 7690, 7078, 8873, 5222, 4117, 2355, 5376, 7386, 7626, 9742, 7849, 3212, 4201, 4192, 4496, 5641, 4354, 3222, 2767, 8015, 5933, 2535, 6314, 2968, 5328, 3328, 4551, 1510, 1054, 9586, 502, 1616, 7586, 219, 8212, 7361, 1213, 7708, 3785, 142, 1852, 1176, 7009, 2472, 1259, 6415, 3531, 512, 5293, 7410, 5368, 8448, 5245, 3482, 3004, 6085, 2293, 883, 5648, 4233, 2845, 8019, 1706, 5051, 7240, 903, 9722, 3702, 791, 5979, 3820, 5855, 4475, 4850, 5433, 8568, 5354, 7212, 9979, 5023, 4076, 9308, 201, 1772, 5291, 6206, 7432, 9820, 8893, 2510, 9332, 6778, 4706, 1192, 3346, 8837, 2237, 8965, 5940, 9336, 3186, 591, 5099, 993, 6105, 3037, 4955, 6395, 4755, 4816, 2599, 5798, 2123, 8785, 8298, 3750, 2632, 1240, 209, 2672, 8295, 8016, 9865, 2453, 7076, 2875, 9982, 7573, 3498, 3709, 6598, 4059, 7489, 1702, 5511, 2605, 3355, 1622, 3548, 5635, 7258, 7866, 7358, 7284, 2586, 5604, 2461, 4347, 6439, 5101, 451, 4375, 7160, 2806, 1944, 9322, 9967, 6053, 1413, 5597, 4336, 9562, 2387, 7114, 931, 3981, 7488, 4619, 5988, 4902, 3259, 8895, 5889, 8229, 4732, 2369, 123, 8119, 5870, 185, 5858, 434, 9181, 933, 6941, 3484, 4246, 4170, 8620, 2610, 399, 5750, 9419, 9801, 3381, 7466, 7495, 3730, 5713, 3887, 9723, 4226, 9477, 160, 8153, 9747, 700, 1373, 3184, 2141, 8854, 8599, 8920, 9550, 6360, 6622, 7157, 2677, 7148, 5528, 665, 1836, 5313, 5653, 3477, 4521, 3102, 9813, 1597, 6509, 3979, 685, 8367, 4483, 1236, 3075, 2944, 6076, 3400, 3368, 7184, 1086, 1416, 7410, 3150, 6043, 6726, 3854, 9495, 7765, 5530, 8894, 4235, 6914, 6378, 9879, 4655, 4191, 184, 2221, 7460, 3567, 2809, 9145, 9918, 1565, 1068, 3362, 4474, 5501, 5231, 1151, 2249, 337, 7918, 363, 309, 3998, 8907, 2247, 5078, 6130, 7571, 8437, 7036, 3586, 2378, 3414, 7447, 7338, 1103, 5915, 1530, 4510, 7847, 94, 1458, 2608, 8634, 828, 5813, 1461, 6408, 5272, 9431, 8230, 7408, 8369, 3620, 1511, 1066, 6220, 8451, 3536, 2739, 2169, 7295, 114, 2020, 1688, 9631, 1384, 70, 9373, 1277, 1099, 1334, 3979, 9482, 8004, 9413, 8595, 5441, 157, 2123, 7037, 8455, 2973, 5486, 2989, 790, 3746, 8505, 8178, 5493, 6266, 8632, 258, 9282, 7766, 9282, 3826, 6174, 5845, 819, 8982, 2560, 2716, 8583, 9494, 597, 6149, 745, 2670, 946, 1339, 5315, 7785, 7334, 3147, 5740, 1431, 5212, 9333, 8424, 8020, 1096, 828, 3546, 3900, 9342, 5223, 439, 4698, 1814, 9027, 4537, 2190, 3007, 7464, 2153, 4515, 5433, 6868, 9113, 9982, 6157, 8578, 317, 7545, 1504, 9082, 3327, 2545, 6741, 8455, 8287, 3298, 3330, 8696, 6863, 1107, 6603, 7846, 5435, 1933, 9184, 8073, 6056, 2258, 5200, 7035, 4473, 1296, 4732, 7882, 8095, 7012, 6407, 7511, 7016, 4385, 9683, 6084, 8443, 1460, 4809, 7599, 6950, 3279, 3599, 2186, 7987, 5128, 9377, 212, 8133, 3337, 9763, 3874, 4111, 7879, 2353, 1182, 5281, 6449, 8515, 3890, 1766, 222, 7680, 9438, 7058, 7134, 8373, 8713, 9019, 8364, 6439, 4316, 9482, 5898, 8008, 5733, 2079, 7674, 6680, 2061, 5657, 9472, 2467, 8418, 1982, 762, 4764, 5201, 8125, 4306, 6754, 7836, 3121};
//
////        int[] nums = {1709, 5955, 4331, 1386, 9131, 385, 814, 573, 569, 7114, 8628, 2545, 7082, 6467, 6980, 3368, 3331, 7256, 4243, 2461, 7306, 5998, 6703, 5357, 6676, 8857, 2978, 3217, 2762, 5304, 3473, 2589, 704, 2662, 5183, 1874, 6282, 5685, 152, 6947, 2439, 5215, 8070, 4244, 6364, 1149, 3257, 1123, 7928, 1465, 673, 2797, 3996, 7253, 1705, 2163, 3267, 6465, 4906, 578, 7135, 4879, 8774, 2690, 4474, 1742, 4218, 2988, 6241, 7527, 1779, 2280, 9011, 9431, 2175, 6750, 1263, 3969, 6770, 6155, 8371, 722, 8156, 793, 9550, 5425, 2478, 4687, 9359, 5552, 9590, 3111, 7081, 1091, 883, 2682, 4582, 7592, 2777, 85, 1096, 513, 6998, 1818, 1920, 7762, 2331, 8093, 2563, 5361, 4210, 6563, 7112};
////        int[] nums = {1709,5955,4331,1386,7114,9131,385,814,573,569,7114,8628,2545,7082,6467,6980,3368,3331,7256,4243,2461,7306,5998,6703,5357,6676,8857,2978,3217,2762};
////        int[] nums = {1709,5955,4331,1386,7114,9131,385,814,573,569,7114,8628,2545,7082,6467,6980,3368,3331,7256,4243,2461,7306,5998,6703,5357,6676,8857,2978,3217,2762};//8
////                int[] nums = {1709,5955,4331,1386,7114,9131,385,814,573,569,7114,8628,2545,7082,6467,6980,3368,3331,7256,4243,2461,7306,5998};//7
////        int[] nums = {1709,5955,4331,1386,7114,9131,385,814,573,569,7114,8628,2545,7082,6467,6980,3368,3331,7256,4243,2461};//6
////        int[] nums = {1709,5955,4331,1386,7114,9131,385,814,573,569,7114,8628,2545,7082,6467};//4
////        int[] nums = {1709,5955,4331,1386,7114,9131,385,814,573,569,7114,8628,2545,7282};
////        int[] nums = {1709,5955,4331,1386};
//        int k = 4331;
//        int ans = 63;
//
////        int[] nums = {1,3,3,4};
////        int k = 1;
////        int ans = 2;
//
////                int[] nums = {4,4,4,3,4};
////        int k = 3;
////        int ans = 2;
//
////        int[] nums = {14,20,3,10,14,20,9};
////        int k = 6;
////        int ans = 3;
////        int[] nums = {1,100000};
////        int k = 100000;
////        int ans = 2;
//
//        long time1, time2, time3;
//
//        List<List<Integer>> mapList = new ArrayList<>();
//        int x = 0;
//
//        for (int num = 0; num < nums.length; num++) {
//            if (x != nums[num]) {
//                x = nums[num];
//                List<Integer> map = new ArrayList<>();
//                map.add(nums[num]);
//                map.add(1);
//                mapList.add(map);
//            }
//        }
//
//        time1 = System.currentTimeMillis();
//        for (int i = mapList.size() - 2; i >= 0; i--) {
////            int size=0;
//            int m = i;
//            int e = i;
//            for (int j = i + 1; j < mapList.size(); j++) {
//                if (mapList.get(i).get(0) > mapList.get(j).get(0)) {
//                    e = j + 1;
//                }
//                if (mapList.get(j - 1).get(1) > mapList.get(j).get(1) || j == mapList.size() - 1) {
//                    m = e;
//
//                }
//                int i1 = mapList.get(j).get(0) - mapList.get(i).get(0);
//
//                if (i1 <= k && i1 > 0) {
//                    mapList.get(i).set(1, mapList.get(j).get(1) + 1);
//                    break;
//                }
//            }
//            mapList.add(m, mapList.get(i));
//            mapList.remove(i);
//
//            System.out.println(mapList);
//
//        }
//
//        time2 = System.currentTimeMillis();
//
//        System.out.println("花了：" + (time2 - time1) + "秒");
//        //        System.out.println();
//        System.out.println("nums:" + nums.length);
//        System.out.println("k:" + k);
////        System.out.println("numMap:" + numMap);
//        int max = 0;
//
//        for (
//                int i = 0; i < mapList.size(); i++) {
//            Integer integer = mapList.get(i).get(1);
//            if (integer > max) {
//                max = integer;
//            }
//
//        }
//
//        System.out.println("numMap:MAX:" + max);
//        System.out.println("ans:" + ans);
//    }
//
//
//    @Test
//    public void lengthOfLIS9_test() throws IOException {
////        int[] nums={};
////        int k = 1;
////        int ans = 0;
//
//
//        //  資料太大須存在txt，取txt檔
//        FileInputStream fis = new FileInputStream("src/test/resources/string.txt");
//        int content;
//        String s = "";
//        List<String> stringList = new ArrayList<>();
//        while ((content = fis.read()) != -1) {
//            char content1 = (char) content;
//            if (content1 == ',') {
//                stringList.add(s);
//                s = "";
//            } else {
//                s = s + content1;
//            }
////            System.out.println(content1);
//        }
//
//
////            System.out.println(stringList);
////        String s = fis.toString();
////        String[] split = s.split(",");
//
//
////        String stringTooLong = IOUtils.toString(fis, "UTF-8");
////        assertThat(stringTooLong).isNotEmpty();
////        int[] nums= {7,4,5,1,8,12,4,7};
////        int k=5;
////        int ans=4;
//
////        int[] nums = {4, 2, 1, 4, 3, 4, 5, 8, 15};
////        int k = 3;
////        int ans = 5;
//
////        int[] nums = {1};
////        int k = 1;
////        int ans = 1;
//
//
////        int[] nums = {2,1,2,3};
////        int k = 3;
////        int ans = 3;
//
////        int[] nums = {1709, 5955, 4331, 1386, 9131, 385, 814, 573, 569, 7114, 8628, 2545, 7082, 6467, 6980, 3368, 3331, 7256, 4243, 2461, 7306, 5998, 6703, 5357, 6676, 8857, 2978, 3217, 2762, 5304, 3473, 2589, 704, 2662, 5183, 1874, 6282, 5685, 152, 6947, 2439, 5215, 8070, 4244, 6364, 1149, 3257, 1123, 7928, 1465, 673, 2797, 3996, 7253, 1705, 2163, 3267, 6465, 4906, 578, 7135, 4879, 8774, 2690, 4474, 1742, 4218, 2988, 6241, 7527, 1779, 2280, 9011, 9431, 2175, 6750, 1263, 3969, 6770, 6155, 8371, 722, 8156, 793, 9550, 5425, 2478, 4687, 9359, 5552, 9590, 3111, 7081, 1091, 883, 2682, 4582, 7592, 2777, 85, 1096, 513, 6998, 1818, 1920, 7762, 2331, 8093, 2563, 5361, 4210, 6563, 7112, 1061, 6542, 7234, 3683, 7429, 8583, 4111, 9184, 5794, 780, 8414, 1522, 5113, 2618, 7798, 4432, 7951, 4507, 9723, 7754, 7513, 574, 4627, 7271, 8511, 2739, 6258, 9089, 6803, 8692, 13, 4147, 3356, 2539, 7321, 6301, 3693, 2944, 2658, 3396, 639, 2758, 3833, 4531, 4658, 7831, 3935, 143, 5533, 1268, 498, 8636, 827, 5569, 5564, 5277, 9273, 7890, 6382, 1635, 8877, 1567, 1977, 9458, 1495, 4529, 8306, 8556, 881, 1994, 3961, 1370, 2616, 9684, 5480, 8656, 5829, 8563, 9197, 8046, 6478, 1965, 1885, 4613, 6457, 8696, 4669, 5301, 8709, 1656, 8820, 8254, 89, 4300, 5670, 3300, 2806, 2761, 9249, 8658, 3023, 2584, 5111, 9006, 7636, 1888, 7519, 40, 5987, 3397, 9960, 3875, 8185, 4727, 4059, 4720, 1602, 9853, 8774, 7854, 6547, 2601, 5544, 5308, 9454, 2954, 1243, 233, 9280, 2441, 2189, 4559, 8594, 5887, 7612, 5982, 3264, 9343, 9380, 9488, 7587, 4851, 6498, 4020, 8047, 5122, 168, 3924, 8957, 6410, 5542, 6650, 3342, 9695, 7693, 6370, 9675, 9314, 3310, 3338, 3004, 6649, 3821, 6112, 719, 5455, 5249, 4969, 5267, 6934, 1249, 2726, 1028, 2029, 6048, 9267, 9189, 8457, 1872, 7290, 4169, 7733, 344, 7145, 4275, 8852, 3560, 9930, 6386, 9271, 1504, 1157, 7657, 2982, 3328, 7143, 2607, 7025, 4683, 2293, 9759, 115, 7200, 3826, 299, 3562, 8695, 7361, 9496, 3810, 1030, 3879, 1882, 776, 691, 2300, 7219, 5195, 609, 3421, 7977, 9909, 4573, 1818, 8651, 4074, 892, 409, 2836, 1844, 9706, 7262, 1827, 5845, 8796, 3926, 1687, 108, 7345, 1565, 3100, 1732, 4404, 3027, 2586, 2783, 9981, 8880, 1326, 1751, 4370, 4929, 9223, 5269, 2215, 7795, 8735, 699, 6151, 2764, 834, 8201, 3990, 5897, 9623, 2563, 4775, 2685, 3292, 4724, 3553, 2246, 1889, 7694, 9593, 428, 5220, 9895, 4618, 7861, 6508, 3521, 5291, 3487, 8736, 2309, 7250, 7621, 4879, 7998, 5167, 6548, 360, 4336, 6534, 2180, 6600, 2006, 2002, 8783, 7714, 5322, 5003, 1859, 3237, 5491, 4346, 6179, 7911, 5800, 3784, 8763, 1321, 1864, 125, 7399, 2192, 71, 2984, 7490, 1831, 3853, 8010, 9291, 2674, 1335, 2809, 859, 4822, 4418, 290, 1662, 2227, 8190, 9145, 6890, 9623, 5745, 9739, 5066, 5004, 3749, 8703, 5165, 6412, 8687, 698, 559, 4671, 5020, 2934, 6239, 4632, 6223, 7776, 3850, 2613, 8056, 8879, 9599, 8758, 4429, 9475, 3305, 4720, 9135, 3345, 618, 8328, 4655, 5507, 9108, 4836, 528, 732, 5811, 3330, 1781, 3940, 2471, 7953, 8057, 5039, 3987, 8459, 9053, 5273, 8710, 2990, 6411, 1299, 5101, 6741, 3701, 6241, 6960, 7690, 7078, 8873, 5222, 4117, 2355, 5376, 7386, 7626, 9742, 7849, 3212, 4201, 4192, 4496, 5641, 4354, 3222, 2767, 8015, 5933, 2535, 6314, 2968, 5328, 3328, 4551, 1510, 1054, 9586, 502, 1616, 7586, 219, 8212, 7361, 1213, 7708, 3785, 142, 1852, 1176, 7009, 2472, 1259, 6415, 3531, 512, 5293, 7410, 5368, 8448, 5245, 3482, 3004, 6085, 2293, 883, 5648, 4233, 2845, 8019, 1706, 5051, 7240, 903, 9722, 3702, 791, 5979, 3820, 5855, 4475, 4850, 5433, 8568, 5354, 7212, 9979, 5023, 4076, 9308, 201, 1772, 5291, 6206, 7432, 9820, 8893, 2510, 9332, 6778, 4706, 1192, 3346, 8837, 2237, 8965, 5940, 9336, 3186, 591, 5099, 993, 6105, 3037, 4955, 6395, 4755, 4816, 2599, 5798, 2123, 8785, 8298, 3750, 2632, 1240, 209, 2672, 8295, 8016, 9865, 2453, 7076, 2875, 9982, 7573, 3498, 3709, 6598, 4059, 7489, 1702, 5511, 2605, 3355, 1622, 3548, 5635, 7258, 7866, 7358, 7284, 2586, 5604, 2461, 4347, 6439, 5101, 451, 4375, 7160, 2806, 1944, 9322, 9967, 6053, 1413, 5597, 4336, 9562, 2387, 7114, 931, 3981, 7488, 4619, 5988, 4902, 3259, 8895, 5889, 8229, 4732, 2369, 123, 8119, 5870, 185, 5858, 434, 9181, 933, 6941, 3484, 4246, 4170, 8620, 2610, 399, 5750, 9419, 9801, 3381, 7466, 7495, 3730, 5713, 3887, 9723, 4226, 9477, 160, 8153, 9747, 700, 1373, 3184, 2141, 8854, 8599, 8920, 9550, 6360, 6622, 7157, 2677, 7148, 5528, 665, 1836, 5313, 5653, 3477, 4521, 3102, 9813, 1597, 6509, 3979, 685, 8367, 4483, 1236, 3075, 2944, 6076, 3400, 3368, 7184, 1086, 1416, 7410, 3150, 6043, 6726, 3854, 9495, 7765, 5530, 8894, 4235, 6914, 6378, 9879, 4655, 4191, 184, 2221, 7460, 3567, 2809, 9145, 9918, 1565, 1068, 3362, 4474, 5501, 5231, 1151, 2249, 337, 7918, 363, 309, 3998, 8907, 2247, 5078, 6130, 7571, 8437, 7036, 3586, 2378, 3414, 7447, 7338, 1103, 5915, 1530, 4510, 7847, 94, 1458, 2608, 8634, 828, 5813, 1461, 6408, 5272, 9431, 8230, 7408, 8369, 3620, 1511, 1066, 6220, 8451, 3536, 2739, 2169, 7295, 114, 2020, 1688, 9631, 1384, 70, 9373, 1277, 1099, 1334, 3979, 9482, 8004, 9413, 8595, 5441, 157, 2123, 7037, 8455, 2973, 5486, 2989, 790, 3746, 8505, 8178, 5493, 6266, 8632, 258, 9282, 7766, 9282, 3826, 6174, 5845, 819, 8982, 2560, 2716, 8583, 9494, 597, 6149, 745, 2670, 946, 1339, 5315, 7785, 7334, 3147, 5740, 1431, 5212, 9333, 8424, 8020, 1096, 828, 3546, 3900, 9342, 5223, 439, 4698, 1814, 9027, 4537, 2190, 3007, 7464, 2153, 4515, 5433, 6868, 9113, 9982, 6157, 8578, 317, 7545, 1504, 9082, 3327, 2545, 6741, 8455, 8287, 3298, 3330, 8696, 6863, 1107, 6603, 7846, 5435, 1933, 9184, 8073, 6056, 2258, 5200, 7035, 4473, 1296, 4732, 7882, 8095, 7012, 6407, 7511, 7016, 4385, 9683, 6084, 8443, 1460, 4809, 7599, 6950, 3279, 3599, 2186, 7987, 5128, 9377, 212, 8133, 3337, 9763, 3874, 4111, 7879, 2353, 1182, 5281, 6449, 8515, 3890, 1766, 222, 7680, 9438, 7058, 7134, 8373, 8713, 9019, 8364, 6439, 4316, 9482, 5898, 8008, 5733, 2079, 7674, 6680, 2061, 5657, 9472, 2467, 8418, 1982, 762, 4764, 5201, 8125, 4306, 6754, 7836, 3121};
//
////        int[] nums = {1709, 5955, 4331, 1386, 9131, 385, 814, 573, 569, 7114, 8628, 2545, 7082, 6467, 6980, 3368, 3331, 7256, 4243, 2461, 7306, 5998, 6703, 5357, 6676, 8857, 2978, 3217, 2762, 5304, 3473, 2589, 704, 2662, 5183, 1874, 6282, 5685, 152, 6947, 2439, 5215, 8070, 4244, 6364, 1149, 3257, 1123, 7928, 1465, 673, 2797, 3996, 7253, 1705, 2163, 3267, 6465, 4906, 578, 7135, 4879, 8774, 2690, 4474, 1742, 4218, 2988, 6241, 7527, 1779, 2280, 9011, 9431, 2175, 6750, 1263, 3969, 6770, 6155, 8371, 722, 8156, 793, 9550, 5425, 2478, 4687, 9359, 5552, 9590, 3111, 7081, 1091, 883, 2682, 4582, 7592, 2777, 85, 1096, 513, 6998, 1818, 1920, 7762, 2331, 8093, 2563, 5361, 4210, 6563, 7112};
////        int[] nums = {1709,5955,4331,1386,7114,9131,385,814,573,569,7114,8628,2545,7082,6467,6980,3368,3331,7256,4243,2461,7306,5998,6703,5357,6676,8857,2978,3217,2762};
////        int[] nums = {1709,5955,4331,1386,7114,9131,385,814,573,569,7114,8628,2545,7082,6467,6980,3368,3331,7256,4243,2461,7306,5998,6703,5357,6676,8857,2978,3217,2762};//8
////                int[] nums = {1709,5955,4331,1386,7114,9131,385,814,573,569,7114,8628,2545,7082,6467,6980,3368,3331,7256,4243,2461,7306,5998};//7
//        int[] nums = {1709, 5955, 4331, 1386, 7114, 9131, 385, 814, 573, 569, 7114, 8628, 2545, 7082, 6467, 6980, 3368, 3331, 7256, 4243, 2461};//6
////        int[] nums = {1709,5955,4331,1386,7114,9131,385,814,573,569,7114,8628,2545,7082,6467};//4
////        int[] nums = {1709,5955,4331,1386,7114,9131,385,814,573,569,7114,8628,2545,7282};
////        int[] nums = {1709,5955,4331,1386};
//        int k = 4331;
//        int ans = 63;
//
////        int[] nums = {1,3,3,4};
////        int k = 1;
////        int ans = 2;
//
////                int[] nums = {4,4,4,3,4};
////        int k = 3;
////        int ans = 2;
//
////        int[] nums = {14,20,3,10,14,20,9};
////        int k = 6;
////        int ans = 3;
////        int[] nums = {1,100000};
////        int k = 100000;
////        int ans = 2;
//
//        long time1, time2, time3;
//
//        Map<Integer, Integer> numMap = new HashMap<>();
//        List<Integer> integers = new ArrayList<>();
//        List<List<Integer>> mapList = new ArrayList<>();
//
//        int x = 0;
//
//
//        int node = 0;
//        for (int num = 0; num < nums.length; num++) {
//            if (x != nums[num]) {
//                x = nums[num];
//                List<Integer> map = new ArrayList<>();
//                map.add(nums[num]);
//                map.add(1);
//                mapList.add(map);
//            }
//        }
//
//        time1 = System.currentTimeMillis();
//
//        // txt 轉 list
////        for (int num = 0; num < stringList.size(); num++) {
////            String s1 = stringList.get(num);
//////            System.out.println(s1);
////            Integer integer = Integer.valueOf(s1);
////
//////            if (x != integer) {
//////                x = integer;
//////                integers.add(integer);
//////                numMap.put(node++, 1);
//////            }
////                        if (x != integer) {
////                x = integer;
////                List<Integer> map = new ArrayList<>();
////                map.add(integer);
////                map.add(1);
////                mapList.add(map);
////            }
////        }
//
//
//        for (int i = mapList.size() - 2; i >= 0; i--) {
//            int m = i;
//            int e = i;
//            for (int j = i + 1; j < mapList.size(); j++) {
//                if (j - i > 1 && mapList.get(j - 1).get(1) > mapList.get(j).get(1)) {
//                    m = e;
//                    e = j;
//                }
//                if (mapList.get(i).get(0) > mapList.get(j).get(0)) {
//                    e = j + 1;
//                }
//                int i1 = mapList.get(j).get(0) - mapList.get(i).get(0);
//                if (i1 <= k && i1 > 0) {
//                    mapList.get(i).set(1, mapList.get(j).get(1) + 1);
//                    break;
//                }
//                if (mapList.size() - 1 == j) {
//                    m = j + 1;
//                }
//            }
//            mapList.add(m, mapList.get(i));
//            mapList.remove(i);
//
//            System.out.println(mapList);
//
//        }
//
//        time2 = System.currentTimeMillis();
//
//        System.out.println("花了：" + (time2 - time1) + "秒");
//        //        System.out.println();
//        System.out.println("nums:" + nums.length);
//        System.out.println("k:" + k);
////        System.out.println("numMap:" + numMap);
//        int max = 0;
//
//        for (
//                int i = 0; i < mapList.size(); i++) {
//            Integer integer = mapList.get(i).get(1);
//            if (integer > max) {
//                max = integer;
//            }
//
//        }
//
//        System.out.println("numMap:MAX:" + max);
//
//        System.out.println("ans:" + ans);
//    }
//
//
//    // 2分法-ok
//    @Test
//    public void lengthOfLIS9_test_3() throws IOException {
////        int[] nums={};
////        int k = 1;
////        int ans = 0;
//
//
//        //  資料太大須存在txt，取txt檔
////        FileInputStream fis = new FileInputStream("src/test/resources/string.txt");
////        int content;
////        String s = "";
////        List<String> stringList = new ArrayList<>();
////        while ((content = fis.read()) != -1) {
////            char content1 = (char) content;
////            if (content1 == ',') {
////                stringList.add(s);
////                s = "";
////            } else {
////                s = s + content1;
////            }
//////            System.out.println(content1);
////        }
//
//
////            System.out.println(stringList);
////        String s = fis.toString();
////        String[] split = s.split(",");
//
//
////        String stringTooLong = IOUtils.toString(fis, "UTF-8");
////        assertThat(stringTooLong).isNotEmpty();
////        int[] nums= {7,4,5,1,8,12,4,7};
////        int k=5;
////        int ans=4;
//
////        int[] nums = {4, 2, 1, 4, 3, 4, 5, 8, 15};
////        int k = 3;
////        int ans = 5;
//
////        int[] nums = {1};
////        int k = 1;
////        int ans = 1;
//
//
////        int[] nums = {2,1,2,3};
////        int k = 3;
////        int ans = 3;
//
//        int[] nums = {1709, 5955, 4331, 1386, 9131, 385, 814, 573, 569, 7114, 8628, 2545, 7082, 6467, 6980, 3368, 3331, 7256, 4243, 2461, 7306, 5998, 6703, 5357, 6676, 8857, 2978, 3217, 2762, 5304, 3473, 2589, 704, 2662, 5183, 1874, 6282, 5685, 152, 6947, 2439, 5215, 8070, 4244, 6364, 1149, 3257, 1123, 7928, 1465, 673, 2797, 3996, 7253, 1705, 2163, 3267, 6465, 4906, 578, 7135, 4879, 8774, 2690, 4474, 1742, 4218, 2988, 6241, 7527, 1779, 2280, 9011, 9431, 2175, 6750, 1263, 3969, 6770, 6155, 8371, 722, 8156, 793, 9550, 5425, 2478, 4687, 9359, 5552, 9590, 3111, 7081, 1091, 883, 2682, 4582, 7592, 2777, 85, 1096, 513, 6998, 1818, 1920, 7762, 2331, 8093, 2563, 5361, 4210, 6563, 7112, 1061, 6542, 7234, 3683, 7429, 8583, 4111, 9184, 5794, 780, 8414, 1522, 5113, 2618, 7798, 4432, 7951, 4507, 9723, 7754, 7513, 574, 4627, 7271, 8511, 2739, 6258, 9089, 6803, 8692, 13, 4147, 3356, 2539, 7321, 6301, 3693, 2944, 2658, 3396, 639, 2758, 3833, 4531, 4658, 7831, 3935, 143, 5533, 1268, 498, 8636, 827, 5569, 5564, 5277, 9273, 7890, 6382, 1635, 8877, 1567, 1977, 9458, 1495, 4529, 8306, 8556, 881, 1994, 3961, 1370, 2616, 9684, 5480, 8656, 5829, 8563, 9197, 8046, 6478, 1965, 1885, 4613, 6457, 8696, 4669, 5301, 8709, 1656, 8820, 8254, 89, 4300, 5670, 3300, 2806, 2761, 9249, 8658, 3023, 2584, 5111, 9006, 7636, 1888, 7519, 40, 5987, 3397, 9960, 3875, 8185, 4727, 4059, 4720, 1602, 9853, 8774, 7854, 6547, 2601, 5544, 5308, 9454, 2954, 1243, 233, 9280, 2441, 2189, 4559, 8594, 5887, 7612, 5982, 3264, 9343, 9380, 9488, 7587, 4851, 6498, 4020, 8047, 5122, 168, 3924, 8957, 6410, 5542, 6650, 3342, 9695, 7693, 6370, 9675, 9314, 3310, 3338, 3004, 6649, 3821, 6112, 719, 5455, 5249, 4969, 5267, 6934, 1249, 2726, 1028, 2029, 6048, 9267, 9189, 8457, 1872, 7290, 4169, 7733, 344, 7145, 4275, 8852, 3560, 9930, 6386, 9271, 1504, 1157, 7657, 2982, 3328, 7143, 2607, 7025, 4683, 2293, 9759, 115, 7200, 3826, 299, 3562, 8695, 7361, 9496, 3810, 1030, 3879, 1882, 776, 691, 2300, 7219, 5195, 609, 3421, 7977, 9909, 4573, 1818, 8651, 4074, 892, 409, 2836, 1844, 9706, 7262, 1827, 5845, 8796, 3926, 1687, 108, 7345, 1565, 3100, 1732, 4404, 3027, 2586, 2783, 9981, 8880, 1326, 1751, 4370, 4929, 9223, 5269, 2215, 7795, 8735, 699, 6151, 2764, 834, 8201, 3990, 5897, 9623, 2563, 4775, 2685, 3292, 4724, 3553, 2246, 1889, 7694, 9593, 428, 5220, 9895, 4618, 7861, 6508, 3521, 5291, 3487, 8736, 2309, 7250, 7621, 4879, 7998, 5167, 6548, 360, 4336, 6534, 2180, 6600, 2006, 2002, 8783, 7714, 5322, 5003, 1859, 3237, 5491, 4346, 6179, 7911, 5800, 3784, 8763, 1321, 1864, 125, 7399, 2192, 71, 2984, 7490, 1831, 3853, 8010, 9291, 2674, 1335, 2809, 859, 4822, 4418, 290, 1662, 2227, 8190, 9145, 6890, 9623, 5745, 9739, 5066, 5004, 3749, 8703, 5165, 6412, 8687, 698, 559, 4671, 5020, 2934, 6239, 4632, 6223, 7776, 3850, 2613, 8056, 8879, 9599, 8758, 4429, 9475, 3305, 4720, 9135, 3345, 618, 8328, 4655, 5507, 9108, 4836, 528, 732, 5811, 3330, 1781, 3940, 2471, 7953, 8057, 5039, 3987, 8459, 9053, 5273, 8710, 2990, 6411, 1299, 5101, 6741, 3701, 6241, 6960, 7690, 7078, 8873, 5222, 4117, 2355, 5376, 7386, 7626, 9742, 7849, 3212, 4201, 4192, 4496, 5641, 4354, 3222, 2767, 8015, 5933, 2535, 6314, 2968, 5328, 3328, 4551, 1510, 1054, 9586, 502, 1616, 7586, 219, 8212, 7361, 1213, 7708, 3785, 142, 1852, 1176, 7009, 2472, 1259, 6415, 3531, 512, 5293, 7410, 5368, 8448, 5245, 3482, 3004, 6085, 2293, 883, 5648, 4233, 2845, 8019, 1706, 5051, 7240, 903, 9722, 3702, 791, 5979, 3820, 5855, 4475, 4850, 5433, 8568, 5354, 7212, 9979, 5023, 4076, 9308, 201, 1772, 5291, 6206, 7432, 9820, 8893, 2510, 9332, 6778, 4706, 1192, 3346, 8837, 2237, 8965, 5940, 9336, 3186, 591, 5099, 993, 6105, 3037, 4955, 6395, 4755, 4816, 2599, 5798, 2123, 8785, 8298, 3750, 2632, 1240, 209, 2672, 8295, 8016, 9865, 2453, 7076, 2875, 9982, 7573, 3498, 3709, 6598, 4059, 7489, 1702, 5511, 2605, 3355, 1622, 3548, 5635, 7258, 7866, 7358, 7284, 2586, 5604, 2461, 4347, 6439, 5101, 451, 4375, 7160, 2806, 1944, 9322, 9967, 6053, 1413, 5597, 4336, 9562, 2387, 7114, 931, 3981, 7488, 4619, 5988, 4902, 3259, 8895, 5889, 8229, 4732, 2369, 123, 8119, 5870, 185, 5858, 434, 9181, 933, 6941, 3484, 4246, 4170, 8620, 2610, 399, 5750, 9419, 9801, 3381, 7466, 7495, 3730, 5713, 3887, 9723, 4226, 9477, 160, 8153, 9747, 700, 1373, 3184, 2141, 8854, 8599, 8920, 9550, 6360, 6622, 7157, 2677, 7148, 5528, 665, 1836, 5313, 5653, 3477, 4521, 3102, 9813, 1597, 6509, 3979, 685, 8367, 4483, 1236, 3075, 2944, 6076, 3400, 3368, 7184, 1086, 1416, 7410, 3150, 6043, 6726, 3854, 9495, 7765, 5530, 8894, 4235, 6914, 6378, 9879, 4655, 4191, 184, 2221, 7460, 3567, 2809, 9145, 9918, 1565, 1068, 3362, 4474, 5501, 5231, 1151, 2249, 337, 7918, 363, 309, 3998, 8907, 2247, 5078, 6130, 7571, 8437, 7036, 3586, 2378, 3414, 7447, 7338, 1103, 5915, 1530, 4510, 7847, 94, 1458, 2608, 8634, 828, 5813, 1461, 6408, 5272, 9431, 8230, 7408, 8369, 3620, 1511, 1066, 6220, 8451, 3536, 2739, 2169, 7295, 114, 2020, 1688, 9631, 1384, 70, 9373, 1277, 1099, 1334, 3979, 9482, 8004, 9413, 8595, 5441, 157, 2123, 7037, 8455, 2973, 5486, 2989, 790, 3746, 8505, 8178, 5493, 6266, 8632, 258, 9282, 7766, 9282, 3826, 6174, 5845, 819, 8982, 2560, 2716, 8583, 9494, 597, 6149, 745, 2670, 946, 1339, 5315, 7785, 7334, 3147, 5740, 1431, 5212, 9333, 8424, 8020, 1096, 828, 3546, 3900, 9342, 5223, 439, 4698, 1814, 9027, 4537, 2190, 3007, 7464, 2153, 4515, 5433, 6868, 9113, 9982, 6157, 8578, 317, 7545, 1504, 9082, 3327, 2545, 6741, 8455, 8287, 3298, 3330, 8696, 6863, 1107, 6603, 7846, 5435, 1933, 9184, 8073, 6056, 2258, 5200, 7035, 4473, 1296, 4732, 7882, 8095, 7012, 6407, 7511, 7016, 4385, 9683, 6084, 8443, 1460, 4809, 7599, 6950, 3279, 3599, 2186, 7987, 5128, 9377, 212, 8133, 3337, 9763, 3874, 4111, 7879, 2353, 1182, 5281, 6449, 8515, 3890, 1766, 222, 7680, 9438, 7058, 7134, 8373, 8713, 9019, 8364, 6439, 4316, 9482, 5898, 8008, 5733, 2079, 7674, 6680, 2061, 5657, 9472, 2467, 8418, 1982, 762, 4764, 5201, 8125, 4306, 6754, 7836, 3121};
//
////        int[] nums = {1709, 5955, 4331, 1386, 9131, 385, 814, 573, 569, 7114, 8628, 2545, 7082, 6467, 6980, 3368, 3331, 7256, 4243, 2461, 7306, 5998, 6703, 5357, 6676, 8857, 2978, 3217, 2762, 5304, 3473, 2589, 704, 2662, 5183, 1874, 6282, 5685, 152, 6947, 2439, 5215, 8070, 4244, 6364, 1149, 3257, 1123, 7928, 1465, 673, 2797, 3996, 7253, 1705, 2163, 3267, 6465, 4906, 578, 7135, 4879, 8774, 2690, 4474, 1742, 4218, 2988, 6241, 7527, 1779, 2280, 9011, 9431, 2175, 6750, 1263, 3969, 6770, 6155, 8371, 722, 8156, 793, 9550, 5425, 2478, 4687, 9359, 5552, 9590, 3111, 7081, 1091, 883, 2682, 4582, 7592, 2777, 85, 1096, 513, 6998, 1818, 1920, 7762, 2331, 8093, 2563, 5361, 4210, 6563, 7112};
////        int[] nums = {1709,5955,4331,1386,7114,9131,385,814,573,569,7114,8628,2545,7082,6467,6980,3368,3331,7256,4243,2461,7306,5998,6703,5357,6676,8857,2978,3217,2762};
////        int[] nums = {1709,5955,4331,1386,7114,9131,385,814,573,569,7114,8628,2545,7082,6467,6980,3368,3331,7256,4243,2461,7306,5998,6703,5357,6676,8857,2978,3217,2762};//8
////                int[] nums = {1709,5955,4331,1386,7114,9131,385,814,573,569,7114,8628,2545,7082,6467,6980,3368,3331,7256,4243,2461,7306,5998};//7
////        int[] nums = {1709, 5955, 4331, 1386, 7114, 9131, 385, 814, 573, 569, 7114, 8628, 2545, 7082, 6467, 6980, 3368, 3331, 7256, 4243, 2461};//6
////        int[] nums = {1709,5955,4331,1386,7114,9131,385,814,573,569,7114,8628,2545,7082,6467};//4
////        int[] nums = {1709,5955,4331,1386,7114,9131,385,814,573,569,7114,8628,2545,7282};
////        int[] nums = {1709,5955,4331,1386};
//        int k = 4331;
//        int ans = 63;
//
////        int[] nums = {1,3,3,4};
////        int k = 1;
////        int ans = 2;
//
////                int[] nums = {4,4,4,3,4};
////        int k = 3;
////        int ans = 2;
//
////        int[] nums = {14,20,3,10,14,20,9};
////        int k = 6;
////        int ans = 3;
////        int[] nums = {1,100000};
////        int k = 100000;
////        int ans = 2;
//
//        long time1, time2, time3;
//
//        List<List<List<Integer>>> mapLists = new ArrayList<>();
//        List<List<Integer>> mapList = new ArrayList<>();
//
//        List<Integer> map = new ArrayList<>();
//        map.add(nums[nums.length - 1]);
//        map.add(1);
//        mapList.add(map);
//        mapLists.add(mapList);
//
//
//        time1 = System.currentTimeMillis();
//
//
//        for (int z = nums.length - 2; z >= 0; z--) {
//            int x = 0;
//            int y = 0;
//            int count = 1;
//            boolean mach = false;
//
//            for (int i = mapLists.size() - 1; i >= 0; i--) {
//                x = 0;
//                y = mapLists.get(i).size();
//                List<List<Integer>> lists = mapLists.get(i);
//                while (!mach) {
//                    int node = (x + y) / 2;
//                    if (nums[z] >= lists.get(node).get(0)) {
//                        x = node;
//                    }
//                    if (nums[z] < lists.get(node).get(0)) {
//                        y = node;
//                        int i1 = lists.get(node).get(0) - nums[z];
//                        if (i1 <= k && i1 > 0) {
//                            count = mapLists.get(i).get(0).get(1) + 1;
//                            mach = true;
//                        }
//                    }
//
//                    if (x == y || y - x <= 1) {
//                        break;
//                    }
//                }
//            }
//
//            if (mach && count > mapLists.size()) {
//                List<List<Integer>> mapList2 = new ArrayList<>();
//                List<Integer> map2 = new ArrayList<>();
//                map2.add(nums[z]);
//                map2.add(count);
//                mapList2.add(map2);
//                mapLists.add(mapList2);
//            } else {
//                List<List<Integer>> lists = mapLists.get(count - 1);
//                mach = false;
//                x = 0;
//                int min = k;
//                int machNode = mapLists.get(count - 1).size();
//                y = mapLists.get(count - 1).size();
//                while (mach) {
//                    int node = (x + y) / 2;
//                    if (nums[z] >= lists.get(node).get(0)) {
//                        x = node;
//                    }
//                    if (nums[z] < lists.get(node).get(0)) {
//                        y = node;
//                        int i1 = nums[z] - lists.get(node).get(0);
//                        machNode = node;
//                    }
//                }
//                List<Integer> map2 = new ArrayList<>();
//                map2.add(nums[z]);
//                map2.add(count);
//                mapLists.get(count - 1).add(machNode, map2);
//            }
//
//
//            System.out.println("mapLists:" + mapLists);
//
//        }
//
//        time2 = System.currentTimeMillis();
//
//        System.out.println("mapLists:" + mapLists);
//        System.out.println("花了：" + (time2 - time1) + "秒");
//        //        System.out.println();
//        System.out.println("nums:" + nums.length);
//        System.out.println("k:" + k);
////        System.out.println("numMap:" + numMap);
//
//        System.out.println("numMap:MAX:" + mapLists.size());
//
//        System.out.println("ans:" + ans);
//    }
//
//
//    // 2分法-ok
//    @Test
//    public void lengthOfLIS9_test_3_txt() throws IOException {
//        int[] nums = {};
//        int k = 500;
//        int ans = 0;
//
//        //string2==89
//        //string==50000
//        //  資料太大須存在txt，取txt檔
//        FileInputStream fis = new FileInputStream("src/test/resources/string2.txt");
//        int content;
//        String s = "";
//        List<String> stringList = new ArrayList<>();
//        while ((content = fis.read()) != -1) {
//            char content1 = (char) content;
//            if (content1 == ',') {
//                stringList.add(s);
//                s = "";
//            } else {
//                s = s + content1;
//            }
////            System.out.println(content1);
//        }
//
//
////            System.out.println(stringList);
////        String s = fis.toString();
////        String[] split = s.split(",");
//
//
////        String stringTooLong = IOUtils.toString(fis, "UTF-8");
////        assertThat(stringTooLong).isNotEmpty();
////        int[] nums= {7,4,5,1,8,12,4,7};
////        int k=5;
////        int ans=4;
//
////        int[] nums = {4, 2, 1, 4, 3, 4, 5, 8, 15};
////        int k = 3;
////        int ans = 5;
//
////        int[] nums = {1};
////        int k = 1;
////        int ans = 1;
//
//
////        int[] nums = {2,1,2,3};
////        int k = 3;
////        int ans = 3;
//
////        int[] nums = {1709, 5955, 4331, 1386, 9131, 385, 814, 573, 569, 7114, 8628, 2545, 7082, 6467, 6980, 3368, 3331, 7256, 4243, 2461, 7306, 5998, 6703, 5357, 6676, 8857, 2978, 3217, 2762, 5304, 3473, 2589, 704, 2662, 5183, 1874, 6282, 5685, 152, 6947, 2439, 5215, 8070, 4244, 6364, 1149, 3257, 1123, 7928, 1465, 673, 2797, 3996, 7253, 1705, 2163, 3267, 6465, 4906, 578, 7135, 4879, 8774, 2690, 4474, 1742, 4218, 2988, 6241, 7527, 1779, 2280, 9011, 9431, 2175, 6750, 1263, 3969, 6770, 6155, 8371, 722, 8156, 793, 9550, 5425, 2478, 4687, 9359, 5552, 9590, 3111, 7081, 1091, 883, 2682, 4582, 7592, 2777, 85, 1096, 513, 6998, 1818, 1920, 7762, 2331, 8093, 2563, 5361, 4210, 6563, 7112, 1061, 6542, 7234, 3683, 7429, 8583, 4111, 9184, 5794, 780, 8414, 1522, 5113, 2618, 7798, 4432, 7951, 4507, 9723, 7754, 7513, 574, 4627, 7271, 8511, 2739, 6258, 9089, 6803, 8692, 13, 4147, 3356, 2539, 7321, 6301, 3693, 2944, 2658, 3396, 639, 2758, 3833, 4531, 4658, 7831, 3935, 143, 5533, 1268, 498, 8636, 827, 5569, 5564, 5277, 9273, 7890, 6382, 1635, 8877, 1567, 1977, 9458, 1495, 4529, 8306, 8556, 881, 1994, 3961, 1370, 2616, 9684, 5480, 8656, 5829, 8563, 9197, 8046, 6478, 1965, 1885, 4613, 6457, 8696, 4669, 5301, 8709, 1656, 8820, 8254, 89, 4300, 5670, 3300, 2806, 2761, 9249, 8658, 3023, 2584, 5111, 9006, 7636, 1888, 7519, 40, 5987, 3397, 9960, 3875, 8185, 4727, 4059, 4720, 1602, 9853, 8774, 7854, 6547, 2601, 5544, 5308, 9454, 2954, 1243, 233, 9280, 2441, 2189, 4559, 8594, 5887, 7612, 5982, 3264, 9343, 9380, 9488, 7587, 4851, 6498, 4020, 8047, 5122, 168, 3924, 8957, 6410, 5542, 6650, 3342, 9695, 7693, 6370, 9675, 9314, 3310, 3338, 3004, 6649, 3821, 6112, 719, 5455, 5249, 4969, 5267, 6934, 1249, 2726, 1028, 2029, 6048, 9267, 9189, 8457, 1872, 7290, 4169, 7733, 344, 7145, 4275, 8852, 3560, 9930, 6386, 9271, 1504, 1157, 7657, 2982, 3328, 7143, 2607, 7025, 4683, 2293, 9759, 115, 7200, 3826, 299, 3562, 8695, 7361, 9496, 3810, 1030, 3879, 1882, 776, 691, 2300, 7219, 5195, 609, 3421, 7977, 9909, 4573, 1818, 8651, 4074, 892, 409, 2836, 1844, 9706, 7262, 1827, 5845, 8796, 3926, 1687, 108, 7345, 1565, 3100, 1732, 4404, 3027, 2586, 2783, 9981, 8880, 1326, 1751, 4370, 4929, 9223, 5269, 2215, 7795, 8735, 699, 6151, 2764, 834, 8201, 3990, 5897, 9623, 2563, 4775, 2685, 3292, 4724, 3553, 2246, 1889, 7694, 9593, 428, 5220, 9895, 4618, 7861, 6508, 3521, 5291, 3487, 8736, 2309, 7250, 7621, 4879, 7998, 5167, 6548, 360, 4336, 6534, 2180, 6600, 2006, 2002, 8783, 7714, 5322, 5003, 1859, 3237, 5491, 4346, 6179, 7911, 5800, 3784, 8763, 1321, 1864, 125, 7399, 2192, 71, 2984, 7490, 1831, 3853, 8010, 9291, 2674, 1335, 2809, 859, 4822, 4418, 290, 1662, 2227, 8190, 9145, 6890, 9623, 5745, 9739, 5066, 5004, 3749, 8703, 5165, 6412, 8687, 698, 559, 4671, 5020, 2934, 6239, 4632, 6223, 7776, 3850, 2613, 8056, 8879, 9599, 8758, 4429, 9475, 3305, 4720, 9135, 3345, 618, 8328, 4655, 5507, 9108, 4836, 528, 732, 5811, 3330, 1781, 3940, 2471, 7953, 8057, 5039, 3987, 8459, 9053, 5273, 8710, 2990, 6411, 1299, 5101, 6741, 3701, 6241, 6960, 7690, 7078, 8873, 5222, 4117, 2355, 5376, 7386, 7626, 9742, 7849, 3212, 4201, 4192, 4496, 5641, 4354, 3222, 2767, 8015, 5933, 2535, 6314, 2968, 5328, 3328, 4551, 1510, 1054, 9586, 502, 1616, 7586, 219, 8212, 7361, 1213, 7708, 3785, 142, 1852, 1176, 7009, 2472, 1259, 6415, 3531, 512, 5293, 7410, 5368, 8448, 5245, 3482, 3004, 6085, 2293, 883, 5648, 4233, 2845, 8019, 1706, 5051, 7240, 903, 9722, 3702, 791, 5979, 3820, 5855, 4475, 4850, 5433, 8568, 5354, 7212, 9979, 5023, 4076, 9308, 201, 1772, 5291, 6206, 7432, 9820, 8893, 2510, 9332, 6778, 4706, 1192, 3346, 8837, 2237, 8965, 5940, 9336, 3186, 591, 5099, 993, 6105, 3037, 4955, 6395, 4755, 4816, 2599, 5798, 2123, 8785, 8298, 3750, 2632, 1240, 209, 2672, 8295, 8016, 9865, 2453, 7076, 2875, 9982, 7573, 3498, 3709, 6598, 4059, 7489, 1702, 5511, 2605, 3355, 1622, 3548, 5635, 7258, 7866, 7358, 7284, 2586, 5604, 2461, 4347, 6439, 5101, 451, 4375, 7160, 2806, 1944, 9322, 9967, 6053, 1413, 5597, 4336, 9562, 2387, 7114, 931, 3981, 7488, 4619, 5988, 4902, 3259, 8895, 5889, 8229, 4732, 2369, 123, 8119, 5870, 185, 5858, 434, 9181, 933, 6941, 3484, 4246, 4170, 8620, 2610, 399, 5750, 9419, 9801, 3381, 7466, 7495, 3730, 5713, 3887, 9723, 4226, 9477, 160, 8153, 9747, 700, 1373, 3184, 2141, 8854, 8599, 8920, 9550, 6360, 6622, 7157, 2677, 7148, 5528, 665, 1836, 5313, 5653, 3477, 4521, 3102, 9813, 1597, 6509, 3979, 685, 8367, 4483, 1236, 3075, 2944, 6076, 3400, 3368, 7184, 1086, 1416, 7410, 3150, 6043, 6726, 3854, 9495, 7765, 5530, 8894, 4235, 6914, 6378, 9879, 4655, 4191, 184, 2221, 7460, 3567, 2809, 9145, 9918, 1565, 1068, 3362, 4474, 5501, 5231, 1151, 2249, 337, 7918, 363, 309, 3998, 8907, 2247, 5078, 6130, 7571, 8437, 7036, 3586, 2378, 3414, 7447, 7338, 1103, 5915, 1530, 4510, 7847, 94, 1458, 2608, 8634, 828, 5813, 1461, 6408, 5272, 9431, 8230, 7408, 8369, 3620, 1511, 1066, 6220, 8451, 3536, 2739, 2169, 7295, 114, 2020, 1688, 9631, 1384, 70, 9373, 1277, 1099, 1334, 3979, 9482, 8004, 9413, 8595, 5441, 157, 2123, 7037, 8455, 2973, 5486, 2989, 790, 3746, 8505, 8178, 5493, 6266, 8632, 258, 9282, 7766, 9282, 3826, 6174, 5845, 819, 8982, 2560, 2716, 8583, 9494, 597, 6149, 745, 2670, 946, 1339, 5315, 7785, 7334, 3147, 5740, 1431, 5212, 9333, 8424, 8020, 1096, 828, 3546, 3900, 9342, 5223, 439, 4698, 1814, 9027, 4537, 2190, 3007, 7464, 2153, 4515, 5433, 6868, 9113, 9982, 6157, 8578, 317, 7545, 1504, 9082, 3327, 2545, 6741, 8455, 8287, 3298, 3330, 8696, 6863, 1107, 6603, 7846, 5435, 1933, 9184, 8073, 6056, 2258, 5200, 7035, 4473, 1296, 4732, 7882, 8095, 7012, 6407, 7511, 7016, 4385, 9683, 6084, 8443, 1460, 4809, 7599, 6950, 3279, 3599, 2186, 7987, 5128, 9377, 212, 8133, 3337, 9763, 3874, 4111, 7879, 2353, 1182, 5281, 6449, 8515, 3890, 1766, 222, 7680, 9438, 7058, 7134, 8373, 8713, 9019, 8364, 6439, 4316, 9482, 5898, 8008, 5733, 2079, 7674, 6680, 2061, 5657, 9472, 2467, 8418, 1982, 762, 4764, 5201, 8125, 4306, 6754, 7836, 3121};
//
////        int[] nums = {1709, 5955, 4331, 1386, 9131, 385, 814, 573, 569, 7114, 8628, 2545, 7082, 6467, 6980, 3368, 3331, 7256, 4243, 2461, 7306, 5998, 6703, 5357, 6676, 8857, 2978, 3217, 2762, 5304, 3473, 2589, 704, 2662, 5183, 1874, 6282, 5685, 152, 6947, 2439, 5215, 8070, 4244, 6364, 1149, 3257, 1123, 7928, 1465, 673, 2797, 3996, 7253, 1705, 2163, 3267, 6465, 4906, 578, 7135, 4879, 8774, 2690, 4474, 1742, 4218, 2988, 6241, 7527, 1779, 2280, 9011, 9431, 2175, 6750, 1263, 3969, 6770, 6155, 8371, 722, 8156, 793, 9550, 5425, 2478, 4687, 9359, 5552, 9590, 3111, 7081, 1091, 883, 2682, 4582, 7592, 2777, 85, 1096, 513, 6998, 1818, 1920, 7762, 2331, 8093, 2563, 5361, 4210, 6563, 7112};
////        int[] nums = {1709,5955,4331,1386,7114,9131,385,814,573,569,7114,8628,2545,7082,6467,6980,3368,3331,7256,4243,2461,7306,5998,6703,5357,6676,8857,2978,3217,2762};
////        int[] nums = {1709,5955,4331,1386,7114,9131,385,814,573,569,7114,8628,2545,7082,6467,6980,3368,3331,7256,4243,2461,7306,5998,6703,5357,6676,8857,2978,3217,2762};//8
////                int[] nums = {1709,5955,4331,1386,7114,9131,385,814,573,569,7114,8628,2545,7082,6467,6980,3368,3331,7256,4243,2461,7306,5998};//7
////        int[] nums = {1709, 5955, 4331, 1386, 7114, 9131, 385, 814, 573, 569, 7114, 8628, 2545, 7082, 6467, 6980, 3368, 3331, 7256, 4243, 2461};//6
////        int[] nums = {1709,5955,4331,1386,7114,9131,385,814,573,569,7114,8628,2545,7082,6467};//4
////        int[] nums = {1709,5955,4331,1386,7114,9131,385,814,573,569,7114,8628,2545,7282};
////        int[] nums = {1709,5955,4331,1386};
////        int k = 4331;
////        int ans = 63;
//
////        int[] nums = {1,3,3,4};
////        int k = 1;
////        int ans = 2;
//
////                int[] nums = {4,4,4,3,4};
////        int k = 3;
////        int ans = 2;
//
////        int[] nums = {14,20,3,10,14,20,9};
////        int k = 6;
////        int ans = 3;
////        int[] nums = {1,100000};
////        int k = 100000;
////        int ans = 2;
//
//        long time1, time2, time3;
//
//
//        // txt 轉 list
//
//        List<Integer> numList = new ArrayList<>();
//        int xh = 0;
//        for (int num = 0; num < stringList.size(); num++) {
//            String s1 = stringList.get(num);
//            Integer integer = Integer.valueOf(s1);
//            if (xh != integer) {
//                xh = integer;
//                numList.add(integer);
//            }
//        }
////        for (int num = 0; num < nums.length; num++) {
////            Integer integer = nums[num];
////            if (xh!= integer) {
////                xh = integer;
////                numList.add(integer);
////            }
////        }
//
//        List<List<List<Integer>>> mapLists = new ArrayList<>();
//        List<List<Integer>> mapList = new ArrayList<>();
//
//        List<Integer> map = new ArrayList<>();
//        map.add(numList.get(numList.size() - 1));
//        map.add(1);
//        mapList.add(map);
//        mapLists.add(mapList);
//
//
//        time1 = System.currentTimeMillis();
//
//        for (int z = numList.size() - 2; z >= 0; z--) {
//            int x = 0;
//            int y = 0;
//            int count = 1;
//            boolean mach = false;
//            int num = numList.get(z);
//            for (int i = mapLists.size() - 1; i >= 0; i--) {
//                x = 0;
//                y = mapLists.get(i).size();
//                List<List<Integer>> lists = mapLists.get(i);
//                if (num < lists.get(0).get(0)) {
//                    if (lists.get(0).get(0) - num <= k && lists.get(0).get(0) - num > 0) {
//                        count = mapLists.get(i).get(0).get(1) + 1;
//                        mach = true;
//                    }
//                }
//                x = 1;
//                while (!mach) {
//                    if (y <= x) {
//
//                        break;
//                    }
//                    int node = (x + y) / 2;
//                    if (num >= lists.get(node).get(0)) {
//                        x = node + 1;
//                    }
//                    if (num < lists.get(node).get(0)) {
//                        y = node - 1;
//                        int i1 = lists.get(node).get(0) - num;
//                        if (i1 <= k && i1 > 0) {
//                            count = mapLists.get(i).get(0).get(1) + 1;
//                            mach = true;
//                        }
//                    }
//
//
//                }
//            }
//
//            if (mach && count > mapLists.size()) {
//                List<List<Integer>> mapList2 = new ArrayList<>();
//                List<Integer> map2 = new ArrayList<>();
//                map2.add(num);
//                map2.add(count);
//                mapList2.add(map2);
//                mapLists.add(mapList2);
//            } else {
//                List<List<Integer>> lists = mapLists.get(count - 1);
//                mach = false;
//                x = 0;
//                int min = k;
//                int machNode = mapLists.get(count - 1).size();
//                y = mapLists.get(count - 1).size();
//                while (mach) {
//                    int node = (x + y) / 2;
//                    if (num >= lists.get(node).get(0)) {
//                        x = node + 1;
//                    }
//                    if (num < lists.get(node).get(0)) {
//                        y = node - 1;
//                        int i1 = num - lists.get(node).get(0);
//                        machNode = node;
//                    }
//
//                    if (y <= x) {
//
//
//                        break;
//                    }
//                }
//                List<Integer> map2 = new ArrayList<>();
//                map2.add(num);
//                map2.add(count);
//                mapLists.get(count - 1).add(machNode, map2);
//            }
//
//
////            System.out.println("mapLists:" + mapLists);
//
//        }
//
//        time2 = System.currentTimeMillis();
//
//        System.out.println("mapLists:" + mapLists);
//        System.out.println("花了：" + (time2 - time1) + "秒");
//        //        System.out.println();
//        System.out.println("nums:" + nums.length);
//        System.out.println("k:" + k);
////        System.out.println("numMap:" + numMap);
//
//        System.out.println("numMap:MAX:" + mapLists.size());
//
//        System.out.println("ans:" + ans);
//    }
//
//
//    // 2分法-ok-最好++
//    @Test
//    public void lengthOfLIS9_test_3_2_txt() throws IOException {
//        int[] nums = {};
//        int k = 500;
//        int ans = 0;
//
//        //string2==89
//        //string==50000
//        //  資料太大須存在txt，取txt檔
//        FileInputStream fis = new FileInputStream("src/test/resources/string2.txt");
//        int content;
//        String s = "";
//        List<String> stringList = new ArrayList<>();
//        while ((content = fis.read()) != -1) {
//            char content1 = (char) content;
//            if (content1 == ',') {
//                stringList.add(s);
//                s = "";
//            } else {
//                s = s + content1;
//            }
////            System.out.println(content1);
//        }
//
//
////            System.out.println(stringList);
////        String s = fis.toString();
////        String[] split = s.split(",");
//
//
////        String stringTooLong = IOUtils.toString(fis, "UTF-8");
////        assertThat(stringTooLong).isNotEmpty();
////        int[] nums= {7,4,5,1,8,12,4,7};
////        int k=5;
////        int ans=4;
//
////        int[] nums = {4, 2, 1, 4, 3, 4, 5, 8, 15};
////        int k = 3;
////        int ans = 5;
//
////        int[] nums = {1};
////        int k = 1;
////        int ans = 1;
//
//
////        int[] nums = {2,1,2,3};
////        int k = 3;
////        int ans = 3;
//
////        int[] nums = {1709, 5955, 4331, 1386, 9131, 385, 814, 573, 569, 7114, 8628, 2545, 7082, 6467, 6980, 3368, 3331, 7256, 4243, 2461, 7306, 5998, 6703, 5357, 6676, 8857, 2978, 3217, 2762, 5304, 3473, 2589, 704, 2662, 5183, 1874, 6282, 5685, 152, 6947, 2439, 5215, 8070, 4244, 6364, 1149, 3257, 1123, 7928, 1465, 673, 2797, 3996, 7253, 1705, 2163, 3267, 6465, 4906, 578, 7135, 4879, 8774, 2690, 4474, 1742, 4218, 2988, 6241, 7527, 1779, 2280, 9011, 9431, 2175, 6750, 1263, 3969, 6770, 6155, 8371, 722, 8156, 793, 9550, 5425, 2478, 4687, 9359, 5552, 9590, 3111, 7081, 1091, 883, 2682, 4582, 7592, 2777, 85, 1096, 513, 6998, 1818, 1920, 7762, 2331, 8093, 2563, 5361, 4210, 6563, 7112, 1061, 6542, 7234, 3683, 7429, 8583, 4111, 9184, 5794, 780, 8414, 1522, 5113, 2618, 7798, 4432, 7951, 4507, 9723, 7754, 7513, 574, 4627, 7271, 8511, 2739, 6258, 9089, 6803, 8692, 13, 4147, 3356, 2539, 7321, 6301, 3693, 2944, 2658, 3396, 639, 2758, 3833, 4531, 4658, 7831, 3935, 143, 5533, 1268, 498, 8636, 827, 5569, 5564, 5277, 9273, 7890, 6382, 1635, 8877, 1567, 1977, 9458, 1495, 4529, 8306, 8556, 881, 1994, 3961, 1370, 2616, 9684, 5480, 8656, 5829, 8563, 9197, 8046, 6478, 1965, 1885, 4613, 6457, 8696, 4669, 5301, 8709, 1656, 8820, 8254, 89, 4300, 5670, 3300, 2806, 2761, 9249, 8658, 3023, 2584, 5111, 9006, 7636, 1888, 7519, 40, 5987, 3397, 9960, 3875, 8185, 4727, 4059, 4720, 1602, 9853, 8774, 7854, 6547, 2601, 5544, 5308, 9454, 2954, 1243, 233, 9280, 2441, 2189, 4559, 8594, 5887, 7612, 5982, 3264, 9343, 9380, 9488, 7587, 4851, 6498, 4020, 8047, 5122, 168, 3924, 8957, 6410, 5542, 6650, 3342, 9695, 7693, 6370, 9675, 9314, 3310, 3338, 3004, 6649, 3821, 6112, 719, 5455, 5249, 4969, 5267, 6934, 1249, 2726, 1028, 2029, 6048, 9267, 9189, 8457, 1872, 7290, 4169, 7733, 344, 7145, 4275, 8852, 3560, 9930, 6386, 9271, 1504, 1157, 7657, 2982, 3328, 7143, 2607, 7025, 4683, 2293, 9759, 115, 7200, 3826, 299, 3562, 8695, 7361, 9496, 3810, 1030, 3879, 1882, 776, 691, 2300, 7219, 5195, 609, 3421, 7977, 9909, 4573, 1818, 8651, 4074, 892, 409, 2836, 1844, 9706, 7262, 1827, 5845, 8796, 3926, 1687, 108, 7345, 1565, 3100, 1732, 4404, 3027, 2586, 2783, 9981, 8880, 1326, 1751, 4370, 4929, 9223, 5269, 2215, 7795, 8735, 699, 6151, 2764, 834, 8201, 3990, 5897, 9623, 2563, 4775, 2685, 3292, 4724, 3553, 2246, 1889, 7694, 9593, 428, 5220, 9895, 4618, 7861, 6508, 3521, 5291, 3487, 8736, 2309, 7250, 7621, 4879, 7998, 5167, 6548, 360, 4336, 6534, 2180, 6600, 2006, 2002, 8783, 7714, 5322, 5003, 1859, 3237, 5491, 4346, 6179, 7911, 5800, 3784, 8763, 1321, 1864, 125, 7399, 2192, 71, 2984, 7490, 1831, 3853, 8010, 9291, 2674, 1335, 2809, 859, 4822, 4418, 290, 1662, 2227, 8190, 9145, 6890, 9623, 5745, 9739, 5066, 5004, 3749, 8703, 5165, 6412, 8687, 698, 559, 4671, 5020, 2934, 6239, 4632, 6223, 7776, 3850, 2613, 8056, 8879, 9599, 8758, 4429, 9475, 3305, 4720, 9135, 3345, 618, 8328, 4655, 5507, 9108, 4836, 528, 732, 5811, 3330, 1781, 3940, 2471, 7953, 8057, 5039, 3987, 8459, 9053, 5273, 8710, 2990, 6411, 1299, 5101, 6741, 3701, 6241, 6960, 7690, 7078, 8873, 5222, 4117, 2355, 5376, 7386, 7626, 9742, 7849, 3212, 4201, 4192, 4496, 5641, 4354, 3222, 2767, 8015, 5933, 2535, 6314, 2968, 5328, 3328, 4551, 1510, 1054, 9586, 502, 1616, 7586, 219, 8212, 7361, 1213, 7708, 3785, 142, 1852, 1176, 7009, 2472, 1259, 6415, 3531, 512, 5293, 7410, 5368, 8448, 5245, 3482, 3004, 6085, 2293, 883, 5648, 4233, 2845, 8019, 1706, 5051, 7240, 903, 9722, 3702, 791, 5979, 3820, 5855, 4475, 4850, 5433, 8568, 5354, 7212, 9979, 5023, 4076, 9308, 201, 1772, 5291, 6206, 7432, 9820, 8893, 2510, 9332, 6778, 4706, 1192, 3346, 8837, 2237, 8965, 5940, 9336, 3186, 591, 5099, 993, 6105, 3037, 4955, 6395, 4755, 4816, 2599, 5798, 2123, 8785, 8298, 3750, 2632, 1240, 209, 2672, 8295, 8016, 9865, 2453, 7076, 2875, 9982, 7573, 3498, 3709, 6598, 4059, 7489, 1702, 5511, 2605, 3355, 1622, 3548, 5635, 7258, 7866, 7358, 7284, 2586, 5604, 2461, 4347, 6439, 5101, 451, 4375, 7160, 2806, 1944, 9322, 9967, 6053, 1413, 5597, 4336, 9562, 2387, 7114, 931, 3981, 7488, 4619, 5988, 4902, 3259, 8895, 5889, 8229, 4732, 2369, 123, 8119, 5870, 185, 5858, 434, 9181, 933, 6941, 3484, 4246, 4170, 8620, 2610, 399, 5750, 9419, 9801, 3381, 7466, 7495, 3730, 5713, 3887, 9723, 4226, 9477, 160, 8153, 9747, 700, 1373, 3184, 2141, 8854, 8599, 8920, 9550, 6360, 6622, 7157, 2677, 7148, 5528, 665, 1836, 5313, 5653, 3477, 4521, 3102, 9813, 1597, 6509, 3979, 685, 8367, 4483, 1236, 3075, 2944, 6076, 3400, 3368, 7184, 1086, 1416, 7410, 3150, 6043, 6726, 3854, 9495, 7765, 5530, 8894, 4235, 6914, 6378, 9879, 4655, 4191, 184, 2221, 7460, 3567, 2809, 9145, 9918, 1565, 1068, 3362, 4474, 5501, 5231, 1151, 2249, 337, 7918, 363, 309, 3998, 8907, 2247, 5078, 6130, 7571, 8437, 7036, 3586, 2378, 3414, 7447, 7338, 1103, 5915, 1530, 4510, 7847, 94, 1458, 2608, 8634, 828, 5813, 1461, 6408, 5272, 9431, 8230, 7408, 8369, 3620, 1511, 1066, 6220, 8451, 3536, 2739, 2169, 7295, 114, 2020, 1688, 9631, 1384, 70, 9373, 1277, 1099, 1334, 3979, 9482, 8004, 9413, 8595, 5441, 157, 2123, 7037, 8455, 2973, 5486, 2989, 790, 3746, 8505, 8178, 5493, 6266, 8632, 258, 9282, 7766, 9282, 3826, 6174, 5845, 819, 8982, 2560, 2716, 8583, 9494, 597, 6149, 745, 2670, 946, 1339, 5315, 7785, 7334, 3147, 5740, 1431, 5212, 9333, 8424, 8020, 1096, 828, 3546, 3900, 9342, 5223, 439, 4698, 1814, 9027, 4537, 2190, 3007, 7464, 2153, 4515, 5433, 6868, 9113, 9982, 6157, 8578, 317, 7545, 1504, 9082, 3327, 2545, 6741, 8455, 8287, 3298, 3330, 8696, 6863, 1107, 6603, 7846, 5435, 1933, 9184, 8073, 6056, 2258, 5200, 7035, 4473, 1296, 4732, 7882, 8095, 7012, 6407, 7511, 7016, 4385, 9683, 6084, 8443, 1460, 4809, 7599, 6950, 3279, 3599, 2186, 7987, 5128, 9377, 212, 8133, 3337, 9763, 3874, 4111, 7879, 2353, 1182, 5281, 6449, 8515, 3890, 1766, 222, 7680, 9438, 7058, 7134, 8373, 8713, 9019, 8364, 6439, 4316, 9482, 5898, 8008, 5733, 2079, 7674, 6680, 2061, 5657, 9472, 2467, 8418, 1982, 762, 4764, 5201, 8125, 4306, 6754, 7836, 3121};
//
////        int[] nums = {1709, 5955, 4331, 1386, 9131, 385, 814, 573, 569, 7114, 8628, 2545, 7082, 6467, 6980, 3368, 3331, 7256, 4243, 2461, 7306, 5998, 6703, 5357, 6676, 8857, 2978, 3217, 2762, 5304, 3473, 2589, 704, 2662, 5183, 1874, 6282, 5685, 152, 6947, 2439, 5215, 8070, 4244, 6364, 1149, 3257, 1123, 7928, 1465, 673, 2797, 3996, 7253, 1705, 2163, 3267, 6465, 4906, 578, 7135, 4879, 8774, 2690, 4474, 1742, 4218, 2988, 6241, 7527, 1779, 2280, 9011, 9431, 2175, 6750, 1263, 3969, 6770, 6155, 8371, 722, 8156, 793, 9550, 5425, 2478, 4687, 9359, 5552, 9590, 3111, 7081, 1091, 883, 2682, 4582, 7592, 2777, 85, 1096, 513, 6998, 1818, 1920, 7762, 2331, 8093, 2563, 5361, 4210, 6563, 7112};
////        int[] nums = {1709,5955,4331,1386,7114,9131,385,814,573,569,7114,8628,2545,7082,6467,6980,3368,3331,7256,4243,2461,7306,5998,6703,5357,6676,8857,2978,3217,2762};
////        int[] nums = {1709,5955,4331,1386,7114,9131,385,814,573,569,7114,8628,2545,7082,6467,6980,3368,3331,7256,4243,2461,7306,5998,6703,5357,6676,8857,2978,3217,2762};//8
////                int[] nums = {1709,5955,4331,1386,7114,9131,385,814,573,569,7114,8628,2545,7082,6467,6980,3368,3331,7256,4243,2461,7306,5998};//7
////        int[] nums = {1709, 5955, 4331, 1386, 7114, 9131, 385, 814, 573, 569, 7114, 8628, 2545, 7082, 6467, 6980, 3368, 3331, 7256, 4243, 2461};//6
////        int[] nums = {1709,5955,4331,1386,7114,9131,385,814,573,569,7114,8628,2545,7082,6467};//4
////        int[] nums = {1709,5955,4331,1386,7114,9131,385,814,573,569,7114,8628,2545,7282};
////        int[] nums = {1709,5955,4331,1386};
////        int k = 4331;
////        int ans = 63;
//
////        int[] nums = {1,3,3,4};
////        int k = 1;
////        int ans = 2;
//
////                int[] nums = {4,4,4,3,4};
////        int k = 3;
////        int ans = 2;
//
////        int[] nums = {14,20,3,10,14,20,9};
////        int k = 6;
////        int ans = 3;
////        int[] nums = {1,100000};
////        int k = 100000;
////        int ans = 2;
//
////        int[] nums = {10,3,20,2,16,12};
////        int k = 4;
////        int ans = 2;
//
//        long time1, time2, time3;
//
//
//        // txt 轉 list
//
//        List<Integer> numList = new ArrayList<>();
//        int xh = 0;
//        for (int num = 0; num < stringList.size(); num++) {
//            String s1 = stringList.get(num);
//            Integer integer = Integer.valueOf(s1);
////            if (xh!= integer) {
//            xh = integer;
//            numList.add(integer);
////            }
//        }
////        for (int num = 0; num < nums.length; num++) {
////            Integer integer = nums[num];
////            if (xh!= integer) {
////                xh = integer;
////                numList.add(integer);
////            }
////        }
//
//        List<List<List<Integer>>> mapLists = new ArrayList<>();
//        List<List<Integer>> mapList = new ArrayList<>();
//
//        List<Integer> map = new ArrayList<>();
//        map.add(numList.get(numList.size() - 1));
//        map.add(1);
//        mapList.add(map);
//        mapLists.add(mapList);
//
//
//        time1 = System.currentTimeMillis();
//
//        for (int z = numList.size() - 2; z >= 0; z--) {
//            int x;
//            int y = 0;
//            int count = 1;
//            boolean mach = false;
//            int num = numList.get(z);
//            for (int i = mapLists.size() - 1; i >= 0; i--) {
//                List<List<Integer>> lists = mapLists.get(i);
//                x = 0;
//
//                for (int j = lists.size() - 1; j >= 0; j--) {
//                    if (num >= lists.get(j).get(0)) {
//                        x = j + 1;
//                        break;
//                    } else {
//                        x = j;
//                        int i1 = lists.get(j).get(0) - num;
//                        if (i1 <= k && i1 > 0) {
//                            count = mapLists.get(i).get(0).get(1) + 1;
//                            mach = true;
//                            break;
//                        }
//                    }
//                }
//                if (mach) {
//                    break;
//
//                } else {
//                    y = x;
//                }
//
//            }
//            if (mach && count > mapLists.size()) {
//                List<List<Integer>> mapList2 = new ArrayList<>();
//                List<Integer> map2 = new ArrayList<>();
//                map2.add(num);
//                map2.add(count);
//                mapList2.add(map2);
//                mapLists.add(mapList2);
//            } else {
//                List<Integer> map2 = new ArrayList<>();
//                map2.add(num);
//                map2.add(count);
//                mapLists.get(count - 1).add(y, map2);
//            }
////            System.out.println("mapLists:" + mapLists);
//
//        }
//
//        time2 = System.currentTimeMillis();
//
//        System.out.println("mapLists:" + mapLists);
//        System.out.println("花了：" + (time2 - time1) + "秒");
//        //        System.out.println();
//        System.out.println("nums:" + nums.length);
//        System.out.println("k:" + k);
////        System.out.println("numMap:" + numMap);
//
//        System.out.println("numMap:MAX:" + mapLists.size());
//
//        System.out.println("ans:" + ans);
//    }
//
//    @Test
//    public void lengthOfLIS9_test_3_3_txt() throws IOException {
//        int[] nums = {};
//        int k = 500;
//        int ans = 0;
//
//        //string==50000//294秒
//        //string2==89//280秒
//        //  資料太大須存在txt，取txt檔
//        FileInputStream fis = new FileInputStream("src/test/resources/string2.txt");
//        int content;
//        String s = "";
//        List<String> stringList = new ArrayList<>();
//        while ((content = fis.read()) != -1) {
//            char content1 = (char) content;
//            if (content1 == ',') {
//                stringList.add(s);
//                s = "";
//            } else {
//                s = s + content1;
//            }
////            System.out.println(content1);
//        }
//
//
////            System.out.println(stringList);
////        String s = fis.toString();
////        String[] split = s.split(",");
//
//
////        String stringTooLong = IOUtils.toString(fis, "UTF-8");
////        assertThat(stringTooLong).isNotEmpty();
////        int[] nums= {7,4,5,1,8,12,4,7};
////        int k=5;
////        int ans=4;
//
////        int[] nums = {4, 2, 1, 4, 3, 4, 5, 8, 15};
////        int k = 3;
////        int ans = 5;
//
////        int[] nums = {1};
////        int k = 1;
////        int ans = 1;
//
//
////        int[] nums = {2,1,2,3};
////        int k = 3;
////        int ans = 3;
//
////        int[] nums = {1709, 5955, 4331, 1386, 9131, 385, 814, 573, 569, 7114, 8628, 2545, 7082, 6467, 6980, 3368, 3331, 7256, 4243, 2461, 7306, 5998, 6703, 5357, 6676, 8857, 2978, 3217, 2762, 5304, 3473, 2589, 704, 2662, 5183, 1874, 6282, 5685, 152, 6947, 2439, 5215, 8070, 4244, 6364, 1149, 3257, 1123, 7928, 1465, 673, 2797, 3996, 7253, 1705, 2163, 3267, 6465, 4906, 578, 7135, 4879, 8774, 2690, 4474, 1742, 4218, 2988, 6241, 7527, 1779, 2280, 9011, 9431, 2175, 6750, 1263, 3969, 6770, 6155, 8371, 722, 8156, 793, 9550, 5425, 2478, 4687, 9359, 5552, 9590, 3111, 7081, 1091, 883, 2682, 4582, 7592, 2777, 85, 1096, 513, 6998, 1818, 1920, 7762, 2331, 8093, 2563, 5361, 4210, 6563, 7112, 1061, 6542, 7234, 3683, 7429, 8583, 4111, 9184, 5794, 780, 8414, 1522, 5113, 2618, 7798, 4432, 7951, 4507, 9723, 7754, 7513, 574, 4627, 7271, 8511, 2739, 6258, 9089, 6803, 8692, 13, 4147, 3356, 2539, 7321, 6301, 3693, 2944, 2658, 3396, 639, 2758, 3833, 4531, 4658, 7831, 3935, 143, 5533, 1268, 498, 8636, 827, 5569, 5564, 5277, 9273, 7890, 6382, 1635, 8877, 1567, 1977, 9458, 1495, 4529, 8306, 8556, 881, 1994, 3961, 1370, 2616, 9684, 5480, 8656, 5829, 8563, 9197, 8046, 6478, 1965, 1885, 4613, 6457, 8696, 4669, 5301, 8709, 1656, 8820, 8254, 89, 4300, 5670, 3300, 2806, 2761, 9249, 8658, 3023, 2584, 5111, 9006, 7636, 1888, 7519, 40, 5987, 3397, 9960, 3875, 8185, 4727, 4059, 4720, 1602, 9853, 8774, 7854, 6547, 2601, 5544, 5308, 9454, 2954, 1243, 233, 9280, 2441, 2189, 4559, 8594, 5887, 7612, 5982, 3264, 9343, 9380, 9488, 7587, 4851, 6498, 4020, 8047, 5122, 168, 3924, 8957, 6410, 5542, 6650, 3342, 9695, 7693, 6370, 9675, 9314, 3310, 3338, 3004, 6649, 3821, 6112, 719, 5455, 5249, 4969, 5267, 6934, 1249, 2726, 1028, 2029, 6048, 9267, 9189, 8457, 1872, 7290, 4169, 7733, 344, 7145, 4275, 8852, 3560, 9930, 6386, 9271, 1504, 1157, 7657, 2982, 3328, 7143, 2607, 7025, 4683, 2293, 9759, 115, 7200, 3826, 299, 3562, 8695, 7361, 9496, 3810, 1030, 3879, 1882, 776, 691, 2300, 7219, 5195, 609, 3421, 7977, 9909, 4573, 1818, 8651, 4074, 892, 409, 2836, 1844, 9706, 7262, 1827, 5845, 8796, 3926, 1687, 108, 7345, 1565, 3100, 1732, 4404, 3027, 2586, 2783, 9981, 8880, 1326, 1751, 4370, 4929, 9223, 5269, 2215, 7795, 8735, 699, 6151, 2764, 834, 8201, 3990, 5897, 9623, 2563, 4775, 2685, 3292, 4724, 3553, 2246, 1889, 7694, 9593, 428, 5220, 9895, 4618, 7861, 6508, 3521, 5291, 3487, 8736, 2309, 7250, 7621, 4879, 7998, 5167, 6548, 360, 4336, 6534, 2180, 6600, 2006, 2002, 8783, 7714, 5322, 5003, 1859, 3237, 5491, 4346, 6179, 7911, 5800, 3784, 8763, 1321, 1864, 125, 7399, 2192, 71, 2984, 7490, 1831, 3853, 8010, 9291, 2674, 1335, 2809, 859, 4822, 4418, 290, 1662, 2227, 8190, 9145, 6890, 9623, 5745, 9739, 5066, 5004, 3749, 8703, 5165, 6412, 8687, 698, 559, 4671, 5020, 2934, 6239, 4632, 6223, 7776, 3850, 2613, 8056, 8879, 9599, 8758, 4429, 9475, 3305, 4720, 9135, 3345, 618, 8328, 4655, 5507, 9108, 4836, 528, 732, 5811, 3330, 1781, 3940, 2471, 7953, 8057, 5039, 3987, 8459, 9053, 5273, 8710, 2990, 6411, 1299, 5101, 6741, 3701, 6241, 6960, 7690, 7078, 8873, 5222, 4117, 2355, 5376, 7386, 7626, 9742, 7849, 3212, 4201, 4192, 4496, 5641, 4354, 3222, 2767, 8015, 5933, 2535, 6314, 2968, 5328, 3328, 4551, 1510, 1054, 9586, 502, 1616, 7586, 219, 8212, 7361, 1213, 7708, 3785, 142, 1852, 1176, 7009, 2472, 1259, 6415, 3531, 512, 5293, 7410, 5368, 8448, 5245, 3482, 3004, 6085, 2293, 883, 5648, 4233, 2845, 8019, 1706, 5051, 7240, 903, 9722, 3702, 791, 5979, 3820, 5855, 4475, 4850, 5433, 8568, 5354, 7212, 9979, 5023, 4076, 9308, 201, 1772, 5291, 6206, 7432, 9820, 8893, 2510, 9332, 6778, 4706, 1192, 3346, 8837, 2237, 8965, 5940, 9336, 3186, 591, 5099, 993, 6105, 3037, 4955, 6395, 4755, 4816, 2599, 5798, 2123, 8785, 8298, 3750, 2632, 1240, 209, 2672, 8295, 8016, 9865, 2453, 7076, 2875, 9982, 7573, 3498, 3709, 6598, 4059, 7489, 1702, 5511, 2605, 3355, 1622, 3548, 5635, 7258, 7866, 7358, 7284, 2586, 5604, 2461, 4347, 6439, 5101, 451, 4375, 7160, 2806, 1944, 9322, 9967, 6053, 1413, 5597, 4336, 9562, 2387, 7114, 931, 3981, 7488, 4619, 5988, 4902, 3259, 8895, 5889, 8229, 4732, 2369, 123, 8119, 5870, 185, 5858, 434, 9181, 933, 6941, 3484, 4246, 4170, 8620, 2610, 399, 5750, 9419, 9801, 3381, 7466, 7495, 3730, 5713, 3887, 9723, 4226, 9477, 160, 8153, 9747, 700, 1373, 3184, 2141, 8854, 8599, 8920, 9550, 6360, 6622, 7157, 2677, 7148, 5528, 665, 1836, 5313, 5653, 3477, 4521, 3102, 9813, 1597, 6509, 3979, 685, 8367, 4483, 1236, 3075, 2944, 6076, 3400, 3368, 7184, 1086, 1416, 7410, 3150, 6043, 6726, 3854, 9495, 7765, 5530, 8894, 4235, 6914, 6378, 9879, 4655, 4191, 184, 2221, 7460, 3567, 2809, 9145, 9918, 1565, 1068, 3362, 4474, 5501, 5231, 1151, 2249, 337, 7918, 363, 309, 3998, 8907, 2247, 5078, 6130, 7571, 8437, 7036, 3586, 2378, 3414, 7447, 7338, 1103, 5915, 1530, 4510, 7847, 94, 1458, 2608, 8634, 828, 5813, 1461, 6408, 5272, 9431, 8230, 7408, 8369, 3620, 1511, 1066, 6220, 8451, 3536, 2739, 2169, 7295, 114, 2020, 1688, 9631, 1384, 70, 9373, 1277, 1099, 1334, 3979, 9482, 8004, 9413, 8595, 5441, 157, 2123, 7037, 8455, 2973, 5486, 2989, 790, 3746, 8505, 8178, 5493, 6266, 8632, 258, 9282, 7766, 9282, 3826, 6174, 5845, 819, 8982, 2560, 2716, 8583, 9494, 597, 6149, 745, 2670, 946, 1339, 5315, 7785, 7334, 3147, 5740, 1431, 5212, 9333, 8424, 8020, 1096, 828, 3546, 3900, 9342, 5223, 439, 4698, 1814, 9027, 4537, 2190, 3007, 7464, 2153, 4515, 5433, 6868, 9113, 9982, 6157, 8578, 317, 7545, 1504, 9082, 3327, 2545, 6741, 8455, 8287, 3298, 3330, 8696, 6863, 1107, 6603, 7846, 5435, 1933, 9184, 8073, 6056, 2258, 5200, 7035, 4473, 1296, 4732, 7882, 8095, 7012, 6407, 7511, 7016, 4385, 9683, 6084, 8443, 1460, 4809, 7599, 6950, 3279, 3599, 2186, 7987, 5128, 9377, 212, 8133, 3337, 9763, 3874, 4111, 7879, 2353, 1182, 5281, 6449, 8515, 3890, 1766, 222, 7680, 9438, 7058, 7134, 8373, 8713, 9019, 8364, 6439, 4316, 9482, 5898, 8008, 5733, 2079, 7674, 6680, 2061, 5657, 9472, 2467, 8418, 1982, 762, 4764, 5201, 8125, 4306, 6754, 7836, 3121};
//
////        int[] nums = {1709, 5955, 4331, 1386, 9131, 385, 814, 573, 569, 7114, 8628, 2545, 7082, 6467, 6980, 3368, 3331, 7256, 4243, 2461, 7306, 5998, 6703, 5357, 6676, 8857, 2978, 3217, 2762, 5304, 3473, 2589, 704, 2662, 5183, 1874, 6282, 5685, 152, 6947, 2439, 5215, 8070, 4244, 6364, 1149, 3257, 1123, 7928, 1465, 673, 2797, 3996, 7253, 1705, 2163, 3267, 6465, 4906, 578, 7135, 4879, 8774, 2690, 4474, 1742, 4218, 2988, 6241, 7527, 1779, 2280, 9011, 9431, 2175, 6750, 1263, 3969, 6770, 6155, 8371, 722, 8156, 793, 9550, 5425, 2478, 4687, 9359, 5552, 9590, 3111, 7081, 1091, 883, 2682, 4582, 7592, 2777, 85, 1096, 513, 6998, 1818, 1920, 7762, 2331, 8093, 2563, 5361, 4210, 6563, 7112};
////        int[] nums = {1709,5955,4331,1386,7114,9131,385,814,573,569,7114,8628,2545,7082,6467,6980,3368,3331,7256,4243,2461,7306,5998,6703,5357,6676,8857,2978,3217,2762};
////        int[] nums = {1709,5955,4331,1386,7114,9131,385,814,573,569,7114,8628,2545,7082,6467,6980,3368,3331,7256,4243,2461,7306,5998,6703,5357,6676,8857,2978,3217,2762};//8
////                int[] nums = {1709,5955,4331,1386,7114,9131,385,814,573,569,7114,8628,2545,7082,6467,6980,3368,3331,7256,4243,2461,7306,5998};//7
////        int[] nums = {1709, 5955, 4331, 1386, 7114, 9131, 385, 814, 573, 569, 7114, 8628, 2545, 7082, 6467, 6980, 3368, 3331, 7256, 4243, 2461};//6
////        int[] nums = {1709,5955,4331,1386,7114,9131,385,814,573,569,7114,8628,2545,7082,6467};//4
////        int[] nums = {1709,5955,4331,1386,7114,9131,385,814,573,569,7114,8628,2545,7282};
////        int[] nums = {1709,5955,4331,1386};
////        int k = 4331;
////        int ans = 63;
//
////        int[] nums = {1,3,3,4};
////        int k = 1;
////        int ans = 2;
//
////                int[] nums = {4,4,4,3,4};
////        int k = 3;
////        int ans = 2;
//
////        int[] nums = {14,20,3,10,14,20,9};
////        int k = 6;
////        int ans = 3;
////        int[] nums = {1,100000};
////        int k = 100000;
////        int ans = 2;
//
////        int[] nums = {10,3,20,2,16,12};
////        int k = 4;
////        int ans = 2;
//
//        long time1, time2, time3;
//
//
//        // txt 轉 list
//
//        List<Integer> numList = new ArrayList<>();
//        int xh = 0;
//        for (int num = 0; num < stringList.size(); num++) {
//            String s1 = stringList.get(num);
//            Integer integer = Integer.valueOf(s1);
////            if (xh!= integer) {
//            xh = integer;
//            numList.add(integer);
////            }
//        }
////        for (int num = 0; num < nums.length; num++) {
////            Integer integer = nums[num];
////            if (xh!= integer) {
////                xh = integer;
////                numList.add(integer);
////            }
////        }
//
//        List<List<List<Integer>>> mapLists = new ArrayList<>();
//        List<List<Integer>> mapList = new ArrayList<>();
//
//        List<Integer> map = new ArrayList<>();
//        map.add(numList.get(numList.size() - 1));
//        map.add(1);
//        mapList.add(map);
//        mapLists.add(mapList);
//
//
//        time1 = System.currentTimeMillis();
//
//        for (int z = numList.size() - 2; z >= 0; z--) {
//            int x;
//            int y = 0;
//            int count = 1;
//            boolean mach = false;
//            int num = numList.get(z);
//            int i1 = 999999999;
//            for (int i = mapLists.size() - 1; i >= 0; i--) {
//                List<List<Integer>> lists = mapLists.get(i);
//                x = 0;
//                int j = lists.size() - 1;
////                if(num >= lists.get(j).get(0)){
////                    x=j+1;
////                    y=x;
////                }
////                else {
////                    x=j;
////                    if(lists.get(j).get(0) - num<i1){
////                        i1=lists.get(j).get(0) - num;
////
////                        if (i1 <= k && i1 > 0) {
////                            count = mapLists.get(i).get(0).get(1) + 1;
////                            mach = true;
////                            break;
////                        }
////                    }
////
////                }
//
//                int n = 0;
//                int m = lists.size() - 1;
//                while (m >= n) {
//                    int node = (n + m) / 2;
//                    if (num >= lists.get(node).get(0)) {
//                        n = node + 1;
//                        x = node + 1;
//                    }
//                    if (num < lists.get(node).get(0)) {
//                        m = node - 1;
//                        if (lists.get(node).get(0) - num < i1) {
//                            i1 = lists.get(node).get(0) - num;
//                            x = node;
//                        }
//                        if (i1 <= k && i1 > 0) {
//                            count = mapLists.get(i).get(0).get(1) + 1;
//                            mach = true;
//                        }
//                    }
//                }
//                if (mach) {
//                    break;
//                } else {
//                    y = x;
//                }
//
//            }
//            if (mach && count > mapLists.size()) {
//                List<List<Integer>> mapList2 = new ArrayList<>();
//                List<Integer> map2 = new ArrayList<>();
//                map2.add(num);
//                map2.add(count);
//                mapList2.add(map2);
//                mapLists.add(mapList2);
//            } else {
//                List<Integer> map2 = new ArrayList<>();
//                map2.add(num);
//                map2.add(count);
//                mapLists.get(count - 1).add(y, map2);
//            }
////            System.out.println("mapLists:" + mapLists);
//
//        }
//
//        time2 = System.currentTimeMillis();
//
//        System.out.println("mapLists:" + mapLists);
//        System.out.println("花了：" + (time2 - time1) + "秒");
//        //        System.out.println();
//        System.out.println("nums:" + nums.length);
//        System.out.println("k:" + k);
////        System.out.println("numMap:" + numMap);
//
//        System.out.println("numMap:MAX:" + mapLists.size());
//
//        System.out.println("ans:" + ans);
//    }
//
//
//    @Test
//    public void lengthOfLIS9_test_3_3_ok_txt() throws IOException {
//        int[] nums = {};
//        int k = 500;
//        int ans = 0;
//
//        //string==50000//234
//        //string2==89//349
//        //  資料太大須存在txt，取txt檔
//        FileInputStream fis = new FileInputStream("src/test/resources/string.txt");
//        int content;
//        String s = "";
//        List<String> stringList = new ArrayList<>();
//        while ((content = fis.read()) != -1) {
//            char content1 = (char) content;
//            if (content1 == ',') {
//                stringList.add(s);
//                s = "";
//            } else {
//                s = s + content1;
//            }
////            System.out.println(content1);
//        }
//
//
////            System.out.println(stringList);
////        String s = fis.toString();
////        String[] split = s.split(",");
//
//
////        String stringTooLong = IOUtils.toString(fis, "UTF-8");
////        assertThat(stringTooLong).isNotEmpty();
////        int[] nums= {7,4,5,1,8,12,4,7};
////        int k=5;
////        int ans=4;
//
////        int[] nums = {4, 2, 1, 4, 3, 4, 5, 8, 15};
////        int k = 3;
////        int ans = 5;
//
////        int[] nums = {1};
////        int k = 1;
////        int ans = 1;
//
//
////        int[] nums = {2,1,2,3};
////        int k = 3;
////        int ans = 3;
//
////        int[] nums = {1709, 5955, 4331, 1386, 9131, 385, 814, 573, 569, 7114, 8628, 2545, 7082, 6467, 6980, 3368, 3331, 7256, 4243, 2461, 7306, 5998, 6703, 5357, 6676, 8857, 2978, 3217, 2762, 5304, 3473, 2589, 704, 2662, 5183, 1874, 6282, 5685, 152, 6947, 2439, 5215, 8070, 4244, 6364, 1149, 3257, 1123, 7928, 1465, 673, 2797, 3996, 7253, 1705, 2163, 3267, 6465, 4906, 578, 7135, 4879, 8774, 2690, 4474, 1742, 4218, 2988, 6241, 7527, 1779, 2280, 9011, 9431, 2175, 6750, 1263, 3969, 6770, 6155, 8371, 722, 8156, 793, 9550, 5425, 2478, 4687, 9359, 5552, 9590, 3111, 7081, 1091, 883, 2682, 4582, 7592, 2777, 85, 1096, 513, 6998, 1818, 1920, 7762, 2331, 8093, 2563, 5361, 4210, 6563, 7112, 1061, 6542, 7234, 3683, 7429, 8583, 4111, 9184, 5794, 780, 8414, 1522, 5113, 2618, 7798, 4432, 7951, 4507, 9723, 7754, 7513, 574, 4627, 7271, 8511, 2739, 6258, 9089, 6803, 8692, 13, 4147, 3356, 2539, 7321, 6301, 3693, 2944, 2658, 3396, 639, 2758, 3833, 4531, 4658, 7831, 3935, 143, 5533, 1268, 498, 8636, 827, 5569, 5564, 5277, 9273, 7890, 6382, 1635, 8877, 1567, 1977, 9458, 1495, 4529, 8306, 8556, 881, 1994, 3961, 1370, 2616, 9684, 5480, 8656, 5829, 8563, 9197, 8046, 6478, 1965, 1885, 4613, 6457, 8696, 4669, 5301, 8709, 1656, 8820, 8254, 89, 4300, 5670, 3300, 2806, 2761, 9249, 8658, 3023, 2584, 5111, 9006, 7636, 1888, 7519, 40, 5987, 3397, 9960, 3875, 8185, 4727, 4059, 4720, 1602, 9853, 8774, 7854, 6547, 2601, 5544, 5308, 9454, 2954, 1243, 233, 9280, 2441, 2189, 4559, 8594, 5887, 7612, 5982, 3264, 9343, 9380, 9488, 7587, 4851, 6498, 4020, 8047, 5122, 168, 3924, 8957, 6410, 5542, 6650, 3342, 9695, 7693, 6370, 9675, 9314, 3310, 3338, 3004, 6649, 3821, 6112, 719, 5455, 5249, 4969, 5267, 6934, 1249, 2726, 1028, 2029, 6048, 9267, 9189, 8457, 1872, 7290, 4169, 7733, 344, 7145, 4275, 8852, 3560, 9930, 6386, 9271, 1504, 1157, 7657, 2982, 3328, 7143, 2607, 7025, 4683, 2293, 9759, 115, 7200, 3826, 299, 3562, 8695, 7361, 9496, 3810, 1030, 3879, 1882, 776, 691, 2300, 7219, 5195, 609, 3421, 7977, 9909, 4573, 1818, 8651, 4074, 892, 409, 2836, 1844, 9706, 7262, 1827, 5845, 8796, 3926, 1687, 108, 7345, 1565, 3100, 1732, 4404, 3027, 2586, 2783, 9981, 8880, 1326, 1751, 4370, 4929, 9223, 5269, 2215, 7795, 8735, 699, 6151, 2764, 834, 8201, 3990, 5897, 9623, 2563, 4775, 2685, 3292, 4724, 3553, 2246, 1889, 7694, 9593, 428, 5220, 9895, 4618, 7861, 6508, 3521, 5291, 3487, 8736, 2309, 7250, 7621, 4879, 7998, 5167, 6548, 360, 4336, 6534, 2180, 6600, 2006, 2002, 8783, 7714, 5322, 5003, 1859, 3237, 5491, 4346, 6179, 7911, 5800, 3784, 8763, 1321, 1864, 125, 7399, 2192, 71, 2984, 7490, 1831, 3853, 8010, 9291, 2674, 1335, 2809, 859, 4822, 4418, 290, 1662, 2227, 8190, 9145, 6890, 9623, 5745, 9739, 5066, 5004, 3749, 8703, 5165, 6412, 8687, 698, 559, 4671, 5020, 2934, 6239, 4632, 6223, 7776, 3850, 2613, 8056, 8879, 9599, 8758, 4429, 9475, 3305, 4720, 9135, 3345, 618, 8328, 4655, 5507, 9108, 4836, 528, 732, 5811, 3330, 1781, 3940, 2471, 7953, 8057, 5039, 3987, 8459, 9053, 5273, 8710, 2990, 6411, 1299, 5101, 6741, 3701, 6241, 6960, 7690, 7078, 8873, 5222, 4117, 2355, 5376, 7386, 7626, 9742, 7849, 3212, 4201, 4192, 4496, 5641, 4354, 3222, 2767, 8015, 5933, 2535, 6314, 2968, 5328, 3328, 4551, 1510, 1054, 9586, 502, 1616, 7586, 219, 8212, 7361, 1213, 7708, 3785, 142, 1852, 1176, 7009, 2472, 1259, 6415, 3531, 512, 5293, 7410, 5368, 8448, 5245, 3482, 3004, 6085, 2293, 883, 5648, 4233, 2845, 8019, 1706, 5051, 7240, 903, 9722, 3702, 791, 5979, 3820, 5855, 4475, 4850, 5433, 8568, 5354, 7212, 9979, 5023, 4076, 9308, 201, 1772, 5291, 6206, 7432, 9820, 8893, 2510, 9332, 6778, 4706, 1192, 3346, 8837, 2237, 8965, 5940, 9336, 3186, 591, 5099, 993, 6105, 3037, 4955, 6395, 4755, 4816, 2599, 5798, 2123, 8785, 8298, 3750, 2632, 1240, 209, 2672, 8295, 8016, 9865, 2453, 7076, 2875, 9982, 7573, 3498, 3709, 6598, 4059, 7489, 1702, 5511, 2605, 3355, 1622, 3548, 5635, 7258, 7866, 7358, 7284, 2586, 5604, 2461, 4347, 6439, 5101, 451, 4375, 7160, 2806, 1944, 9322, 9967, 6053, 1413, 5597, 4336, 9562, 2387, 7114, 931, 3981, 7488, 4619, 5988, 4902, 3259, 8895, 5889, 8229, 4732, 2369, 123, 8119, 5870, 185, 5858, 434, 9181, 933, 6941, 3484, 4246, 4170, 8620, 2610, 399, 5750, 9419, 9801, 3381, 7466, 7495, 3730, 5713, 3887, 9723, 4226, 9477, 160, 8153, 9747, 700, 1373, 3184, 2141, 8854, 8599, 8920, 9550, 6360, 6622, 7157, 2677, 7148, 5528, 665, 1836, 5313, 5653, 3477, 4521, 3102, 9813, 1597, 6509, 3979, 685, 8367, 4483, 1236, 3075, 2944, 6076, 3400, 3368, 7184, 1086, 1416, 7410, 3150, 6043, 6726, 3854, 9495, 7765, 5530, 8894, 4235, 6914, 6378, 9879, 4655, 4191, 184, 2221, 7460, 3567, 2809, 9145, 9918, 1565, 1068, 3362, 4474, 5501, 5231, 1151, 2249, 337, 7918, 363, 309, 3998, 8907, 2247, 5078, 6130, 7571, 8437, 7036, 3586, 2378, 3414, 7447, 7338, 1103, 5915, 1530, 4510, 7847, 94, 1458, 2608, 8634, 828, 5813, 1461, 6408, 5272, 9431, 8230, 7408, 8369, 3620, 1511, 1066, 6220, 8451, 3536, 2739, 2169, 7295, 114, 2020, 1688, 9631, 1384, 70, 9373, 1277, 1099, 1334, 3979, 9482, 8004, 9413, 8595, 5441, 157, 2123, 7037, 8455, 2973, 5486, 2989, 790, 3746, 8505, 8178, 5493, 6266, 8632, 258, 9282, 7766, 9282, 3826, 6174, 5845, 819, 8982, 2560, 2716, 8583, 9494, 597, 6149, 745, 2670, 946, 1339, 5315, 7785, 7334, 3147, 5740, 1431, 5212, 9333, 8424, 8020, 1096, 828, 3546, 3900, 9342, 5223, 439, 4698, 1814, 9027, 4537, 2190, 3007, 7464, 2153, 4515, 5433, 6868, 9113, 9982, 6157, 8578, 317, 7545, 1504, 9082, 3327, 2545, 6741, 8455, 8287, 3298, 3330, 8696, 6863, 1107, 6603, 7846, 5435, 1933, 9184, 8073, 6056, 2258, 5200, 7035, 4473, 1296, 4732, 7882, 8095, 7012, 6407, 7511, 7016, 4385, 9683, 6084, 8443, 1460, 4809, 7599, 6950, 3279, 3599, 2186, 7987, 5128, 9377, 212, 8133, 3337, 9763, 3874, 4111, 7879, 2353, 1182, 5281, 6449, 8515, 3890, 1766, 222, 7680, 9438, 7058, 7134, 8373, 8713, 9019, 8364, 6439, 4316, 9482, 5898, 8008, 5733, 2079, 7674, 6680, 2061, 5657, 9472, 2467, 8418, 1982, 762, 4764, 5201, 8125, 4306, 6754, 7836, 3121};
//
////        int[] nums = {1709, 5955, 4331, 1386, 9131, 385, 814, 573, 569, 7114, 8628, 2545, 7082, 6467, 6980, 3368, 3331, 7256, 4243, 2461, 7306, 5998, 6703, 5357, 6676, 8857, 2978, 3217, 2762, 5304, 3473, 2589, 704, 2662, 5183, 1874, 6282, 5685, 152, 6947, 2439, 5215, 8070, 4244, 6364, 1149, 3257, 1123, 7928, 1465, 673, 2797, 3996, 7253, 1705, 2163, 3267, 6465, 4906, 578, 7135, 4879, 8774, 2690, 4474, 1742, 4218, 2988, 6241, 7527, 1779, 2280, 9011, 9431, 2175, 6750, 1263, 3969, 6770, 6155, 8371, 722, 8156, 793, 9550, 5425, 2478, 4687, 9359, 5552, 9590, 3111, 7081, 1091, 883, 2682, 4582, 7592, 2777, 85, 1096, 513, 6998, 1818, 1920, 7762, 2331, 8093, 2563, 5361, 4210, 6563, 7112};
////        int[] nums = {1709,5955,4331,1386,7114,9131,385,814,573,569,7114,8628,2545,7082,6467,6980,3368,3331,7256,4243,2461,7306,5998,6703,5357,6676,8857,2978,3217,2762};
////        int[] nums = {1709,5955,4331,1386,7114,9131,385,814,573,569,7114,8628,2545,7082,6467,6980,3368,3331,7256,4243,2461,7306,5998,6703,5357,6676,8857,2978,3217,2762};//8
////                int[] nums = {1709,5955,4331,1386,7114,9131,385,814,573,569,7114,8628,2545,7082,6467,6980,3368,3331,7256,4243,2461,7306,5998};//7
////        int[] nums = {1709, 5955, 4331, 1386, 7114, 9131, 385, 814, 573, 569, 7114, 8628, 2545, 7082, 6467, 6980, 3368, 3331, 7256, 4243, 2461};//6
////        int[] nums = {1709,5955,4331,1386,7114,9131,385,814,573,569,7114,8628,2545,7082,6467};//4
////        int[] nums = {1709,5955,4331,1386,7114,9131,385,814,573,569,7114,8628,2545,7282};
////        int[] nums = {1709,5955,4331,1386};
////        int k = 4331;
////        int ans = 63;
//
////        int[] nums = {1,3,3,4};
////        int k = 1;
////        int ans = 2;
//
////                int[] nums = {4,4,4,3,4};
////        int k = 3;
////        int ans = 2;
//
////        int[] nums = {14,20,3,10,14,20,9};
////        int k = 6;
////        int ans = 3;
////        int[] nums = {1,100000};
////        int k = 100000;
////        int ans = 2;
//
////        int[] nums = {10,3,20,2,16,12};
////        int k = 4;
////        int ans = 2;
//
//        long time1, time2, time3;
//
//
//        // txt 轉 list
//
//        List<Integer> numList = new ArrayList<>();
//        int xh = 0;
//        for (int num = 0; num < stringList.size(); num++) {
//            String s1 = stringList.get(num);
//            Integer integer = Integer.valueOf(s1);
////            if (xh!= integer) {
//            xh = integer;
//            numList.add(integer);
////            }
//        }
////        for (int num = 0; num < nums.length; num++) {
////            Integer integer = nums[num];
////            if (xh!= integer) {
////                xh = integer;
////                numList.add(integer);
////            }
////        }
//
//        List<List<List<Integer>>> mapLists = new ArrayList<>();
//        List<List<Integer>> mapList = new ArrayList<>();
//
//        List<Integer> map = new ArrayList<>();
//        map.add(numList.get(numList.size() - 1));
//        map.add(1);
//        mapList.add(map);
//        mapLists.add(mapList);
//
//
//        time1 = System.currentTimeMillis();
//
//        for (int z = numList.size() - 2; z >= 0; z--) {
//            int x;
//            int y = 0;
//            int count = 1;
//            boolean mach = false;
//            boolean bb = false;
//            int num = numList.get(z);
//            int i1 = 999999999;
//
//            for (int i = mapLists.size() - 1; i >= 0; i--) {
//                List<List<Integer>> lists = mapLists.get(i);
//                x = 0;
//                int j = lists.size() - 1;
//
//
//                int n = 0;
//                int m = lists.size() - 1;
//                boolean aa = false;
//
//                if (num >= lists.get(j).get(0)) {
//                    n = j + 1;
//                    x = j + 1;
//                    if (num == lists.get(j).get(0)) {
//                        aa = true;
//                    }
//                }
//                if (num < lists.get(j).get(0)) {
//                    m = j - 1;
//                    if (lists.get(j).get(0) - num < i1) {
//                        i1 = lists.get(j).get(0) - num;
//                        x = j;
//                    }
//                    if (i1 <= k && i1 > 0) {
//                        count = mapLists.get(i).get(0).get(1) + 1;
//                        mach = true;
//                    }
//                }
//                while (m >= n) {
//                    int node = (n + m) / 2;
//                    if (num >= lists.get(node).get(0)) {
//                        n = node + 1;
//                        x = node + 1;
//                        if (num == lists.get(node).get(0)) {
//                            aa = true;
//                        }
//                    }
//                    if (num < lists.get(node).get(0)) {
//                        m = node - 1;
//                        if (lists.get(node).get(0) - num < i1) {
//                            i1 = lists.get(node).get(0) - num;
//                            x = node;
//                        }
//                        if (i1 <= k && i1 > 0) {
//                            count = mapLists.get(i).get(0).get(1) + 1;
//                            mach = true;
//                        }
//                    }
//                }
//                if (mach) {
//                    break;
//                } else {
//                    y = x;
//
//                    bb = aa;
//                }
//
//            }
//            if (mach && count > mapLists.size()) {
//                List<List<Integer>> mapList2 = new ArrayList<>();
//                List<Integer> map2 = new ArrayList<>();
//                map2.add(num);
//                map2.add(count);
//                mapList2.add(map2);
//                mapLists.add(mapList2);
//            } else if (!bb) {
//
//                List<Integer> map2 = new ArrayList<>();
//                map2.add(num);
//                map2.add(count);
//                mapLists.get(count - 1).add(y, map2);
//            }
////            System.out.println("mapLists:" + mapLists);
//
//        }
//
//        time2 = System.currentTimeMillis();
//
//        System.out.println("mapLists:" + mapLists);
//        System.out.println("花了：" + (time2 - time1) + "秒");
//        //        System.out.println();
//        System.out.println("nums:" + nums.length);
//        System.out.println("k:" + k);
////        System.out.println("numMap:" + numMap);
//
//        System.out.println("numMap:MAX:" + mapLists.size());
//
//        System.out.println("ans:" + ans);
//    }
//
//
//    //leetCode 441  beats 24%//401 beats 24%
//    @Test
//    public void lengthOfLIS9_test_3_3_2_ok_txt() throws IOException {
//        int[] nums = {};
//        int k = 500;
//        int ans = 0;
//
//        //string==50000//234//212
//        //string2==89//349//232
//        //  資料太大須存在txt，取txt檔
//        FileInputStream fis = new FileInputStream("src/test/resources/string.txt");
//        int content;
//        String s = "";
//        List<String> stringList = new ArrayList<>();
//        while ((content = fis.read()) != -1) {
//            char content1 = (char) content;
//            if (content1 == ',') {
//                stringList.add(s);
//                s = "";
//            } else {
//                s = s + content1;
//            }
////            System.out.println(content1);
//        }
//
//
////            System.out.println(stringList);
////        String s = fis.toString();
////        String[] split = s.split(",");
//
//
////        String stringTooLong = IOUtils.toString(fis, "UTF-8");
////        assertThat(stringTooLong).isNotEmpty();
////        int[] nums= {7,4,5,1,8,12,4,7};
////        int k=5;
////        int ans=4;
//
////        int[] nums = {4, 2, 1, 4, 3, 4, 5, 8, 15};
////        int k = 3;
////        int ans = 5;
//
////        int[] nums = {1};
////        int k = 1;
////        int ans = 1;
//
//
////        int[] nums = {2,1,2,3};
////        int k = 3;
////        int ans = 3;
//
////        int[] nums = {1709, 5955, 4331, 1386, 9131, 385, 814, 573, 569, 7114, 8628, 2545, 7082, 6467, 6980, 3368, 3331, 7256, 4243, 2461, 7306, 5998, 6703, 5357, 6676, 8857, 2978, 3217, 2762, 5304, 3473, 2589, 704, 2662, 5183, 1874, 6282, 5685, 152, 6947, 2439, 5215, 8070, 4244, 6364, 1149, 3257, 1123, 7928, 1465, 673, 2797, 3996, 7253, 1705, 2163, 3267, 6465, 4906, 578, 7135, 4879, 8774, 2690, 4474, 1742, 4218, 2988, 6241, 7527, 1779, 2280, 9011, 9431, 2175, 6750, 1263, 3969, 6770, 6155, 8371, 722, 8156, 793, 9550, 5425, 2478, 4687, 9359, 5552, 9590, 3111, 7081, 1091, 883, 2682, 4582, 7592, 2777, 85, 1096, 513, 6998, 1818, 1920, 7762, 2331, 8093, 2563, 5361, 4210, 6563, 7112, 1061, 6542, 7234, 3683, 7429, 8583, 4111, 9184, 5794, 780, 8414, 1522, 5113, 2618, 7798, 4432, 7951, 4507, 9723, 7754, 7513, 574, 4627, 7271, 8511, 2739, 6258, 9089, 6803, 8692, 13, 4147, 3356, 2539, 7321, 6301, 3693, 2944, 2658, 3396, 639, 2758, 3833, 4531, 4658, 7831, 3935, 143, 5533, 1268, 498, 8636, 827, 5569, 5564, 5277, 9273, 7890, 6382, 1635, 8877, 1567, 1977, 9458, 1495, 4529, 8306, 8556, 881, 1994, 3961, 1370, 2616, 9684, 5480, 8656, 5829, 8563, 9197, 8046, 6478, 1965, 1885, 4613, 6457, 8696, 4669, 5301, 8709, 1656, 8820, 8254, 89, 4300, 5670, 3300, 2806, 2761, 9249, 8658, 3023, 2584, 5111, 9006, 7636, 1888, 7519, 40, 5987, 3397, 9960, 3875, 8185, 4727, 4059, 4720, 1602, 9853, 8774, 7854, 6547, 2601, 5544, 5308, 9454, 2954, 1243, 233, 9280, 2441, 2189, 4559, 8594, 5887, 7612, 5982, 3264, 9343, 9380, 9488, 7587, 4851, 6498, 4020, 8047, 5122, 168, 3924, 8957, 6410, 5542, 6650, 3342, 9695, 7693, 6370, 9675, 9314, 3310, 3338, 3004, 6649, 3821, 6112, 719, 5455, 5249, 4969, 5267, 6934, 1249, 2726, 1028, 2029, 6048, 9267, 9189, 8457, 1872, 7290, 4169, 7733, 344, 7145, 4275, 8852, 3560, 9930, 6386, 9271, 1504, 1157, 7657, 2982, 3328, 7143, 2607, 7025, 4683, 2293, 9759, 115, 7200, 3826, 299, 3562, 8695, 7361, 9496, 3810, 1030, 3879, 1882, 776, 691, 2300, 7219, 5195, 609, 3421, 7977, 9909, 4573, 1818, 8651, 4074, 892, 409, 2836, 1844, 9706, 7262, 1827, 5845, 8796, 3926, 1687, 108, 7345, 1565, 3100, 1732, 4404, 3027, 2586, 2783, 9981, 8880, 1326, 1751, 4370, 4929, 9223, 5269, 2215, 7795, 8735, 699, 6151, 2764, 834, 8201, 3990, 5897, 9623, 2563, 4775, 2685, 3292, 4724, 3553, 2246, 1889, 7694, 9593, 428, 5220, 9895, 4618, 7861, 6508, 3521, 5291, 3487, 8736, 2309, 7250, 7621, 4879, 7998, 5167, 6548, 360, 4336, 6534, 2180, 6600, 2006, 2002, 8783, 7714, 5322, 5003, 1859, 3237, 5491, 4346, 6179, 7911, 5800, 3784, 8763, 1321, 1864, 125, 7399, 2192, 71, 2984, 7490, 1831, 3853, 8010, 9291, 2674, 1335, 2809, 859, 4822, 4418, 290, 1662, 2227, 8190, 9145, 6890, 9623, 5745, 9739, 5066, 5004, 3749, 8703, 5165, 6412, 8687, 698, 559, 4671, 5020, 2934, 6239, 4632, 6223, 7776, 3850, 2613, 8056, 8879, 9599, 8758, 4429, 9475, 3305, 4720, 9135, 3345, 618, 8328, 4655, 5507, 9108, 4836, 528, 732, 5811, 3330, 1781, 3940, 2471, 7953, 8057, 5039, 3987, 8459, 9053, 5273, 8710, 2990, 6411, 1299, 5101, 6741, 3701, 6241, 6960, 7690, 7078, 8873, 5222, 4117, 2355, 5376, 7386, 7626, 9742, 7849, 3212, 4201, 4192, 4496, 5641, 4354, 3222, 2767, 8015, 5933, 2535, 6314, 2968, 5328, 3328, 4551, 1510, 1054, 9586, 502, 1616, 7586, 219, 8212, 7361, 1213, 7708, 3785, 142, 1852, 1176, 7009, 2472, 1259, 6415, 3531, 512, 5293, 7410, 5368, 8448, 5245, 3482, 3004, 6085, 2293, 883, 5648, 4233, 2845, 8019, 1706, 5051, 7240, 903, 9722, 3702, 791, 5979, 3820, 5855, 4475, 4850, 5433, 8568, 5354, 7212, 9979, 5023, 4076, 9308, 201, 1772, 5291, 6206, 7432, 9820, 8893, 2510, 9332, 6778, 4706, 1192, 3346, 8837, 2237, 8965, 5940, 9336, 3186, 591, 5099, 993, 6105, 3037, 4955, 6395, 4755, 4816, 2599, 5798, 2123, 8785, 8298, 3750, 2632, 1240, 209, 2672, 8295, 8016, 9865, 2453, 7076, 2875, 9982, 7573, 3498, 3709, 6598, 4059, 7489, 1702, 5511, 2605, 3355, 1622, 3548, 5635, 7258, 7866, 7358, 7284, 2586, 5604, 2461, 4347, 6439, 5101, 451, 4375, 7160, 2806, 1944, 9322, 9967, 6053, 1413, 5597, 4336, 9562, 2387, 7114, 931, 3981, 7488, 4619, 5988, 4902, 3259, 8895, 5889, 8229, 4732, 2369, 123, 8119, 5870, 185, 5858, 434, 9181, 933, 6941, 3484, 4246, 4170, 8620, 2610, 399, 5750, 9419, 9801, 3381, 7466, 7495, 3730, 5713, 3887, 9723, 4226, 9477, 160, 8153, 9747, 700, 1373, 3184, 2141, 8854, 8599, 8920, 9550, 6360, 6622, 7157, 2677, 7148, 5528, 665, 1836, 5313, 5653, 3477, 4521, 3102, 9813, 1597, 6509, 3979, 685, 8367, 4483, 1236, 3075, 2944, 6076, 3400, 3368, 7184, 1086, 1416, 7410, 3150, 6043, 6726, 3854, 9495, 7765, 5530, 8894, 4235, 6914, 6378, 9879, 4655, 4191, 184, 2221, 7460, 3567, 2809, 9145, 9918, 1565, 1068, 3362, 4474, 5501, 5231, 1151, 2249, 337, 7918, 363, 309, 3998, 8907, 2247, 5078, 6130, 7571, 8437, 7036, 3586, 2378, 3414, 7447, 7338, 1103, 5915, 1530, 4510, 7847, 94, 1458, 2608, 8634, 828, 5813, 1461, 6408, 5272, 9431, 8230, 7408, 8369, 3620, 1511, 1066, 6220, 8451, 3536, 2739, 2169, 7295, 114, 2020, 1688, 9631, 1384, 70, 9373, 1277, 1099, 1334, 3979, 9482, 8004, 9413, 8595, 5441, 157, 2123, 7037, 8455, 2973, 5486, 2989, 790, 3746, 8505, 8178, 5493, 6266, 8632, 258, 9282, 7766, 9282, 3826, 6174, 5845, 819, 8982, 2560, 2716, 8583, 9494, 597, 6149, 745, 2670, 946, 1339, 5315, 7785, 7334, 3147, 5740, 1431, 5212, 9333, 8424, 8020, 1096, 828, 3546, 3900, 9342, 5223, 439, 4698, 1814, 9027, 4537, 2190, 3007, 7464, 2153, 4515, 5433, 6868, 9113, 9982, 6157, 8578, 317, 7545, 1504, 9082, 3327, 2545, 6741, 8455, 8287, 3298, 3330, 8696, 6863, 1107, 6603, 7846, 5435, 1933, 9184, 8073, 6056, 2258, 5200, 7035, 4473, 1296, 4732, 7882, 8095, 7012, 6407, 7511, 7016, 4385, 9683, 6084, 8443, 1460, 4809, 7599, 6950, 3279, 3599, 2186, 7987, 5128, 9377, 212, 8133, 3337, 9763, 3874, 4111, 7879, 2353, 1182, 5281, 6449, 8515, 3890, 1766, 222, 7680, 9438, 7058, 7134, 8373, 8713, 9019, 8364, 6439, 4316, 9482, 5898, 8008, 5733, 2079, 7674, 6680, 2061, 5657, 9472, 2467, 8418, 1982, 762, 4764, 5201, 8125, 4306, 6754, 7836, 3121};
//
////        int[] nums = {1709, 5955, 4331, 1386, 9131, 385, 814, 573, 569, 7114, 8628, 2545, 7082, 6467, 6980, 3368, 3331, 7256, 4243, 2461, 7306, 5998, 6703, 5357, 6676, 8857, 2978, 3217, 2762, 5304, 3473, 2589, 704, 2662, 5183, 1874, 6282, 5685, 152, 6947, 2439, 5215, 8070, 4244, 6364, 1149, 3257, 1123, 7928, 1465, 673, 2797, 3996, 7253, 1705, 2163, 3267, 6465, 4906, 578, 7135, 4879, 8774, 2690, 4474, 1742, 4218, 2988, 6241, 7527, 1779, 2280, 9011, 9431, 2175, 6750, 1263, 3969, 6770, 6155, 8371, 722, 8156, 793, 9550, 5425, 2478, 4687, 9359, 5552, 9590, 3111, 7081, 1091, 883, 2682, 4582, 7592, 2777, 85, 1096, 513, 6998, 1818, 1920, 7762, 2331, 8093, 2563, 5361, 4210, 6563, 7112};
////        int[] nums = {1709,5955,4331,1386,7114,9131,385,814,573,569,7114,8628,2545,7082,6467,6980,3368,3331,7256,4243,2461,7306,5998,6703,5357,6676,8857,2978,3217,2762};
////        int[] nums = {1709,5955,4331,1386,7114,9131,385,814,573,569,7114,8628,2545,7082,6467,6980,3368,3331,7256,4243,2461,7306,5998,6703,5357,6676,8857,2978,3217,2762};//8
////                int[] nums = {1709,5955,4331,1386,7114,9131,385,814,573,569,7114,8628,2545,7082,6467,6980,3368,3331,7256,4243,2461,7306,5998};//7
////        int[] nums = {1709, 5955, 4331, 1386, 7114, 9131, 385, 814, 573, 569, 7114, 8628, 2545, 7082, 6467, 6980, 3368, 3331, 7256, 4243, 2461};//6
////        int[] nums = {1709,5955,4331,1386,7114,9131,385,814,573,569,7114,8628,2545,7082,6467};//4
////        int[] nums = {1709,5955,4331,1386};
////        int k = 4331;
////        int ans = 63;
//
////        int[] nums = {1,3,3,4};
////        int k = 1;
////        int ans = 2;
//
////                int[] nums = {4,4,4,3,4};
////        int k = 3;
////        int ans = 2;
//
////        int[] nums = {14,20,3,10,14,20,9};
////        int k = 6;
////        int ans = 3;
////        int[] nums = {1,100000};
////        int k = 100000;
////        int ans = 2;
//
////        int[] nums = {10,3,20,2,16,12};
////        int k = 4;
////        int ans = 2;
//
//        long time1, time2, time3;
//
//
//        // txt 轉 list
//
//        List<Integer> numList = new ArrayList<>();
//        int xh = 0;
//        for (int num = 0; num < stringList.size(); num++) {
//            String s1 = stringList.get(num);
//            Integer integer = Integer.valueOf(s1);
////            if (xh!= integer) {
//            xh = integer;
//            numList.add(integer);
////            }
//        }
////        for (int num = 0; num < nums.length; num++) {
////            Integer integer = nums[num];
////            if (xh!= integer) {
////                xh = integer;
////                numList.add(integer);
////            }
////        }
//
//        List<List<Integer>> mapList = new ArrayList<>();
//
//        List<Integer> lists = new ArrayList<>();
//        lists.add(numList.get(numList.size() - 1));
//        mapList.add(lists);
//
//
//        time1 = System.currentTimeMillis();
//
//        for (int z = numList.size() - 2; z >= 0; z--) {
//            int x;
//            int y = 0;
//            int count = 1;
//            boolean mach = false;
//            boolean bb = false;
//            int num = numList.get(z);
//            int i1 = 999999999;
//
//            for (int i = mapList.size() - 1; i >= 0; i--) {
//                count = i;
//                x = 0;
//                int n = 0;
//                int m = mapList.get(i).size() - 1;
//                boolean aa = false;
//                int node = m;
//                while (m >= n) {
//                    if (num >= mapList.get(i).get(node)) {
//                        if (num == mapList.get(i).get(node)) {
//                            aa = true;
//                        }
//                        n = node + 1;
//                        x = node + 1;
//                        if (m == mapList.get(i).size() - 1) {
//                            break;
//                        }
//                    } else if (num < mapList.get(i).get(node)) {
//                        if (mapList.get(i).get(node) - num < i1) {
//                            i1 = mapList.get(i).get(node) - num;
//                            x = node;
//                        }
//                        if (i1 <= k && i1 > 0) {
//                            mach = true;
//                        }
//                        m = node - 1;
//                    }
//                    node = (n + m) / 2;
//                }
//                if (mach) {
//                    count++;
//                    break;
//                } else {
//                    y = x;
//                    bb = aa;
//                }
//
//            }
//            if (mach && count >= mapList.size()) {
//                List<Integer> list = new ArrayList<>();
//                list.add(num);
//                mapList.add(list);
//            } else if (!bb) {
//                mapList.get(count).add(y, num);
//            }
////            System.out.println("mapList:" + mapList);
//
//        }
//
//        time2 = System.currentTimeMillis();
//
//        System.out.println("mapList:" + mapList);
//        System.out.println("花了：" + (time2 - time1) + "秒");
//        System.out.println("nums:" + nums.length);
//        System.out.println("k:" + k);
//        System.out.println("numMap:MAX:" + mapList.size());
//        System.out.println("ans:" + ans);
//    }
//
//
//    @Test
//    public void trap() {
////        int[] height={0,1,0,2,1,0,1,3,2,1,2,1};
////        int Output= 6;
////        int[] height = {4, 2, 0, 3, 2, 5};
//        int[] height = {4, 2, 0, 3, 2, 5, 0, 1};
//        int Output = 9;
//        int sum = 0;
//        boolean b;
//        int j = 0;
//        int count = 0;
//        do {
//            boolean a = false;
//            b = false;
//            for (int i = 0; i < height.length; i++) {
//                if (height[i] > j) {
//                    if (!a) {
//                        a = true;
//                    } else {
//                        b = true;
//                        sum = sum + count;
//                        count = 0;
//                    }
//                } else {
//                    if (a) {
//                        count++;
//                    }
//                }
//            }
//            count = 0;
//            j++;
//        } while (b);
//        System.out.println(sum);
//    }
//
//
//    @Test
//    public void trap2() {
////        int[] height={0,1,0,2,1,0,1,3,2,1,2,1};
////        int Output= 6;
//        int[] height = {4, 2, 0, 3, 2, 5};
//        int Output = 9;
//        int sum = 0;
//        int allSum = 0;
////        int j = 0;
//        int count = 0;
//        int a = 0;
//        int b = 0;
//        int x = 0;
//        int y = 0;
//
//        List<Integer> list = new ArrayList<>();
//        Map<Integer, Integer> map = new HashMap<>();
//        for (int i = 0; i < height.length; i++) {
//            if (height[i] >= a) {
//                a = height[i];
//            } else {
//                x = i;
//                for (int j = i + 1; j < height.length; j++) {
//                    if (height[j] >= a) {
//                        for (int ii = 0; ii < a; ii++) {
//                            sum = sum + (map.get(ii) == null ? 0 : map.get(ii) * ii);
//                        }
//                        allSum = allSum + a * (j - x - 1) - sum;
//                        a = height[j];
//                        x = j;
//                    } else {
//                        if (map.containsKey(height[j])) {
//                            map.replace(height[j], map.get(map) + 1);
//                        } else {
//                            map.put(height[j], 1);
//                        }
//                    }
//                }
//            }
//        }
//        System.out.println(sum);
//    }
//
//
//    @Test
//    public void trap3() {
////        int[] height={0,1,0,2,1,0,1,3,2,1,2,1};
////        int Output= 6;
//        int[] height = {4, 2, 0, 3, 2, 5};
//        int Output = 9;
//        int sum = 0;
//        int allSum = 0;
//        int j = 0;
//        int count = 0;
//        int a = -1;
//        int b = 0;
//        int x = 0;
//        int ay = 0;
//        int by = 0;
//
//        List<List<Integer>> lists = new ArrayList<>();
//        List<List<Integer>> lists3 = new ArrayList<>();
//        Map<Integer, Integer> map = new HashMap<>();
//
//
//        for (int i = 1; i < height.length; i++) {
//            if (height[i - 1] < height[i]) {
//                a = height[i];
//
//            }
//        }
//
//        //取A點
//        for (int i = 1; i < height.length; i++) {
//            if (height[i - 1] > height[i]) {
//                if (a < height[i - 1]) {
//                    a = height[i - 1];
//                    ay = i - 1;
//                    List<Integer> list = new ArrayList<>();
//                    list.add(i - 1);
//                    list.add(height[i - 1]);
//                    lists.add(list);
//                    lists3.clear();
//                } else {
//                    if (b < height[i - 1]) {
//                        b = height[i - 1];
//                        by = i - 1;
//                        List<Integer> list3 = new ArrayList<>();
//                        list3.add(i - 1);
//                        list3.add(height[i - 1]);
//                        lists3.add(list3);
//                    }
//
//                }
//
//            }
//        }
//        lists.addAll(lists3);
//
//        for (int i = 0; i < height.length; i++) {
//            if (a < height[i]) {
//                a = height[i];
//                ay = i;
//            }
//        }
//
//
//        //取A點
//        for (int i = 1; i < height.length; i++) {
//            if (height[i - 1] > height[i]) {
//                List<Integer> list = new ArrayList<>();
//                list.add(i - 1);
//                list.add(height[i - 1]);
//                lists.add(list);
//            }
//        }
//
//        List<List<Integer>> lists2 = new ArrayList<>();
//        lists2.add(lists.get(0));
//        a = lists.get(0).get(1);
//        for (int i = 1; i < lists.size(); i++) {
//            if (a > lists.get(i).get(1)) {
//                lists2.clear();
//                lists2.add(lists.remove(i));
//            }
//        }
//
//        while (by < height.length - 1) {
//            b = 0;
//            //取B點
//            for (int i = ay + 1; i < height.length; i++) {
//                if (b <= height[i]) {
//                    by = i;
//                    b = height[i];
//                }
//                if (a <= height[i]) {
//                    break;
//                }
//            }
//            int min = Math.min(a, b);
//            for (int i = ay + 1; i < by; i++) {
//                sum = sum + (height[i] > min ? min : height[i]);
//            }
//            ay = by;
//            a = b;
//
//
//            allSum = allSum + ((by - (ay + 1)) * min - sum);
//
//
//        }
//        System.out.println(sum);
//    }
//
////    List<List<Integer>> aa(int a,){
////        for (int i = 1; i < height.length; i++) {
////            if(height[i-1]>height[i]){
////                if(a<height[i-1]){
////                    a=height[i-1];
////                    ay=i-1;
////                    List<Integer> list = new ArrayList<>();
////                    list.add(i-1);
////                    list.add(height[i-1]);
////                    lists.add(list);
////                    lists3.clear();
////                }else {
////                    if(b<height[i-1]){
////                        b=height[i-1];
////                        by=i-1;
////                        List<Integer> list3 = new ArrayList<>();
////                        list3.add(i-1);
////                        list3.add(height[i-1]);
////                        lists3.add(list3);
////                    }
////
////                }
////
////            }
////        }
////
////        return null;
////    }
//
//    @Test
//    public void trap5() {
////        int[] height={0,1,0,2,1,0,1,3,2,1,2,1};
////        int Output= 6;
//        int[] height = {4, 2, 0, 3, 2, 5, 0, 1};//10
////        int[] height = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};//6
////        int[] height = {4,2,0,3,2,5};//9
////        int[] height = {5,4,1,2};//1
////        int[] height = {5,2,1,2,1,5};//14
////        int[] height = {4,2,3,5,1,9,9,6};//7
////        int[] height = {5,3,7,7};//2
////        int[] height = {4,3,8,3,1,5,9,9,0,4,3,4,7};//33
//
//        if (height.length < 3) {
//            System.out.println("長度小於3");
//        }
//
//        int b = 0;
//        int by;
//        int h = 0;
//        int hy = 0;
//        List<Integer> heightList = new ArrayList<>();
//        for (int i = 0; i < height.length; i++) {
//            if (height[i] > h) {
//                h = height[i];
//                hy = i;
//            } else if (height[i] == h && hy == i - 1) {
//                hy = i;
//            }
//            heightList.add(height[i]);
//        }
//
//        heightList.add(0);
//        List<Integer> list = new ArrayList<>();
//        for (int i = 1; i < heightList.size(); i++) {
//            if (heightList.get(i - 1) > heightList.get(i)) {
//                if (b < heightList.get(i - 1)) {
//                    b = heightList.get(i - 1);
//                    by = i - 1;
//                    if (list.size() < 1) {
//                        list.add(i - 1);
//                    } else {
//                        if (i - 1 <= hy) {
//                            if (heightList.get(list.get(list.size() - 1)) > b) {
//                            } else {
//                                list.add(by);
//                            }
//                        } else {
//                            for (int j = list.size() - 1; j >= 1; j--) {
//                                if (heightList.get(list.get(j)) < b) {
//                                    list.remove(j);
//                                } else {
//                                    break;
//                                }
//                            }
//                            list.add(by);
//                        }
//                    }
//                }
//            } else {
//                b = 0;
//            }
//            System.out.println(list);
//        }
//
//        int min;
//        int stone = 0;
//        int sum = 0;
//        int aa;
//        int bb;
//
//        for (int i = 1; i < list.size(); i++) {
//            aa = list.get(i - 1);
//            bb = list.get(i);
//            min = Math.min(height[aa], height[bb]);
//            for (int j = aa + 1; j < bb; j++) {
//                stone = stone + (height[j] > min ? min : height[j]);
//            }
//
//            sum = sum + min * (bb - aa - 1) - stone;
//            stone = 0;
//        }
//        System.out.println(h);
//        System.out.println(hy);
//        System.out.println(list);
//        System.out.println(sum);
//
//    }
//
//
//    @Test
//        //48
//    void isRectangleCover2() {
//        int[][] rectangles = {{1, 1, 3, 3}, {3, 1, 4, 2}, {3, 2, 4, 4}, {1, 3, 2, 4}, {2, 3, 3, 4}};
//
//        List<Integer> list = new ArrayList<>();
//        if (rectangles.length == 0 || rectangles[0].length == 0) {
//            System.out.println(false);
//        } else {
//            list.add(rectangles[0][0]);
//            list.add(rectangles[0][1]);
//            list.add(rectangles[0][2]);
//            list.add(rectangles[0][3]);
//        }
//        int sum = 0;
//        for (int i = 0; i < rectangles.length; i++) {
//            for (int j = i + 1; j < rectangles.length; j++) {
//                if ((rectangles[i][0] < rectangles[j][2] && rectangles[i][2] > rectangles[j][0])
//                        && (rectangles[i][1] < rectangles[j][3] && rectangles[i][3] > rectangles[j][1])) {
//                    break;
//                }
//            }
//            list.set(0, Math.min(rectangles[i][0], list.get(0)));
//            list.set(1, Math.min(rectangles[i][1], list.get(1)));
//            list.set(2, Math.max(rectangles[i][2], list.get(2)));
//            list.set(3, Math.max(rectangles[i][3], list.get(3)));
//            sum = sum + (rectangles[i][2] - rectangles[i][0]) * (rectangles[i][3] - rectangles[i][1]);
//        }
//
//        int i = (list.get(2) - list.get(0)) * (list.get(3) - list.get(1));
//
//        System.out.println(sum == i);
//    }
//
//    @Test
//    void isRectangleCover3() {
//        int[][] rectangles = {{1, 1, 3, 3}, {3, 1, 4, 2}, {3, 2, 4, 4}, {1, 3, 2, 4}, {2, 3, 3, 4}};//true
////        int[][] rectangles = {{0,0,1,1}, {0,1,3,2}, {1,0,2,2}};//false
////        int[][] rectangles = {{0, 0, 3, 1}, {0, 1, 2, 3}, {1, 0, 2, 1}, {2, 2, 3, 3}};false
//        List<List<Integer>> lists = new ArrayList<>();
//        List<Integer> maxList = new ArrayList<>();
//        if (rectangles.length == 0 || rectangles[0].length == 0) {
//            System.out.println(false);
//        } else {
//            List<Integer> list = new ArrayList<>();
//            list.add(rectangles[0][0]);
//            list.add(rectangles[0][1]);
//            list.add(rectangles[0][2]);
//            list.add(rectangles[0][3]);
//            maxList.add(rectangles[0][0]);
//            maxList.add(rectangles[0][1]);
//            maxList.add(rectangles[0][2]);
//            maxList.add(rectangles[0][3]);
//
//            lists.add(list);
//        }
//        boolean ans = true;
//        int sum = (rectangles[0][2] - rectangles[0][0]) * (rectangles[0][3] - rectangles[0][1]);
//        for (int i = 1; i < rectangles.length; i++) {
//
//            int x = 0;
//
//            int num0 = rectangles[i][0];
//            int num1 = rectangles[i][1];
//            int num2 = rectangles[i][2];
//            int num3 = rectangles[i][3];
//            int n = 0;
//            int m = lists.size() - 1;
//            boolean aa = false;
//
//            while (m >= n) {
//                int node = (n + m) / 2;
//                if (num0 >= lists.get(node).get(2)) {
//                    n = node + 1;
//                    x = node + 1;
//                } else {
//                    m = node - 1;
//                    x = node;
//                }
//            }
//
//            for (int j = x; j < lists.size(); j++) {
//                if (num2 <= lists.get(j).get(0)) {
//                    break;
//                } else if (num0 < lists.get(j).get(2) && num1 < lists.get(j).get(3) && num3 > lists.get(j).get(1)) {
//                    System.out.println(false);
//                    break;
//                }
//            }
//            List<Integer> integers = new ArrayList<>();
//            integers.add(rectangles[i][0]);
//            integers.add(rectangles[i][1]);
//            integers.add(rectangles[i][2]);
//            integers.add(rectangles[i][3]);
//            lists.add(integers);
//
//            maxList.set(0, Math.min(rectangles[i][0], maxList.get(0)));
//            maxList.set(1, Math.min(rectangles[i][1], maxList.get(1)));
//            maxList.set(2, Math.max(rectangles[i][2], maxList.get(2)));
//            maxList.set(3, Math.max(rectangles[i][3], maxList.get(3)));
//            sum = sum + (num2 - num0) * (num3 - num1);
//        }
//
//        int i = (maxList.get(2) - maxList.get(0)) * (maxList.get(3) - maxList.get(1));
//
//        System.out.println(sum == i);
//    }
//
//    @Test
//    void isRectangleCover4() {
////        int[][] rectangles = {{1, 1, 3, 3}, {3, 1, 4, 2}, {3, 2, 4, 4}, {1, 3, 2, 4}, {2, 3, 3, 4}};//true
////        int[][] rectangles = {{0,0,1,1}, {0,1,3,2}, {1,0,2,2}};//false
////        int[][] rectangles = {{0, 0, 3, 1}, {0, 1, 2, 3}, {1, 0, 2, 1}, {2, 2, 3, 3}};//false
////        int[][] rectangles = {{1,1,2,3}, {1,3,2,4}, {3,1,4,2}, {3,2,4,4}};//false
//        int[][] rectangles = {{1, 1, 3, 3}, {3, 1, 4, 2}, {1, 3, 2, 4}, {2, 2, 4, 4}};//false
//
//        List<List<Integer>> lists = new ArrayList<>();
//        List<Integer> maxList = new ArrayList<>();
//        if (rectangles.length == 0 || rectangles[0].length == 0) {
//            System.out.println(false);
////            return false;
//        } else {
//            List<Integer> list = new ArrayList<>();
//            list.add(rectangles[0][0]);
//            list.add(rectangles[0][1]);
//            list.add(rectangles[0][2]);
//            list.add(rectangles[0][3]);
//            maxList.add(rectangles[0][0]);
//            maxList.add(rectangles[0][1]);
//            maxList.add(rectangles[0][2]);
//            maxList.add(rectangles[0][3]);
//
//            lists.add(list);
//        }
//        int sum = (rectangles[0][2] - rectangles[0][0]) * (rectangles[0][3] - rectangles[0][1]);
//        for (int i = 1; i < rectangles.length; i++) {
//
//            int num0 = rectangles[i][0];
//            int num1 = rectangles[i][1];
//            int num2 = rectangles[i][2];
//            int num3 = rectangles[i][3];
//
//            int startX = 0;
//            int endX = 0;
//            int n1 = 0;
//            int m1 = lists.size() - 1;
//            int n2 = 0;
//            int m2 = lists.size() - 1;
//            boolean aa = false;
//            while (m1 >= n1 && m2 >= n2) {
//                if (m1 >= n1) {
//                    int node1 = (n1 + m1) / 2;
//                    if (num0 >= lists.get(node1).get(2)) {
//                        n1 = node1 + 1;
//                        startX = node1 + 1;
//                    } else {
//                        m1 = node1 - 1;
//                        startX = node1;
//                    }
//                }
//
//                if (m2 >= n2) {
//                    int node2 = (n2 + m2) / 2;
//                    if (num2 > lists.get(node2).get(0)) {
//                        n2 = node2 + 1;
//                        endX = node2;
//                    } else {
//                        m2 = node2 - 1;
//                        endX = node2;
//                    }
//                }
//            }
//
//
//            int startY = 0;
//            int endY = 0;
//            if (startX <= endX && startX < lists.size() && endX >= 0) {
//                n1 = startX;
//                m1 = endX;
//                n2 = startX;
//                m2 = endX;
//                while (m1 >= n1 && m2 >= n2) {
//                    if (m1 >= n1) {
//                        int node1 = (n1 + m1) / 2;
//                        if (num1 >= lists.get(node1).get(3)) {
//                            n1 = node1 + 1;
//                            startY = node1 + 1;
//                        } else {
//                            m1 = node1 - 1;
//                            startY = node1;
//                        }
//                    }
//
//                    if (m2 >= n2) {
//                        int node2 = (n2 + m2) / 2;
//                        if (num3 > lists.get(node2).get(1)) {
//                            n2 = node2 + 1;
//                            endY = node2 + 1;
//                        } else {
//                            m2 = node2 - 1;
//                            endY = node2;
//                        }
//                    }
//                }
//            }
//
//            if (startY <= endY && startY < lists.size()) {
//                for (int j = startY; j <= endY && j < lists.size(); j++) {
//                    if (num0 < lists.get(j).get(2) && num1 < lists.get(j).get(3) && num3 > lists.get(j).get(1)) {
//                        System.out.println(false);
//                        break;
////                        return false;
//                    }
//                }
//            }
//
//            List<Integer> integers = new ArrayList<>();
//            integers.add(rectangles[i][0]);
//            integers.add(rectangles[i][1]);
//            integers.add(rectangles[i][2]);
//            integers.add(rectangles[i][3]);
//            lists.add(endY, integers);
//
//            System.out.println(lists);
//            maxList.set(0, Math.min(rectangles[i][0], maxList.get(0)));
//            maxList.set(1, Math.min(rectangles[i][1], maxList.get(1)));
//            maxList.set(2, Math.max(rectangles[i][2], maxList.get(2)));
//            maxList.set(3, Math.max(rectangles[i][3], maxList.get(3)));
//            sum = sum + (num2 - num0) * (num3 - num1);
//        }
//
//        int i = (maxList.get(2) - maxList.get(0)) * (maxList.get(3) - maxList.get(1));
//
//        System.out.println(sum == i);
//    }
//
//
//    @Test
//    void isRectangleCover5() {
////        int[][] rectangles = {{1, 1, 3, 3}, {3, 1, 4, 2}, {3, 2, 4, 4}, {1, 3, 2, 4}, {2, 3, 3, 4}};//true
////        int[][] rectangles = {{0,0,1,1}, {0,1,3,2}, {1,0,2,2}};//false
////        int[][] rectangles = {{0, 0, 3, 1}, {0, 1, 2, 3}, {1, 0, 2, 1}, {2, 2, 3, 3}};//false
////        int[][] rectangles = {{1,1,2,3}, {1,3,2,4}, {3,1,4,2}, {3,2,4,4}};//false
//        int[][] rectangles = {{1, 1, 3, 3}, {3, 1, 4, 2}, {1, 3, 2, 4}, {2, 2, 4, 4}};//false
//
//        List<List<Integer>> lists = new ArrayList<>();
//        List<Integer> maxList = new ArrayList<>();
//        if (rectangles.length == 0 || rectangles[0].length == 0) {
//            System.out.println(false);
////            return false;
//        } else {
//            List<Integer> list = new ArrayList<>();
//            list.add(rectangles[0][0]);
//            list.add(rectangles[0][1]);
//            list.add(rectangles[0][2]);
//            list.add(rectangles[0][3]);
//            maxList.add(rectangles[0][0]);
//            maxList.add(rectangles[0][1]);
//            maxList.add(rectangles[0][2]);
//            maxList.add(rectangles[0][3]);
//
//            lists.add(list);
//        }
//        int sum = (rectangles[0][2] - rectangles[0][0]) * (rectangles[0][3] - rectangles[0][1]);
//        for (int i = 1; i < rectangles.length; i++) {
//
//            int num0 = rectangles[i][0];
//            int num1 = rectangles[i][1];
//            int num2 = rectangles[i][2];
//            int num3 = rectangles[i][3];
//
//            int start = 0;
//            int end = 0;
//            int n = 0;
//            int m = lists.size() - 1;
//            boolean aa = false;
//            while (m >= n) {
//
//                int node2 = (n + m) / 2;
//                if (num2 > lists.get(node2).get(0)) {
//                    n = node2 + 1;
//                    end = node2;
//                } else {
//                    m = node2 - 1;
//                    end = node2 - 1;
//                }
//
//            }
//
//            if (end >= 0) {
//
//                while (m >= n) {
//                    int node1 = (n + m) / 2;
//                    if (num0 >= lists.get(node1).get(2)) {
//                        n = node1 + 1;
//                        start = node1 + 1;
//                    } else {
//                        m = node1 - 1;
//                        start = node1;
//                    }
//
//                }
//            }
//
//
//            int startY = 0;
//            int endY = 0;
//            if (start <= end && start < lists.size() && end >= 0) {
//                n = start;
//                m = end;
//                n = start;
//                m = end;
//                while (m >= n && m >= n) {
//                    if (m >= n) {
//                        int node1 = (n + m) / 2;
//                        if (num1 >= lists.get(node1).get(3)) {
//                            n = node1 + 1;
//                            startY = node1 + 1;
//                        } else {
//                            m = node1 - 1;
//                            startY = node1;
//                        }
//                    }
//
//                    if (m >= n) {
//                        int node2 = (n + m) / 2;
//                        if (num3 > lists.get(node2).get(1)) {
//                            n = node2 + 1;
//                            endY = node2 + 1;
//                        } else {
//                            m = node2 - 1;
//                            endY = node2;
//                        }
//                    }
//                }
//            }
//
//            if (startY <= endY && startY < lists.size()) {
//                for (int j = startY; j <= endY && j < lists.size(); j++) {
//                    if (num0 < lists.get(j).get(2) && num1 < lists.get(j).get(3) && num3 > lists.get(j).get(1)) {
//                        System.out.println(false);
//                        break;
////                        return false;
//                    }
//                }
//            }
//
//            List<Integer> integers = new ArrayList<>();
//            integers.add(rectangles[i][0]);
//            integers.add(rectangles[i][1]);
//            integers.add(rectangles[i][2]);
//            integers.add(rectangles[i][3]);
//            lists.add(endY, integers);
//
//            System.out.println(lists);
//            maxList.set(0, Math.min(rectangles[i][0], maxList.get(0)));
//            maxList.set(1, Math.min(rectangles[i][1], maxList.get(1)));
//            maxList.set(2, Math.max(rectangles[i][2], maxList.get(2)));
//            maxList.set(3, Math.max(rectangles[i][3], maxList.get(3)));
//            sum = sum + (num2 - num0) * (num3 - num1);
//        }
//
//        int i = (maxList.get(2) - maxList.get(0)) * (maxList.get(3) - maxList.get(1));
//
//        System.out.println(sum == i);
//    }
//
//
//    @Test
//    void isRectangleCover6() {
////        int[][] rectangles = {{1, 1, 3, 3}, {3, 1, 4, 2}, {3, 2, 4, 4}, {1, 3, 2, 4}, {2, 3, 3, 4}};//true
////        int[][] rectangles = {{1,2,4,4}, {1,0,4,1}, {0,2,1,3}, {0,1,3,2}, {3,1,4,2}, {0,3,1,4}, {0,0,1,1}};//43 true
////        int[][] rectangles = {{0,0,1,1}, {0,1,1,2}, {0,2,1,3}, {1,0,2,1}, {1,0,2,1}, {1,2,2,3}, {2,0,3,1}, {2,1,3,2}, {2,2,3,3}};//42 false
////        int[][] rectangles = {{0,0,1,1}, {0,1,3,2}, {1,0,2,2}};//false
////        int[][] rectangles = {{0, 0, 3, 1}, {0, 1, 2, 3}, {1, 0, 2, 1}, {2, 2, 3, 3}};//false
////        int[][] rectangles = {{1,1,2,3}, {1,3,2,4}, {3,1,4,2}, {3,2,4,4}};//false
////        int[][] rectangles = {{1, 1, 3, 3}, {3, 1, 4, 2}, {1, 3, 2, 4}, {2, 2, 4, 4}};//false
//        int[][] rectangles = {{1,1,2,2}, {0,1,1,2}, {1,0,2,1}, {0,2,3,3}, {2,0,3,3}};//false
//
//        List<List<Integer>> lists = new ArrayList<>();
//        List<Integer> maxList = new ArrayList<>();
//        if (rectangles.length == 0 || rectangles[0].length == 0) {
//            System.out.println(false);
////            return false;
//        } else {
//            List<Integer> list = new ArrayList<>();
//            list.add(rectangles[0][0]);
//            list.add(rectangles[0][1]);
//            list.add(rectangles[0][2]);
//            list.add(rectangles[0][3]);
//            maxList.add(rectangles[0][0]);
//            maxList.add(rectangles[0][1]);
//            maxList.add(rectangles[0][2]);
//            maxList.add(rectangles[0][3]);
//
//            lists.add(list);
//        }
//        int sum = (rectangles[0][2] - rectangles[0][0]) * (rectangles[0][3] - rectangles[0][1]);
//        for (int i = 1; i < rectangles.length; i++) {
//
//            int num0 = rectangles[i][0];
//            int num1 = rectangles[i][1];
//            int num2 = rectangles[i][2];
//            int num3 = rectangles[i][3];
//
//            int node = 0;
//            int n = 0;
//            int m = lists.size() - 1;
//
//            for (int j = 0; j < rectangles[i].length; j++) {
//                int[] startEndNode = node(rectangles[i][j], lists, n, m, j);
//                if (startEndNode[0] > startEndNode[1]) {
//                    node = startEndNode[0];
//                    break;
//                }else if(j==3 && startEndNode[0] == startEndNode[1]){
//                    node = startEndNode[0];
//                    System.out.println("j==3 && startEndNode[0] == startEndNode[1]"+false);
////                    return false;
//                }
//                n = startEndNode[0];
//                m = startEndNode[1];
//
//            }
//
//            n = 0;
//            m = lists.size() - 1;
//            m = end(rectangles[i][2], lists, n, m, 0);
//            if(m>0){
//                m = end(rectangles[i][3], lists, n, m, 1);
//            }
//            System.out.println("n:" + n);
//            System.out.println("m:" + m);
//            if(m>0){
//                n = start(rectangles[i][0], lists, n, m, 2);
//            }
//            System.out.println("n:" + n);
//            System.out.println("m:" + m);
//            if(n<lists.size()){
//                n = start(rectangles[i][1], lists, n, m, 3);
//            }
//
//
//
//            System.out.println("n:" + n);
//            System.out.println("m:" + m);
//            for (int j = n; j <= m && j < lists.size(); j++) {
//                System.out.println("最後:"+j);
//                if (num0 < lists.get(j).get(2) && num1 < lists.get(j).get(3) && num2 > lists.get(j).get(0) && num3 > lists.get(j).get(1)) {
//                    System.out.println(false);
//                    break;
////                        return false;
//                }
//            }
//
//
//            List<Integer> integers = new ArrayList<>();
//            integers.add(rectangles[i][0]);
//            integers.add(rectangles[i][1]);
//            integers.add(rectangles[i][2]);
//            integers.add(rectangles[i][3]);
//            lists.add(node, integers);
//
//            System.out.println(lists);
//            maxList.set(0, Math.min(rectangles[i][0], maxList.get(0)));
//            maxList.set(1, Math.min(rectangles[i][1], maxList.get(1)));
//            maxList.set(2, Math.max(rectangles[i][2], maxList.get(2)));
//            maxList.set(3, Math.max(rectangles[i][3], maxList.get(3)));
//            sum = sum + (num2 - num0) * (num3 - num1);
//        }
//
//        int i = (maxList.get(2) - maxList.get(0)) * (maxList.get(3) - maxList.get(1));
//
//        System.out.println(sum == i);
//    }
//
//    int start(int num, List<List<Integer>> lists, int n, int m, int i) {
//        int node = 0;
//        while (m >= n) {
//            int node1 = (n + m) / 2;
//            if (num > lists.get(node1).get(i)) {
//                n = node1 + 1;
//                node = node1+1;
//            } else {
//                m = node1 - 1;
//                node = node1 ;
//            }
//        }
//
//        return node;
//    }
//
//    int end(int num, List<List<Integer>> lists, int n, int m, int i) {
//        int node = 0;
//        while (m >= n) {
//            int node1 = (n + m) / 2;
//            if (num > lists.get(node1).get(i)) {
//                n = node1 + 1;
//                node = node1 ;
//            } else {
//                m = node1 - 1;
//                node = node1-1;
//            }
//        }
//
//        return node;
//    }
//
//    int[] node(int num, List<List<Integer>> lists, int n, int m, int i) {
//        int[] rNode = new int[2];
//        int n1 = n;
//        int m1 = m;
//        int n2 = n;
//        int m2 = m;
//        while (m1 >= n1 || m2 >= n2) {
//            if (m1 >= n1) {
//                int node1 = (n1 + m1) / 2;
//                if (num > lists.get(node1).get(i)) {
//                    n1 = node1 + 1;
//                    rNode[0] = node1 + 1;
//                } else {
//                    m1 = node1 - 1;
//                    rNode[0] = node1;
//                }
//            }
//
//            if (m2 >= n2) {
//                int node2 = (n2 + m2) / 2;
//                if (num >= lists.get(node2).get(i)) {
//                    n2 = node2 + 1;
//                    rNode[1] = node2;
//                } else {
//                    m2 = node2 - 1;
//                    rNode[1] = node2 - 1;
//                }
//            }
//
//        }
//
//        return rNode;
//    }
//
//
//}