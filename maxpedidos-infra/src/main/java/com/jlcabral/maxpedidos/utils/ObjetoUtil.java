package com.jlcabral.maxpedidos.utils;

import java.util.ArrayList;
import java.util.Arrays;

public class ObjetoUtil {

	public static boolean isNull(Object obj) {
		return obj == null;
	}
	
	public static boolean isNotNull(Object obj) {
		return !isNull(obj);
	}
	
	public static boolean isVazio(Object obj) {
		if(isNotNull(obj)) {
			if(obj instanceof String) {
				return "".equals(obj);
			}
			if(obj instanceof Arrays) {
				return ((ArrayList<?>) obj).size() == 0;
			}
		}
		return false;
	}

	public static boolean isNaoVazio(String obj) {
		return !isVazio(obj);
	}
}
