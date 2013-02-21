package org.red5.codecs.g729;

//package org.mobicents.media.server.impl.dsp.audio.g729;

public class TabLD8k {

	public static final float hamwindow[] = new float[] { (float) 0.08000000, (float) 0.08005703, (float) 0.08022812,
			(float) 0.08051321, (float) 0.08091225, (float) 0.08142514, (float) 0.08205172, (float) 0.08279188,
			(float) 0.08364540, (float) 0.08461212, (float) 0.08569173, (float) 0.08688401, (float) 0.08818865,
			(float) 0.08960532, (float) 0.09113365, (float) 0.09277334, (float) 0.09452391, (float) 0.09638494,
			(float) 0.09835598, (float) 0.10043652, (float) 0.10262608, (float) 0.10492408, (float) 0.10732999,
			(float) 0.10984316, (float) 0.11246302, (float) 0.11518890, (float) 0.11802010, (float) 0.12095598,
			(float) 0.12399574, (float) 0.12713866, (float) 0.13038395, (float) 0.13373083, (float) 0.13717847,
			(float) 0.14072597, (float) 0.14437246, (float) 0.14811710, (float) 0.15195890, (float) 0.15589692,
			(float) 0.15993017, (float) 0.16405767, (float) 0.16827843, (float) 0.17259133, (float) 0.17699537,
			(float) 0.18148938, (float) 0.18607232, (float) 0.19074300, (float) 0.19550033, (float) 0.20034306,
			(float) 0.20527001, (float) 0.21027996, (float) 0.21537170, (float) 0.22054392, (float) 0.22579536,
			(float) 0.23112471, (float) 0.23653066, (float) 0.24201185, (float) 0.24756692, (float) 0.25319457,
			(float) 0.25889328, (float) 0.26466170, (float) 0.27049842, (float) 0.27640197, (float) 0.28237087,
			(float) 0.28840363, (float) 0.29449883, (float) 0.30065489, (float) 0.30687031, (float) 0.31314352,
			(float) 0.31947297, (float) 0.32585713, (float) 0.33229437, (float) 0.33878314, (float) 0.34532180,
			(float) 0.35190874, (float) 0.35854232, (float) 0.36522087, (float) 0.37194279, (float) 0.37870640,
			(float) 0.38550997, (float) 0.39235184, (float) 0.39923036, (float) 0.40614375, (float) 0.41309035,
			(float) 0.42006844, (float) 0.42707625, (float) 0.43411207, (float) 0.44117412, (float) 0.44826069,
			(float) 0.45537004, (float) 0.46250033, (float) 0.46964988, (float) 0.47681686, (float) 0.48399949,
			(float) 0.49119604, (float) 0.49840465, (float) 0.50562358, (float) 0.51285106, (float) 0.52008528,
			(float) 0.52732444, (float) 0.53456670, (float) 0.54181033, (float) 0.54905349, (float) 0.55629444,
			(float) 0.56353134, (float) 0.57076240, (float) 0.57798582, (float) 0.58519983, (float) 0.59240264,
			(float) 0.59959245, (float) 0.60676748, (float) 0.61392599, (float) 0.62106609, (float) 0.62818617,
			(float) 0.63528436, (float) 0.64235890, (float) 0.64940804, (float) 0.65643007, (float) 0.66342324,
			(float) 0.67038584, (float) 0.67731601, (float) 0.68421221, (float) 0.69107264, (float) 0.69789559,
			(float) 0.70467937, (float) 0.71142232, (float) 0.71812278, (float) 0.72477907, (float) 0.73138952,
			(float) 0.73795253, (float) 0.74446648, (float) 0.75092971, (float) 0.75734061, (float) 0.76369762,
			(float) 0.76999915, (float) 0.77624369, (float) 0.78242958, (float) 0.78855544, (float) 0.79461962,
			(float) 0.80062068, (float) 0.80655706, (float) 0.81242740, (float) 0.81823015, (float) 0.82396388,
			(float) 0.82962728, (float) 0.83521879, (float) 0.84073710, (float) 0.84618086, (float) 0.85154873,
			(float) 0.85683930, (float) 0.86205131, (float) 0.86718345, (float) 0.87223446, (float) 0.87720311,
			(float) 0.88208807, (float) 0.88688827, (float) 0.89160240, (float) 0.89622939, (float) 0.90076804,
			(float) 0.90521723, (float) 0.90957582, (float) 0.91384280, (float) 0.91801709, (float) 0.92209762,
			(float) 0.92608339, (float) 0.92997342, (float) 0.93376678, (float) 0.93746245, (float) 0.94105959,
			(float) 0.94455731, (float) 0.94795465, (float) 0.95125085, (float) 0.95444512, (float) 0.95753652,
			(float) 0.96052444, (float) 0.96340811, (float) 0.96618676, (float) 0.96885973, (float) 0.97142631,
			(float) 0.97388595, (float) 0.97623801, (float) 0.97848189, (float) 0.98061699, (float) 0.98264289,
			(float) 0.98455900, (float) 0.98636484, (float) 0.98806006, (float) 0.98964417, (float) 0.99111670,
			(float) 0.99247742, (float) 0.99372596, (float) 0.99486196, (float) 0.99588519, (float) 0.99679530,
			(float) 0.99759221, (float) 0.99827564, (float) 0.99884540, (float) 0.99930143, (float) 0.99964350,
			(float) 0.99987161, (float) 0.99998569, (float) 1.00000000, (float) 0.99921930, (float) 0.99687845,
			(float) 0.99298108, (float) 0.98753333, (float) 0.98054361, (float) 0.97202289, (float) 0.96198452,
			(float) 0.95044410, (float) 0.93741965, (float) 0.92293155, (float) 0.90700239, (float) 0.88965708,
			(float) 0.87092263, (float) 0.85082841, (float) 0.82940567, (float) 0.80668795, (float) 0.78271067,
			(float) 0.75751126, (float) 0.73112911, (float) 0.70360541, (float) 0.67498308, (float) 0.64530689,
			(float) 0.61462307, (float) 0.58297962, (float) 0.55042595, (float) 0.51701277, (float) 0.48279238,
			(float) 0.44781810, (float) 0.41214463, (float) 0.37582767, (float) 0.33892387, (float) 0.30149087,
			(float) 0.26358715, (float) 0.22527184, (float) 0.18660481, (float) 0.14764643, (float) 0.10845750,
			(float) 0.06909923, (float) 0.02963307 };

	public static final float lwindow[] = new float[] { (float) 0.99879038, (float) 0.99546894, (float) 0.98995779,
			(float) 0.98229335, (float) 0.97252620, (float) 0.96072035, (float) 0.94695264, (float) 0.93131180,
			(float) 0.91389754, (float) 0.89481964 };

