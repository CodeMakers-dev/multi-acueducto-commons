package com.codemakers.commons.utils;

public class Constantes {
	
	private Constantes() {
        throw new UnsupportedOperationException("Esta clase no puede ser instanciada");
    }

	public static final String SAVED_SUCCESSFULLY ="Guardado exitosamente";
	public static final String UPDATED_SUCCESSFULLY ="Actualizado exitosamente";
	public static final String DELETED_SUCCESSFULLY ="Eliminado exitosamente";
	public static final String CONSULTED_SUCCESSFULLY ="Consulta exitosamente";
	public static final String SENT_SUCCESSFULLY ="Enviado exitosamente";
	public static final String AUTHENTICATION_SUCCESSFULLY ="Autenticación exitosa";
	public static final String SEND_ERROR ="Error al enviar mensaje";
	
	public static final String SAVE_ERROR = "Error al guardar";
	public static final String PASSWORD_SUCCESSFULLY ="Contraseña actualizada correctamente.";
	public static final String UPDATE_ERROR = "Error al actualizar";
	public static final String DELETE_ERROR = "Error al eliminar, registro no encontrado";
	public static final String AUTHENTICATION_ERROR ="Error inesperado al autenticar";
	public static final String RECORD_NOT_FOUND = "Registro no encontrado";
	public static final String CONSULTING_ERROR = "Error al consultar";
	public static final String ERROR_QUERY_RECORD_BY_ID = "Error al consultar registro por Id";
	public static final String NO_RECORD_FOUND = "No se ha encontrado ningún registro";
	public static final String DEPART_NOT_FOUND = "Departamento no encontrado";
	public static final String COUNTRY_CODE_NOT_FOUND = "pais + codigo no encontrado";
	public static final String TOKEN_REQUIRED = "Token de recuperación es obligatorio";
	public static final String TOKEN_INVALID = "Token inválido o ya usado";
	public static final String TOKEN_EXPIRED = "Token inválido o expirado" ;
	public static final String SPECIAL_CHARACTERS ="La contraseña debe tener al menos 8 caracteres, una mayúscula, una minúscula, un número y un carácter especial (@#$%^&+=!)";
	public static final String PASSWORD_DIFFERENT ="La nueva contraseña debe ser diferente a la actual";
	public static final String USER_REQUIRED = "El usuario es obligatorio";
	public static final String USER_INVALID = "El usuario está inactivo. No se puede recuperar la contraseña.";
	
	public static final String INVALID_CREDENTIALS = "Credenciales inválidas";
	public static final String INTERNAL_SERVER_ERROR = "Error interno del servidor";

}
