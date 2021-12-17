package com.example.demo.controller;

import javax.persistence.EntityNotFoundException;
import javax.validation.Valid;

import com.example.demo.dto.OperacionEmprendimiento;
import com.example.demo.entity.Emprendimiento;
import com.example.demo.entity.Evento;
import com.example.demo.entity.Usuario;
import com.example.demo.repository.EmprendimientoRepository;
import com.example.demo.repository.EventoRepository;
import com.example.demo.repository.UsuarioRepository;
import com.example.demo.service.EmprendimientoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/eventos")
public class EventoController {

    /*

    private UsuarioRepository usuarioRepository;
    private EventoRepository eventoRepository;

    public EventoController(EventoRepository eventoRepository) {
        this.eventoRepository = eventoRepository;
        this.usuarioRepository = usuarioRepository;
    }

    @PostMapping("/usuarios/{id}/eventos")
    public ResponseEntity<?> crearEvento(@PathVariable("id") Long id,
            @RequestBody @Valid Evento evento) {
        Usuario usuario = usuarioRepository
                .findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Usuario no encontrado"));
        usuario.getEvento().add(evento);
        evento.setUsuario(usuario);
        return new ResponseEntity<>(usuarioRepository.save(usuario), HttpStatus.CREATED);
    }

    @PutMapping("/eventos/{id}")
    public ResponseEntity<?> modificarEvento(@PathVariable("id") Long id,
            @RequestBody @Valid Evento evento) {
        Evento eventoExistente = eventoRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Evento no encontrado"));
                eventoExistente.setDetalle(evento.getDetalle());
                eventoExistente.setFechaDeCreacion(evento.getFechaDeCreacion());
                eventoExistente.setFechaDeCierre(evento.getFechaDeCierre());
                eventoExistente.setEstado(evento.getEstado());
                eventoExistente.setSuscriptores(evento.getSuscriptores());
                eventoExistente.setPremio(evento.getPremio());
        return new ResponseEntity<>(eventoRepository.save(eventoExistente), HttpStatus.OK);
    }

    // Consulta de Todos los Eventos

    @GetMapping("/eventos")
    public ResponseEntity<?> buscarEeventos() {
        return new ResponseEntity<>(eventoRepository.findAll(), HttpStatus.OK);

    }










    private EmprendimientoService emprendimientoService;
    private EmprendimientoRepository emprendimientoRepository;

    @Autowired
    public EmprendimientoController(EmprendimientoRepository emprendimientoRepository,
                                    EmprendimientoService emprendimientoService) {
        this.emprendimientoRepository = emprendimientoRepository;
        this.emprendimientoService = emprendimientoService;
    }

    @GetMapping("/emprendimientos")
    public ResponseEntity<?> mostrarEmorendimientos() {
        return new ResponseEntity<>(emprendimientoRepository.findAll(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<?> crearEmrprendimiento(@Valid @RequestBody OperacionEmprendimiento operacionEmprendimiento) {
        return new ResponseEntity<>(emprendimientoService.crearEmrprendimiento(operacionEmprendimiento), HttpStatus.CREATED);
    }


    @DeleteMapping(value = "/emprendimientos/{id}")
    public void eliminarEmprendimiento(@PathVariable Long id) {
        try {
            emprendimientoRepository.deleteById(id);
        } catch (EmptyResultDataAccessException e) {
            throw new IllegalArgumentException("No se encontro el Emprendimiento a eliminar");
        }
    }

    @PutMapping("/emprendimientos/{id}")
    public ResponseEntity<?> modiicarEmporendimiento(@PathVariable("id") Long id,
                                                     @RequestBody @Valid Emprendimiento emprendimiento) {
        Emprendimiento emprendimientoE = emprendimientoRepository.findById(id).orElseThrow(() -> new EntityNotFoundException("Emprendimiento no encontrado"));
        emprendimientoE.setNombre(emprendimiento.getNombre());
        emprendimientoE.setDescripcion(emprendimiento.getDescripcion());
        emprendimientoE.setContenido(emprendimiento.getContenido());
        emprendimientoE.setObjetivo(emprendimiento.getObjetivo());
        emprendimientoE.setPublicado(emprendimiento.getPublicado());
        emprendimientoE.setUrl(emprendimiento.getUrl());
        emprendimientoE.setTags(emprendimiento.getTags());
        emprendimientoE.setPublicado(emprendimiento.getPublicado());
        return new ResponseEntity<>(emprendimientoRepository.save(emprendimientoE), HttpStatus.OK);
    }

    @GetMapping(value = "/emprendimientos", params = "tags")
    public ResponseEntity<?> filtrarPorTags(@RequestParam String tags) {
        return new ResponseEntity<>(emprendimientoRepository.getByTags(tags), HttpStatus.OK);

    }

    @GetMapping(value = "/emprendimientos", params = "publicado")
    public ResponseEntity<?> filtrarNoPublicados(@RequestParam Boolean publicado) {
        return new ResponseEntity<>(emprendimientoRepository.getByPublicado(publicado), HttpStatus.OK);
    }


     */
}