	public static final float grid[] = new float[] { (float) 0.9997559, (float) 0.9986295, (float) 0.9945219,
			(float) 0.9876884, (float) 0.9781476, (float) 0.9659258, (float) 0.9510565, (float) 0.9335804,
			(float) 0.9135454, (float) 0.8910065, (float) 0.8660254, (float) 0.8386706, (float) 0.8090170,
			(float) 0.7771460, (float) 0.7431448, (float) 0.7071068, (float) 0.6691306, (float) 0.6293204,
			(float) 0.5877852, (float) 0.5446391, (float) 0.5000000, (float) 0.4539905, (float) 0.4067366,
			(float) 0.3583679, (float) 0.3090170, (float) 0.2588190, (float) 0.2079117, (float) 0.1564345,
			(float) 0.1045285, (float) 0.0523360, (float) 0.0000000, (float) -0.0523360, (float) -0.1045285,
			(float) -0.1564345, (float) -0.2079117, (float) -0.2588190, (float) -0.3090170, (float) -0.3583679,
			(float) -0.4067366, (float) -0.4539905, (float) -0.5000000, (float) -0.5446391, (float) -0.5877852,
			(float) -0.6293204, (float) -0.6691306, (float) -0.7071068, (float) -0.7431448, (float) -0.7771460,
			(float) -0.8090170, (float) -0.8386706, (float) -0.8660254, (float) -0.8910065, (float) -0.9135454,
			(float) -0.9335804, (float) -0.9510565, (float) -0.9659258, (float) -0.9781476, (float) -0.9876884,
			(float) -0.9945219, (float) -0.9986295, (float) -0.9997559 };

