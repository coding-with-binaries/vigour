import React, { useState } from 'react';
import cn from 'classnames';
import './Main.css';
import { Theme } from '../types/Theme';
import { ChatList } from './chat-list';
import { ChatChannel } from './chat-channel';

const Main: React.FC = () => {
  const [theme, setTheme] = useState(Theme.DARK);

  return (
    <div className={cn('vigour-main', theme)}>
      <ChatList />
      <ChatChannel />
    </div>
  );
};

export default Main;
