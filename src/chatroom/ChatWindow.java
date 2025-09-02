package chatroom;

public class ChatWindow extends javax.swing.JFrame {
    
    private ChatController chatController;
    
    public ChatWindow(String name, ChatController chatController) {
        initComponents();
        setTitle(name);
        lblChatWindowTitle.setText(name);
        this.chatController = chatController;
        setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblChatWindowTitle = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAreaDisplayMessage = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtAreaSendMessage = new javax.swing.JTextArea();
        btnSend = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setForeground(java.awt.Color.cyan);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        lblChatWindowTitle.setBackground(new java.awt.Color(204, 255, 102));
        lblChatWindowTitle.setFont(new java.awt.Font("STLiti", 0, 18)); // NOI18N
        lblChatWindowTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        txtAreaDisplayMessage.setEditable(false);
        txtAreaDisplayMessage.setBackground(new java.awt.Color(204, 204, 255));
        txtAreaDisplayMessage.setColumns(20);
        txtAreaDisplayMessage.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        txtAreaDisplayMessage.setRows(5);
        jScrollPane1.setViewportView(txtAreaDisplayMessage);

        txtAreaSendMessage.setBackground(new java.awt.Color(153, 204, 255));
        txtAreaSendMessage.setColumns(20);
        txtAreaSendMessage.setFont(new java.awt.Font("WinCC_flexible_high", 1, 14)); // NOI18N
        txtAreaSendMessage.setRows(5);
        jScrollPane2.setViewportView(txtAreaSendMessage);

        btnSend.setBackground(new java.awt.Color(51, 153, 255));
        btnSend.setText("SEND");
        btnSend.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnSend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSendActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnSend, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 33, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(148, 148, 148)
                .addComponent(lblChatWindowTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblChatWindowTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSend, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSendActionPerformed
       chatController.recieveMessage(getTitle(), txtAreaSendMessage.getText(), this);
       txtAreaDisplayMessage.append("me : " + txtAreaSendMessage.getText() + "\n");
    }//GEN-LAST:event_btnSendActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        chatController.removeParticipant(this);
    }//GEN-LAST:event_formWindowClosed

    public void displayMessage(String name, String message) {
        txtAreaDisplayMessage.append(name + ": " + message + "\n");
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSend;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblChatWindowTitle;
    private javax.swing.JTextArea txtAreaDisplayMessage;
    private javax.swing.JTextArea txtAreaSendMessage;
    // End of variables declaration//GEN-END:variables
}
