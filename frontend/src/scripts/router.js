// 'vue-router' 패키지에서 필요한 함수들을 가져옵니다.
// 'createRouter'는 새로운 라우터 인스턴스를 생성할 때 사용됩니다.
// 'createWebHistory'는 브라우저의 히스토리 모드(즉, pushState 기능)를 활성화하는 데 사용됩니다.
import {createRouter, createWebHistory} from 'vue-router'
import Home from "@/pages/Home.vue";
import Login from "@/pages/Login.vue";

// URL 경로를 컴포넌트에 매핑하여 라우트를 정의하는 곳
const routes = [
    {path: '/', component: Home},
    {path: '/login', component: Login},
]

// asd
const router = createRouter({
    history: createWebHistory(),
    routes
})

export default router;