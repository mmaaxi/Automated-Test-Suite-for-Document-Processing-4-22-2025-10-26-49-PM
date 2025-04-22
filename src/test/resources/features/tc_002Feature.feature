Feature: Validar subida de archivo con formato válido y vista previa

  Scenario: Subir archivo en formato PDF/DOCX y ver vista previa
    Given El usuario está en la página de carga de archivos
    When El usuario selecciona un archivo PDF/DOCX dentro del límite de 50 MB
    Then El archivo se carga exitosamente
    And Se muestra la vista previa del archivo incluyendo nombre, tamaño y tipo