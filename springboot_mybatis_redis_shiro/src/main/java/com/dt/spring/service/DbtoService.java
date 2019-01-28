package com.dt.spring.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dt.spring.mapper.AdrressMapMapper;
import com.dt.spring.mapper.AdrressMapper;
import com.dt.spring.mapper1.AdrressMap1Mapper;
import com.dt.spring.pojo.Adrress;
import com.dt.spring.pojo.AdrressExample;
import com.dt.spring.pojo.AdrressMap;
import com.dt.spring.pojo.AdrressMapExample;
import com.dt.spring.pojo1.AdrressMap1;

@Service
public class DbtoService {
	@Autowired
	private AdrressMap1Mapper adrressMap1Mapper;
	@Autowired
	private AdrressMapMapper adrressMapMapper;
	@Autowired
	private AdrressMapper adrressMapper;

	
	public void insertaddressMapById() {//15572,19725;
		String idstr = "15280, 15572, 15612, 15693, 15804,"
				+ "15944, 15945, 15946, 15947, 15948, 15949, 15950, 15951, 15952, 15953, 15954, 15955, 15956, 15957, 15958,"
				+ " 15959, 15960, 15961, 15962, 15963, 15964, 15965, 15966, 15967, 15968, 15969, 15970, 15971,"
				+ " 15972, 15973, 15974, 15975, 15976, 15977, 15978, 15979, 15980, 15981, 15982, 15983,"
				+ " 15984, 15985, 15986, 15987, 15988, 15989, 15990, 15991, 15992, 15993, 15994, 15995, 15996, 15997, 15998, "
				+ "15999, 16000, 16001, 16002, 16003, 16004, 16005, 16006, 16007, 16008, 16009, 16010, 16011, 16012, 16013, 16014, 16015, 16016, 16017, 16018, 16019, 16020, 16021, 16022, 16023, 16024, 16025, 16026, 16027, 16028, "
				+ "16029, 16030, 16031, 16032, 16033, 16034, 16035, 16036, 16037, 16038, 16039, 16040, 16041, 16042, "
				+ "16043, 16044, 16045, 16046, 16047, 16048, 16049, 16050, 16051, 16052, 16053, 16054,"
				+ " 16059, 16060, 16061, 16062, 16063, 16064, 16065, 16066, 16067, 16068, 16069, 16070, 16071, 16072, 16073, 16074, 16075,"
				+ " 16076, 16077, 16078, 16079, 16080, 16081, 16082, 16083, 16084, 16085, 16086, 16087, 16088, 16089, "
				+ "16090, 16091, 16092, 16093, 16094, 16095, 16096, 16097, 16098, 16099, 16100, 16101, 16102, 16103, 16104, 16105, 16106,"
				+ " 16107, 16108, 16109, 16110, 16111, 16112, 16113, 16114, 16115, 16116, 16117, 16118, 16119, 16120, 16121, 16122, 16123,"
				+ " 16124, 16125, 16126, 16127, 16128, 16129, 16130, 16131, 16132, 16133, 16134, 16135, 16136, 16137, 16138, 16139,"
				+ " 16140, 16141, 16142, "
				+ "16149, 16150, "
				+ "16156, 16157, 16158, 16159, 16160, 16161, 16162, 16163, 16164, 16165, 16166,"
				+ " 16167, 16168, 16169, 16170, 16171, 16172, 16173, 16174, 16175, 16176, 16177, 16178, 16179, 16180, 16181, 16182, 16183, 16184, 16185,"
				+ " 16186, 16187, 16188, 16189, 16190, 16191, 16192, 16193, 16194, 16195, 16196, 16197, 16198, 16199, 16200, 16201, 16202, 16203, 16204, 16205, 16206, 16207, 16208, 16209, 16210, 16211, 16212, 16213, 16214,"
				+ " 16215, 16216, 16217, 16218, 16219, 16220, 16221, 16222, "
				+ "16401, 16402, 16404, 16444, 16447, 16475, 16493, 16499, 16511, 16520, 16530, 16569, "
				+ "16624,"
				+ " 16708, 16712, 16864, 16868,16726,16856,16874,16875, 16727, 16733, 16734,16749,16756, 16761, 16772, 16773, 16777, 16778, 16781,16789,16792, 16793, 16801, 16804, 16812, 16824, 16825, 16845"
				+ "16735, 16736, 16740, 16746, 16747, 16754,  16763, 16769, 16784, 16788 , 16803,  16818, 16826,16833, 16851, 16852,  16858, 16865, 16866, 16872,  16877,  16885, 16886, 16887, 16891, "
				+ "16751, 16780, 16797,16814, 16816, 16838, 16848,16854, "
				+ " 16879,"
				+ "17005, 17015, 17064, 17084, 17099, 17124, 17152, 17168, 17336, 17342, 17350, 17353, 17372, 17385, "
				+ "17478, 17640, 18783, 19022, 19030, 19073, 19221, 19222, 19223, 19224, 19225, 19226, 19227, 19228, 19229, 19230, 19231, 19232, 19233, 19234, 19235, 19236, 19237, 19238, 19239, 19240,"
				+ " 19301, 19490, 19492, 19499, 19605, 19635, 19675, 19676, 19677, 19678, 19679, 19680, 19681, 19682, 19683, 19684, 19685, 19686, 19687, 19688, 19689, 19690, 19691, 19692, 19693, 19694, 19695, 19696, 19697, 19698, 19699, 19700, 19701, 19702, 19703, 19704, 19705, "
				+ "19721, 19722, 19723, 19725, 19855, 19890, 19909, 19920, 19948, 19971, 19972, 20097, 20098, 20100, 20326, 20336, 20340, 20343, 20346,"
				+ " 20352, 20369, 20387, 20410, 20425, 20440, 20554, 20555, 20556, 20561, 20562, 20563, 20564, 20565, 20566, 20567, 20568, 20569, 20570, 20571, 20572, 20573, 20574, 20575, 20576, 20667, 20673, 20850, 21071, 21089, 21090, 21091, 21092, 21142, 21329, 21336, 21349, 21352, 21373, 21415, 21440, 21553, 21574, 21575, 21636, 21835, 21909, 21928, 21939, 22150, 22403, 22404, 22405, 22406, 22407, 22408, 22409, 22410, 22411, 22412, 22413, 22414, 22415, 22416, 22417, 22418, 22419, 22420, 22421, 22422, 22423, 22424, 22425, 22426, 22427, 22428, 22429, 22430, 22431, 22432, 22433, 22434, 22435, 22436, 22437, 22438, 22439, 22440, 22441, 22442, 22443, 22444, 22445, 22446, 22447, 22448, 22449, 22450, 22451, 22452, 22453, 22454, 22455, 22456, 22457, 22458, 22459, 22460, 22461, 22462, 22463, 22464, 22465, 22466, 22467, 22468, 22469, 22470, 22471, 22472, 22473, 22474, 22475, 22476, 22477, 22478, 22479, 22480, 22481, 22482, 22483, 22484, 22485, 22486, 22487, 22488, 22489, 22490, 22491, 22492, 22493, 22494, 22495, 22496, 22497, 22498, 22499, 22500, 22501, 22502, 22503, 22504, 22505, 22506, 22507, 22508, 22509, 22510, 22511, 22512, 22513, 22514, 22515, 22516, 22517, 22518, 22519, 22520, 22521, 22522, 22523, 22524, 22525, 22526, 22527, 22528, 22529, 22530, 22531, 22532, 22533, 22534, 22535, 22536, 22537, 22538, 22539, 22540, 22541, 22542, 22543, 22544, 22545, 22546, 22547, 22548, 22549, 22550, 22551, 22552, 22553, 22554, 22555, 22556, 22557, 22558, 22559, 22560, 22561, 22562, 22563, 22564, 22565, 22566, 22567, 22568, 22569, 22570, 22571, 22572, 22573, 22574, 22575, 22576, 22577, 22578, 22579, 22580, 22581, 22582, 22583, 22584, 22585, 22586, 22587, 22588, 22589, 22590, 22591, 22592, 22593, 22594, 22595, 22596, 22597, 22598, 22599, 22600, 22601, 22602, 22603, 22604, 22605, 22606, 22607, 22608, 22609, 22610, 22611, 22612, 22613, 22614, 22615, 22616, 22617, 22618, 22619, 22620, 22621, 22622, 22623, 22624, 22625, 22626, 22627, 22628, 22629, 22630, 22631, 22632, 22633, 22634, 22635, 22636, 22637, 22638, 22639, 22640, 22641, 22642, 22643, 22644, 22645, 22646, 22647, 22648, 22649, 22650, 22651, 22652, 22653, 22654, 22655, 22656, 22657, 22658, 22659, 22660, 22661, 22662, 22663, 22664, 22665, 22666, 22667, 22668, 22669, 22670, 22671, 22672, 22673, 22674, 22675, 22676, 22677, 22678, 22679, 22680, 22681, 22682, 22683, 22684, 22685, 22686, 22687, 22688, 22689, 22690, 22691, 22692, 22693, 22694, 22695, 22696, 22697, 22698, 22699, 22700, 22701, 22702, 22703, 22704, 22705, 22706, 22707, 22708, 22709, 22710, 22711, 22712, 22713, 22714, 22715, 22716, 22717, 22718, 22719, 22720, 22721, 22722, 22723, 22724, 22725, 22726, 22727, 22728, 22729, 22730, 22731, 22732, 22733, 22734, 22735, 22736, 22737, 22738, 22739, 22740, 22741, 22742, 22743, 22744, 22745, 22746, 22747, 22748, 22749, 22750, 22751, 22752, 22753, 22754, 22755, 22756, 22757, 22758, 22759, 22760, 22761, 22762, 22763, 22764, 22765, 22766, 22767, 22768, 22769, 22770, 22771, 22772, 22773, 22774, 22865, 22866, 22867, 22868, 22869, 22870, 22871, 22872, 22873, 22874, 22875, 22876, 22877, 22878, 22879, 22880, 22881, 22882, 22943, 22944, 22946, 22980, 22981, 22982, 22983, 22984, 23290, 23293, 23543, 23583, 23596, 23601, 24392, 24755, 24937, 25060, 25242, 25537, 25735, 25736, 25737, 25738, 25739, 25740, 25741, 25742, 25743, 25790, 25795, 25797, 25798, 25852, 25853, 25854, 25855, 25856, 25857, 25858, 25859, 25860, 25861, 25862, 25863, 25864, 25865, 25866, 25867, 25868, 25869, 26010, 26011, 26012, 26013, 26014, 26015, 26016, 26017, 26018, 26166, 26167, 26175, 26176, 26177, 26178, 26179, 26206, 26252, 26253, 26254, 26255, 26256, 26257, 26258, 26259, 26267, 26269, 26270, 26273, 26275, 26276, 26278, 26279, 26280, 26282, 26283, 26286, 26287, 26289, 26290, 26291, 26297, 26298, 26299, 26300, 26302, 26303, 26304, 26305, 26306, 26307, 26308, 26309, 26310, 26311, 26312, 26387, 26388, 26389, 26390, 26391, 26392, 26393, 26394, 26395, 26397, 26398, 26399, 26400, 26404, 26405, 26406, 26407, 26408, 26410, 26411, 26412, 26413, 26414, 26415, 26416, 26417, 26418, 26419, 26420, 26421, 26422, 26423, 26424, 26425, 26426, 26427, 26428, 26429, 26430, 26431, 26432, 26446, 26447, 26448, 26449, 26450, 26451, 26452, 26453, 26454, 26485, 26486, 26488, 26489, 26491, 26493, 26497, 26498, 26499, 26500, 26502, 26503, 26505, 26507, 26508, 26510, 26513, 26514, 26515, 26522, 26531, 26567, 26573, 26728, 26767, 26780, 26783, 27553, 27906, 28081, 28204, 28376, 28670, 28854, 28856, 28857, 28860, 28862, 28863, 28865, 28866, 28867, 28869, 28870, 28873, 28874, 28875, 28876, 28877, 28883, 28885, 28886, 28887, 28888, 28889, 28890, 28891, 28892, 28893, 28894, 28895, 28970, 28971, 28972, 28973, 28974, 28975, 28976, 28977, 28978, 28980, 28981, 28982, 28983, 28984, 28985, 28986, 28987, 28988, 28989, 28990, 28991, 28992, 28993, 28994, 28995, 28996, 28997, 28998, 28999, 29000, 29001, 29002, 29003, 29004, 29005, 29006, 29007, 29008, 29009, 29010, 29027, 29028, 29030, 29031, 29037, 29038, 29040, 29043, 29044, 29048, 29078, 29081, 29082, 29083, 29088, 29089, 29090, 29092, 29093, 29094, 29095, 29096, 29103, 29104";
		String[] split = idstr.split(","); 
		ArrayList<Long> idList = new ArrayList<>();
		for (String id : split) {
			AdrressMap1 adrressMap1 = adrressMap1Mapper.selectByPrimaryKey(Long.parseLong(id.trim()));
			Integer conveterpartnerId = conveterpartnerId(adrressMap1.getAddressType());
			Long dangaddressId = null;
			if(id.equals("15280")) {
				dangaddressId = 13272l;
			}
			if(id.equals("15612")) {
				dangaddressId = 26136l;
			}
			if(id.equals("15693")) {
				dangaddressId = 27459l;
			}
//			28729
			if(id.equals("15804")) {
				dangaddressId = 28729l;
			}
			if(adrressMap1.getProvinceName().replace("省", "").replace("市", "").equals("海南")) {
				//15944,15945,15946,15947,15948,15949,15950,15951,15952,15953,15954,15955,15956,15957,15958
				if(adrressMap1.getCityName().replace("县", "").replace("市", "").equals("白沙")) {
					dangaddressId = 29183l;
				}
				//15959,15960,15961,15962,15963,15964,15965,15966,15967,15968,15969,15970,15971,
				if(adrressMap1.getCityName().replace("县", "").replace("市", "").equals("保亭")) {
					dangaddressId = 29186l;
				}
				//15972,15973,15974, 15975, 15976, 15977, 15978, 15979, 15980, 15981, 15982, 15983,
				if(adrressMap1.getCityName().replace("县", "").replace("市", "").equals("昌江")) {
					dangaddressId = 29182l;
				}
				// 15984, 15985, 15986, 15987, 15988, 15989, 15990, 15991, 15992, 15993, 15994, 15995, 15996, 15997, 15998, "
				if(adrressMap1.getCityName().replace("县", "").replace("市", "").equals("澄迈")) {
					dangaddressId = 29179l;
				}
				//"15999, 16000, 16001, 16002, 16003, 16004, 16005, 16006, 16007, 16008, 16009, 16010, 16011, 16012, 16013, 16014, 16015, 16016, 16017, 16018, 16019, 16020, 16021, 16022, 16023, 16024, 16025, 16026, 16027, 16028, "
				if(adrressMap1.getCityName().replace("县", "").replace("市", "").equals("儋州")) {
					dangaddressId = 29177l;
				}
				//"16029, 16030, 16031, 16032, 16033, 16034, 16035, 16036, 16037, 16038, 16039, 16040, 16041, 16042, "
				if(adrressMap1.getCityName().replace("县", "").replace("市", "").equals("定安")) {
					dangaddressId = 29180l;
				}
				//"16043, 16044, 16045, 16046, 16047, 16048, 16049, 16050, 16051, 16052, 16053, 16054,"
				if(adrressMap1.getCityName().replace("县", "").replace("市", "").equals("东方")) {
					dangaddressId = 29176l;
				}
				//16059, 16060, 16061, 16062, 16063, 16064, 16065, 16066, 16067, 16068, 16069, 16070, 16071, 16072, 16073, 16074, 16075,
				if(adrressMap1.getCityName().replace("县", "").replace("市", "").equals("乐东")) {
					dangaddressId = 29187l;
				}
//				16076, 16077, 16078, 16079, 16080, 16081, 16082, 16083, 16084, 16085, 16086, 16087, 16088, 16089, "
				if(adrressMap1.getCityName().replace("县", "").replace("市", "").equals("临高")) {
					dangaddressId = 29178l;
				}
//				"16090, 16091, 16092, 16093, 16094, 16095, 16096, 16097, 16098, 16099, 16100, 16101, 16102, 16103, 16104, 16105, 16106,"
				if(adrressMap1.getCityName().replace("县", "").replace("市", "").equals("陵水")) {
					dangaddressId = 29185l;
				}
//				" 16107, 16108, 16109, 16110, 16111, 16112, 16113, 16114, 16115, 16116, 16117, 16118, 16119, 16120, 16121, 16122, 16123,"
				if(adrressMap1.getCityName().replace("县", "").replace("市", "").equals("琼海")) {
					dangaddressId = 29173l;
				}
//				 " 16124, 16125, 16126, 16127, 16128, 16129, 16130, 16131, 16132, 16133, 16134, 16135, 16136, 16137, 16138, 16139,"
				if(adrressMap1.getCityName().replace("县", "").replace("市", "").equals("琼中")) {
					dangaddressId = 29184l;
				}
				//" 16140, 16141, 16142, "
				if(adrressMap1.getCityName().replace("县", "").replace("市", "").equals("三沙")) {
					if(adrressMap1.getAreaName().equals("中沙群岛的岛礁及其海域")) {
						dangaddressId = 29188l;
					}
					if(adrressMap1.getAreaName().equals("西沙群岛")) {
						dangaddressId = 29190l;
					}
					if(adrressMap1.getAreaName().equals("南沙群岛")) {
						dangaddressId = 29191l;
					}
				}
				if(adrressMap1.getCityName().replace("县", "").replace("市", "").equals("三亚")) {
				  if(adrressMap1.getAreaName().equals("南滨农场")) {//16149
					  dangaddressId = 29168l;
				  }
				  if(adrressMap1.getAreaName().equals("南岛农场")) {//16150
					  dangaddressId = 29169l;
				  }
				}
//				"16156, 16157, 16158, 16159, 16160, 16161, 16162, 16163, 16164, 16165, 16166,"
				if(adrressMap1.getCityName().replace("县", "").replace("市", "").equals("屯昌")) {
					dangaddressId = 29181l;
				}
				//" 16167, 16168, 16169, 16170, 16171, 16172, 16173, 16174, 16175, 16176, 16177, 16178, 16179, 16180, 16181, 16182, 16183, 16184, 16185,"
				if(adrressMap1.getCityName().replace("县", "").replace("市", "").equals("万宁")) {
					dangaddressId = 29174l;
				}
				// 16186, 16187, 16188, 16189, 16190, 16191, 16192, 16193, 16194, 16195, 16196, 16197, 16198, 16199, 16200, 16201, 16202, 16203, 16204, 16205, 16206, 16207, 16208, 16209, 16210, 16211, 16212, 16213, 16214,"
				if(adrressMap1.getCityName().replace("县", "").replace("市", "").equals("文昌")) {
					dangaddressId = 29172l;
				}
//				 16215, 16216, 16217, 16218, 16219, 16220, 16221, 16222, "
				if(adrressMap1.getCityName().replace("县", "").replace("市", "").equals("五指山")) {
					dangaddressId = 29175l;
				}
				if(adrressMap1.getCityName().equals("省直辖县")) {
					 if(adrressMap1.getAreaName().equals("白沙黎族自治县")) {//16149
						  dangaddressId = 29183l;
					  }
					 if(adrressMap1.getAreaName().equals("保亭黎族苗族自治县")) {//16149
						  dangaddressId = 29186l;
					  }
					 if(adrressMap1.getAreaName().equals("昌江黎族自治县")) {//16149
						  dangaddressId = 29182l;
					  }
					 if(adrressMap1.getAreaName().equals("澄迈县")) {//16149
						  dangaddressId = 29179l;
					  }
					 if(adrressMap1.getAreaName().equals("儋州市")) {//16149
						  dangaddressId = 29177l;
					  }
					 if(adrressMap1.getAreaName().equals("定安县")) {//16149
						  dangaddressId = 29180l;
					  }
					 if(adrressMap1.getAreaName().equals("东方市")) {//16149
						  dangaddressId = 29176l;
					  }
					 if(adrressMap1.getAreaName().equals("乐东黎族自治县")) {//16149
						  dangaddressId = 29187l;
					  }
					 if(adrressMap1.getAreaName().equals("临高县")) {//16149
						  dangaddressId = 29178l;
					  }
					 if(adrressMap1.getAreaName().equals("陵水黎族自治县")) {//16149
						  dangaddressId = 29185l;
					  }
					 if(adrressMap1.getAreaName().equals("琼海市")) {//16149
						  dangaddressId = 29173l;
					  }
					 if(adrressMap1.getAreaName().equals("琼中黎族苗族自治县")) {//16149
						  dangaddressId = 29184l;
					  }
					 if(adrressMap1.getAreaName().equals("屯昌县")) {//16149
						  dangaddressId = 29181l;
					  }
					 if(adrressMap1.getAreaName().equals("万宁市")) {//16149
						  dangaddressId = 29174l;
					  }
					 if(adrressMap1.getAreaName().equals("文昌市")) {//16149
						  dangaddressId = 29172l;
					  }
					 if(adrressMap1.getAreaName().equals("五指山市")) {//16149
						  dangaddressId = 29175l;
					  }
				}
			}
			if(adrressMap1.getProvinceName().replace("省", "").replace("市", "").equals("河南")) {
				//"16401, 16402, 16404, 16444, 16447, 16475, 16493, 16499, 16511, 16520, 16530, 16569, "
				if(adrressMap1.getCityName().replace("县", "").replace("市", "").equals("济源")) {
					dangaddressId = 22183l;
				}
				if(adrressMap1.getCityName().equals("省直辖县")) {
					if(adrressMap1.getAreaName().equals("济源市")) {
						dangaddressId = 22183l;
					}
					
				}
			}
			if(adrressMap1.getProvinceName().replace("省", "").replace("市", "").equals("河北")) {
				//"16401, 16402, 16404, 16444, 16447, 16475, 16493, 16499, 16511, 16520, 16530, 16569, "
				if(adrressMap1.getCityName().replace("县", "").replace("市", "").equals("廊坊")) {
					if("燕郊经济技术开发区".equals(adrressMap1.getAreaName())) {
						dangaddressId = 2498l;
					}
				}
				if(adrressMap1.getCityName().replace("县", "").replace("市", "").equals("秦皇岛")) {
					if("经济技术开发区".equals(adrressMap1.getAreaName())) {
						dangaddressId = 805l;
					}
				}
			}
			if(adrressMap1.getProvinceName().replace("省", "").replace("市", "").equals("辽宁")) {
				//"16401, 16402, 16404, 16444, 16447, 16475, 16493, 16499, 16511, 16520, 16530, 16569, "
				if(adrressMap1.getCityName().replace("县", "").replace("市", "").equals("沈阳")) {
					if("浑南新区".equals(adrressMap1.getAreaName())) {
						dangaddressId = 5817l;
					}
				}
				if(adrressMap1.getCityName().replace("县", "").replace("市", "").equals("鞍山")) {
					if("高新区".equals(adrressMap1.getAreaName())) {
						dangaddressId = 13323l;
					}
				}
				if(adrressMap1.getCityName().replace("县", "").replace("市", "").equals("大连")) {
					if("大连高新区".equals(adrressMap1.getAreaName())) {
						dangaddressId = 5931l;
					}
				}
				if(adrressMap1.getCityName().replace("县", "").replace("市", "").equals("沈阳")) {
					if("经济技术开发区".equals(adrressMap1.getAreaName())) {
						dangaddressId = 5815l;
					}
				}
			}
			if(adrressMap1.getProvinceName().replace("省", "").replace("市", "").equals("四川")) {
				//"16401, 16402, 16404, 16444, 16447, 16475, 16493, 16499, 16511, 16520, 16530, 16569, "
				if(adrressMap1.getCityName().replace("县", "").replace("市", "").equals("资阳")) {
					if("简阳市".equals(adrressMap1.getAreaName().trim())) {
						dangaddressId = 34486l;
					}
				}
			}
			if(adrressMap1.getProvinceName().replace("省", "").replace("市", "").equals("山东")) {
				//"16401, 16402, 16404, 16444, 16447, 16475, 16493, 16499, 16511, 16520, 16530, 16569, "
				if(adrressMap1.getCityName().replace("县", "").replace("市", "").equals("德州")) {
					if("德州经济技术开发区".equals(adrressMap1.getAreaName().trim())) {
						dangaddressId = 19202l;
					}
				}
				if(adrressMap1.getCityName().replace("县", "").replace("市", "").equals("青岛")) {
					if("开发区".equals(adrressMap1.getAreaName().trim())) {
						dangaddressId = 17996l;
					}
				}
				if(adrressMap1.getCityName().replace("县", "").replace("市", "").equals("威海")) {
					if("经济技术开发区".equals(adrressMap1.getAreaName().trim())) {
						dangaddressId = 18509l;
					}
				}
				if(adrressMap1.getCityName().replace("县", "").replace("市", "").equals("潍坊")) {
					if("开发区".equals(adrressMap1.getAreaName().trim())) {
						dangaddressId = 18436l;
					}
				}
			}
			if(adrressMap1.getProvinceName().replace("省", "").replace("市", "").equals("西藏")) {
				//"16401, 16402, 16404, 16444, 16447, 16475, 16493, 16499, 16511, 16520, 16530, 16569, "
				if(adrressMap1.getCityName().replace("县", "").replace("市", "").equals("日喀则地区")) {
					if("萨迦县".equals(adrressMap1.getAreaName().trim())) {
						dangaddressId = 41394l;
					}
					if("桑珠孜区".equals(adrressMap1.getAreaName().trim())) {
						dangaddressId = 41539l;
					}
				}
				if(adrressMap1.getCityName().replace("县", "").replace("市", "").equals("阿里地区")) {
					if("札达县".trim().equals(adrressMap1.getAreaName().trim())) {
						dangaddressId = 41681l;
					}
					
				}
			}
			if(adrressMap1.getProvinceName().replace("省", "").replace("市", "").equals("宁夏")) {
				//"16401, 16402, 16404, 16444, 16447, 16475, 16493, 16499, 16511, 16520, 16530, 16569, "
				if(adrressMap1.getCityName().replace("县", "").replace("市", "").equals("吴忠")) {
					if("红寺堡开发区".equals(adrressMap1.getAreaName())) {
						dangaddressId = 45628l;
					}
				}
			}
			if(adrressMap1.getProvinceName().replace("省", "").replace("市", "").trim().equals("陕西")) {
				if(adrressMap1.getCityName().replace("县", "").replace("市", "").trim().equals("西安")) {
					if("户县".equals(adrressMap1.getAreaName())) {
						dangaddressId = 41921l;
					}
				}
			}
			if(adrressMap1.getProvinceName().replace("省", "").replace("市", "").trim().equals("广东")) {
				if(adrressMap1.getCityName().replace("县", "").replace("市", "").trim().equals("中山")) {
					if("东区街道".equals(adrressMap1.getAreaName())) {
						dangaddressId = 27458l;
					}
					if("南区街道".equals(adrressMap1.getAreaName())) {
						dangaddressId = 27460l;
					}
					if("沙朗镇".equals(adrressMap1.getAreaName())) {
						dangaddressId = 27463l;
					}
					if("石岐区街道".equals(adrressMap1.getAreaName())) {
						dangaddressId = 27461l;
					}
					if("西区街道".equals(adrressMap1.getAreaName())) {
						dangaddressId = 27459l;
					}
				}
			}
			if(adrressMap1.getProvinceName().replace("省", "").replace("市", "").trim().equals("澳门特别行政区")) {
				dangaddressId = 47324l;
			}
			if(adrressMap1.getProvinceName().replace("省", "").replace("市", "").trim().equals("甘肃")) {
				if(adrressMap1.getCityName().replace("县", "").replace("市", "").trim().equals("嘉峪关")) {
					if("文殊镇".equals(adrressMap1.getAreaName())) {
						dangaddressId = 43557l;
					}
					if("新城镇".equals(adrressMap1.getAreaName())) {
						dangaddressId = 43557l;
					}
					if("峪泉镇".equals(adrressMap1.getAreaName())) {
						dangaddressId = 43557l;
					}
				}
			}
			if(adrressMap1.getProvinceName().replace("省", "").replace("市", "").trim().equals("广西壮族自治区")) {
				if(adrressMap1.getCityName().replace("县", "").replace("市", "").trim().equals("百色")) {
					if("靖西市".equals(adrressMap1.getAreaName().trim())) {
						dangaddressId = 28642l;
					}
				}
				if(adrressMap1.getCityName().replace("县", "").replace("市", "").trim().equals("崇左")) {
					if("江州区".equals(adrressMap1.getAreaName())) {
						dangaddressId = 29042l;
					}
				}
				if(adrressMap1.getCityName().replace("县", "").replace("市", "").trim().equals("桂林")) {
					if("临桂区".equals(adrressMap1.getAreaName())) {
						dangaddressId = 28024l;
					}
				}
				if(adrressMap1.getCityName().replace("县", "").replace("市", "").trim().equals("河池")) {
					if("宜州市".equals(adrressMap1.getAreaName())) {
						dangaddressId = 28817l;
					}
				}
				if(adrressMap1.getCityName().replace("县", "").replace("市", "").trim().equals("柳州")) {
					if("柳江区".equals(adrressMap1.getAreaName())) {
						dangaddressId = 27901l;
					}
				}
				if(adrressMap1.getCityName().replace("县", "").replace("市", "").trim().equals("南宁")) {
					if("武鸣区".equals(adrressMap1.getAreaName())) {
						dangaddressId = 27771l;
					}
				}
			}
			if(adrressMap1.getProvinceName().replace("省", "").replace("市", "").trim().equals("安徽")) {
				if(adrressMap1.getCityName().replace("县", "").replace("市", "").trim().equals("安庆")) {
					if("安庆经济技术开发区".equals(adrressMap1.getAreaName())) {
						dangaddressId = 13604l;
					}
				}
				if(adrressMap1.getCityName().replace("县", "").replace("市", "").trim().equals("阜阳")) {
					if("阜阳经济技术开发区".equals(adrressMap1.getAreaName())) {
						dangaddressId = 14012l;
					}
				}
				if(adrressMap1.getCityName().replace("县", "").replace("市", "").trim().equals("合肥")) {
					if("新站高新区".equals(adrressMap1.getAreaName())) {
						dangaddressId = 13014l;
					}
				}
				if(adrressMap1.getCityName().replace("县", "").replace("市", "").trim().equals("淮南")) {
					if("淮南高新技术产业开发区".equals(adrressMap1.getAreaName())) {
						dangaddressId = 13272l;
					}
				}
				if(adrressMap1.getCityName().replace("县", "").replace("市", "").trim().equals("铜陵")) {
					if("铜官山区".equals(adrressMap1.getAreaName())) {
						dangaddressId = 13389l;
					}
				}
			}
			if(adrressMap1.getProvinceName().replace("省", "").replace("市", "").equals("浙江")) {
				if(adrressMap1.getCityName().replace("县", "").replace("市", "").equals("杭州")) {
					if("下沙区".equals(adrressMap1.getAreaName().trim())) {
						dangaddressId = 11723l;
					}
				}
			}
			if(adrressMap1.getProvinceName().replace("省", "").replace("市", "").equals("台湾")) {
				AdrressExample example = new AdrressExample();
				example.createCriteria().andDangProvinceNameLike("%"+adrressMap1.getProvinceName().replace("省", "").replace("市", "")+"%")
				 .andDangCityNameLike("%"+adrressMap1.getAreaName().replace("省", "").replace("市", "").replace("县", "")+"%");
				List<Adrress> example2 = adrressMapper.selectByExample(example );
				if(example2!= null && example2.size()>0) {
					dangaddressId = example2.get(0).getId();
				}
				if(adrressMap1.getCityName().equals("高雄市")) {
					dangaddressId = 47298l;
				}
				if(adrressMap1.getCityName().equals("花莲县")) {
					dangaddressId = 47319l;
				}
				if(adrressMap1.getCityName().equals("基隆市")) {
					dangaddressId = 47299l;
				}
				if(adrressMap1.getCityName().equals("嘉义市")) {
					dangaddressId = 47303l;
				}
				if(adrressMap1.getCityName().equals("嘉义县")) {
					dangaddressId = 47313l;
				}
				if(adrressMap1.getCityName().equals("金门县")) {
					dangaddressId = 47320l;
				}
				if(adrressMap1.getCityName().equals("连江县")) {
					dangaddressId = 47320l;
				}
			}
			if(adrressMap1.getProvinceName().replace("省", "").replace("市", "").equals("内蒙古")) {
				if(adrressMap1.getCityName().replace("县", "").replace("市", "").equals("包头")) {
					dangaddressId = 4467l;
				}
				if(adrressMap1.getCityName().replace("县", "").replace("市", "").equals("呼伦贝尔")) {
					if(adrressMap1.getAreaName().equals("鄂伦春旗")) {
						dangaddressId = 5110l;
					}
					if(adrressMap1.getAreaName().equals("鄂温克族旗")) {
						dangaddressId = 5120l;
					}
					if(adrressMap1.getAreaName().equals("莫力达瓦旗")) {
						dangaddressId = 5143l;
					}
					
				}
				if(adrressMap1.getCityName().replace("县", "").replace("市", "").equals("鄂尔多斯")) {
					if(adrressMap1.getAreaName().equals("康巴什新区")) {
						dangaddressId = 4970l;
					}
				}
			}
			if(adrressMap1.getProvinceName().replace("省", "").replace("市", "").equals("黑龙江")) {
				if(adrressMap1.getCityName().replace("县", "").replace("市", "").equals("七台河")&&adrressMap1.getAreaName().equals("金沙新区")) {//16624
					dangaddressId = 9567l;
				}
			}
			if(adrressMap1.getProvinceName().replace("省", "").replace("市", "").equals("湖北")) {
//				" 16708, 16712, 16726, 16727, 16733, 16734,16749,16756, 16761, 16772, 16773, 16777, 16778, 16781,16789,16792, 16793, 16801, 16804, 16812, 16824, 16825, 16845"
				if(adrressMap1.getCityName().replace("县", "").replace("市", "").equals("天门")) {
					dangaddressId = 23485l;
				}
//				"16735, 16736, 16740, 16746, 16747, 16754,  16763, 16769, 16784, 16788 , 16803,  16818, 16826, 16851, 16852,  16858, 16865, 16866, 16872,  16877,  16885, 16886, 16887, 16891, "
				if(adrressMap1.getCityName().replace("县", "").replace("市", "").equals("潜江")) {
					dangaddressId = 23484l;
				}
//				"16751, 16780, 16797,16814, 16816, 16838, 16848,16854, "
				if(adrressMap1.getCityName().replace("县", "").replace("市", "").equals("神农架林区")) {
					dangaddressId = 23486l;
				}
				if(adrressMap1.getCityName().replace("县", "").replace("市", "").equals("宜昌市")) {
					if(adrressMap1.getAreaName().equals("经济开发区")) {
						
						dangaddressId = 22811l;
					}
				}
				if(adrressMap1.getCityName().replace("县", "").replace("市", "").equals("仙桃")) {
					dangaddressId = 23483l;
				}
				if(adrressMap1.getCityName().replace("县", "").replace("市", "").equals("黄石")) {
					dangaddressId = 22254l;
				}
				if(adrressMap1.getCityName().equals("省直辖县")) {
					if(adrressMap1.getAreaName().equals("潜江市")) {
						dangaddressId = 23484l;
					}
					if(adrressMap1.getAreaName().equals("神农架林区")) {
						dangaddressId = 23486l;
					}
					if(adrressMap1.getAreaName().equals("天门市")) {
						dangaddressId = 23485l;
					}
					if(adrressMap1.getAreaName().equals("仙桃市")) {
						dangaddressId = 23483l;
					}
				}
			}
			
			if(adrressMap1.getProvinceName().replace("省", "").replace("市", "").equals("湖南")) {
				if(adrressMap1.getCityName().replace("县", "").replace("市", "").equals("株洲")) {
					dangaddressId = 23768l;
				}
			}
			if(adrressMap1.getProvinceName().replace("省", "").replace("市", "").equals("江西")) {
				if(adrressMap1.getCityName().replace("县", "").replace("市", "").equals("九江")) {
					if("庐山风景名胜区".equals(adrressMap1.getAreaName()))
					dangaddressId = 16094l;
				}
			}
			if(adrressMap1.getProvinceName().replace("省", "").replace("市", "").equals("吉林")) {
				if(adrressMap1.getCityName().replace("县", "").replace("市", "").equals("长春")) {
					if(adrressMap1.getAreaName().equals("高新技术产业开发区")) {
						dangaddressId = 7368l;
					}else
					dangaddressId = 7366l;
				}
			}
			if(adrressMap1.getProvinceName().replace("省", "").replace("市", "").equals("新疆")) {
				if(adrressMap1.getCityName().replace("县", "").replace("市", "").equals("石河子")) {
					dangaddressId = 47289l;
				}
				if(adrressMap1.getCityName().replace("县", "").replace("市", "").equals("巴音郭楞州")) {
					if(adrressMap1.getAreaName().equals("库尔勒市")) {
						
						dangaddressId = 46580l;
					}
                    if(adrressMap1.getAreaName().equals("尉犁县")) {
						
						dangaddressId = 46609l;
					}
                   if(adrressMap1.getAreaName().equals("和静县")) {
						
						dangaddressId = 46656l;
					}
                   if(adrressMap1.getAreaName().equals("博湖县")) {
						
						dangaddressId = 46680l;
					}
                   if(adrressMap1.getAreaName().equals("和硕县")) {
						
						dangaddressId = 46670l;
					}
                   if(adrressMap1.getAreaName().equals("轮台县")) {
						
						dangaddressId = 46581l;
					}
                   if(adrressMap1.getAreaName().equals("若羌县")) {
						
						dangaddressId = 46610l;
					}
                   if(adrressMap1.getAreaName().equals("且末县")) {
						
						dangaddressId = 46620l;
					}
                   if(adrressMap1.getAreaName().equals("焉耆县")) {
						
						dangaddressId = 46695l;
					}
				}
				if(adrressMap1.getCityName().replace("县", "").replace("市", "").equals("昌吉州")) {
					   if(adrressMap1.getAreaName().equals("昌吉市")) {
							
							dangaddressId = 46724l;
						}
					   if(adrressMap1.getAreaName().equals("阜康市")) {
							
							dangaddressId = 46725l;
						}
					   if(adrressMap1.getAreaName().equals("奇台县")) {
							
							dangaddressId = 46807l;
						}
					   if(adrressMap1.getAreaName().equals("奇台县")) {
							
							dangaddressId = 46807l;
						}
					   if(adrressMap1.getAreaName().equals("玛纳斯县")) {
							
							dangaddressId = 46786l;
						}
					   if(adrressMap1.getAreaName().equals("吉木萨尔县")) {
							
							dangaddressId = 46821l;
						}
					   if(adrressMap1.getAreaName().equals("呼图壁县")) {
							
							dangaddressId = 46761l;
						}
					   if(adrressMap1.getAreaName().equals("木垒县")) {
							
							dangaddressId = 46838l;
						}
				}
				if(adrressMap1.getCityName().replace("县", "").replace("市", "").equals("博尔塔拉州")) {
					if(adrressMap1.getAreaName().equals("博乐市")) {
						dangaddressId = 46839l;
					}
					if(adrressMap1.getAreaName().equals("精河县")) {
						dangaddressId = 46851l;
					}
					if(adrressMap1.getAreaName().equals("温泉县")) {
						dangaddressId = 46863l;
					}
					if(adrressMap1.getAreaName().equals("阿拉山口市")) {
						dangaddressId = 46867l;
					}
				}
				if(adrressMap1.getCityName().replace("县", "").replace("市", "").equals("伊犁州")) {
					if(adrressMap1.getAreaName().equals("阿拉山口市")) {
						dangaddressId = 46868l;
					}
					if(adrressMap1.getAreaName().equals("特克斯县")) {
						dangaddressId = 47006l;
					}
					if(adrressMap1.getAreaName().equals("尼勒克县")) {
						dangaddressId = 47025l;
					}
					if(adrressMap1.getAreaName().equals("昭苏县")) {
						dangaddressId = 46989l;
					}
					if(adrressMap1.getAreaName().equals("新源县")) {
						dangaddressId = 46967l;
					}
					if(adrressMap1.getAreaName().equals("霍城县")) {
						dangaddressId = 46928l;
					}
					if(adrressMap1.getAreaName().equals("察布查尔县")) {
						dangaddressId = 47027l;
					}
					if(adrressMap1.getAreaName().equals("巩留县")) {
						dangaddressId = 46951l;
					}
					if(adrressMap1.getAreaName().equals("奎屯市")) {
						dangaddressId = 46882l;
					}
					if(adrressMap1.getAreaName().equals("伊宁县")) {
						dangaddressId = 46883l;
					}
					if(adrressMap1.getAreaName().equals("霍尔果斯市")) {
						dangaddressId = 47050l;
					}
				}
				if(adrressMap1.getCityName().replace("县", "").replace("市", "").equals("五家渠市")) {
					dangaddressId = 47292l;
					
				}
				if(adrressMap1.getCityName().replace("县", "").replace("市", "").equals("阿拉尔市")) {
					dangaddressId = 47290l;
					
				}
				if(adrressMap1.getCityName().replace("县", "").replace("市", "").equals("图木舒克市")) {
					dangaddressId = 19723l;
					
				}
			}
			if(adrressMap1.getProvinceName().replace("省", "").replace("市", "").equals("江苏")) {
				if(adrressMap1.getCityName().replace("县", "").replace("市", "").equals("徐州")&&adrressMap1.getAreaName().equals("八段工业园区")) {
					dangaddressId = 10328l;
				}
				if(adrressMap1.getCityName().replace("县", "").replace("市", "").equals("徐州")&&adrressMap1.getAreaName().equals("铜山经济技术开发区")) {
					dangaddressId = 10316l;
				}
				if(adrressMap1.getCityName().replace("县", "").replace("市", "").equals("徐州")&&adrressMap1.getAreaName().equals("工业园区")) {
					dangaddressId = 10389l;
				}
				if(adrressMap1.getCityName().replace("县", "").replace("市", "").equals("淮安")&&adrressMap1.getAreaName().equals("经济开发区")) {
					dangaddressId = 11015l;
				}
				if(adrressMap1.getCityName().replace("县", "").replace("市", "").equals("淮安")&&adrressMap1.getAreaName().equals("清浦区")) {
					dangaddressId = 10894l;
				}
				if(adrressMap1.getCityName().replace("县", "").replace("市", "").equals("镇江")) {
					dangaddressId = 11290l;
				}
				if(adrressMap1.getCityName().replace("县", "").replace("市", "").equals("南通")) {
					dangaddressId = 10765l;
				}
				if(adrressMap1.getCityName().replace("县", "").replace("市", "").equals("扬州")) {
					if(adrressMap1.getAreaName().equals("经济开发区")) {
						
						dangaddressId = 11234l;
					}
				}
			}
			if(dangaddressId ==null) {
				idList.add(adrressMap1.getId());
				continue;
			}
			AdrressMap record = new AdrressMap();
//			Adrress selectByPrimaryKey = adrressMapper.selectByPrimaryKey(dangaddressId);
			record.setPartnerId(conveterpartnerId);
			record.setProvinceName(adrressMap1.getProvinceName().trim());
			record.setProvinceId("");
			record.setCityName(adrressMap1.getCityName().trim());
			record.setCityId("");
			record.setAreaName(adrressMap1.getAreaName().trim());
			record.setAreaId("");
			record.setDangAddressId(dangaddressId);
			record.setStreetId("");
			record.setStreetName("");
			adrressMapMapper.insert(record);
				
		}
	}
	
	
	
	
	
