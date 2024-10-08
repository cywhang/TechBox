// vue 인스턴스 생성
import { createApp } from 'vue'
import router from '@/scripts/router'
import App from './App.vue'

createApp(App).use(router).mount('#app')

/*
Vue 애플리케이션의 진입점으로서, 여러 가지 중요한 역할을 수행하는 곳.

1. Vue 인스턴스 생성
    Vue 애플리케이션을 초기화하는 역할.
    Vue.createApp을 호출하여 루트 컴포넌트를 렌더링하고 Vue 인스턴스를 생성

2. 루트 컴포넌트 연결
    보통 App.vue와 같은 루트 컴포넌트를 main.js에서 연결하고, 그 컴포넌트를 HTML 파일 특정 DOM 엘리먼트에 마운트함.

3. 플러그인 설정
    Vue Router, Vuex, Vuetify 등과 같은 플로그인들을 등록하여 앱에 통합 함.

4. 전역 스타일 및 설정
    전역 CSS 파일이나 환경 변수를 포함시키는 작업도 main.js에서 이루어짐.
*/