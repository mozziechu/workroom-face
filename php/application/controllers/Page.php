<?php
    class Page extends CI_Controller {
        public function view($page = 'home'){
            print(APPPATH.'views\pages'.$page.'.php');
            print($page);
            print(ucfirst($page));
            // if( !file_exists(APPPATH.'views\pages'.$page.'.php')){
            //     show_404();
            // }
            $data['title'] = ucfirst($page);
            $this->load->view('tem/header', $data);
            $this->load->view('pages/'.$page, $data);
            $this->load->view('tem/footer', $data);
        }
    }
?>