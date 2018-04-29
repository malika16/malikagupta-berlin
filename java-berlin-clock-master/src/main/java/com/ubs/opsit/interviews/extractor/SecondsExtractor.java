package com.ubs.opsit.interviews.extractor;

import static com.ubs.opsit.interviews.util.BerlinLampEnum.OFF;
import static com.ubs.opsit.interviews.util.BerlinLampEnum.YELLOW;

public class SecondsExtractor implements TimeUnitExtractor {

	@Override
	public String getTimeUnit(Integer seconds) {
		return (null != seconds && seconds % 2 == 0) ? String.valueOf(YELLOW
				.getColor()) : String.valueOf(OFF.getColor());
	}

}
