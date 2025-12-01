package com.reciclaje.inteligente.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import jakarta.mail.MessagingException;		
import jakarta.mail.internet.MimeMessage;


@Service
//@ConditionalOnProperty(prefix = "spring.mail", name = "username")
public class EmailService {
	
	// 🚫 Desactivado: no hay servicio de correo en Render en este proyecto
    // @Autowired
    // private JavaMailSender mailSender;

    public void enviarTicketConQR(String para, String asunto, String contenidoHtml, byte[] qrBytes) {
        // 🚫 Correo deshabilitado temporalmente
        System.out.println("📭 [INFO] Envío de correo con QR desactivado (modo producción sin SMTP)");
    }

    public void enviar(String para, String asunto, String contenidoHtml) {
        // 🚫 Correo deshabilitado temporalmente
        System.out.println("📭 [INFO] Envío de correo desactivado (modo producción sin SMTP)");
    }
}
