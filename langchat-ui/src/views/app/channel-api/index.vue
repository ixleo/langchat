<!--
  - Copyright (c) 2024 LangChat. TyCoding All Rights Reserved.
  -
  - Licensed under the GNU Affero General Public License, Version 3 (the "License");
  - you may not use this file except in compliance with the License.
  - You may obtain a copy of the License at
  -
  -     https://www.gnu.org/licenses/agpl-3.0.html
  -
  - Unless required by applicable law or agreed to in writing, software
  - distributed under the License is distributed on an "AS IS" BASIS,
  - WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
  - See the License for the specific language governing permissions and
  - limitations under the License.
  -->

<script lang="ts" setup>
  import Docs from './components/docs.vue';
  import ApiTable from '@/views/app/ApiTable.vue';
  import { CHANNEL } from '@/views/app/columns';
</script>

<template>
  <div class="w-full my-3 pb-8 flex items-start justify-start gap-2 h-full">
    <div class="bg-white p-4 rounded w-4/5 h-full">
      <ApiTable :channel="CHANNEL.API" />
    </div>

    <Docs class="w-full" />
  </div>
</template>

<style lang="less" scoped></style>
