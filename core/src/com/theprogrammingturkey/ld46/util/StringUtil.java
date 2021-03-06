package com.theprogrammingturkey.ld46.util;

import java.text.DecimalFormat;

public class StringUtil
{
	private static DecimalFormat format = new DecimalFormat("0.##");
	private static DecimalFormat intFormat = new DecimalFormat("0");

	public static String formatDecimal(float dec)
	{
		return format.format(dec);
	}

	public static String formatToInt(float dec)
	{
		return intFormat.format(dec);
	}
}
