<template>
  <div class="layout" v-if="isCollapsed">
    <Layout>
      <Sider ref="side1" hide-trigger collapsible :collapsed-width="78" v-model="isCollapsed">
        <Menu active-name="1-2" theme="dark" width="auto" :class="menuitemClasses">
          <div class="logo1">K</div>
          <Dropdown placement="right-start">
            <a href="javascript:void(0)">
              <MenuItem name="1-1">
                <Icon type="ios-navigate"></Icon>
              </MenuItem>
            </a>
            <DropdownMenu slot="list">
              <router-link to="/home">
                <DropdownItem>
                  <p style="color:gray;">设备信息</p>
                </DropdownItem>
              </router-link>
              <router-link to="/content">
                <DropdownItem style="color:black;">
                  <p style="color:gray;">设备设置</p>
                </DropdownItem>
              </router-link>
            </DropdownMenu>
          </Dropdown>
          <Dropdown placement="right-start">
            <a href="javascript:void(0)">
              <MenuItem name="1-2">
                <Icon type="ios-keypad"></Icon>
              </MenuItem>
            </a>

            <DropdownMenu slot="list">
              <DropdownItem>
                <p style="color:gray;">基础表单</p>
              </DropdownItem>
              <DropdownItem>
                <p style="color:gray;">高级表单</p>
              </DropdownItem>
            </DropdownMenu>
          </Dropdown>

          <Dropdown placement="right-start">
            <a href="javascript:void(0)">
              <MenuItem name="1-3">
                <Icon type="ios-analytics"></Icon>
              </MenuItem>
            </a>
            <DropdownMenu slot="list">
              <DropdownItem>
                <p style="color:gray;">分析页</p>
              </DropdownItem>
              <DropdownItem>
                <p style="color:gray;">工作台</p>
              </DropdownItem>
              <DropdownItem>
                <p style="color:gray;">监控页</p>
              </DropdownItem>
              <DropdownItem>
                <p style="color:gray;">详情页</p>
              </DropdownItem>
            </DropdownMenu>
          </Dropdown>
        </Menu>
      </Sider>
      <Layout>
        <Header :style="{padding: 0}" class="layout-header-bar">
          <Breadcrumb>
            <Icon
              @click.native="collapsedSider"
              :class="rotateIcon"
              :style="{margin: '0 20px'}"
              type="md-menu"
              size="24"
            ></Icon>
          </Breadcrumb>
        </Header>
        <Content :style="{margin: '20px', background: '#fff', minHeight: '800px'}">
          <router-view></router-view>
        </Content>
      </Layout>
    </Layout>
  </div>
  <div class="layout" v-else>
    <Layout>
      <Sider ref="side1" hide-trigger collapsible :collapsed-width="78" v-model="isCollapsed">
        <Menu accordion :open-names="['1']" theme="dark" width="auto" :class="menuitemClasses">
          <div class="logo">侃度科技</div>

          <Submenu name="1">
            <template slot="title">
              <Icon type="ios-navigate"></Icon>

              <span>设备管理</span>
            </template>
            <router-link to="/home">
              <MenuItem name="1-1">
                <span style="display:block;width:100%;height:100%;">设备信息</span>
              </MenuItem>
            </router-link>
            <router-link to="/content">
              <MenuItem name="1-2">
                <span style="display:block;width:100%;height:100%;">设备设置</span>
              </MenuItem>
            </router-link>
          </Submenu>
          <Submenu name="2">
            <template slot="title">
              <Icon type="ios-keypad"></Icon>
              <span>表单页</span>
            </template>

            <MenuItem name="2-1">
              <span style="display:block;width:100%;height:100%;">基础表单</span>
            </MenuItem>

            <MenuItem name="2-2">
              <span style="display:block;width:100%;height:100%;">高级表单</span>
            </MenuItem>
          </Submenu>
          <Submenu name="3">
            <template slot="title">
              <Icon type="ios-analytics"></Icon>
              <span>图表页</span>
            </template>
            <MenuItem name="3-1">
              <span style="display:block;width:100%;height:100%;">分析页</span>
            </MenuItem>
            <MenuItem name="3-2">
              <span style="display:block;width:100%;height:100%;">工作台</span>
            </MenuItem>
            <MenuItem name="3-3">
              <span style="display:block;width:100%;height:100%;">监控页</span>
            </MenuItem>
            <MenuItem name="3-4">
              <span style="display:block;width:100%;height:100%;">详情页</span>
            </MenuItem>
          </Submenu>
        </Menu>
      </Sider>
      <Layout>
        <Header :style="{padding: 0}" class="layout-header-bar">
          <Breadcrumb>
            <Icon
              @click.native="collapsedSider"
              :class="rotateIcon"
              :style="{margin: '0 20px'}"
              type="md-menu"
              size="24"
            ></Icon>
          </Breadcrumb>
        </Header>
        <Content :style="{margin: '20px', background: '#fff', minHeight: '800px'}">
          <router-view></router-view>
        </Content>
      </Layout>
    </Layout>
  </div>
</template>
<script>
export default {
  data() {
    return {
      isCollapsed: false,
      isShow: true
    };
  },
  computed: {
    rotateIcon() {
      return ["menu-icon", this.isCollapsed ? "rotate-icon" : ""];
    },
    menuitemClasses() {
      return ["menu-item", this.isCollapsed ? "collapsed-menu" : ""];
    }
  },
  methods: {
    collapsedSider() {
      this.$refs.side1.toggleCollapse();
    }
  }
};
</script>
<style scoped>
.layout {
  border: 1px solid #d7dde4;
  background: #f5f7f9;
  position: relative;
  border-radius: 4px;
  overflow: hidden;
}
.layout-header-bar {
  background: #fff;
  box-shadow: 0 1px 1px rgba(0, 0, 0, 0.1);
}
.layout-logo-left {
  width: 90%;
  height: 30px;
  background: #5b6270;
  border-radius: 3px;
  margin: 15px auto;
}
.menu-icon {
  transition: all 0.3s;
}
.rotate-icon {
  transform: rotate(-90deg);
}
.menu-item span {
  display: inline-block;
  overflow: hidden;
  width: 69px;
  color: gainsboro;
  text-overflow: ellipsis;
  white-space: nowrap;
  vertical-align: bottom;
  transition: width 0.2s ease 0.2s;
}
.menu-item span:hover {
  color: #fff;
}
.menu-item i {
  transform: translateX(0px);
  transition: font-size 0.2s ease, transform 0.2s ease;
  vertical-align: middle;
  font-size: 16px;
}
.collapsed-menu span {
  width: 0px;
  transition: width 0.2s ease;
}
.collapsed-menu i {
  transform: translateX(5px);
  transition: font-size 0.2s ease 0.2s, transform 0.2s ease 0.2s;
  vertical-align: middle;
  font-size: 22px;
}
.logo {
  width: 80%;
  height: auto;
  margin: 3vh auto;
  color: white;
  text-align: center;
  font-weight: 600;
  font-size: 30px;
  border-top-left-radius: 12px;
  border-bottom-right-radius: 12px;
  background-color: #6eb3fd;
}
.logo1 {
  width: 80%;
  height: auto;
  margin: 3vh auto;
  color: white;
  text-align: center;
  font-weight: 600;
  font-size: 30px;
  border-top-left-radius: 12px;
  border-bottom-right-radius: 12px;
  background-color: #6eb3fd;
}
</style>