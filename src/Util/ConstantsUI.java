/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Util;

import UI.MainWindow;
import java.awt.Image;
import java.awt.Toolkit;

/**
 *
 * @author Elliot-VS
 */
public class ConstantsUI {

    /*
    Algebra 
     */
    public static final String SUM_STRING = "  \\sum_{x}^{y}";
    public static final String SUPERSCRIPT_STRING = "^{x}";
    public static final String SUB_STRING = "_{x}";
    public static final String SQRT_STRING = "  \\sqrt[x]{y}";
    public static final String SQRT_STRING2 = "  \\sqrt{x}";
    public static final String DIVIDE_STRING = "  \\frac{x}{y}";
    public static final String OVERLINR_STRING = "  \\overline{x}";
    public static final String UNDERLINE_STRING = "  \\underline{x}";
    public static final String VECTOR_STRING = "  \\overrightarrow{x}";
    public static final String PM_STRING = "  \\pm ";
    public static final String MP_STRING = "  \\mp ";
    public static final String LEQ_STRING = "  \\leq";
    public static final String GEP_STRING = "  \\geq";
    public static final String SIDESET_STRING = "  \\sideset{_{LD}^{LU}}{^{RU}_{RD} }{X}";
    public static final String INFINITE_STRING = " \\infty";
    public static final String INEQUALITY_STRING = "  \\ne";
    public static final String SPACE_STRING = " \\quad ";
    public static final String NEWLINE_STRING = "\\\\ ";
    public static final String APPROX__STRING = "  \\approx";
    public static final String LRFLOOR_STRING = "  \\lfloor {x} \\rfloor";
    public static final String LARROW_STRING = "  \\xleftarrow[x]{y}";
    public static final String RARROW_STRING = "  \\xrightarrow[x]{y}";
    public static final String UPARROW_STRING = "  \\uparrow ";
    public static final String DOWNARROW_STRING = "  \\downarrow ";
    public static final String CENTIGRADE_STRING = "℃";
    public static final String UNDERBRACE_STRING = "  \\underbrace{formula}_{x} ";
    public static final String OVERBRACE_STRING = "  \\overbrace{formula}^{x} ";
    public static final String RIGHTARROW_STRING = "  \\Rightarrow ";
    /*
    Greek Sets
     */
    public static final String ALPHA_STRING = "  \\Alpha ";
    public static final String BETA__STRING = "  \\Beta ";
    public static final String GAMMA_STRING = "  \\Gamma ";
    public static final String DELTA_STRING = "  \\Delta ";
    public static final String EPSILON_STRING = "  \\Epsilon ";
    public static final String ZETA_STRING = "  \\Zeta ";
    public static final String ETA_STRING = "  \\Eta ";
    public static final String THETA_STRING = "  \\Theta ";
    public static final String IOTA_STING = "  \\Iota ";
    public static final String KAPPA__STRING = "  \\Kappa ";
    public static final String LAMBDA_STRING = "  \\Lambda ";
    public static final String MU_STRING = "  \\Mu ";
    public static final String NU_TRING = "  Nu";
    public static final String XI_STRING = "  \\Xi ";
    public static final String OMICRON__STRING = "  \\Omicron ";
    public static final String PI_STRING = "  \\Pi ";
    public static final String RHO_STRING = "  \\Rho ";
    public static final String SIGMA_STRING = "  \\Sigma ";
    public static final String TAU_STRING = "  \\Tau ";
    public static final String UPSILON__STRING = "  \\Upsilon ";
    public static final String PHI_STRING = "  \\Phi ";
    public static final String CHI_STRING = "  \\Chi ";
    public static final String PSI_STRING = "  \\Psi ";
    public static final String OMEGA_STRING = "  \\Omega ";

    // lowercase
    public static final String alpha_STRING = "  \\alpha ";
    public static final String beta_STRING = "  \\beta ";
    public static final String gamma_STRING = "  \\gamma ";
    public static final String delta_STRING = "  \\delta ";
    public static final String epsilon_STRING = "  \\epsilon ";
    public static final String zeta_STRING = "  \\zeta ";
    public static final String eta_STRING = "  \\eta ";
    public static final String theta_STRING = "  \\theta ";
    public static final String iota_STRING = "  \\iota ";
    public static final String kappa_STRING = "  \\kappa ";
    public static final String lambda_STRING = "  \\lambda ";
    public static final String mu_STRING = "  \\mu ";
    public static final String nu_STRING = "  \\nu ";
    public static final String xi_STRING = "  \\xi ";
    public static final String omicron_STRING = "  \\omicron ";
    public static final String pi_STRING = "  \\pi ";
    public static final String rho_STRING = "  \\rho ";
    public static final String sigma_STRING = "  \\sigma ";
    public static final String tau_STRING = "  \\tau ";
    public static final String upsilon_STRING = "  \\upsilon ";
    public static final String phi_STRING = "  \\phi ";
    public static final String chi_STRING = "  \\chi ";
    public static final String psi_STRING = "  \\psi ";
    public static final String omega_STRING = "  \\omega ";

    /*
    Differential Sets
     */
    public static final String A_STRING = "  \\partial{x}";
    public static final String DX_STRING = "  \\mathrm{d}{x}";
    public static final String LIM_STRING = " \\lim_{ {x}\\to{y} } ";

    /*
    Integral Sets
     */
    public static final String INT_STRING = "  \\int_{x}^{y} {fun}\\, d{x}";
    public static final String IIN_STRING = "  \\iint_{x}^{y} {fun}\\, d{x}\\,d{y}";
    public static final String IIIN_STRING = "  \\iiint_{x}^{y} {fun}\\, d{x}\\,d{y}\\,d{z}";
    public static final String OINT_STRING = "  \\oint_{x} {fun}\\,d{x} + {fun}\\, d{y}";

    /*
    Sets
     */
    public static final String CAP_STRING = "  \\cap";
    public static final String CUP_STRING = "  \\cup";
    public static final String IN_STRING = "  \\in ";
    public static final String NOTIN_STRING = "  \\notin ";


    /*
    MainWindow icon path
     */
    public final static Image MAIN_WINDOW_ICON = Toolkit.getDefaultToolkit().getImage(MainWindow.class.getResource("/resources/icon.png"));
    public static final Image SPONSOR_ICON = Toolkit.getDefaultToolkit().getImage(MainWindow.class.getResource("/resources/favoriate.png"));
    public static final Image RENDER_ICON = Toolkit.getDefaultToolkit().getImage(MainWindow.class.getResource("/resources/render.png"));
    public static final Image PREVIEW_ICON = Toolkit.getDefaultToolkit().getImage(MainWindow.class.getResource("/resources/preview.png"));
    /*
    Thread  name
     */
    public static final String CHANGE_FONT_COLOR_STRING = "Change_Font_Color_thread";
    public static final String DISPLAY_FORMULA_STRING = "Display_Formula_Thread";

    /*
    enter key
     */
    public static final String LINE_SEPARATOR = System.getProperty("line.separator");
    public static final String USER_HOME = System.getProperty("user.home");
    
    

}
