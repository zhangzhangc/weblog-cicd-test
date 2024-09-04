import '@/assets/main.css'

import { createApp } from 'vue'
import App from '@/App.vue'
// 导入路由
import router from '@/router'
import 'nprogress/nprogress.css'
const app = createApp(App)
// 导入 Element Plus 图标
import * as ElementPlusIconsVue from '@element-plus/icons-vue'

import 'animate.css';

// 引入全局状态管理 Pinia
import pinia from '@/stores'

// 导入全局路由守卫
import '@/permission'
// 引入图标
for (const [key, component] of Object.entries(ElementPlusIconsVue)) {
    app.component(key, component)
}
// 图片点击放大
import 'viewerjs/dist/viewer.css'
import VueViewer from 'v-viewer'
// 导入 element-plus 暗黑 css
import 'element-plus/theme-chalk/dark/css-vars.css'

// 省略..

app.use(VueViewer)





// 应用 Pinia
app.use(pinia)
// 应用路由
app.use(router)
app.mount('#app')
