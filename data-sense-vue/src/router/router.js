import Vue from 'vue'
import Router from 'vue-router'

import Helloworld from '@/components/HelloWorld.vue'
import Home from '@/components/Home'
import Content from '@/components/Content'
import Login from '@/components/login'
import HomePage from '@/components/home-page'
import Register from '@/components/register'

Vue.use(Router)

var router = new Router({
    routes: [
        { path: '/', redirect: '/home-page' },
        { path: '/login', component: Login },
        { path: '/home-page', component: HomePage },
        { path: '/register', component: Register },

        {
            path: '/HelloWorld', name: 'Helloworld', component: Helloworld,
            children: [
                { path: '/home', name: 'Home', component: Home },
                { path: '/content', name: 'Content', component: Content }
            ]
        },

    ],
})
export default router
