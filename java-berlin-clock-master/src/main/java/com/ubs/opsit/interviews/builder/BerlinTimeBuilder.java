package com.ubs.opsit.interviews.builder;

import static com.ubs.opsit.interviews.util.BerlinConstants.NEW_LINE;

public class BerlinTimeBuilder {

	private String hours;
	private String minutes;
	private String seconds;
	private StringBuilder berlinTime = new StringBuilder();

	private BerlinTimeBuilder(BerlinBuilder builder) {
		this.hours = builder.hours;
		this.minutes = builder.minutes;
		this.seconds = builder.seconds;
	}

	public String getHours() {
		return hours;
	}

	public String getMinutes() {
		return minutes;
	}

	public String getSeconds() {
		return seconds;
	}

	public StringBuilder getBerlinTime() {
		return this.berlinTime.append(this.seconds).append(NEW_LINE)
				.append(this.hours).append(NEW_LINE).append(this.minutes);
	}

	public static class BerlinBuilder {
		private String hours;
		private String minutes;
		private String seconds;

		public BerlinBuilder(String hours, String minutes, String seconds) {
			this.hours = hours;
			this.minutes = minutes;
			this.seconds = seconds;
		}

		public BerlinTimeBuilder build() {
			return new BerlinTimeBuilder(this);
		}

	}

}
