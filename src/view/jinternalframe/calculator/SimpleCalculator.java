/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.jinternalframe.calculator;

import control.Calculate;

/**
 *
 * @author italo
 */
public class SimpleCalculator extends javax.swing.JInternalFrame {

    private final Calculate CALC = new Calculate();
    private double valorUm;
    private boolean operacaoInvalida = false;

    /**
     * Creates new form JInternalFrameSimpleCalculator
     */
    public SimpleCalculator() {
        initComponents();
    }

    private void executar(String operacao) {
        if (jtfOperacao.getText().isEmpty()) {
            jtfOperacao.setText(operacao);
        }
        executarOperacao();
        jtfOperacao.setText(operacao);
    }

    private void executarOperacao() {
        String campoUm = jtfValorUm.getText();
        String campoDois = jtfValorDois.getText();

        if (!campoUm.isEmpty() && campoUm.matches("[0-9\\-]*")) {
            switch (jtfOperacao.getText()) {
                case "+":
                    if (campoDois.isEmpty()) {
                        valorUm = transformaEmDouble(campoUm);
                    } else {
                        valorUm += transformaEmDouble(campoUm);
                    }
                    break;
                case "-":
                    if (campoDois.isEmpty()) {
                        valorUm = transformaEmDouble(campoUm);
                    } else {
                        valorUm -= transformaEmDouble(campoUm);
                    }
                    break;
                case "x":
                    if (campoDois.isEmpty()) {
                        valorUm = transformaEmDouble(campoUm);
                    } else {
                        valorUm *= transformaEmDouble(campoUm);
                    }
                    break;
                case "/":
                    if (campoDois.isEmpty()) {
                        valorUm = transformaEmDouble(campoUm);
                    } else {
                        valorUm /= transformaEmDouble(campoUm);
                    }
                    break;
                case "√":
                    valorUm = CALC.raizQuadrada(transformaEmDouble(campoUm));
                    break;
                case "%":
                    if (campoDois.isEmpty()) {
                        valorUm = transformaEmDouble(campoUm);
                    } else {
                        valorUm = CALC.porcentagemDeX(valorUm, transformaEmDouble(campoUm));
                    }
                    break;
                default:
                    jtfValorUm.setText("Operação inválida");
                    return;
            }

            jtfValorDois.setText(valorUm + "");
            jtfOperacao.setText("+");
            jtfValorUm.setText("");
            System.out.println("entrou");
        } else {
            System.out.println("não entrou");
        }
    }

    private void adicionaPonto() {
        if (!jtfValorUm.getText().contains(".")) {
            concatenaNoUm(".");
        }
    }

    private void adicionaNumero(String valor) {
        if (operacaoInvalida) {
            operacaoInvalida = false;
            jtfValorUm.setText("");
        }
        concatenaNoUm(valor);
    }

    private void clearEnd() {
        if (!jtfValorUm.getText().isEmpty()) {
            jtfValorUm.setText(jtfValorUm.getText().substring(0, jtfValorUm.getText().length() - 1));
        }
    }

    private void clearAll() {
        jtfValorUm.setText("");
        jtfValorDois.setText("");
        jtfOperacao.setText("");
    }

    private void concatenaNoUm(String string) {
        jtfValorUm.setText(jtfValorUm.getText() + string);
    }