	public static final float lspcb1[][] = new float[][] {
			{ (float) 0.1814, (float) 0.2647, (float) 0.4580, (float) 1.1077, (float) 1.4813, (float) 1.7022,
					(float) 2.1953, (float) 2.3405, (float) 2.5867, (float) 2.6636 },

			{ (float) 0.2113, (float) 0.3223, (float) 0.4212, (float) 0.5946, (float) 0.7479, (float) 0.9615,
					(float) 1.9097, (float) 2.1750, (float) 2.4773, (float) 2.6737 },

			{ (float) 0.1915, (float) 0.2755, (float) 0.3770, (float) 0.5950, (float) 1.3505, (float) 1.6349,
					(float) 2.2348, (float) 2.3552, (float) 2.5768, (float) 2.6540 },

			{ (float) 0.2116, (float) 0.3067, (float) 0.4099, (float) 0.5748, (float) 0.8518, (float) 1.2569,
					(float) 2.0782, (float) 2.1920, (float) 2.3371, (float) 2.4842 },

			{ (float) 0.2129, (float) 0.2974, (float) 0.4039, (float) 1.0659, (float) 1.2735, (float) 1.4658,
					(float) 1.9061, (float) 2.0312, (float) 2.6074, (float) 2.6750 },

			{ (float) 0.2181, (float) 0.2893, (float) 0.4117, (float) 0.5519, (float) 0.8295, (float) 1.5825,
					(float) 2.1575, (float) 2.3179, (float) 2.5458, (float) 2.6417 },

			{ (float) 0.1991, (float) 0.2971, (float) 0.4104, (float) 0.7725, (float) 1.3073, (float) 1.4665,
					(float) 1.6208, (float) 1.6973, (float) 2.3732, (float) 2.5743 },

			{ (float) 0.1818, (float) 0.2886, (float) 0.4018, (float) 0.7630, (float) 1.1264, (float) 1.2699,
					(float) 1.6899, (float) 1.8650, (float) 2.1633, (float) 2.6186 },

			{ (float) 0.2282, (float) 0.3093, (float) 0.4243, (float) 0.5329, (float) 1.1173, (float) 1.7717,
					(float) 1.9420, (float) 2.0780, (float) 2.5160, (float) 2.6137 },

			{ (float) 0.2528, (float) 0.3693, (float) 0.5290, (float) 0.7146, (float) 0.9528, (float) 1.1269,
					(float) 1.2936, (float) 1.9589, (float) 2.4548, (float) 2.6653 },

			{ (float) 0.2332, (float) 0.3263, (float) 0.4174, (float) 0.5202, (float) 1.3633, (float) 1.8447,
					(float) 2.0236, (float) 2.1474, (float) 2.3572, (float) 2.4738 },

			{ (float) 0.1393, (float) 0.2216, (float) 0.3204, (float) 0.5644, (float) 0.7929, (float) 1.1705,
					(float) 1.7051, (float) 2.0054, (float) 2.3623, (float) 2.5985 },

			{ (float) 0.2677, (float) 0.3871, (float) 0.5746, (float) 0.7091, (float) 1.3311, (float) 1.5260,
					(float) 1.7288, (float) 1.9122, (float) 2.5787, (float) 2.6598 },

			{ (float) 0.1570, (float) 0.2328, (float) 0.3111, (float) 0.4216, (float) 1.1688, (float) 1.4605,
					(float) 1.9505, (float) 2.1173, (float) 2.4038, (float) 2.7460 },

			{ (float) 0.2346, (float) 0.3321, (float) 0.5621, (float) 0.8160, (float) 1.4042, (float) 1.5860,
					(float) 1.7518, (float) 1.8631, (float) 2.0749, (float) 2.5380 },

			{ (float) 0.2505, (float) 0.3368, (float) 0.4758, (float) 0.6405, (float) 0.8104, (float) 1.2533,
					(float) 1.9329, (float) 2.0526, (float) 2.2155, (float) 2.6459 },

			{ (float) 0.2196, (float) 0.3049, (float) 0.6857, (float) 1.3976, (float) 1.6100, (float) 1.7958,
					(float) 2.0813, (float) 2.2211, (float) 2.4789, (float) 2.5857 },

			{ (float) 0.1232, (float) 0.2011, (float) 0.3527, (float) 0.6969, (float) 1.1647, (float) 1.5081,
					(float) 1.8593, (float) 2.2576, (float) 2.5594, (float) 2.6896 },

			{ (float) 0.3682, (float) 0.4632, (float) 0.6600, (float) 0.9118, (float) 1.5245, (float) 1.7071,
					(float) 1.8712, (float) 1.9939, (float) 2.4356, (float) 2.5380 },

			{ (float) 0.2690, (float) 0.3711, (float) 0.4635, (float) 0.6644, (float) 1.4633, (float) 1.6495,
					(float) 1.8227, (float) 1.9983, (float) 2.1797, (float) 2.2954 },

			{ (float) 0.3555, (float) 0.5240, (float) 0.9751, (float) 1.1685, (float) 1.4114, (float) 1.6168,
					(float) 1.7769, (float) 2.0178, (float) 2.4420, (float) 2.5724 },

			{ (float) 0.3493, (float) 0.4404, (float) 0.7231, (float) 0.8587, (float) 1.1272, (float) 1.4715,
					(float) 1.6760, (float) 2.2042, (float) 2.4735, (float) 2.5604 },

			{ (float) 0.3747, (float) 0.5263, (float) 0.7284, (float) 0.8994, (float) 1.4017, (float) 1.5502,
					(float) 1.7468, (float) 1.9816, (float) 2.2380, (float) 2.3404 },

			{ (float) 0.2972, (float) 0.4470, (float) 0.5941, (float) 0.7078, (float) 1.2675, (float) 1.4310,
					(float) 1.5930, (float) 1.9126, (float) 2.3026, (float) 2.4208 },

			{ (float) 0.2467, (float) 0.3180, (float) 0.4712, (float) 1.1281, (float) 1.6206, (float) 1.7876,
					(float) 1.9544, (float) 2.0873, (float) 2.3521, (float) 2.4721 },

			{ (float) 0.2292, (float) 0.3430, (float) 0.4383, (float) 0.5747, (float) 1.3497, (float) 1.5187,
					(float) 1.9070, (float) 2.0958, (float) 2.2902, (float) 2.4301 },

			{ (float) 0.2573, (float) 0.3508, (float) 0.4484, (float) 0.7079, (float) 1.6577, (float) 1.7929,
					(float) 1.9456, (float) 2.0847, (float) 2.3060, (float) 2.4208 },

			{ (float) 0.1968, (float) 0.2789, (float) 0.3594, (float) 0.4361, (float) 1.0034, (float) 1.7040,
					(float) 1.9439, (float) 2.1044, (float) 2.2696, (float) 2.4558 },

			{ (float) 0.2955, (float) 0.3853, (float) 0.7986, (float) 1.2470, (float) 1.4723, (float) 1.6522,
					(float) 1.8684, (float) 2.0084, (float) 2.2849, (float) 2.4268 },

			{ (float) 0.2036, (float) 0.3189, (float) 0.4314, (float) 0.6393, (float) 1.2834, (float) 1.4278,
					(float) 1.5796, (float) 2.0506, (float) 2.2044, (float) 2.3656 },

			{ (float) 0.2916, (float) 0.3684, (float) 0.5907, (float) 1.1394, (float) 1.3933, (float) 1.5540,
					(float) 1.8341, (float) 1.9835, (float) 2.1301, (float) 2.2800 },

			{ (float) 0.2289, (float) 0.3402, (float) 0.5166, (float) 0.7716, (float) 1.0614, (float) 1.2389,
					(float) 1.4386, (float) 2.0769, (float) 2.2715, (float) 2.4366 },

			{ (float) 0.0829, (float) 0.1723, (float) 0.5682, (float) 0.9773, (float) 1.3973, (float) 1.6174,
					(float) 1.9242, (float) 2.2128, (float) 2.4855, (float) 2.6327 },

			{ (float) 0.2244, (float) 0.3169, (float) 0.4368, (float) 0.5625, (float) 0.6897, (float) 1.3763,
					(float) 1.7524, (float) 1.9393, (float) 2.5121, (float) 2.6556 },

			{ (float) 0.1591, (float) 0.2387, (float) 0.2924, (float) 0.4056, (float) 1.4677, (float) 1.6802,
					(float) 1.9389, (float) 2.2067, (float) 2.4635, (float) 2.5919 },

			{ (float) 0.1756, (float) 0.2566, (float) 0.3251, (float) 0.4227, (float) 1.0167, (float) 1.2649,
					(float) 1.6801, (float) 2.1055, (float) 2.4088, (float) 2.7276 },

			{ (float) 0.1050, (float) 0.2325, (float) 0.7445, (float) 0.9491, (float) 1.1982, (float) 1.4658,
					(float) 1.8093, (float) 2.0397, (float) 2.4155, (float) 2.5797 },

			{ (float) 0.2043, (float) 0.3324, (float) 0.4522, (float) 0.7477, (float) 0.9361, (float) 1.1533,
					(float) 1.6703, (float) 1.7631, (float) 2.5071, (float) 2.6528 },

			{ (float) 0.1522, (float) 0.2258, (float) 0.3543, (float) 0.5504, (float) 0.8815, (float) 1.5516,
					(float) 1.8110, (float) 1.9915, (float) 2.3603, (float) 2.7735 },

			{ (float) 0.1862, (float) 0.2759, (float) 0.4715, (float) 0.6908, (float) 0.8963, (float) 1.4341,
					(float) 1.6322, (float) 1.7630, (float) 2.2027, (float) 2.6043 },

			{ (float) 0.1460, (float) 0.2254, (float) 0.3790, (float) 0.8622, (float) 1.3394, (float) 1.5754,
					(float) 1.8084, (float) 2.0798, (float) 2.4319, (float) 2.7632 },

			{ (float) 0.2621, (float) 0.3792, (float) 0.5463, (float) 0.7948, (float) 1.0043, (float) 1.1921,
					(float) 1.3409, (float) 1.4845, (float) 2.3159, (float) 2.6002 },

			{ (float) 0.1935, (float) 0.2937, (float) 0.3656, (float) 0.4927, (float) 1.4015, (float) 1.6086,
					(float) 1.7724, (float) 1.8837, (float) 2.4374, (float) 2.5971 },

			{ (float) 0.2171, (float) 0.3282, (float) 0.4412, (float) 0.5713, (float) 1.1554, (float) 1.3506,
					(float) 1.5227, (float) 1.9923, (float) 2.4100, (float) 2.5391 },

			{ (float) 0.2274, (float) 0.3157, (float) 0.4263, (float) 0.8202, (float) 1.4293, (float) 1.5884,
					(float) 1.7535, (float) 1.9688, (float) 2.3939, (float) 2.4934 },

			{ (float) 0.1704, (float) 0.2633, (float) 0.3259, (float) 0.4134, (float) 1.2948, (float) 1.4802,
					(float) 1.6619, (float) 2.0393, (float) 2.3165, (float) 2.6083 },

			{ (float) 0.1763, (float) 0.2585, (float) 0.4012, (float) 0.7609, (float) 1.1503, (float) 1.5847,
					(float) 1.8309, (float) 1.9352, (float) 2.0982, (float) 2.6681 },

			{ (float) 0.2447, (float) 0.3535, (float) 0.4618, (float) 0.5979, (float) 0.7530, (float) 0.8908,
					(float) 1.5393, (float) 2.0075, (float) 2.3557, (float) 2.6203 },

			{ (float) 0.1826, (float) 0.3496, (float) 0.7764, (float) 0.9888, (float) 1.3915, (float) 1.7421,
					(float) 1.9412, (float) 2.1620, (float) 2.4999, (float) 2.6931 },

			{ (float) 0.3033, (float) 0.3802, (float) 0.6981, (float) 0.8664, (float) 1.0254, (float) 1.5401,
					(float) 1.7180, (float) 1.8124, (float) 2.5068, (float) 2.6119 },

			{ (float) 0.2960, (float) 0.4001, (float) 0.6465, (float) 0.7672, (float) 1.3782, (float) 1.5751,
					(float) 1.9559, (float) 2.1373, (float) 2.3601, (float) 2.4760 },

			{ (float) 0.3132, (float) 0.4613, (float) 0.6544, (float) 0.8532, (float) 1.0721, (float) 1.2730,
					(float) 1.7566, (float) 1.9217, (float) 2.1693, (float) 2.6531 },

			{ (float) 0.3329, (float) 0.4131, (float) 0.8073, (float) 1.1297, (float) 1.2869, (float) 1.4937,
					(float) 1.7885, (float) 1.9150, (float) 2.4505, (float) 2.5760 },

			{ (float) 0.2340, (float) 0.3605, (float) 0.7659, (float) 0.9874, (float) 1.1854, (float) 1.3337,
					(float) 1.5128, (float) 2.0062, (float) 2.4427, (float) 2.5859 },

			{ (float) 0.4131, (float) 0.5330, (float) 0.6530, (float) 0.9360, (float) 1.3648, (float) 1.5388,
					(float) 1.6994, (float) 1.8707, (float) 2.4294, (float) 2.5335 },

			{ (float) 0.3754, (float) 0.5229, (float) 0.7265, (float) 0.9301, (float) 1.1724, (float) 1.3440,
					(float) 1.5118, (float) 1.7098, (float) 2.5218, (float) 2.6242 },

			{ (float) 0.2138, (float) 0.2998, (float) 0.6283, (float) 1.2166, (float) 1.4187, (float) 1.6084,
					(float) 1.7992, (float) 2.0106, (float) 2.5377, (float) 2.6558 },

			{ (float) 0.1761, (float) 0.2672, (float) 0.4065, (float) 0.8317, (float) 1.0900, (float) 1.4814,
					(float) 1.7672, (float) 1.8685, (float) 2.3969, (float) 2.5079 },

			{ (float) 0.2801, (float) 0.3535, (float) 0.4969, (float) 0.9809, (float) 1.4934, (float) 1.6378,
					(float) 1.8021, (float) 2.1200, (float) 2.3135, (float) 2.4034 },

			{ (float) 0.2365, (float) 0.3246, (float) 0.5618, (float) 0.8176, (float) 1.1073, (float) 1.5702,
					(float) 1.7331, (float) 1.8592, (float) 1.9589, (float) 2.3044 },

			{ (float) 0.2529, (float) 0.3251, (float) 0.5147, (float) 1.1530, (float) 1.3291, (float) 1.5005,
					(float) 1.7028, (float) 1.8200, (float) 2.3482, (float) 2.4831 },

			{ (float) 0.2125, (float) 0.3041, (float) 0.4259, (float) 0.9935, (float) 1.1788, (float) 1.3615,
					(float) 1.6121, (float) 1.7930, (float) 2.5509, (float) 2.6742 },

			{ (float) 0.2685, (float) 0.3518, (float) 0.5707, (float) 1.0410, (float) 1.2270, (float) 1.3927,
					(float) 1.7622, (float) 1.8876, (float) 2.0985, (float) 2.5144 },

			{ (float) 0.2373, (float) 0.3648, (float) 0.5099, (float) 0.7373, (float) 0.9129, (float) 1.0421,
					(float) 1.7312, (float) 1.8984, (float) 2.1512, (float) 2.6342 },

			{ (float) 0.2229, (float) 0.3876, (float) 0.8621, (float) 1.1986, (float) 1.5655, (float) 1.8861,
					(float) 2.2376, (float) 2.4239, (float) 2.6648, (float) 2.7359 },

			{ (float) 0.3009, (float) 0.3719, (float) 0.5887, (float) 0.7297, (float) 0.9395, (float) 1.8797,
					(float) 2.0423, (float) 2.1541, (float) 2.5132, (float) 2.6026 },

			{ (float) 0.3114, (float) 0.4142, (float) 0.6476, (float) 0.8448, (float) 1.2495, (float) 1.7192,
					(float) 2.2148, (float) 2.3432, (float) 2.5246, (float) 2.6046 },

			{ (float) 0.3666, (float) 0.4638, (float) 0.6496, (float) 0.7858, (float) 0.9667, (float) 1.4213,
					(float) 1.9300, (float) 2.0564, (float) 2.2119, (float) 2.3170 },

			{ (float) 0.4218, (float) 0.5075, (float) 0.8348, (float) 1.0009, (float) 1.2057, (float) 1.5032,
					(float) 1.9416, (float) 2.0540, (float) 2.4352, (float) 2.5504 },

			{ (float) 0.3726, (float) 0.4602, (float) 0.5971, (float) 0.7093, (float) 0.8517, (float) 1.2361,
					(float) 1.8052, (float) 1.9520, (float) 2.4137, (float) 2.5518 },

			{ (float) 0.4482, (float) 0.5318, (float) 0.7114, (float) 0.8542, (float) 1.0328, (float) 1.4751,
					(float) 1.7278, (float) 1.8237, (float) 2.3496, (float) 2.4931 },

			{ (float) 0.3316, (float) 0.4498, (float) 0.6404, (float) 0.8162, (float) 1.0332, (float) 1.2209,
					(float) 1.5130, (float) 1.7250, (float) 1.9715, (float) 2.4141 },

			{ (float) 0.2375, (float) 0.3221, (float) 0.5042, (float) 0.9760, (float) 1.7503, (float) 1.9014,
					(float) 2.0822, (float) 2.2225, (float) 2.4689, (float) 2.5632 },

			{ (float) 0.2813, (float) 0.3575, (float) 0.5032, (float) 0.5889, (float) 0.6885, (float) 1.6040,
					(float) 1.9318, (float) 2.0677, (float) 2.4546, (float) 2.5701 },

			{ (float) 0.2198, (float) 0.3072, (float) 0.4090, (float) 0.6371, (float) 1.6365, (float) 1.9468,
					(float) 2.1507, (float) 2.2633, (float) 2.5063, (float) 2.5943 },

			{ (float) 0.1754, (float) 0.2716, (float) 0.3361, (float) 0.5550, (float) 1.1789, (float) 1.3728,
					(float) 1.8527, (float) 1.9919, (float) 2.1349, (float) 2.3359 },

			{ (float) 0.2832, (float) 0.3540, (float) 0.6080, (float) 0.8467, (float) 1.0259, (float) 1.6467,
					(float) 1.8987, (float) 1.9875, (float) 2.4744, (float) 2.5527 },

			{ (float) 0.2670, (float) 0.3564, (float) 0.5628, (float) 0.7172, (float) 0.9021, (float) 1.5328,
					(float) 1.7131, (float) 2.0501, (float) 2.5633, (float) 2.6574 },

			{ (float) 0.2729, (float) 0.3569, (float) 0.6252, (float) 0.7641, (float) 0.9887, (float) 1.6589,
					(float) 1.8726, (float) 1.9947, (float) 2.1884, (float) 2.4609 },

			{ (float) 0.2155, (float) 0.3221, (float) 0.4580, (float) 0.6995, (float) 0.9623, (float) 1.2339,
					(float) 1.6642, (float) 1.8823, (float) 2.0518, (float) 2.2674 },

			{ (float) 0.4224, (float) 0.7009, (float) 1.1714, (float) 1.4334, (float) 1.7595, (float) 1.9629,
					(float) 2.2185, (float) 2.3304, (float) 2.5446, (float) 2.6369 },

			{ (float) 0.4560, (float) 0.5403, (float) 0.7568, (float) 0.8989, (float) 1.1292, (float) 1.7687,
					(float) 1.9575, (float) 2.0784, (float) 2.4260, (float) 2.5484 },

			{ (float) 0.4299, (float) 0.5833, (float) 0.8408, (float) 1.0596, (float) 1.5524, (float) 1.7484,
					(float) 1.9471, (float) 2.2034, (float) 2.4617, (float) 2.5812 },

			{ (float) 0.2614, (float) 0.3624, (float) 0.8381, (float) 0.9829, (float) 1.2220, (float) 1.6064,
					(float) 1.8083, (float) 1.9362, (float) 2.1397, (float) 2.2773 },

			{ (float) 0.5064, (float) 0.7481, (float) 1.1021, (float) 1.3271, (float) 1.5486, (float) 1.7096,
					(float) 1.9503, (float) 2.1006, (float) 2.3911, (float) 2.5141 },

			{ (float) 0.5375, (float) 0.6552, (float) 0.8099, (float) 1.0219, (float) 1.2407, (float) 1.4160,
					(float) 1.8266, (float) 1.9936, (float) 2.1951, (float) 2.2911 },

			{ (float) 0.4994, (float) 0.6575, (float) 0.8365, (float) 1.0706, (float) 1.4116, (float) 1.6224,
					(float) 1.9200, (float) 2.0667, (float) 2.3262, (float) 2.4539 },

			{ (float) 0.3353, (float) 0.4426, (float) 0.6469, (float) 0.9161, (float) 1.2528, (float) 1.3956,
					(float) 1.6080, (float) 1.8909, (float) 2.0600, (float) 2.1380 },

			{ (float) 0.2745, (float) 0.4341, (float) 1.0424, (float) 1.2928, (float) 1.5461, (float) 1.7940,
					(float) 2.0161, (float) 2.1758, (float) 2.4742, (float) 2.5937 },

			{ (float) 0.1562, (float) 0.2393, (float) 0.4786, (float) 0.9513, (float) 1.2395, (float) 1.8010,
					(float) 2.0320, (float) 2.2143, (float) 2.5243, (float) 2.6204 },

			{ (float) 0.2979, (float) 0.4242, (float) 0.8224, (float) 1.0564, (float) 1.4881, (float) 1.7808,
					(float) 2.0898, (float) 2.1882, (float) 2.3328, (float) 2.4389 },

			{ (float) 0.2294, (float) 0.3070, (float) 0.5490, (float) 0.9244, (float) 1.2229, (float) 1.8248,
					(float) 1.9704, (float) 2.0627, (float) 2.2458, (float) 2.3653 },

			{ (float) 0.3423, (float) 0.4502, (float) 0.9144, (float) 1.2313, (float) 1.3694, (float) 1.5517,
					(float) 1.9907, (float) 2.1326, (float) 2.4509, (float) 2.5789 },

			{ (float) 0.2470, (float) 0.3275, (float) 0.4729, (float) 1.0093, (float) 1.2519, (float) 1.4216,
					(float) 1.8540, (float) 2.0877, (float) 2.3151, (float) 2.4156 },

			{ (float) 0.3447, (float) 0.4401, (float) 0.7099, (float) 1.0493, (float) 1.2312, (float) 1.4001,
					(float) 2.0225, (float) 2.1317, (float) 2.2894, (float) 2.4263 },

			{ (float) 0.3481, (float) 0.4494, (float) 0.6446, (float) 0.9336, (float) 1.1198, (float) 1.2620,
					(float) 1.8264, (float) 1.9712, (float) 2.1435, (float) 2.2552 },

			{ (float) 0.1646, (float) 0.3229, (float) 0.7112, (float) 1.0725, (float) 1.2964, (float) 1.5663,
					(float) 1.9843, (float) 2.2363, (float) 2.5798, (float) 2.7572 },

			{ (float) 0.2614, (float) 0.3707, (float) 0.5241, (float) 0.7425, (float) 0.9269, (float) 1.2976,
					(float) 2.0945, (float) 2.2014, (float) 2.6204, (float) 2.6959 },

			{ (float) 0.1963, (float) 0.2900, (float) 0.4131, (float) 0.8397, (float) 1.2171, (float) 1.3705,
					(float) 2.0665, (float) 2.1546, (float) 2.4640, (float) 2.5782 },

			{ (float) 0.3387, (float) 0.4415, (float) 0.6121, (float) 0.8005, (float) 0.9507, (float) 1.0937,
					(float) 2.0836, (float) 2.2342, (float) 2.3849, (float) 2.5076 },

			{ (float) 0.2362, (float) 0.5876, (float) 0.7574, (float) 0.8804, (float) 1.0961, (float) 1.4240,
					(float) 1.9519, (float) 2.1742, (float) 2.4935, (float) 2.6493 },

			{ (float) 0.2793, (float) 0.4282, (float) 0.6149, (float) 0.8352, (float) 1.0106, (float) 1.1766,
					(float) 1.8392, (float) 2.0119, (float) 2.6433, (float) 2.7117 },

			{ (float) 0.3603, (float) 0.4604, (float) 0.5955, (float) 0.9251, (float) 1.1006, (float) 1.2572,
					(float) 1.7688, (float) 1.8607, (float) 2.4687, (float) 2.5623 },

			{ (float) 0.3975, (float) 0.5849, (float) 0.8059, (float) 0.9182, (float) 1.0552, (float) 1.1850,
					(float) 1.6356, (float) 1.9627, (float) 2.3318, (float) 2.4719 },

			{ (float) 0.2231, (float) 0.3192, (float) 0.4256, (float) 0.7373, (float) 1.4831, (float) 1.6874,
					(float) 1.9765, (float) 2.1097, (float) 2.6152, (float) 2.6906 },

			{ (float) 0.1221, (float) 0.2081, (float) 0.3665, (float) 0.7734, (float) 1.0341, (float) 1.2818,
					(float) 1.8162, (float) 2.0727, (float) 2.4446, (float) 2.7377 },

			{ (float) 0.2010, (float) 0.2791, (float) 0.3796, (float) 0.8845, (float) 1.4030, (float) 1.5615,
					(float) 2.0538, (float) 2.1567, (float) 2.3171, (float) 2.4686 },

			{ (float) 0.2086, (float) 0.3053, (float) 0.4047, (float) 0.8224, (float) 1.0656, (float) 1.2115,
					(float) 1.9641, (float) 2.0871, (float) 2.2430, (float) 2.4313 },

			{ (float) 0.3203, (float) 0.4285, (float) 0.5467, (float) 0.6891, (float) 1.2039, (float) 1.3569,
					(float) 1.8578, (float) 2.2055, (float) 2.3906, (float) 2.4881 },

			{ (float) 0.3074, (float) 0.4192, (float) 0.5772, (float) 0.7799, (float) 0.9866, (float) 1.1335,
					(float) 1.6068, (float) 2.2441, (float) 2.4194, (float) 2.5089 },

			{ (float) 0.2108, (float) 0.2910, (float) 0.4993, (float) 0.7695, (float) 0.9528, (float) 1.5681,
					(float) 1.7838, (float) 2.1495, (float) 2.3522, (float) 2.4636 },

			{ (float) 0.3492, (float) 0.4560, (float) 0.5906, (float) 0.7379, (float) 0.8855, (float) 1.0257,
					(float) 1.7128, (float) 1.9997, (float) 2.2019, (float) 2.3694 },

			{ (float) 0.5185, (float) 0.7316, (float) 0.9708, (float) 1.1954, (float) 1.5066, (float) 1.7887,
					(float) 2.1396, (float) 2.2918, (float) 2.5429, (float) 2.6489 },

			{ (float) 0.4276, (float) 0.4946, (float) 0.6934, (float) 0.8308, (float) 0.9944, (float) 1.4582,
					(float) 2.0324, (float) 2.1294, (float) 2.4891, (float) 2.6324 },

			{ (float) 0.3847, (float) 0.5973, (float) 0.7202, (float) 0.8787, (float) 1.3938, (float) 1.5959,
					(float) 1.8463, (float) 2.1574, (float) 2.5050, (float) 2.6687 },

			{ (float) 0.4835, (float) 0.5919, (float) 0.7235, (float) 0.8862, (float) 1.0756, (float) 1.2853,
					(float) 1.9118, (float) 2.0215, (float) 2.2213, (float) 2.4638 },

			{ (float) 0.5492, (float) 0.8062, (float) 0.9810, (float) 1.1293, (float) 1.3189, (float) 1.5415,
					(float) 1.9385, (float) 2.1378, (float) 2.4439, (float) 2.5691 },

			{ (float) 0.5190, (float) 0.6764, (float) 0.8123, (float) 1.0154, (float) 1.2085, (float) 1.4266,
					(float) 1.8433, (float) 2.0866, (float) 2.5113, (float) 2.6474 },

			{ (float) 0.4602, (float) 0.6503, (float) 0.9602, (float) 1.1427, (float) 1.3043, (float) 1.4427,
					(float) 1.6676, (float) 1.8758, (float) 2.2868, (float) 2.4271 },

			{ (float) 0.3764, (float) 0.4845, (float) 0.7627, (float) 0.9914, (float) 1.1961, (float) 1.3421,
					(float) 1.5129, (float) 1.6707, (float) 2.1836, (float) 2.3322 },

			{ (float) 0.3334, (float) 0.5701, (float) 0.8622, (float) 1.1232, (float) 1.3851, (float) 1.6767,
					(float) 2.0600, (float) 2.2946, (float) 2.5375, (float) 2.7295 },

			{ (float) 0.1449, (float) 0.2719, (float) 0.5783, (float) 0.8807, (float) 1.1746, (float) 1.5422,
					(float) 1.8804, (float) 2.1934, (float) 2.4734, (float) 2.8728 },

			{ (float) 0.2333, (float) 0.3024, (float) 0.4780, (float) 1.2327, (float) 1.4180, (float) 1.5815,
					(float) 1.9804, (float) 2.0921, (float) 2.3524, (float) 2.5304 },

			{ (float) 0.2154, (float) 0.3075, (float) 0.4746, (float) 0.8477, (float) 1.1170, (float) 1.5369,
					(float) 1.9847, (float) 2.0733, (float) 2.1880, (float) 2.2504 },

			{ (float) 0.1709, (float) 0.4486, (float) 0.8705, (float) 1.0643, (float) 1.3047, (float) 1.5269,
					(float) 1.9175, (float) 2.1621, (float) 2.4073, (float) 2.5718 },

			{ (float) 0.2835, (float) 0.3752, (float) 0.5234, (float) 0.9898, (float) 1.1484, (float) 1.2974,
					(float) 1.9363, (float) 2.0378, (float) 2.4065, (float) 2.6214 },

			{ (float) 0.3211, (float) 0.4077, (float) 0.5809, (float) 1.0206, (float) 1.2542, (float) 1.3835,
					(float) 1.5723, (float) 2.1209, (float) 2.3464, (float) 2.4336 },

			{ (float) 0.2101, (float) 0.3146, (float) 0.6779, (float) 0.8783, (float) 1.0561, (float) 1.3045,
					(float) 1.8395, (float) 2.0695, (float) 2.2831, (float) 2.4328 } };

