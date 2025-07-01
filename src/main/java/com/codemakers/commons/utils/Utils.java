package com.codemakers.commons.utils;

import java.util.Calendar;
import java.util.Date;
import java.util.Objects;

import com.codemakers.commons.dtos.ResponseDTO;

public class Utils {
	private Utils() {
	}

	public static ResponseDTO mapearRespuesta(final String message, final Integer statusCode,
			final Object objResponse) {
		ResponseDTO response = new ResponseDTO();
		response.setMessage(message);
		response.setCode(statusCode);
		response.setResponse(objResponse);

		return response;
	}

	public static ResponseDTO mapearRespuesta(final String message, final Integer statusCode) {
		ResponseDTO response = new ResponseDTO();
		response.setMessage(message);
		response.setCode(statusCode);
		response.setResponse(null);

		return response;
	}

	public static Date sumarRestarHorasFecha(Date fecha, int horas) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(fecha);
		calendar.add(Calendar.HOUR, horas);
		return calendar.getTime();
	}

	public static String validarValue(String valor) {
		return Objects.nonNull(valor) ? valor : "";
	}
}
