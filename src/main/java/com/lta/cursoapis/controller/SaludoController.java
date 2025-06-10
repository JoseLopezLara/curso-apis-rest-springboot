package com.lta.cursoapis.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*
- Controller: Es una clase en Java que gestiona las solicitudes HTTP (como GET, POST, PUT, DELETE)
que llega a la aplicación web o API, es el puente entre el cliente y la lógica de negocio o servicios

- En otras palabras es donde defines qué hacer cuando alguien visita cierta URL

- Controlador REST: Es una clase en Java que expone rutas HTTP (URLs) para que otros sistemas puedan
enviarle peticiones y recibir respuestas en formato JSON

    - Indica que esta clase es un controlador REST
    - Combina @Controller y @ResponseBody
    - No vistas HTML
*/

//Indicamos que esta clase es un controlador Web en APIs REST
//@RestController
//Configuramos una URL para para todos los métodos del controlador
//@RequestMapping("/micontroller")
public class SaludoController {

    @GetMapping("/saludo")
    public String saludar(){
        return "Hola Mundo";
    }

}