	public static final float lspcb2[][] = new float[][] {
			{ (float) -0.0532, (float) -0.0995, (float) -0.0906, (float) 0.1261, (float) -0.0633, (float) 0.0711,
					(float) -0.1467, (float) 0.1012, (float) 0.0106, (float) 0.0470 },

			{ (float) -0.1017, (float) -0.1088, (float) 0.0566, (float) -0.0010, (float) -0.1528, (float) 0.1771,
					(float) 0.0089, (float) -0.0282, (float) 0.1055, (float) 0.0808 },

			{ (float) -0.1247, (float) 0.0283, (float) -0.0374, (float) 0.0393, (float) -0.0269, (float) -0.0200,
					(float) -0.0643, (float) -0.0921, (float) -0.1994, (float) 0.0327 },

			{ (float) 0.0070, (float) -0.0242, (float) -0.0415, (float) -0.0041, (float) -0.1793, (float) 0.0700,
					(float) 0.0972, (float) -0.0207, (float) -0.0771, (float) 0.0997 },

			{ (float) 0.0209, (float) -0.0428, (float) 0.0359, (float) 0.2027, (float) 0.0554, (float) 0.0634,
					(float) 0.0356, (float) 0.0195, (float) -0.0782, (float) -0.1583 },

			{ (float) -0.0856, (float) -0.1028, (float) -0.0071, (float) 0.1160, (float) 0.1089, (float) 0.1892,
					(float) 0.0874, (float) 0.0644, (float) -0.0872, (float) -0.0236 },

			{ (float) 0.0713, (float) 0.0039, (float) -0.0353, (float) 0.0435, (float) -0.0407, (float) -0.0558,
					(float) 0.0748, (float) -0.0346, (float) -0.1686, (float) -0.0905 },

			{ (float) -0.0134, (float) -0.0987, (float) 0.0283, (float) 0.0095, (float) -0.0107, (float) -0.0420,
					(float) 0.1638, (float) 0.1328, (float) -0.0799, (float) -0.0695 },

			{ (float) -0.1049, (float) 0.1510, (float) 0.0672, (float) 0.1043, (float) 0.0872, (float) -0.0663,
					(float) -0.2139, (float) -0.0239, (float) -0.0120, (float) -0.0338 },

			{ (float) -0.1071, (float) -0.1165, (float) -0.1524, (float) -0.0365, (float) 0.0260, (float) -0.0288,
					(float) -0.0889, (float) 0.1159, (float) 0.1852, (float) 0.1093 },

			{ (float) -0.0094, (float) 0.0420, (float) -0.0758, (float) 0.0932, (float) 0.0505, (float) 0.0614,
					(float) -0.0443, (float) -0.1172, (float) -0.0590, (float) 0.1693 },

			{ (float) -0.0384, (float) -0.0375, (float) -0.0313, (float) -0.1539, (float) -0.0524, (float) 0.0550,
					(float) -0.0569, (float) -0.0133, (float) 0.1233, (float) 0.2714 },

			{ (float) 0.0869, (float) 0.0847, (float) 0.0637, (float) 0.0794, (float) 0.1594, (float) -0.0035,
					(float) -0.0462, (float) 0.0909, (float) -0.1227, (float) 0.0294 },

			{ (float) -0.0137, (float) -0.0332, (float) -0.0611, (float) 0.1156, (float) 0.2116, (float) 0.0332,
					(float) -0.0019, (float) 0.1110, (float) -0.0317, (float) 0.2061 },

			{ (float) 0.0703, (float) -0.0013, (float) -0.0572, (float) -0.0243, (float) 0.1345, (float) -0.1235,
					(float) 0.0710, (float) -0.0065, (float) -0.0912, (float) 0.1072 },

			{ (float) 0.0178, (float) -0.0349, (float) -0.1563, (float) -0.0487, (float) 0.0044, (float) -0.0609,
					(float) -0.1682, (float) 0.0023, (float) -0.0542, (float) 0.1811 },

			{ (float) -0.1384, (float) -0.1020, (float) 0.1649, (float) 0.1568, (float) -0.0116, (float) 0.1240,
					(float) -0.0271, (float) 0.0541, (float) 0.0455, (float) -0.0433 },

			{ (float) -0.1782, (float) -0.1511, (float) 0.0509, (float) -0.0261, (float) 0.0570, (float) 0.0817,
					(float) 0.0805, (float) 0.2003, (float) 0.1138, (float) 0.0653 },

			{ (float) -0.0019, (float) 0.0081, (float) 0.0572, (float) 0.1245, (float) -0.0914, (float) 0.1691,
					(float) -0.0223, (float) -0.1108, (float) -0.0881, (float) -0.0320 },

			{ (float) -0.0413, (float) 0.0181, (float) 0.1764, (float) 0.0092, (float) -0.0928, (float) 0.0695,
					(float) 0.1523, (float) 0.0412, (float) 0.0508, (float) -0.0148 },

			{ (float) 0.0476, (float) 0.0292, (float) 0.1915, (float) 0.1198, (float) 0.0139, (float) 0.0451,
					(float) -0.1225, (float) -0.0619, (float) -0.0717, (float) -0.1104 },

			{ (float) -0.0382, (float) -0.0120, (float) 0.1159, (float) 0.0039, (float) 0.1348, (float) 0.0088,
					(float) -0.0173, (float) 0.1789, (float) 0.0078, (float) -0.0959 },

			{ (float) 0.1376, (float) 0.0713, (float) 0.1020, (float) 0.0339, (float) -0.1415, (float) 0.0254,
					(float) 0.0368, (float) -0.1077, (float) 0.0143, (float) -0.0494 },

			{ (float) 0.0658, (float) -0.0140, (float) 0.1046, (float) -0.0603, (float) 0.0273, (float) -0.1114,
					(float) 0.0761, (float) -0.0093, (float) 0.0338, (float) -0.0538 },

			{ (float) 0.2683, (float) 0.2853, (float) 0.1549, (float) 0.0819, (float) 0.0372, (float) -0.0327,
					(float) -0.0642, (float) 0.0172, (float) 0.1077, (float) -0.0170 },

			{ (float) -0.1949, (float) 0.0672, (float) 0.0978, (float) -0.0557, (float) -0.0069, (float) -0.0851,
					(float) 0.1057, (float) 0.1294, (float) 0.0505, (float) 0.0545 },

			{ (float) 0.1409, (float) 0.0724, (float) -0.0094, (float) 0.1511, (float) -0.0039, (float) 0.0710,
					(float) -0.1266, (float) -0.1093, (float) 0.0817, (float) 0.0363 },

			{ (float) 0.0485, (float) 0.0682, (float) 0.0248, (float) -0.0974, (float) -0.1122, (float) 0.0004,
					(float) 0.0845, (float) -0.0357, (float) 0.1282, (float) 0.0955 },

			{ (float) 0.0408, (float) 0.1801, (float) 0.0772, (float) -0.0098, (float) 0.0059, (float) -0.1296,
					(float) -0.0591, (float) 0.0443, (float) -0.0729, (float) -0.1041 },

			{ (float) -0.0666, (float) -0.0403, (float) -0.0524, (float) -0.0831, (float) 0.1384, (float) -0.1443,
					(float) -0.0909, (float) 0.1636, (float) 0.0320, (float) 0.0077 },

			{ (float) 0.1612, (float) 0.1010, (float) -0.0486, (float) -0.0704, (float) 0.0417, (float) -0.0945,
					(float) -0.0590, (float) -0.1523, (float) -0.0086, (float) 0.0120 },

			{ (float) -0.0199, (float) 0.0823, (float) -0.0014, (float) -0.1082, (float) 0.0649, (float) -0.1374,
					(float) -0.0324, (float) -0.0296, (float) 0.0885, (float) 0.1141 } };

