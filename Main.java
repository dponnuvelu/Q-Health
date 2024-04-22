import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.*;
import javax.swing.*;
import javax.swing.plaf.BorderUIResource;

public class Main {
    public static JFrame frame = new JFrame();
    public static JPanel panel = new JPanel(new FlowLayout());
    public static JPanel welcomePanel = new JPanel();
    public static JLabel welcomeLabel = new JLabel("Welcome to QHealth! How can we help you?");
    public static JPanel meetingsPanel = new JPanel();
    public static JButton genderAffirmingCare = new JButton("Gender Affirming Care");
    public static JButton nameChangeClinics = new JButton("Name Change Clinics");
    public static JButton lgbtMeetings = new JButton("Local LGBTQ Center Meetings");
    public static JButton therapists = new JButton("Therapists");
    public static JButton trevor = new JButton("Trevor Helpline");
    public static JButton legInfo = new JButton("Legislation Info");
    public static JButton quickEscape = new JButton("QUICK ESCAPE");
    public static JLabel meetingsLabel = new JLabel("LGBTQ+ Meetings: ");
    public static JButton meetingsForYou = new JButton("Meetings For You");
    public static JButton meetingsForFam = new JButton("Meetings For Family");
    public static JPanel MForYou = new JPanel();
    public static JPanel MForFam = new JPanel();
    private static JPanel surgeryPanel = new JPanel();
    private static JLabel header = new JLabel(
            "Looking for Surgeons Specializing in Gender Affirming Care? Select a procedure! (Maps from transhealthcare.org!)");
    private static String surgerySelect;
    private static JButton ffs = new JButton("Facial Feminization Surgery");
    private static JButton vplasty = new JButton("Vaginoplasty");
    private static JButton top = new JButton("Top Surgery");
    private static JButton hyst = new JButton("Hysterectomy");
    private static JButton phplasty = new JButton("Phalloplasty");
    private static JButton mplasty = new JButton("Metoidioplasty");

    public static void main(String[] args) {
        frame.setSize(300, 300);
        welcomePanel.add(welcomeLabel);

        panel.add(quickEscape);
        panel.add(genderAffirmingCare);
        panel.add(nameChangeClinics);
        panel.add(lgbtMeetings);
        panel.add(trevor);
        panel.add(therapists);
        panel.add(legInfo);

        frame.add(welcomePanel, BorderLayout.NORTH);
        frame.add(panel);

        frame.pack();

        frame.setVisible(true);

        genderAffirmingCare.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                frame.remove(welcomePanel);
                frame.remove(panel);
                frame.add(surgeryPanel);
                surgeryPanel.add(quickEscape);

                surgeryPanel.setLayout(new FlowLayout());
                surgeryPanel.add(header);

                ffs.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        try {
                            Desktop.getDesktop()
                                    .browse(new URI(
                                            "https://www.transhealthcare.org/ffs-map/"));
                        } catch (IOException | URISyntaxException e1) {
                            e1.printStackTrace();
                        }
                    }
                });
                surgeryPanel.add(ffs);

                vplasty.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        try {
                            Desktop.getDesktop()
                                    .browse(new URI("https://www.transhealthcare.org/vaginoplasty-map/"));
                        } catch (IOException | URISyntaxException e1) {
                            e1.printStackTrace();
                        }
                    }
                });
                surgeryPanel.add(vplasty);

                top.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        try {
                            Desktop.getDesktop()
                                    .browse(new URI("https://www.transhealthcare.org/top-surgery-map/"));
                        } catch (IOException | URISyntaxException e1) {
                            e1.printStackTrace();
                        }
                    }
                });
                surgeryPanel.add(top);

                hyst.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        try {
                            Desktop.getDesktop()
                                    .browse(new URI("https://www.transhealthcare.org/hysterectomy-map/"));
                        } catch (IOException | URISyntaxException e1) {
                            e1.printStackTrace();
                        }
                    }
                });
                surgeryPanel.add(hyst);

                phplasty.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        try {
                            Desktop.getDesktop()
                                    .browse(new URI("https://www.transhealthcare.org/phalloplasty-map/"));
                        } catch (IOException | URISyntaxException e1) {
                            e1.printStackTrace();
                        }
                    }
                });
                surgeryPanel.add(phplasty);

                mplasty.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        try {
                            Desktop.getDesktop()
                                    .browse(new URI("https://www.transhealthcare.org/metoidioplasty-map/"));
                        } catch (IOException | URISyntaxException e1) {
                            e1.printStackTrace();
                        }
                    }
                });

                quickEscape.addMouseListener(new MouseAdapter() {
                    int counter = 0;

                    public void mouseClicked(MouseEvent e) {
                        counter++;
                        if (counter >= 3) {
                            frame.setVisible(false);
                        }
                    }
                });

                frame.pack();
            }
        });

        quickEscape.addMouseListener(new MouseAdapter() {
            int counter = 0;

            public void mouseClicked(MouseEvent e) {
                counter++;
                if (counter >= 3) {
                    frame.setVisible(false);
                }
            }
        });

        trevor.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                try {
                    Desktop.getDesktop().browse(new URI("https://www.thetrevorproject.org/get-help/"));
                } catch (IOException | URISyntaxException e1) {
                    e1.printStackTrace();
                }
            }
        });

        lgbtMeetings.addMouseListener(new MouseAdapter() {

            public void mouseClicked(MouseEvent e) {
                frame.remove(welcomePanel);
                frame.remove(panel);
                frame.add(meetingsPanel);
                meetingsPanel.add(quickEscape);

                meetingsPanel.add(meetingsLabel, BorderLayout.PAGE_START);

                meetingsPanel.add(meetingsForYou);
                meetingsPanel.add(meetingsForFam);
                frame.pack();

                meetingsForYou.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        try {
                            Desktop.getDesktop().browse(new URI("https://pflag.org/meetings/"));
                        } catch (IOException | URISyntaxException e1) {
                            e1.printStackTrace();
                        }
                    }
                });

                meetingsForFam.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        try {
                            Desktop.getDesktop().browse(new URI("https://pflag.org/findachapter/"));
                        } catch (IOException | URISyntaxException e1) {
                            e1.printStackTrace();
                        }
                    }
                });

                quickEscape.addMouseListener(new MouseAdapter() {
                    int counter = 0;

                    public void mouseClicked(MouseEvent e) {
                        counter++;
                        if (counter >= 3) {
                            frame.setVisible(false);
                        }
                    }
                });
            }
        });

        nameChangeClinics.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                try {
                    Desktop.getDesktop().browse(
                            new URI("https://transgenderlawcenter.org/resources/id/trans-legal-clinic-calendar/"));
                } catch (IOException | URISyntaxException e1) {
                    e1.printStackTrace();
                }
            }
        });

        legInfo.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                try {
                    Desktop.getDesktop().browse(
                            new URI("https://www.aclu.org/legislative-attacks-on-lgbtq-rights-2024?state=&impact="));
                } catch (IOException | URISyntaxException e1) {
                    e1.printStackTrace();
                }
            }
        });

        therapists.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                try {
                    Desktop.getDesktop().browse(new URI("https://nqttcn.com/en/mental-health-directory/"));
                } catch (IOException | URISyntaxException e1) {
                    e1.printStackTrace();
                }
            }
        });

    }

}