	public void dbser() {
		ArrayList<Long> idList = new ArrayList<>();
		List<AdrressMap1> selectByExample = adrressMap1Mapper.selectByExample(null);
		for (AdrressMap1 adrressMap1 : selectByExample) {
			Integer conveterpartnerId = conveterpartnerId(adrressMap1.getAddressType());
			if(conveterpartnerId == 0 ) {
				continue;
			}
			
			
			AdrressMapExample example = new AdrressMapExample();
			example.createCriteria().andProvinceNameLike("%"+adrressMap1.getProvinceName().replace("省", "").replace("市", "")+"%")
					.andCityNameLike("%"+adrressMap1.getCityName().replace("市", "").replace("县", "").replace("区", "")+"%").andAreaNameLike("%"+adrressMap1.getAreaName().replace("市", "").replace("县", "").replace("区", "")+"%");
			List<AdrressMap> selectByExample2 = adrressMapMapper.selectByExample(example);
			Long dangaddressId = null;
			AdrressMap adrressMap = null;
			if (selectByExample2 != null && selectByExample2.size() > 0) {
				adrressMap = selectByExample2.get(0);
				dangaddressId = adrressMap.getDangAddressId();
			}
			if (dangaddressId == null) {
				AdrressExample example23 = new AdrressExample();
				example23.createCriteria().andDangProvinceNameLike("%"+adrressMap1.getProvinceName().replace("省", "").replace("市", "")+"%")
						.andDangCityNameLike("%"+adrressMap1.getCityName().replace("市", "").replace("县", "").replace("区", "")+"%").andDangAreaNameLike("%"+adrressMap1.getAreaName().replace("市", "").replace("县", "").replace("区", "")+"%");
				List<Adrress> selectByExample3 = adrressMapper.selectByExample(example23);
				if (selectByExample3 != null && selectByExample3.size() > 0) {
					dangaddressId = selectByExample3.get(0).getId();
				}
			}
			if(dangaddressId == null) {
			if(adrressMap1.getProvinceName().replace("省", "").replace("市", "").equals("重庆")||adrressMap1.getProvinceName().replace("省", "").replace("市", "").equals("天津")||adrressMap1.getProvinceName().replace("省", "").replace("市", "").equals("北京")||adrressMap1.getProvinceName().replace("省", "").replace("市", "").equals("上海")) {
				AdrressMapExample example11 = new AdrressMapExample();
				if(!adrressMap1.getCityName().equals("县")) {
					
					
					example.createCriteria().andProvinceNameLike("%"+adrressMap1.getProvinceName().replace("省", "").replace("市", "")+"%")
					.andCityNameLike("%"+adrressMap1.getProvinceName().replace("省", "").replace("市", "").replace("县", "").replace("区", "")+"%").andAreaNameLike("%"+adrressMap1.getCityName().replace("市", "").replace("县", "").replace("区", "")+"%");
				}else {
					example.createCriteria().andProvinceNameLike("%"+adrressMap1.getProvinceName().replace("省", "").replace("市", "")+"%")
					.andCityNameLike("%"+adrressMap1.getCityName()+"%").andAreaNameLike("%"+adrressMap1.getAreaName().replace("市", "").replace("县", "").replace("区", "")+"%");
				}
				List<AdrressMap> selectByExample21 = adrressMapMapper.selectByExample(example11);
				if (selectByExample21 != null && selectByExample21.size() > 0) {
					adrressMap = selectByExample21.get(0);
					dangaddressId = adrressMap.getDangAddressId();
				}
				if (dangaddressId == null) {
					AdrressExample example23 = new AdrressExample();
					if(!adrressMap1.getCityName().equals("县")) {
					example23.createCriteria().andDangProvinceNameLike("%"+adrressMap1.getProvinceName().replace("省", "").replace("市", "")+"%")
							.andDangCityNameLike("%"+adrressMap1.getProvinceName().replace("省", "").replace("市", "").replace("县", "").replace("区", "")+"%").andDangAreaNameLike("%"+adrressMap1.getCityName().replace("市", "").replace("县", "").replace("区", "")+"%");
					
					}else {
						example23.createCriteria().andDangProvinceNameLike("%"+adrressMap1.getProvinceName().replace("省", "").replace("市", "")+"%")
						.andDangCityNameLike("%"+adrressMap1.getProvinceName().replace("省", "").replace("市", "").replace("县", "").replace("区", "")+"%").andDangAreaNameLike("%"+adrressMap1.getAreaName().replace("市", "").replace("县", "").replace("区", "")+"%");
				
					}
					List<Adrress> selectByExample3 = adrressMapper.selectByExample(example23);
					if (selectByExample3 != null && selectByExample3.size() > 0) {
						dangaddressId = selectByExample3.get(0).getId();
					}
				}
			}
			}
			
			
			if(adrressMap1.getProvinceName().equals("港澳")) {
				if(adrressMap1.getCityName().equals("香港特别行政区")) {
					dangaddressId = 47323l;
				}
				//澳门特别行政区
				if(adrressMap1.getCityName().equals("澳门特别行政区")) {
					dangaddressId = 47324l;
				}
			}
			if (dangaddressId == null) {
				idList.add(adrressMap1.getId());
				continue;
			}
			
			// xuetian 1002
//			tmall 
//			jingdong：1001
//			weixin 
//			youzan 1003
			AdrressMap record = new AdrressMap();
//			Adrress selectByPrimaryKey = adrressMapper.selectByPrimaryKey(dangaddressId);
			record.setPartnerId(conveterpartnerId);
			record.setProvinceName(adrressMap1.getProvinceName());
			record.setProvinceId("");
			record.setCityName(adrressMap1.getCityName());
			record.setCityId("");
			record.setAreaName(adrressMap1.getAreaName());
			record.setAreaId("");
			record.setDangAddressId(dangaddressId);
			record.setStreetId("");
			record.setStreetName("");
			adrressMapMapper.insert(record);
		}
		System.out.println(idList);
		
	}

	public Integer conveterpartnerId(String partner) {
		if ("xuetian".equals(partner)) {
			return 1002;
		} else if ("jingdong".equals(partner)) {
			return 1001;
		} else if ("youzan".equals(partner)) {
			return 1003;
		}
		return 0;

	}
}
