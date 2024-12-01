/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculamediaatualizado;

/**
 *
 * @author REGYANE
 */
public class Aluno {
    
 // Atributos para armazenar nome e notas
    public String nome;
    public float nota1;
    public float nota2;

    // Método para calcular a média do aluno
    public float calcularMedia() {
        return (nota1 + nota2) / 2;
    }
}
