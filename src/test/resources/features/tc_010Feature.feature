Feature: Validación de generación de Slip de salida y almacenamiento en historial

  Scenario: Completar la carga y procesamiento de documentos
    Given El usuario ha iniciado sesión en el sistema
    When El usuario completa la carga y procesamiento de documentos
    Then El sistema genera el 'Slip de salida'
    And Los documentos originales y los datos extraídos son guardados en el historial de la solicitud