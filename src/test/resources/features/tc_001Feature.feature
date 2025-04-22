Feature: Validar selección de modo de carga de documentos

  Scenario: Seleccionar opciones de carga de documentos
    Given Que el usuario está en la página de carga de documentos
    When Seleccionar opción 'cargar documentos'
    Then El sistema muestra opción para carga única y carga múltiple

    When Elegir 'carga en un solo archivo'
    Then Se habilita un único recuadro para subir el archivo

    When Elegir 'cargar documentos por separado'
    Then Se muestran múltiples recuadros correspondientes a cada documento requerido