/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers.PhatQuaManagerController;

import Bean.NhanKhauBean;
import static controllers.PhatQuaManagerController.PhatThuongController.INTEST;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.EventObject;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.DefaultTableModel;
import models.NhanKhauModel;
import services.NhanKhauService;
import utility.ClassTableModel;
import views.infoViews.InfoJframe;

/**
 *
 * @author admin
 */
public class PhatThuongPanelController {
    private JPanel jpnView;
    private JTextField jtfSearch;
    private NhanKhauService nhanKhauService;
    private List<NhanKhauBean> listNhanKhauBeans;
    private ClassTableModel classTableModel = null;
    private JFrame parentJFrame;
    private final String[] COLUMNS = {"ID", "Họ tên", "Phần thưởng", "Số lượng", "Danh hiệu"};

    public PhatThuongPanelController(JPanel jpnView, JTextField jtfSearch) {
        this.jpnView = jpnView;
        this.jtfSearch = jtfSearch;
        classTableModel = new ClassTableModel();
        this.nhanKhauService = new NhanKhauService();
        this.listNhanKhauBeans = this.nhanKhauService.getListNhanKhau();
        //initAction();
    }

    public PhatThuongPanelController() {
    }
    
    
    //
    public void initAction(){
        this.jtfSearch.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                String key = jtfSearch.getText();
                listNhanKhauBeans = nhanKhauService.search(key.trim());
                setDataTable();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                String key = jtfSearch.getText();
                listNhanKhauBeans = nhanKhauService.search(key.trim());
                setDataTable();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                String key = jtfSearch.getText();
                listNhanKhauBeans = nhanKhauService.search(key.trim());
                setDataTable();
            }
        });
    }
    
    public void setDataTable() {
        Object[][] data = INTEST();
        
        JTable table = new JTable(data, COLUMNS) {
            @Override
            public boolean editCellAt(int row, int column, EventObject e) {
                return false;
            }
            
        };
        
        // thiet ke bang
        
        table.getTableHeader().setFont(new Font("Arial", Font.BOLD, 14));
        table.getTableHeader().setPreferredSize(new Dimension(100, 50));
        table.setRowHeight(50);
        table.validate();
        table.repaint();
        table.setFont(new Font("Arial", Font.PLAIN, 14));
        table.getColumnModel().getColumn(0).setMaxWidth(80);
        table.getColumnModel().getColumn(0).setMinWidth(80);
        table.getColumnModel().getColumn(0).setPreferredWidth(80);
//        table.addMouseListener(new MouseAdapter() {
//            @Override
//            public void mouseClicked(MouseEvent e) {
////                JOptionPane.showConfirmDialog(null, table.getSelectedRow());
//                if (e.getClickCount() > 1) {
//                    NhanKhauBean temp = listNhanKhauBeans.get(table.getSelectedRow());
//                    NhanKhauBean info = nhanKhauService.getNhanKhau(temp.getChungMinhThuModel().getSoCMT());
//                    InfoJframe infoJframe = new InfoJframe(info.toString(), parentJFrame);
//                    infoJframe.setLocationRelativeTo(null);
//                    infoJframe.setVisible(true);
//                }
//            }
//            
//        });
        
        JScrollPane scroll = new JScrollPane();
        scroll.getViewport().add(table);
        scroll.setPreferredSize(new Dimension(1350, 400));
        jpnView.removeAll();
        jpnView.setLayout(new BorderLayout());
        jpnView.add(scroll);
        jpnView.validate();
        jpnView.repaint();
    }

    public void setParentJFrame(JFrame parentJFrame) {
        this.parentJFrame = parentJFrame;
    }
    
    public void refreshData() {
        this.listNhanKhauBeans = this.nhanKhauService.getListNhanKhau();
        setDataTable();
    }
    public JPanel getJpnView() {
        return jpnView;
    }

    public void setJpnView(JPanel jpnView) {
        this.jpnView = jpnView;
    }

    public JTextField getJtfSearch() {
        return jtfSearch;
    }

    public void setJtfSearch(JTextField jtfSearch) {
        this.jtfSearch = jtfSearch;
    }
    
}