	public static final float fg[][][] = new float[][][] {
			{
					{ (float) 0.2570, (float) 0.2780, (float) 0.2800, (float) 0.2736, (float) 0.2757, (float) 0.2764,
							(float) 0.2675, (float) 0.2678, (float) 0.2779, (float) 0.2647 },

					{ (float) 0.2142, (float) 0.2194, (float) 0.2331, (float) 0.2230, (float) 0.2272, (float) 0.2252,
							(float) 0.2148, (float) 0.2123, (float) 0.2115, (float) 0.2096 },

					{ (float) 0.1670, (float) 0.1523, (float) 0.1567, (float) 0.1580, (float) 0.1601, (float) 0.1569,
							(float) 0.1589, (float) 0.1555, (float) 0.1474, (float) 0.1571 },

					{ (float) 0.1238, (float) 0.0925, (float) 0.0798, (float) 0.0923, (float) 0.0890, (float) 0.0828,
							(float) 0.1010, (float) 0.0988, (float) 0.0872, (float) 0.1060 }, },

			{
					{ (float) 0.2360, (float) 0.2405, (float) 0.2499, (float) 0.2495, (float) 0.2517, (float) 0.2591,
							(float) 0.2636, (float) 0.2625, (float) 0.2551, (float) 0.2310 },

					{ (float) 0.1285, (float) 0.0925, (float) 0.0779, (float) 0.1060, (float) 0.1183, (float) 0.1176,
							(float) 0.1277, (float) 0.1268, (float) 0.1193, (float) 0.1211 },

					{ (float) 0.0981, (float) 0.0589, (float) 0.0401, (float) 0.0654, (float) 0.0761, (float) 0.0728,
							(float) 0.0841, (float) 0.0826, (float) 0.0776, (float) 0.0891 },

					{ (float) 0.0923, (float) 0.0486, (float) 0.0287, (float) 0.0498, (float) 0.0526, (float) 0.0482,
							(float) 0.0621, (float) 0.0636, (float) 0.0584, (float) 0.0794 }, },

	};

