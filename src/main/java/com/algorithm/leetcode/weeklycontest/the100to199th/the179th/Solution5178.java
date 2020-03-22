package com.algorithm.leetcode.weeklycontest.the100to199th.the179th;

import org.junit.Test;

import java.util.HashMap;

public class Solution5178 {

    @Test
    public void test1(){
        System.out.println(sumFourDivisors(new int[]{1,2,3,4,5,6,7,8,9,10}));
        System.out.println(sumFourDivisors(new int[]{21,4,7}));
        System.out.println(sumFourDivisors(new int[]{78756,82259,82272,50895,19786}));
        System.out.println(sumFourDivisors(new int[]{93751,92795,98881,94438,96685,95056,90417,92677,98207,
                96164,93887,98421,98044,94626,99911,96275,91134,90177,98316,93173,95182,98023,98460,94542,90310,
                94434,97496,90409,98476,91452,92170,92642,91877,99552,91570,93871,90494,97218,96846,99181,93365,
                90584,99480,95026,97763,92867,95409,97082,90206,94436,93134,99212,90040,98147,94420,99892,96104,
                99193,94483,97733,96816,98753,97592,95793,92768,99243,91663,97219,99230,92552,99164,99969,94321,
                96276,99304,96491,94699,93336,96136,99880,97108,99319,96648,96800,97409,95260,90791,92189,99731,
                91248,90575,95026,96413,95953,99844,97938,91076,99170,94199,90215,90834,96922,91331,93602,95950,
                90201,92380,98928,90783,95176,93300,92362,93532,94781,90089,98918,95430,90998,92764,96305,90802,
                90966,92899,98726,95654,91208,90398,96162,99963,97243,94603,94781,99667,98623,96840,92494,96020,
                95347,91315,94341,97876,91599,93705,98295,92466,98290,98140,93108,91473,91432,96893,99298,92346,
                94764,96802,92541,99243,97890,90669,91943,98106,90217,91005,90129,99631,99808,94049,91359,99356,
                91385,93761,91292,93718,90190,93755,93760,92576,94667,95521,92184,98468,99966,95480,91132,91249,
                90653,91084,99286,90063,98572,98346,93703,99616,92042,94038,90856,99287,91866,93749,97237,91131,
                97957,98165,92411,90128,98115,90793,93994,94041,95048,95715,94391,97301,96980,99561,98773,92752,
                96321,97643,97948,97628,99764,90092,96054,90447,94996,97833,92200,91466,93796,94953,97896,93591,
                96114,99901,96471,98426,95248,93482,91843,91779,94316,91246,96937,95302,97504,96666,91813,96574,
                95188,99131,93769,97094,97252,92655,96004,94793,93544,94597,93473,96526,91222,92972,92861,98192,
                98792,97359,95656,93364,91331,98297,97713,90852,99312,95938,99075,99086,91404,97908,93965,97250,
                99072,99365,93877,97703,91702,97486,90340,90638,99434,98494,97169,97281,94812,95556,96418,98959,
                92977,92709,94222,90036,93219,90369,99721,97648,97090,95081,98278,94693,97277,99691,98884,91064,
                91904,92848,96147,91230,98826,90883,90119,93394,96989,92934,96937,92932,92007,96353,95502,95463,
                96338,99330,96568,93086,95059,93304,97177,90614,95972,96770,97072,99090,93168,94871,99316,92771,
                91023,99198,95421,95840,99564,94708,96973,99178,96102,97399,93428,98421,93051,95054,96468,91508,
                93438,92771,95619,90646,96262,99116,92366,94718,91688,95838,97943,90227,95111,90657,97612,91461,
                90725,94311,95382,91203,98268,91225,93027,93952,97986,95406,93935,91600,94252,92363,97908,96623,
                99834,95868,90178,99495,97450,98818,91908,98840,93649,98723,94430,92201,94409,90471,90430,90939,
                91579,97277,91056,93101,97675,99797,97123,94232,99542,93339,93103,91883,97422,94097,99516,93028,
                94041,96461,92934,95168,95368,95175,99182,91801,94776,96882,91600,97451,95181,91216,90800,93240,
                98244,94995,95582,95873,96313,98154,93232,93408,92067,93545,93929,94914,95320,93213,97526,95220,
                94563,99048,90319,96711,99522,96239,91985,90068,96401,93658,92924,94722,95048,96075,90129,99463,
                90941,95822,95094,97052,98462,91722,95873,97295,94270,92070,94372,97057,94289,93707,90043,92350,
                91033,96397,95024,91873,93882,98562,94869,90889,97736,94723,93495,92000,96322,99255,95340,93189,
                96795,90988,94099,93763,92925,93628,94653,98435,96812,96600,93055,92686,97305,92376,94303,95004,
                90601,93943,98849,93923,94046,90096,94157,90629,92203,92214,94495,90586,98061,97946,98349,90028,
                94615,93156,93810,91992,98673,94152,92665,98642,92208,91480,92697,95145,99831,96675,98914,93737,
                94018,90430,98944,95455,94254,90879,94366,91692,98027,91679,96408,98310,96126,96978,95829,90605,
                92149,99017,91531,91740,90068,90641,91603,93956,95181,92562,92191,90731,99186,93705,97606,90026,
                98575,95937,98715,90155,94220,92769,98549,92589,92315,94601,96929,92242,90748,97290,92805,91115,
                93777,92104,91722,91592,94115,91414,99376,97915,93294,98776,91034,92030,96476,90413,95951,91586,
                91284,91805,93225,97865,92182,99822,99627,98000,93992,93032,93464,92784,98706,95976,90411,90428,
                94921,96952,92399,96052,97760,90962,97051,99274,94667,96253,99028,91977,90732,95854,96681,94250,
                92931,93169,95832,94698,99692,90497,94734,94533,95705,90566,97262,90035,94217,99733,99673,94337,
                94431,96937,99789,91612,94632,97682,91813,91498,97270,93007,97691,94982,97398,93378,95645,97968,
                90643,95984,95452,96519,92977,91931,94739,97089,98335,92386,95685,93168,94713,95018,99833,90643,
                91080,93333,91284,99485,90620,99157,96693,92994,92183,99461,92152,99787,92709,98471,94521,91074,
                93427,95218,94912,98010,94393,94151,98608,91331,98119,90295,90397,91114,97413,91996,93823,97874,
                98420,93794,96946,96521,92945,91940,92257,97024,97248,96913,91209,94422,97837,96616,94710,90851,
                96924,99618,94303,90529,98467,90329,93171,90670,91973,94895,95808,96719,92123,98538,98374,99733,
                98339,90733,97830,98766,95698,90515,99966,90004,99881,92288,92275,98655,95567,93182,96831,95450,
                96444,99707,90514,96799,95433,90634,90282,98791,96124,94217,90323,90427,92656,94573,97689,96756,
                92720,99133,93867,92278,98912,90156,96184,94397,95876,94982,93298,96080,90423,98075,94175,98780,
                94347,91185,97333,94758,92182,98497,96580,93048,90667,93009,90542,96237,92749,91783,99235,96479,
                92190,91859,96099,93784,93439,97957,97551,95700,96717,98262,90921,91676,91632,93868,94162,91615,
                92130,92660,96454,91679,90052,96562,98546,91202,96444,95546,90923,91655,92187,98083,94404,92470,
               }));
    }

    public int sumFourDivisors(int[] nums) {
        int result = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            int tmp = 1 + num;
            if (map.containsKey(num)){
                result += map.get(num);
            } else {
                int counter = 0;
                double sqrt = Math.sqrt(num);
                for (int j = 2; j <= sqrt; j++) {
                    if (num % j == 0) {
                        if (j < sqrt){
                            counter+=2;
                            tmp += j;
                            tmp += num / j;
                        } else {
                            counter+=1;
                            tmp += j;
                        }
                    }
                    if (counter > 2) break;
                }
                if (counter == 2) {
                    result += (tmp);
                    map.put(num,tmp);
                }
            }
        }
        return result;
    }
}