    private double transformaEmDouble(String string) {
        double n = Double.parseDouble(string.replace("-", ""));
        return string.contains("-") ? n * -1 : n;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnLimparTudo = new javax.swing.JButton();
        btnLimparCaractere = new javax.swing.JButton();
        btnRaizQuadrada = new javax.swing.JButton();
        btnPorcentagem = new javax.swing.JButton();
        btnSete = new javax.swing.JButton();
        btnOito = new javax.swing.JButton();
        btnNove = new javax.swing.JButton();
        btndividir = new javax.swing.JButton();
        btnQuatro = new javax.swing.JButton();
        btnCinco = new javax.swing.JButton();
        btnSeis = new javax.swing.JButton();
        btnVezes = new javax.swing.JButton();
        btnUm = new javax.swing.JButton();
        btnDois = new javax.swing.JButton();
        btnTres = new javax.swing.JButton();
        btnMenos = new javax.swing.JButton();
        btnNumeroZero = new javax.swing.JButton();
        btnPonto = new javax.swing.JButton();
        btnIgual = new javax.swing.JButton();
        btnSoma = new javax.swing.JButton();
        jtfValorUm = new javax.swing.JTextField();
        jtfValorDois = new javax.swing.JTextField();
        jtfOperacao = new javax.swing.JLabel();

        setClosable(true);
        setTitle("Simple calculate");

        btnLimparTudo.setFont(new java.awt.Font("Arimo", 1, 14)); // NOI18N
        btnLimparTudo.setText("CA");
        btnLimparTudo.setToolTipText("Clear All");
        btnLimparTudo.setRolloverEnabled(false);
        btnLimparTudo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparTudoActionPerformed(evt);
            }
        });

        btnLimparCaractere.setFont(new java.awt.Font("Arimo", 1, 14)); // NOI18N
        btnLimparCaractere.setText("CE");
        btnLimparCaractere.setToolTipText("Clear End");
        btnLimparCaractere.setRolloverEnabled(false);
        btnLimparCaractere.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparCaractereActionPerformed(evt);
            }
        });

        btnRaizQuadrada.setFont(new java.awt.Font("Arimo", 1, 14)); // NOI18N
        btnRaizQuadrada.setText("√");
        btnRaizQuadrada.setRolloverEnabled(false);
        btnRaizQuadrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRaizQuadradaActionPerformed(evt);
            }
        });

        btnPorcentagem.setFont(new java.awt.Font("Arimo", 1, 14)); // NOI18N
        btnPorcentagem.setText("%");
        btnPorcentagem.setRolloverEnabled(false);
        btnPorcentagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPorcentagemActionPerformed(evt);
            }
        });

        btnSete.setFont(new java.awt.Font("Arimo", 1, 14)); // NOI18N
        btnSete.setText("7");
        btnSete.setRolloverEnabled(false);
        btnSete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeteActionPerformed(evt);
            }
        });

        btnOito.setFont(new java.awt.Font("Arimo", 1, 14)); // NOI18N
        btnOito.setText("8");
        btnOito.setRolloverEnabled(false);
        btnOito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOitoActionPerformed(evt);
            }
        });

        btnNove.setFont(new java.awt.Font("Arimo", 1, 14)); // NOI18N
        btnNove.setText("9");
        btnNove.setRolloverEnabled(false);
        btnNove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNoveActionPerformed(evt);
            }
        });

        btndividir.setFont(new java.awt.Font("Arimo", 1, 14)); // NOI18N
        btndividir.setText("/");
        btndividir.setRolloverEnabled(false);
        btndividir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndividirActionPerformed(evt);
            }
        });

        btnQuatro.setFont(new java.awt.Font("Arimo", 1, 14)); // NOI18N
        btnQuatro.setText("4");
        btnQuatro.setRolloverEnabled(false);
        btnQuatro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuatroActionPerformed(evt);
            }
        });

        btnCinco.setFont(new java.awt.Font("Arimo", 1, 14)); // NOI18N
        btnCinco.setText("5");
        btnCinco.setRolloverEnabled(false);
        btnCinco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCincoActionPerformed(evt);
            }
        });

        btnSeis.setFont(new java.awt.Font("Arimo", 1, 14)); // NOI18N
        btnSeis.setText("6");
        btnSeis.setRolloverEnabled(false);
        btnSeis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeisActionPerformed(evt);
            }
        });

        btnVezes.setFont(new java.awt.Font("Arimo", 1, 14)); // NOI18N
        btnVezes.setText("x");
        btnVezes.setRolloverEnabled(false);
        btnVezes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVezesActionPerformed(evt);
            }
        });

        btnUm.setFont(new java.awt.Font("Arimo", 1, 14)); // NOI18N
        btnUm.setText("1");
        btnUm.setRolloverEnabled(false);
        btnUm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUmActionPerformed(evt);
            }
        });

        btnDois.setFont(new java.awt.Font("Arimo", 1, 14)); // NOI18N
        btnDois.setText("2");
        btnDois.setRolloverEnabled(false);
        btnDois.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDoisActionPerformed(evt);
            }
        });

        btnTres.setFont(new java.awt.Font("Arimo", 1, 14)); // NOI18N
        btnTres.setText("3");
        btnTres.setRolloverEnabled(false);
        btnTres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTresActionPerformed(evt);
            }
        });

        btnMenos.setFont(new java.awt.Font("Arimo", 1, 14)); // NOI18N
        btnMenos.setText("-");
        btnMenos.setRolloverEnabled(false);
        btnMenos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenosActionPerformed(evt);
            }
        });

        btnNumeroZero.setFont(new java.awt.Font("Arimo", 1, 14)); // NOI18N
        btnNumeroZero.setText("0");
        btnNumeroZero.setRolloverEnabled(false);
        btnNumeroZero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNumeroZeroActionPerformed(evt);
            }
        });

        btnPonto.setFont(new java.awt.Font("Arimo", 1, 14)); // NOI18N
        btnPonto.setText(".");
        btnPonto.setRolloverEnabled(false);
        btnPonto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPontoActionPerformed(evt);
            }
        });

        btnIgual.setFont(new java.awt.Font("Arimo", 1, 14)); // NOI18N
        btnIgual.setText("=");
        btnIgual.setRolloverEnabled(false);
        btnIgual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIgualActionPerformed(evt);
            }
        });

        btnSoma.setFont(new java.awt.Font("Arimo", 1, 14)); // NOI18N
        btnSoma.setText("+");
        btnSoma.setRolloverEnabled(false);
        btnSoma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSomaActionPerformed(evt);
            }
        });

        jtfValorUm.setEditable(false);
        jtfValorUm.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jtfValorUm.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 1, new java.awt.Color(0, 0, 0)));

        jtfValorDois.setEditable(false);
        jtfValorDois.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jtfValorDois.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 0, 0, new java.awt.Color(0, 0, 0)));

        jtfOperacao.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jtfOperacao.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 1, 1, 0, new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtfValorUm)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnLimparTudo, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnSete, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnQuatro, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnUm, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnNumeroZero, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnLimparCaractere, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnOito, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnCinco, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnDois, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnPonto, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnRaizQuadrada, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnNove, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnSeis, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnTres, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnIgual, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnPorcentagem, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btndividir, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnVezes, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnMenos, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnSoma, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jtfValorDois, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtfOperacao, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jtfValorDois, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(jtfOperacao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtfValorUm, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLimparTudo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLimparCaractere, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRaizQuadrada, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPorcentagem, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSete, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnOito, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNove, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btndividir, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnQuatro, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCinco, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSeis, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVezes, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnUm, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDois, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTres, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMenos, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNumeroZero, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPonto, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnIgual, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSoma, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNumeroZeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNumeroZeroActionPerformed
        // TODO add your handling code here:
        adicionaNumero("0");
    }//GEN-LAST:event_btnNumeroZeroActionPerformed

    private void btnUmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUmActionPerformed
        // TODO add your handling code here:
        adicionaNumero("1");
    }//GEN-LAST:event_btnUmActionPerformed

    private void btnDoisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDoisActionPerformed
        // TODO add your handling code here:
        adicionaNumero("2");
    }//GEN-LAST:event_btnDoisActionPerformed

    private void btnTresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTresActionPerformed
        // TODO add your handling code here:
        adicionaNumero("3");
    }//GEN-LAST:event_btnTresActionPerformed

    private void btnQuatroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuatroActionPerformed
        // TODO add your handling code here:
        adicionaNumero("4");
    }//GEN-LAST:event_btnQuatroActionPerformed

    private void btnCincoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCincoActionPerformed
        // TODO add your handling code here:
        adicionaNumero("5");
    }//GEN-LAST:event_btnCincoActionPerformed

    private void btnSeisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeisActionPerformed
        // TODO add your handling code here:
        adicionaNumero("6");
    }//GEN-LAST:event_btnSeisActionPerformed

    private void btnSeteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeteActionPerformed
        // TODO add your handling code here:
        adicionaNumero("7");
    }//GEN-LAST:event_btnSeteActionPerformed

    private void btnOitoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOitoActionPerformed
        // TODO add your handling code here:
        adicionaNumero("8");
    }//GEN-LAST:event_btnOitoActionPerformed

    private void btnNoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNoveActionPerformed
        // TODO add your handling code here:
        adicionaNumero("9");
    }//GEN-LAST:event_btnNoveActionPerformed

    private void btnLimparTudoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparTudoActionPerformed
        // TODO add your handling code here:
        clearAll();
    }//GEN-LAST:event_btnLimparTudoActionPerformed

    private void btnLimparCaractereActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparCaractereActionPerformed
        // TODO add your handling code here:
        clearEnd();
    }//GEN-LAST:event_btnLimparCaractereActionPerformed

    private void btnPontoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPontoActionPerformed
        // TODO add your handling code here:
        adicionaPonto();
    }//GEN-LAST:event_btnPontoActionPerformed

    private void btnSomaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSomaActionPerformed
        executar("+");
    }//GEN-LAST:event_btnSomaActionPerformed

    private void btnIgualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIgualActionPerformed
        // TODO add your handling code here:
        executarOperacao();
    }//GEN-LAST:event_btnIgualActionPerformed

    private void btnMenosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenosActionPerformed
        // TODO add your handling code here:
        if (jtfValorUm.getText().isEmpty()) {
            jtfValorUm.setText("-");
        } else {
            executar("-");
        }
    }//GEN-LAST:event_btnMenosActionPerformed

    private void btnVezesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVezesActionPerformed
        // TODO add your handling code here:
//        String campoUm = jtfValorUm.getText();
//        String campoDois = jtfValorDois.getText();
//
//        if (!campoUm.isEmpty()) {
//            if (campoDois.isEmpty()) {
//                valorUm = transformaEmDouble(campoUm);
//            } else {
//                valorUm = valorUm * transformaEmDouble(campoUm);
//                System.out.println("ola mundo");
//            }
//            jtfValorDois.setText(valorUm + "");
//            jtfOperacao.setText("×");
//            jtfValorUm.setText("");
//        }

        executar("x");
    }//GEN-LAST:event_btnVezesActionPerformed

    private void btndividirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndividirActionPerformed
        // TODO add your handling code here:
        executar("/");
    }//GEN-LAST:event_btndividirActionPerformed

    private void btnPorcentagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPorcentagemActionPerformed
        // TODO add your handling code here:
        executar("%");
    }//GEN-LAST:event_btnPorcentagemActionPerformed

    private void btnRaizQuadradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRaizQuadradaActionPerformed
        // TODO add your handling code here:
        executar("√");
    }//GEN-LAST:event_btnRaizQuadradaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCinco;
    private javax.swing.JButton btnDois;
    private javax.swing.JButton btnIgual;
    private javax.swing.JButton btnLimparCaractere;
    private javax.swing.JButton btnLimparTudo;
    private javax.swing.JButton btnMenos;
    private javax.swing.JButton btnNove;
    private javax.swing.JButton btnNumeroZero;
    private javax.swing.JButton btnOito;
    private javax.swing.JButton btnPonto;
    private javax.swing.JButton btnPorcentagem;
    private javax.swing.JButton btnQuatro;
    private javax.swing.JButton btnRaizQuadrada;
    private javax.swing.JButton btnSeis;
    private javax.swing.JButton btnSete;
    private javax.swing.JButton btnSoma;
    private javax.swing.JButton btnTres;
    private javax.swing.JButton btnUm;
    private javax.swing.JButton btnVezes;
    private javax.swing.JButton btndividir;
    private javax.swing.JLabel jtfOperacao;
    private javax.swing.JTextField jtfValorDois;
    private javax.swing.JTextField jtfValorUm;
    // End of variables declaration//GEN-END:variables
}