	public static final float fg_sum[][] = new float[][] {
			{ (float) 0.2380000054836, (float) 0.2578000128269, (float) 0.2504000067711, (float) 0.2531000375748,
					(float) 0.2480000108480, (float) 0.2587000429630, (float) 0.2577999532223, (float) 0.2656000256538,
					(float) 0.2760000228882, (float) 0.2625999450684 },

			{ (float) 0.4451000094414, (float) 0.5595000386238, (float) 0.6034000515938, (float) 0.5292999744415,
					(float) 0.5012999176979, (float) 0.5023000240326, (float) 0.4625000357628, (float) 0.4645000100136,
					(float) 0.4895999729633, (float) 0.4793999791145 } };

	public static final float fg_sum_inv[][] = new float[][] {
			{ (float) 4.2016806602478, (float) 3.8789758682251, (float) 3.9936101436615, (float) 3.9510068893433,
					(float) 4.0322580337524, (float) 3.8654806613922, (float) 3.8789765834808, (float) 3.7650599479675,
					(float) 3.6231880187988, (float) 3.8080739974976 },

			{ (float) 2.2466859817505, (float) 1.7873100042343, (float) 1.6572753190994, (float) 1.8892878293991,
					(float) 1.9948137998581, (float) 1.9908419847488, (float) 2.1621620655060, (float) 2.1528525352478,
					(float) 2.0424838066101, (float) 2.0859408378601 } };

