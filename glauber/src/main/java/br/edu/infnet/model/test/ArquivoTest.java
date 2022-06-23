package br.edu.infnet.model.test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import br.edu.infnet.model.domain.Cirurgia;
import br.edu.infnet.model.domain.Consulta;
import br.edu.infnet.model.domain.Exame;
import br.edu.infnet.model.domain.Internacao;
import br.edu.infnet.model.domain.Paciente;
import br.edu.infnet.model.domain.Servico;
import br.edu.infnet.model.exception.HospitalInvalidoException;
import br.edu.infnet.model.exception.MedicoInvalidoException;
import br.edu.infnet.model.exception.TipoInvalidoException;
import br.edu.infnet.model.exception.ValorInvalidoException;

public class ArquivoTest {
    public static void main(String[] args) {
        try {
            String dir = "C:/Dev/FundamentosJava/AT_DR1/Fundamentos_AT_DR1/";
            String arq = "consulta.txt";

            try {

                FileReader fileR = new FileReader(dir + arq);
                BufferedReader leitura = new BufferedReader(fileR);

                FileWriter fileW = new FileWriter(dir + "out_" + arq);
                BufferedWriter escrita = new BufferedWriter(fileW);

                String linha = leitura.readLine();

                Consulta consulta = null;
                List<Servico> servicos = new ArrayList<Servico>();

                while (linha != null) {
                    String[] campos = linha.split(";");

                    String opcao = campos[0];

                    switch (opcao.toUpperCase()) {
                        case "CONSULTA":

                            try {
                                Paciente paciente = new Paciente(campos[3], campos[4], LocalDate.parse(campos[5]));
                                consulta = new Consulta();
                                consulta.setValor(Integer.valueOf(campos[1]));
                                consulta.setMedico(campos[2]);
                                consulta.setPaciente(paciente);
                                consulta.setServicos(servicos);
                            } catch (ValorInvalidoException e) {
                                System.out.println("[ERRO]" + e.getMessage());
                            }
                            break;
                        case "E":
                            try {
                                Exame exame = new Exame(campos[1], campos[2], campos[3]);
                                exame.setLaudo(campos[4]);
                                exame.setPreparacao(campos[5]);
                                exame.setTipo(campos[6]);
                                servicos.add(exame);
                            } catch (TipoInvalidoException e) {
                                System.out.println("[ERRO]" + e.getMessage());
                            }
                            break;
                        case "C":
                            try {
                                Cirurgia cirurgia = new Cirurgia(campos[1], campos[2], campos[3]);
                                cirurgia.setDuracao(campos[4]);
                                cirurgia.setEmergencia(Boolean.valueOf(campos[5]));
                                cirurgia.setMedico(campos[6]);
                                servicos.add(cirurgia);
                            } catch (MedicoInvalidoException e) {
                                System.out.println("[ERRO]" + e.getMessage());
                            }
                            break;
                        case "I":
                            try {
                                Internacao internacao = new Internacao(campos[1], campos[2], campos[3]);
                                internacao.setDuracao(campos[4]);
                                internacao.setHospital(campos[5]);
                                servicos.add(internacao);
                            } catch (HospitalInvalidoException e) {
                                System.out.println("[ERRO]" + e.getMessage());
                            }
                            break;
                        default:
                            System.out.println("Tipo inválido!!!");
                            break;
                    }
                    linha = leitura.readLine();
                }

                if (consulta != null) {
                    escrita.write(consulta.obterDadosArquivo());
                }

                leitura.close();
                fileR.close();
                escrita.close();
                fileW.close();
            } catch (IOException e) {
                System.out.println("[ERRO] " + e.getMessage());
            }
        } finally {
            System.out.println("PROCESSAMENTO REALIZADO!");
        }
    }
}
