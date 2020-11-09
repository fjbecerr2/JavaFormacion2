package gestXML;

public class DatosEmail {
		private String nombreUsuario;
		private String emailUsuario;
		public String getNombreUsuario() {
			return nombreUsuario;
		}
		public void setNombreUsuario(String nombreUsuario) {
			this.nombreUsuario = nombreUsuario;
		}
		public String getEmailUsuario() {
			return emailUsuario;
		}
		public void setEmailUsuario(String emailUsuario) {
			this.emailUsuario = emailUsuario;
		}
		
		@Override
	    public String toString() {
	        return "Datos del usuario: Nombre->"+this.nombreUsuario+" email->"+this.emailUsuario;
	    }
		
		

}