	public static final float inter_3[] = new float[] { (float) 0.900839, (float) 0.760084, (float) 0.424082,
			(float) 0.084078, (float) -0.105570, (float) -0.121120, (float) -0.047624, (float) 0.016285,
			(float) 0.031217, (float) 0.015738, (float) 0.000000, (float) -0.005925, (float) 0.000000 };

	public static final float inter_3l[] = new float[] { (float) 0.898517, (float) 0.769271, (float) 0.448635,
			(float) 0.095915, (float) -0.134333, (float) -0.178528, (float) -0.084919, (float) 0.036952,
			(float) 0.095533, (float) 0.068936, (float) -0.000000, (float) -0.050404, (float) -0.050835,
			(float) -0.014169, (float) 0.023083, (float) 0.033543, (float) 0.016774, (float) -0.007466,
			(float) -0.019340, (float) -0.013755, (float) 0.000000, (float) 0.009400, (float) 0.009029,
			(float) 0.002381, (float) -0.003658, (float) -0.005027, (float) -0.002405, (float) 0.001050,
			(float) 0.002780, (float) 0.002145, (float) 0.000000 };

	public static final float pred[] = new float[] { (float) 0.68, (float) 0.58, (float) 0.34, (float) 0.19 };

	public static final float coef[][] = new float[][] { { (float) 31.134575, (float) 1.612322 },

	{ (float) 0.481389, (float) 0.053056 } };

	public static final float thr1[] = new float[] { (float) 0.659681, (float) 0.755274, (float) 1.207205,
			(float) 1.987740 };

	public static final float thr2[] = new float[] { (float) 0.429912, (float) 0.494045, (float) 0.618737,
			(float) 0.650676, (float) 0.717949, (float) 0.770050, (float) 0.850628, (float) 0.932089 };

	public static final float gbk1[][] = new float[][] { { (float) 0.000010, (float) 0.185084 },

	{ (float) 0.094719, (float) 0.296035 },

	{ (float) 0.111779, (float) 0.613122 },

	{ (float) 0.003516, (float) 0.659780 },

	{ (float) 0.117258, (float) 1.134277 },

	{ (float) 0.197901, (float) 1.214512 },

	{ (float) 0.021772, (float) 1.801288 },

	{ (float) 0.163457, (float) 3.315700 } };

	public static final float gbk2[][] = new float[][] { { (float) 0.050466, (float) 0.244769 },

	{ (float) 0.121711, (float) 0.000010 },

	{ (float) 0.313871, (float) 0.072357 },

	{ (float) 0.375977, (float) 0.292399 },

	{ (float) 0.493870, (float) 0.593410 },

	{ (float) 0.556641, (float) 0.064087 },

	{ (float) 0.645363, (float) 0.362118 },

	{ (float) 0.706138, (float) 0.146110 },

	{ (float) 0.809357, (float) 0.397579 },

	{ (float) 0.866379, (float) 0.199087 },

	{ (float) 0.923602, (float) 0.599938 },

	{ (float) 0.925376, (float) 1.742757 },

	{ (float) 0.942028, (float) 0.029027 },

	{ (float) 0.983459, (float) 0.414166 },

	{ (float) 1.055892, (float) 0.227186 },

	{ (float) 1.158039, (float) 0.724592 } };

	public static final float tab_hup_s[] = new float[] { (float) -0.005772, (float) 0.087669, (float) 0.965882,
			(float) -0.048753, (float) -0.014793, (float) 0.214886, (float) 0.868791, (float) -0.065537,
			(float) -0.028507, (float) 0.374334, (float) 0.723418, (float) -0.060834, (float) -0.045567,
			(float) 0.550847, (float) 0.550847, (float) -0.045567, (float) -0.060834, (float) 0.723418,
			(float) 0.374334, (float) -0.028507, (float) -0.065537, (float) 0.868791, (float) 0.214886,
			(float) -0.014793, (float) -0.048753, (float) 0.965882, (float) 0.087669, (float) -0.005772 };

	public static final float tab_hup_l[] = new float[] { (float) -0.001246, (float) 0.002200, (float) -0.004791,
			(float) 0.009621, (float) -0.017685, (float) 0.031212, (float) -0.057225, (float) 0.135470,
			(float) 0.973955, (float) -0.103495, (float) 0.048663, (float) -0.027090, (float) 0.015280,
			(float) -0.008160, (float) 0.003961, (float) -0.001827, (float) -0.002388, (float) 0.004479,
			(float) -0.009715, (float) 0.019261, (float) -0.035118, (float) 0.061945, (float) -0.115187,
			(float) 0.294161, (float) 0.898322, (float) -0.170283, (float) 0.083211, (float) -0.046645,
			(float) 0.026210, (float) -0.013854, (float) 0.006641, (float) -0.003099, (float) -0.003277,
			(float) 0.006456, (float) -0.013906, (float) 0.027229, (float) -0.049283, (float) 0.086990,
			(float) -0.164590, (float) 0.464041, (float) 0.780309, (float) -0.199879, (float) 0.100795,
			(float) -0.056792, (float) 0.031761, (float) -0.016606, (float) 0.007866, (float) -0.003740,
			(float) -0.003770, (float) 0.007714, (float) -0.016462, (float) 0.031849, (float) -0.057272,
			(float) 0.101294, (float) -0.195755, (float) 0.630993, (float) 0.630993, (float) -0.195755,
			(float) 0.101294, (float) -0.057272, (float) 0.031849, (float) -0.016462, (float) 0.007714,
			(float) -0.003770, (float) -0.003740, (float) 0.007866, (float) -0.016606, (float) 0.031761,
			(float) -0.056792, (float) 0.100795, (float) -0.199879, (float) 0.780309, (float) 0.464041,
			(float) -0.164590, (float) 0.086990, (float) -0.049283, (float) 0.027229, (float) -0.013906,
			(float) 0.006456, (float) -0.003277, (float) -0.003099, (float) 0.006641, (float) -0.013854,
			(float) 0.026210, (float) -0.046645, (float) 0.083211, (float) -0.170283, (float) 0.898322,
			(float) 0.294161, (float) -0.115187, (float) 0.061945, (float) -0.035118, (float) 0.019261,
			(float) -0.009715, (float) 0.004479, (float) -0.002388, (float) -0.001827, (float) 0.003961,
			(float) -0.008160, (float) 0.015280, (float) -0.027090, (float) 0.048663, (float) -0.103495,
			(float) 0.973955, (float) 0.135470, (float) -0.057225, (float) 0.031212, (float) -0.017685,
			(float) 0.009621, (float) -0.004791, (float) 0.002200, (float) -0.001246 };

	public static final int map1[] = new int[] { 5, 1, 4, 7, 3, 0, 6, 2 };

	public static final int map2[] = new int[] { 4, 6, 0, 2, 12, 14, 8, 10, 15, 11, 9, 13, 7, 3, 1, 5 };

	public static final int imap1[] = new int[] { 5, 1, 7, 4, 2, 0, 6, 3 };
	public static final int imap2[] = new int[] { 2, 14, 3, 13, 0, 15, 1, 12, 6, 10, 7, 9, 4, 11, 5, 8 };

	public static final int bitsno[] = new int[] { 1 + LD8KConstants.NC0_B, /*
																			 * MA + 1 st stage
																			 */
	LD8KConstants.NC1_B * 2, /* 2nd stage */
	8, 1, 13, 4, 7, /* first subframe */
	5, 13, 4, 7 }; /* second subframe */

	/* filter coefficients (fc = 140 Hz) */

	public static final float b140[] = new float[] { (float) 0.92727435E+00, (float) -0.18544941E+01,
			(float) 0.92727435E+00 };
	public static final float a140[] = new float[] { (float) 1.00000000E+00, (float) 0.19059465E+01,
			(float) -0.91140240E+00 };

	/* filter coefficients (fc = 100 Hz ) */

	public static final float b100[] = new float[] { (float) 0.93980581E+00, (float) -0.18795834E+01,
			(float) 0.93980581E+00 };
	public static final float a100[] = new float[] { (float) 1.00000000E+00, (float) 0.19330735E+01,
			(float) -0.93589199E+00 };

}
